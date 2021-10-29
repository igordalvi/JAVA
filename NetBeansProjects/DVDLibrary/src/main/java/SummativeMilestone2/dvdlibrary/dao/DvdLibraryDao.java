/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SummativeMilestone2.dvdlibrary.dao;

import SummativeMilestone2.dvdlibrary.dto.Dvd;
import java.util.List;

/**
 *
 * @author igord
 */
public interface DvdLibraryDao {
    /**
* Adds the given Dvd to the roster and associates it with the given
* dvdTitle.If there is already a dvd associated with the given
 ddvdTitle it will return that dvd object, otherwise it will
 return null.
*
     * @param dvdTitle
* @param dvd dvd to be added to the roster
* @return the Dvd object previously associated with the given
* dvdTitle if it exists, null otherwise
* @throws DvdLibraryDaoException
*/

Dvd addDvd(String dvdTitle, Dvd dvd) throws DvdLibraryDaoException;
/**

* Returns a List of all Dvds on the roster.
*
* @return Dvd List containing all dvds on the roster.
* @throws DvdLibraryDaoException
*/

List<Dvd> getAllDvds() throws DvdLibraryDaoException;
/**
* Returns the dvd object associated with the given dvdTitle.
* Returns null if no such dvd exists
*
* @param dvdTitle of the dvd to retrieve
* @return the Dvd object associated with the given dvdTitle,
* null if no such dvd exists
* @throws DvdLibraryDaoException
*/

Dvd getDvd(String dvdTitle) throws DvdLibraryDaoException;
/**
* Removes from the roster the dvd associated with the title.Returns the dvd object that is being removed or null if
 there is no dvd associated with the given id
*
     * @param dvdTitle
* @return Dvd object that was removed or null if no dvd
* was associated with the given dvdTitle
* @throws DvdLibraryDaoException
*/
Dvd removeDvd(String dvdTitle) throws DvdLibraryDaoException;


}
