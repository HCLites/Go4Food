

import javax.persistence.Column;

public class FullAddress {
	@Column(name="Address", nullable=false)
	private String hno, building, street, locality, state;
	private int pincode;
	public FullAddress(String hno, String building, String street, String locality, String state, int pincode) {
		super();
		this.hno = hno;
		this.building = building;
		this.street = street;
		this.locality = locality;
		this.state = state;
		this.pincode = pincode;
	}
	public String getHno() {
		return hno;
	}
	public void setHno(String hno) {
		this.hno = hno;
	}
	public String getBuilding() {
		return building;
	}
	public void setBuilding(String building) {
		this.building = building;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getLocality() {
		return locality;
	}
	public void setLocality(String locality) {
		this.locality = locality;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return hno + ", " + building + ", " + street + ", " + locality
				+ ", " + state + ", " + pincode;
	}
	
	
}
