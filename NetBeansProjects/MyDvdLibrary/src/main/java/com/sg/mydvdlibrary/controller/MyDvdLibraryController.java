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
import java.util.List;

/**
 *
 * @author igord
 */
public class MyDvdLibraryController {

    private final MyDvdLibraryView view;
    private final MyDvdLibraryDao dao;

    public MyDvdLibraryController(MyDvdLibraryDao dao, MyDvdLibraryView view) {
        this.dao = dao;
        this.view = view;
    }

    public void run() {

        boolean keepGoing = true;
        int menuSelection;
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
                        editDvd();
                        break;
                    case 5:
                        removeDvd();
                        break;
                    case 6:
                        keepGoing = false;
                        break;
                    default:
                        unknownCommand();
                }
            } catch (MyDvdLibraryDaoException e) {
                view.displayErrorMessage(e.getMessage());
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

    private void editDvd() throws MyDvdLibraryDaoException {
        view.displayEditDvdBanner();
        String dvdTitle = view.getDvdTitleChoice();
        Dvd dvd = dao.getDvd(dvdTitle);
        Dvd editedDvd = view.getEditDvdInfo(dvd);
        dao.editDvd(dvdTitle, editedDvd);
        view.displayEditSuccessBanner();
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
