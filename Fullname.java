import javax.persistence.*;

public class Fullname {
	
	@Column(name="first_name", nullable=false)
	private String firstName;
	@Column(name="middle_name", nullable=true)
	private String middleName;
	@Column(name="last_name", nullable=false)
	private String lastName;
	
	public Fullname(String firstName, String middleName, String lastName) {
		super();
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
	}
	
	public Fullname(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Fullname() {
		super();
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return firstName + " " + middleName + " " + lastName;
	}
	
	
	
}
