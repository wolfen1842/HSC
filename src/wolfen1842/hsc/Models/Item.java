/**
 * Item.java
 */
package wolfen1842.hsc.Models;

import java.util.Date;

import wolfen1842.hsc.enums.Platforms;

/**
 * @author John Sieglaff
 * Class that defines the Item database table records
 */
public class Item {
	private int id;
	private int sourceId;
	private String name;
	private String description;
	private Platforms platform;
	private float purchasePrice;
	private float listedPrice;
	private float salePrice;
	private float shippingCost;
	private float fee;
	private Date purchaseDate;
	private Date salesDate;
	
	/**
	 * Default constructor for the class
	 */
	public Item() {
		
	}// end default constructor

	/**
	 * Constructor that contains all of the field values for the Item type
	 * @param id - Item ID
	 * @param sourceId - Foreign Key pointing to source record
	 * @param name - Name of the item being sold
	 * @param description - description of the item
	 * @param platform - platform the item is being sold on
	 * @param purchasePrice - Price paid for the item
	 * @param listedPrice - Price the item is listed for
	 * @param salePrice - price the item was sold for
	 * @param shippingCost - Cost seller paid for shipping
	 * @param fee - fee the seller paid to the platform
	 * @param purchaseDate - Date item was purchased
	 * @param salesDate - Date item was sold
	 */
	public Item(int id, int sourceId, String name, String description, Platforms platform, float purchasePrice,
			float listedPrice, float salePrice, float shippingCost, float fee, Date purchaseDate, Date salesDate) {
		this.id = id;
		this.sourceId = sourceId;
		this.name = name;
		this.description = description;
		this.platform = platform;
		this.purchasePrice = purchasePrice;
		this.listedPrice = listedPrice;
		this.salePrice = salePrice;
		this.shippingCost = shippingCost;
		this.fee = fee;
		this.purchaseDate = purchaseDate;
		this.salesDate = salesDate;
	}// end constructor with all items

	/**
	 * @return the sourceId
	 */
	public int getSourceId() {
		return sourceId;
	}

	/**
	 * @param sourceId the sourceId to set
	 */
	public void setSourceId(int sourceId) {
		this.sourceId = sourceId;
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
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the platform
	 */
	public Platforms getPlatform() {
		return platform;
	}

	/**
	 * @param platform the platform to set
	 */
	public void setPlatform(Platforms platform) {
		this.platform = platform;
	}

	/**
	 * @return the purchasePrice
	 */
	public float getPurchasePrice() {
		return purchasePrice;
	}

	/**
	 * @param purchasePrice the purchasePrice to set
	 */
	public void setPurchasePrice(float purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	/**
	 * @return the listedPrice
	 */
	public float getListedPrice() {
		return listedPrice;
	}

	/**
	 * @param listedPrice the listedPrice to set
	 */
	public void setListedPrice(float listedPrice) {
		this.listedPrice = listedPrice;
	}

	/**
	 * @return the salePrice
	 */
	public float getSalePrice() {
		return salePrice;
	}

	/**
	 * @param salePrice the salePrice to set
	 */
	public void setSalePrice(float salePrice) {
		this.salePrice = salePrice;
	}

	/**
	 * @return the shippingCost
	 */
	public float getShippingCost() {
		return shippingCost;
	}

	/**
	 * @param shippingCost the shippingCost to set
	 */
	public void setShippingCost(float shippingCost) {
		this.shippingCost = shippingCost;
	}

	/**
	 * @return the fee
	 */
	public float getFee() {
		return fee;
	}

	/**
	 * @param fee the fee to set
	 */
	public void setFee(float fee) {
		this.fee = fee;
	}

	/**
	 * @return the purchaseDate
	 */
	public Date getPurchaseDate() {
		return purchaseDate;
	}

	/**
	 * @param purchaseDate the purchaseDate to set
	 */
	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	/**
	 * @return the salesDate
	 */
	public Date getSalesDate() {
		return salesDate;
	}

	/**
	 * @param salesDate the salesDate to set
	 */
	public void setSalesDate(Date salesDate) {
		this.salesDate = salesDate;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
}// end class Item
