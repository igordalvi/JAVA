/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SummativeMilestone2.classroster.dto;

/**
 *
 * @author igord
 */
public class Dvd {

    private String dvdTitle;
    private String releaseDate;
    private String dvdId;
    private String mpaaRating;
    private String directorsName;
    private String studio;
    private String userNoteOrRating;

    public Dvd(String dvdId) {
    this.dvdId = dvdId;
    }

    public String getDvdTitle() {
    return dvdTitle;
    }

    public void setDvdTitle(String dvdTitle) {
    this.dvdTitle = dvdTitle;
    }

    public String getReleaseDate() {
    return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
    this.releaseDate = releaseDate;
    }

    public String getDvdId() {
    return dvdId;
    }

    public String getMpaaRating() {
    return mpaaRating;
    }

    public void setMpaaRating(String mpaaRating) {
    this.mpaaRating = mpaaRating;
    }

    public String getDirectorsName() {
    return directorsName;
    }

    public void setDirectorsName(String directorsName) {
    this.directorsName = directorsName;
    }

    public String getStudio() {
    return studio;
    }

    public void setStudio(String studio) {
    this.studio = studio;
    }

    public String getUserNoteOrRating() {
    return userNoteOrRating;
    }

    public void setUserNoteOrRating(String userNoteOrRating) {
    this.userNoteOrRating = userNoteOrRating;
    }

}
