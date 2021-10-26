/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SummativeMilestone2.classroster.ui;

import SummativeMilestone2.classroster.dto.Dvd;
import java.util.List;

/**
 *
 * @author igord
 */
public class ClassRosterView {

    private UserIO io;

    public ClassRosterView(UserIO io) {
        this.io = io;
    }

    public void displayErrorMessage(String errorMsg) {
        io.print("=== ERROR ===");
        io.print(errorMsg);
    }

    public int printMenuAndGetSelection() {
        io.print("Main Menu");
        io.print("1. List DVDs");
        io.print("2. Add New DVD");
        io.print("3. View info about a DVD");
        io.print("4. Remove a DVD");
        io.print("5. Exit");
        return io.readInt("Please select from the above choices.", 1, 5);
    }

    public Dvd getNewDvdInfo() {
        String dvdId = io.readString("Please enter the DVD ID (Last Name of the DVD/Movie director followed by the Year when it was Released. For example, the ID of 'Back to the Future I' is 'Zemeckis1985')");
        String dvdTitle = io.readString("Please enter the DVD Title");
        String releaseDate = io.readString("Please enter Release Date of this DVD");
        String mpaaRating = io.readString("Please enter MPAA Rating of this DVD");
        String directorsName = io.readString("Please enter the DVD Director's Name");
        String studio = io.readString("Please enter the name of the Studio of this DVD");
        String userNoteOrRating = io.readString("Please enter your Personal Rating, Comments or any Notes about this DVD");

        Dvd currentDvd = new Dvd(dvdId);
        currentDvd.setDvdTitle(dvdTitle);
        currentDvd.setReleaseDate(releaseDate);
        currentDvd.setMpaaRating(mpaaRating);
        currentDvd.setDirectorsName(directorsName);
        currentDvd.setStudio(studio);
        currentDvd.setUserNoteOrRating(userNoteOrRating);

        return currentDvd;
    }

    public void displayCreateDvdBanner() {
        io.print("=== Create DVD ===");
    }

    public void displayCreateSuccessBanner() {
        io.readString("DVD successfully created. Please hit enter to continue");
    }

    public void displayDvdList(List<Dvd> dvdList) {
        for (Dvd currentDvd : dvdList) {
            String dvdInfo = String.format("#%s: %s, %s",
                    currentDvd.getDvdId(),
                    currentDvd.getDvdTitle(),
                    currentDvd.getReleaseDate());
            io.print(dvdInfo);
        }
        io.readString("Please hit enter to continue.");
    }

    public void displayDisplayAllBanner() {
        io.print("=== Display All DVDs ===");
    }

    public void displayDisplayDvdBanner() {
        io.print("=== Display Dvd ===");
    }

    public String getDvdIdChoice() {
        return io.readString("Please enter the Dvd ID.");
    }

    public void displayDvd(Dvd dvd) {
        if (dvd != null) {
            io.print("DVD ID: " + dvd.getDvdId() + ". Following is the details about this DVD:");
            io.print("Title: " + dvd.getDvdTitle() + "; Directed by " + dvd.getDirectorsName());
            io.print("Release Date: " + dvd.getReleaseDate());
            io.print("Studio: " + dvd.getStudio());
            io.print("MPAA Rating: " + dvd.getMpaaRating());
            io.print("");
        } else {
            io.print("No such DVD.");
        }

        io.readString("Please hit enter to continue.");
    }

    public void displayRemoveDvdBanner() {
        io.print("=== Remove DVD ===");
    }

    public void displayRemoveResult(Dvd dvdRecord) {
        if (dvdRecord != null) {
            io.print("DVD successfully removed.");
        } else {
            io.print("No such DVD.");
        }
        io.readString("Please hit enter to continue.");
    }

    public void displayExitBanner() {
        io.print("Good Bye!!!");
    }

    public void displayUnknownCommandBanner() {
        io.print("Unknown Command!!!");
    }
}
