/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.mydvdlibrary.ui;

import com.sg.mydvdlibrary.dto.Dvd;
import java.util.List;

/**
 *
 * @author igord
 */
public class MyDvdLibraryView {

    private final UserIO io;

    public MyDvdLibraryView(UserIO io) {
        this.io = io;
    }

    public int printMenuAndGetSelection() {
        io.print("Main Menu");
        io.print("1. List DVDs by Title");
        io.print("2. Add a New DVD");
        io.print("3. DVD Search");
        io.print("4. Remove a DVD");
        io.print("5. Exit");
        return io.readInt("Please select from the above choices.", 1, 5);
    }

    public Dvd getNewDvdInfo() {
        String dvdTitle = io.readString("Please enter the Title of the DVD that you want to Add:");
        String directorName = io.readString("DVD Director's Name:");
        String releaseDate = io.readString("Release Date of this DVD:");
        String studio = io.readString("Name of the Studio of this DVD:");

        String mpaaRating = io.readString("MPAA Rating of this DVD:");
        String userNoteOrRating = io.readString("Your Personal Rating, Comments or any Notes about this DVD");

        Dvd currentDvd = new Dvd(dvdTitle);
        currentDvd.setDirectorName(directorName);
        currentDvd.setReleaseDate(releaseDate);
        currentDvd.setStudio(studio);

        currentDvd.setMpaaRating(mpaaRating);
        currentDvd.setUserNote(userNoteOrRating);

        return currentDvd;
    }

    public void displayCreateDvdBanner() {
        io.print("=== Create or Edit an Existing DVD ===");
    }

    public void displayCreateSuccessBanner() {
        io.readString("DVD successfully created. Please hit enter to continue");
    }

    public void displayDisplayAllBanner() {
        io.print("=== Display All DVDs ===");
    }

    public void displayDvdList(List<Dvd> dvdList) {
        for (Dvd currentDvd : dvdList) {
            String dvdInfo = String.format("- %s, directed by %s",
                    currentDvd.getDvdTitle(),
                    currentDvd.getDirectorName());
            io.print(dvdInfo);
        }
        io.readString("Please hit enter to continue.");
    }

    public void displayDisplayDvdBanner() {
        io.print("=== Display Dvd ===");
        io.print("");
    }

    public String getDvdTitleChoice() {
        return io.readString("Please enter the DVD Title that you want to search for:");
    }

    public void displayDvd(Dvd dvd) {
        if (dvd != null) {
            io.print("");
            io.print("DVD Title: " + dvd.getDvdTitle());
            io.print("Directed by: " + dvd.getDirectorName());
            io.print("Released on: " + dvd.getReleaseDate());
            io.print("Studio: " + dvd.getStudio());
            io.print("MPAA Rating: " + dvd.getMpaaRating());
            io.print("Your Notes: " + dvd.getUserNote());
            io.print("");
        } else {
            io.print("No such dvd.");
        }
        io.readString("Please hit enter to continue.");
    }

    public void displayRemoveDvdBanner() {
        io.print("=== Remove DVD ===");
        io.print("");
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

    public void displayErrorMessage(String errorMsg) {
        io.print("=== ERROR ===");
        io.print(errorMsg);
    }
    
}
