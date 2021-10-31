/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.mydvdlibrary.controller;

import com.sg.mydvdlibrary.dao.MyDvdLibraryDao;
import com.sg.mydvdlibrary.dao.MyDvdLibraryDaoException;
import com.sg.mydvdlibrary.dto.Dvd;
import com.sg.mydvdlibrary.ui.MyDvdLibraryView;
import com.sg.mydvdlibrary.ui.UserIO;
import com.sg.mydvdlibrary.ui.UserIOConsoleImpl;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author igord
 */
public class MyDvdLibraryController {

    private MyDvdLibraryView view;
    private MyDvdLibraryDao dao;
    private UserIO io = new UserIOConsoleImpl();

    public MyDvdLibraryController(MyDvdLibraryDao dao, MyDvdLibraryView view) {
        this.dao = dao;
        this.view = view;
    }

    public void run() {

        boolean keepGoing = true;
        int menuSelection = 0;
        while (keepGoing) {

            try {
                menuSelection = getMenuSelection();
                
                switch (menuSelection) {
                    case 1:
                        listDvds();
                        break;
                    case 2:
                        addDvd();
                        break;
                    case 3:
                        viewDvd();
                        break;
                    case 4:
                        removeDvd();
                        break;
                    case 5:
                        keepGoing = false;
                        break;
                    default:
                        unknownCommand();
                }
            } catch (MyDvdLibraryDaoException ex) {
                Logger.getLogger(MyDvdLibraryController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        exitMessage();
    }

    private int getMenuSelection() {
        return view.printMenuAndGetSelection();
    }

    private void addDvd() throws MyDvdLibraryDaoException {
        view.displayCreateDvdBanner();
        Dvd newDvd = view.getNewDvdInfo();
        dao.addDvd(newDvd.getDvdTitle(), newDvd);
        view.displayCreateSuccessBanner();
    }

    private void listDvds() throws MyDvdLibraryDaoException {
        view.displayDisplayAllBanner();
        List<Dvd> dvdList = dao.getAllDvds();
        view.displayDvdList(dvdList);
    }

    private void viewDvd() throws MyDvdLibraryDaoException {
        view.displayDisplayDvdBanner();
        String dvdTitle = view.getDvdTitleChoice();
        Dvd dvd = dao.getDvd(dvdTitle);
        view.displayDvd(dvd);
    }

    private void removeDvd() throws MyDvdLibraryDaoException {
        view.displayRemoveDvdBanner();
        String dvdTitle = view.getDvdTitleChoice();
        Dvd removedDvd = dao.removeDvd(dvdTitle);
        view.displayRemoveResult(removedDvd);
    }

    private void unknownCommand() {
        view.displayUnknownCommandBanner();
    }

    private void exitMessage() {
        view.displayExitBanner();
    }
}
