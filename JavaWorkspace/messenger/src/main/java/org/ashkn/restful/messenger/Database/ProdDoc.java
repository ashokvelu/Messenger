package org.ashkn.restful.messenger.Database;

import java.util.Date;

public class ProdDoc {
    private String prodname;
    private int price;
    private String prodtype;
    public ProdDoc(){
    	
    }
	public ProdDoc(String prodname, String prodtype, int price) {
		this.prodname = prodname;
		this.prodtype = prodtype;
		this.price = price;
	}
	public String getProdname() {
		return prodname;
	}
	public void setProdname(String prodname) {
		this.prodname = prodname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getProdtype() {
		return prodtype;
	}
	public void setProdtype(String prodtype) {
		this.prodtype = prodtype;
	}
	@Override
	public String toString() {
		return "ProdDoc [prodname=" + prodname + ", price=" + price + ", prodtype=" + prodtype + "]";
	}
	
}
