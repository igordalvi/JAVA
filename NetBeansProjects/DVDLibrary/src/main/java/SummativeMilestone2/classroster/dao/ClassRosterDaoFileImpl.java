/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SummativeMilestone2.classroster.dao;

import SummativeMilestone2.classroster.dto.Dvd;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author igord
 */
public class ClassRosterDaoFileImpl implements ClassRosterDao {

    public static final String ROSTER_FILE = "roster.txt";
    public static final String DELIMITER = "::";

    private Map<String, Dvd> dvds = new HashMap<>();

    private Dvd unmarshallDvd(String dvdAsText) {
        String[] dvdTokens = dvdAsText.split(DELIMITER);

        String dvdId = dvdTokens[0];

        Dvd dvdFromFile = new Dvd(dvdId);

        dvdFromFile.setDvdTitle(dvdTokens[1]);

        dvdFromFile.setReleaseDate(dvdTokens[2]);

        dvdFromFile.setMpaaRating(dvdTokens[3]);

        dvdFromFile.setDirectorsName(dvdTokens[4]);

        dvdFromFile.setStudio(dvdTokens[5]);

        dvdFromFile.setUserNoteOrRating(dvdTokens[6]);

        return dvdFromFile;
    }

    private void loadRoster() throws ClassRosterDaoException {
        Scanner scanner;
        try {
            scanner = new Scanner(
                    new BufferedReader(
                            new FileReader(ROSTER_FILE)));
        } catch (FileNotFoundException e) {
            throw new ClassRosterDaoException(
                    "-_- Could not load roster data into memory.", e);
        }

        String currentLine;

        Dvd currentDvd;

        while (scanner.hasNextLine()) {

            currentLine = scanner.nextLine();

            currentDvd = unmarshallDvd(currentLine);

        }

        scanner.close();
    }

    private String marshallDvd(Dvd aDvd) {

        String dvdAsText = aDvd.getDvdId() + DELIMITER;

        dvdAsText += aDvd.getDvdTitle() + DELIMITER;

        dvdAsText += aDvd.getReleaseDate() + DELIMITER;

        dvdAsText += aDvd.getMpaaRating() + DELIMITER;

        dvdAsText += aDvd.getDirectorsName() + DELIMITER;

        dvdAsText += aDvd.getStudio() + DELIMITER;

        dvdAsText += aDvd.getUserNoteOrRating();

        return dvdAsText;
    }

    private void writeRoster() throws ClassRosterDaoException {
        PrintWriter out;
        try {
            out = new PrintWriter(new FileWriter(ROSTER_FILE));
        } catch (IOException e) {
            throw new ClassRosterDaoException("Could not save DVD data.", e);
        }

        String dvdAsText;
        List dvdList = this.getAllDvds();
        for (Object currentDvd : dvdList) {
            dvdAsText = marshallDvd((Dvd) currentDvd);
            out.println(dvdAsText);
            out.flush();
        }
        out.close();
    }

    /**
     *
     * @param dvdId
     * @param dvd
     * @return
     * @throws ClassRosterDaoException
     */
    @Override
    public Dvd addDvd(String dvdId, Dvd dvd) throws ClassRosterDaoException {
        loadRoster();
        Dvd newDvd = dvds.put(dvdId, dvd);
        writeRoster();
        return newDvd;
    }

    @Override
    public List<Dvd> getAllDvds() throws ClassRosterDaoException {
        loadRoster();
        return new ArrayList(dvds.values());
    }

    @Override
    public Dvd getDvd(String dvdId) throws ClassRosterDaoException {
        loadRoster();
        return dvds.get(dvdId);
    }
    
    @Override
    public Dvd removeDvd(String dvdId) throws ClassRosterDaoException {
        loadRoster();
        Dvd removedDvd = dvds.remove(dvdId);
        writeRoster();
        return removedDvd;
    }
///????
    @Override
    public Dvd dvdSearch(String searchDvdByTitle) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
