package application.layers.dao;

public class Customer {
	private int id;
	private String firstname; 
	private String lastname;
	private String address;
	private String mobile;
	private String email;
	
		
	public Customer() {
	}

	public Customer(String firstname, String lastname, String address, String mobile, String email) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
		this.mobile = mobile;
		this.email = email;
	}

	Customer(int id, String firstname, String lastname, String address, String mobile, String email) {
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
		this.mobile = mobile;
		this.email = email;
	}

	public int getId() {
		return id;
	}
	
	void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Customer [id=");
		builder.append(id);
		builder.append(", firstname=");
		builder.append(firstname);
		builder.append(", lastname=");
		builder.append(lastname);
		builder.append(", address=");
		builder.append(address);
		builder.append(", mobile=");
		builder.append(mobile);
		builder.append(", email=");
		builder.append(email);
		builder.append("]");
		return builder.toString();
	}
	
}
