/**
 * Source.java
 */
package wolfen1842.hsc.Models;

/**
 * @author John Sieglaff
 * Class that defines the layout of the Source database table
 */
public class Source {
	private int id;
	private String name;
	private String location;
	
	/**
	 * Default constructor for the class
	 */
	public Source() {
		
	}// end default constructor
	
	/**
	 * Constructor for the class that takes all pieces of the 
	 * source object
	 * @param id ID of the source
	 * @param name Name of the source
	 * @param location Location of the source
	 */
	public Source(int id, String name, String location) {
		this.id = id;
		this.name = name;
		this.location = location;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}
	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
}
