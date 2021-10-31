/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.mydvdlibrary.dao;

import com.sg.mydvdlibrary.dto.Dvd;
import java.util.List;

/**
 *
 * @author igord
 */
public interface MyDvdLibraryDao {

    /**
     * Adds the given Dvd to the library. If there is already a dvd associated with the given
     * dvd title, it will return that dvd object, otherwise it will return
     * null.
     *
     * @param dvdTitle title with which dvd is to be associated
     * @param dvd dvd to be added to the library
     * @return the Dvd object previously associated with the given dvd
     * title if it exists, null otherwise
     * @throws MyDvdLibraryDaoException
     */
    Dvd addDvd(String dvdTitle, Dvd dvd) throws MyDvdLibraryDaoException;

    /**
     * Returns a List of all dvds in the library.
     *
     * @return List containing all dvds in the library.
     * @throws com.sg.mydvdlibrary.dao.MyDvdLibraryDaoException
     */
    List<Dvd> getAllDvds() throws MyDvdLibraryDaoException;

    /**
     * Returns the dvd object associated with the given dvd title.Returns null if no such dvd exists
     *
     * @param dvdTitle Title of the dvd to retrieve
     * @return the Dvd object associated with the given dvd title, null if
     * no such dvd exists
     * @throws com.sg.mydvdlibrary.dao.MyDvdLibraryDaoException
     */
    Dvd getDvd(String dvdTitle) throws MyDvdLibraryDaoException;

    /**
     * Removes from the library the dvd associated with the given title.Returns the dvd object that is being removed or null if there is no dvd associated with the given title
     *
     * @param dvdId
     * @return Dvd object that was removed or null if no dvd was
     * associated with the given dvd title
     * @throws com.sg.mydvdlibrary.dao.MyDvdLibraryDaoException
     */
    Dvd removeDvd(String dvdId) throws MyDvdLibraryDaoException;
}
