/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.mydvdlibrary.dao;

import com.sg.mydvdlibrary.dto.Dvd;
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
public class MyDvdLibraryDaoFileImpl implements MyDvdLibraryDao {

    public static final String DVDLIBRARY_FILE = "dvdlibrary.txt";
    public static final String DELIMITER = "::";

    private Map<String, Dvd> dvds = new HashMap<>();

    private Dvd unmarshallDvd(String dvdAsText) {
        String[] dvdTokens = dvdAsText.split(DELIMITER);

        String dvdTitle = dvdTokens[0];
        Dvd dvdFromFile = new Dvd(dvdTitle);

        dvdFromFile.setDirectorName(dvdTokens[1]);
        dvdFromFile.setReleaseDate(dvdTokens[2]);
        dvdFromFile.setStudio(dvdTokens[3]);
        dvdFromFile.setMpaaRating(dvdTokens[4]);
        dvdFromFile.setUserNote(dvdTokens[5]);
        return dvdFromFile;
    }

    private void loadLibrary() throws MyDvdLibraryDaoException {
        Scanner scanner;
        try {
            scanner = new Scanner(
                new BufferedReader(
                    new FileReader(DVDLIBRARY_FILE)));
        } catch (FileNotFoundException e) {
            throw new MyDvdLibraryDaoException(
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
        String dvdAsText = aDvd.getDvdTitle() + DELIMITER;
        dvdAsText += aDvd.getDirectorName() + DELIMITER;
        dvdAsText += aDvd.getReleaseDate() + DELIMITER;
        dvdAsText += aDvd.getStudio() + DELIMITER;
        dvdAsText += aDvd.getMpaaRating() + DELIMITER;
        dvdAsText += aDvd.getUserNote();
        return dvdAsText;
    }

    private void writeLibrary() throws MyDvdLibraryDaoException {
        PrintWriter out;
        try {
            out = new PrintWriter(new FileWriter(DVDLIBRARY_FILE));
        } catch (IOException e) {
            throw new MyDvdLibraryDaoException("Could not save DVD data.", e);
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

    @Override
        public Dvd addDvd(String dvdTitle, Dvd dvd) throws MyDvdLibraryDaoException {
            loadLibrary();
            Dvd newDvd = dvds.put(dvdTitle, dvd);
            return newDvd;
    }

    @Override
        public List<Dvd> getAllDvds()throws MyDvdLibraryDaoException {
            loadLibrary();
            return new ArrayList<Dvd>(dvds.values());
    }

    @Override
        public Dvd getDvd(String dvdTitle) throws MyDvdLibraryDaoException {
            loadLibrary();
            return dvds.get(dvdTitle);
    }

    @Override
        public Dvd removeDvd(String dvdId) throws MyDvdLibraryDaoException {
            loadLibrary();
            Dvd removedDvd = dvds.remove(dvdId);
            writeLibrary();
            return removedDvd;
    }

}
