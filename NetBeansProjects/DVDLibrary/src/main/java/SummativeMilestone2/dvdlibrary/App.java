/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SummativeMilestone2.dvdlibrary;

import SummativeMilestone2.dvdlibrary.controller.DvdLibraryController;
import SummativeMilestone2.dvdlibrary.dao.DvdLibraryDaoFileImpl;
import SummativeMilestone2.dvdlibrary.ui.DvdLibraryView;
import SummativeMilestone2.dvdlibrary.ui.UserIO;
import SummativeMilestone2.dvdlibrary.ui.UserIOConsoleImpl;
import SummativeMilestone2.dvdlibrary.dao.DvdLibraryDao;

/**
 *
 * @author igord
 */
public class App {

    public static void main(String[] args) {
        UserIO myIo = new UserIOConsoleImpl();
        DvdLibraryView myView = new DvdLibraryView(myIo);
        DvdLibraryDao myDao = new DvdLibraryDaoFileImpl();
        DvdLibraryController controller = new DvdLibraryController(myDao, myView);
        controller.run();
    }
}
