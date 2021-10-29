/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SummativeMilestone2.dvdlibrary.dao;

import SummativeMilestone2.dvdlibrary.dto.Dvd;
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
public class DvdLibraryDaoFileImpl implements DvdLibraryDao {

    public static final String DVDLIBRARY_FILE = "dvdlibrary.txt";
    public static final String DELIMITER = "::";

    private final Map<String, Dvd> dvds = new HashMap<>();

    private Dvd unmarshallDvd(String dvdAsText) {
        String[] dvdTokens = dvdAsText.split(DELIMITER);

        String dvdTitle = dvdTokens[0];

        Dvd dvdFromFile = new Dvd(dvdTitle);

        //dvdFromFile.setDvdTitle(dvdTokens[0]);

        dvdFromFile.setReleaseDate(dvdTokens[1]);

        dvdFromFile.setMpaaRating(dvdTokens[2]);

        dvdFromFile.setDirectorsName(dvdTokens[3]);

        dvdFromFile.setStudio(dvdTokens[4]);

        dvdFromFile.setUserNoteOrRating(dvdTokens[5]);

        return dvdFromFile;
    }

    private void loadLibrary() throws DvdLibraryDaoException {
        Scanner scanner;
        try {
            scanner = new Scanner(
                    new BufferedReader(
                            new FileReader(DVDLIBRARY_FILE)));
        } catch (FileNotFoundException e) {
            throw new DvdLibraryDaoException(
                    "-_- Could not load DVD data into memory.", e);
        }

        Dvd currentDvd;

        while (scanner.hasNextLine()) {

            currentDvd = unmarshallDvd(scanner.nextLine());
            dvds.put(currentDvd.getDvdTitle(), currentDvd);
        }

        scanner.close();
    }

    private String marshallDvd(Dvd aDvd) {

        //String dvdAsText = aDvd.getDvdId() + DELIMITER;

        String dvdAsText = aDvd.getDvdTitle() + DELIMITER;

        dvdAsText += aDvd.getReleaseDate() + DELIMITER;

        dvdAsText += aDvd.getMpaaRating() + DELIMITER;

        dvdAsText += aDvd.getDirectorsName() + DELIMITER;

        dvdAsText += aDvd.getStudio() + DELIMITER;

        dvdAsText += aDvd.getUserNoteOrRating();

        return dvdAsText;
    }

    private void writeLibrary() throws DvdLibraryDaoException {
        PrintWriter out;
        try {
            out = new PrintWriter(new FileWriter(DVDLIBRARY_FILE));
        } catch (IOException e) {
            throw new DvdLibraryDaoException("Could not save DVD data.", e);
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
     * @param dvdTitle
     * @param dvd
     * @return
     * @throws DvdLibraryDaoException
     */
    @Override
    public Dvd addDvd(String dvdTitle, Dvd dvd) throws DvdLibraryDaoException {
        loadLibrary();
        Dvd newDvd = dvds.put(dvdTitle, dvd);
        writeLibrary();
        return newDvd;
    }

    @Override
    public List<Dvd> getAllDvds() throws DvdLibraryDaoException {
        loadLibrary();
        return new ArrayList(dvds.values());
    }

    @Override
    public Dvd getDvd(String title) throws DvdLibraryDaoException {
        loadLibrary();
        return dvds.get(title);
    }

    @Override
    public Dvd removeDvd(String dvdTitle) throws DvdLibraryDaoException {
        loadLibrary();
        Dvd removedDvd = dvds.remove(dvdTitle);
        writeLibrary();
        return removedDvd;
    }

///????

//    @Override
//    public Dvd dvdSearch(String searchDvdByTitle) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
}
