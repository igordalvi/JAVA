/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.mydvdlibrary;

import com.sg.mydvdlibrary.controller.MyDvdLibraryController;
import com.sg.mydvdlibrary.dao.MyDvdLibraryDao;
import com.sg.mydvdlibrary.dao.MyDvdLibraryDaoFileImpl;
import com.sg.mydvdlibrary.ui.MyDvdLibraryView;
import com.sg.mydvdlibrary.ui.UserIO;
import com.sg.mydvdlibrary.ui.UserIOConsoleImpl;

/**
 *
 * @author igord
 */
public class App {

    public static void main(String[] args) {
        UserIO myIo = new UserIOConsoleImpl();
        MyDvdLibraryView myView = new MyDvdLibraryView(myIo);
        MyDvdLibraryDao myDao = new MyDvdLibraryDaoFileImpl();
        MyDvdLibraryController controller = new MyDvdLibraryController(myDao, myView);
        controller.run();
    }
}
