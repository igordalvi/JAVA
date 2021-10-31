/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.mydvdlibrary.dto;

/**
 *
 * @author igord
 */
public class Dvd {

    private String dvdTitle;
    private String directorName;
    private String releaseDate;
    private String mpaaRating;
    private String studio;
    private String userNote;

    public Dvd(String dvdTitle) {
        this.dvdTitle = dvdTitle;
    }
    
    public String getDvdTitle() {
        return dvdTitle;
    }
    
    public String getDirectorName() {
        return directorName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }
    
    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public String getMpaaRating() {
        return mpaaRating;
    }

    public void setMpaaRating(String mpaaRating) {
        this.mpaaRating = mpaaRating;
    }
    
    public String getUserNote() {
        return userNote;
    }

    public void setUserNote(String userNote) {
        this.userNote = userNote;
    }
}
