/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SummativeMilestone2.classroster;

import SummativeMilestone2.classroster.controller.ClassRosterController;
import SummativeMilestone2.classroster.dao.ClassRosterDao;
import SummativeMilestone2.classroster.dao.ClassRosterDaoFileImpl;
import SummativeMilestone2.classroster.ui.ClassRosterView;
import SummativeMilestone2.classroster.ui.UserIO;
import SummativeMilestone2.classroster.ui.UserIOConsoleImpl;

/**
 *
 * @author igord
 */
public class App {

    public static void main(String[] args) {
        UserIO myIo = new UserIOConsoleImpl();
        ClassRosterView myView = new ClassRosterView(myIo);
        ClassRosterDao myDao = new ClassRosterDaoFileImpl();
        ClassRosterController controller = new ClassRosterController(myDao, myView);
        controller.run();
    }
}