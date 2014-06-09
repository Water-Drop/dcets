package entity;

import java.util.Date;

public class OriginOrder {
	private int id;
	private int fid; // future id
	private int tid; // trader id
	private int quantity; // ����
	private int cumQtyl; // �ɽ���
	private int leavesqty; // ʣ��δ�ɽ���
	private int price; // ���Խ��ܵı���
	private Date date; // ����ʱ��
	private int status;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getFid() {
		return fid;
	}

	public void setFid(int fid) {
		this.fid = fid;
	}

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getCumQtyl() {
		return cumQtyl;
	}

	public void setCumQtyl(int cumQtyl) {
		this.cumQtyl = cumQtyl;
	}

	public int getLeavesqty() {
		return leavesqty;
	}

	public void setLeavesqty(int leavesqty) {
		this.leavesqty = leavesqty;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public OriginOrder(int id, int fid, int tid, int quantity, int cumQtyl,
			int leavesqty, int price, Date date, int status) {
		super();
		this.id = id;
		this.fid = fid;
		this.tid = tid;
		this.quantity = quantity;
		this.cumQtyl = cumQtyl;
		this.leavesqty = leavesqty;
		this.price = price;
		this.date = date;
		this.status = status;
	}

	public OriginOrder() {
		super();
	}

	@Override
	public String toString() {
		return "|" + id + "," + fid + "," + tid + "," + quantity + ","
				+ cumQtyl + "," + leavesqty + "," + price + "," + date + ","
				+ status;
	}

}
