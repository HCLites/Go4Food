

import javax.persistence.*;

@Entity(name = "customer")
@Table(name="customer")
public class Customer {
	
	@Column(nullable=false)
	String first_name;
	@Column
	String last_name;
	@Id
	String user_name;
	@Column(unique=true)
	String email;
	@Column(unique=true, length=10)
	int mobile;
	@Column(nullable=false)
	String address;
	@Column(nullable=false)
	String password;
	@Column(length=6)
	String gender;
	
	public Customer(String first_name, String last_name, String user_name, String email, int mobile, String address,
			String password, String gender) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.user_name = user_name;
		this.email = email;
		this.mobile = mobile;
		this.address = address;
		this.password = password;
		this.gender = gender;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	
	
}
