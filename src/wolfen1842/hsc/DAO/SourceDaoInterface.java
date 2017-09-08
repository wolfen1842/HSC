/**
 * SourceDaoInterface.java
 */
package wolfen1842.hsc.DAO;

import java.util.List;

import wolfen1842.hsc.Models.Source;

/**
 * @author John Sieglaff
 * Interface that defines the Source Data Access Object
 */
public interface SourceDaoInterface {
	/**
	 * Adds a new source to the database
	 * @param newSource source record to be added
	 * @return indicator of success
	 */
	boolean createSource(Source newSource);
	/**
	 * Deletes the source record for the supplied id
	 * @param sourceId Id of source to delete
	 * @return indicator of success
	 */
	boolean deleteSource(int sourceId);
	/**
	 * Updates the source record with the supplied data
	 * @param sourceRecord updated record
	 * @return indicator of success
	 */
	boolean updateSource(Source sourceRecord);
	/**
	 * Gets the source record for the supplied ID
	 * @param sourceId Source ID to get the record for
	 * @return Source Record
	 */
	Source getSourceById(int sourceId);
	/**
	 * Gets all of the source records that match the supplied name
	 * @param name Name to search for
	 * @return List of sources that match the search
	 */
	List<Source> getSourceByName(String name);
	/**
	 * Gets all of the source records in the database
	 * @return List of source records
	 */
	List<Source> getAllSources();
}
