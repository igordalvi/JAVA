/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SummativeMilestone2.classroster.dao;

import SummativeMilestone2.classroster.dto.Dvd;
import java.util.List;

/**
 *
 * @author igord
 */
public interface ClassRosterDao {
    /**
* Adds the given Dvd to the roster and associates it with the given
* dvd id. If there is already a dvd associated with the given
* dvd id it will return that dvd object, otherwise it will
* return null.
*
* @param dvdId id with which dvd is to be associated
* @param dvd dvd to be added to the roster
* @return the Dvd object previously associated with the given
* dvd id if it exists, null otherwise
* @throws ClassRosterDaoException
*/

Dvd addDvd(String dvdId, Dvd dvd) throws ClassRosterDaoException;
/**

* Returns a List of all Dvds on the roster.
*
* @return Dvd List containing all dvds on the roster.
* @throws ClassRosterDaoException
*/

List<Dvd> getAllDvds() throws ClassRosterDaoException;
/**
* Returns the dvd object associated with the given dvd id.
* Returns null if no such dvd exists
*
* @param dvdId ID of the dvd to retrieve
* @return the Dvd object associated with the given dvd id,
* null if no such dvd exists
* @throws ClassRosterDaoException
*/

Dvd getDvd(String dvdId) throws ClassRosterDaoException;
/**
* Removes from the roster the dvd associated with the given id.
* Returns the dvd object that is being removed or null if
* there is no dvd associated with the given id
*
* @param dvdId id of dvd to be removed
* @return Dvd object that was removed or null if no dvd
* was associated with the given dvd id
* @throws ClassRosterDaoException
*/
Dvd removeDvd(String dvdId) throws ClassRosterDaoException;
}
