/**
 * ItemDaoInterface
 */
package wolfen1842.hsc.DAO;

import java.util.List;

import wolfen1842.hsc.Models.Item;
import wolfen1842.hsc.enums.Platforms;

/**
 * @author John Sieglaff
 * Interface that defines the procedures that will be used to 
 * access the Item table in the database
 */
public interface ItemDaoInterface {
	/**
	 * Gets all of the items in the database
	 * @param includeSold True if sold items should be included
	 * @return list of items
	 */
	public List<Item> getAllItems(boolean includeSold);
	/**
	 * Gets all of the items by the source the item was bought at
	 * @param includeSold True if sold items should be included
	 * @param sourceId ID of the source
	 * @return List of items
	 */
	public List<Item> getAllItemsBySource(boolean includeSold, int sourceId);
	/**
	 * Gets all of the items by the platform they are being sold on
	 * @param includeSold True if sold items should be included
	 * @param platform Platform the item is being sold on
	 * @return List of items
	 */
	public List<Item> getAllItemsByPlatform(boolean includeSold, Platforms platform);
	/**
	 * Gets the item from the database for the ID supplied
	 * @param id ID to search for
	 * @return Item
	 */
	public Item getItemById(int id);
	/**
	 * Gets the item by the name passed in 
	 * @param name name to search for
	 * @return List of items with that name
	 */
	public List<Item> getItemByName(String name);
	/**
	 * Creates the item specified in the passed in object
	 * @param item Item to add to the database
	 * @return Status of Success
	 */
	public boolean createItem(Item item);
	/**
	 * Updates the item that is passed in with the updated values
	 * @param item Item with updated values
	 * @return Status of success
	 */
	public boolean updateItem(Item item);
	/**
	 * Deletes the item indicated by the passed in id
	 * @param id ID of the item to delete
	 * @return Status of success
	 */
	public boolean deleteItem(int id);
}
