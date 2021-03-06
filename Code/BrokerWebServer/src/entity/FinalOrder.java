package entity;

public class FinalOrder {
	private int id;
	private int osid; // origin sell order id
	private int obid; // origin buy order id
	private int quantity;
	private int price;
	private int status;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getOsid() {
		return osid;
	}

	public void setOsid(int osid) {
		this.osid = osid;
	}

	public int getObid() {
		return obid;
	}

	public void setObid(int obid) {
		this.obid = obid;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public FinalOrder() {
		super();
	}

	public FinalOrder(int id, int osid, int obid, int quantity, int price,
			int status) {
		super();
		this.id = id;
		this.osid = osid;
		this.obid = obid;
		this.quantity = quantity;
		this.price = price;
		this.status = status;
	}

	@Override
	public String toString() {
		return "|" + id + "," + osid + "," + obid + "," + quantity + ","
				+ price + "," + status;
	}

}
