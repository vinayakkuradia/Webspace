package application.layers.dao.entity;

public class User {
	private int id;
	private String username;
	private String password;
	private UserType userType;
		
	public User() {
	}
	
	public User(String username, String password, UserType userType) {
		super();
		this.username = username;
		this.password = password;
		this.userType = userType;
	}
	
	public User(int id, String username, String password, UserType userType) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.userType = userType;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public UserType getUserType() {
		return userType;
	}
	public void setUserType(UserType userType) {
		this.userType = userType;
	}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [id=");
		builder.append(id);
		builder.append(", username=");
		builder.append(username);
		builder.append(", userType=");
		builder.append(userType);
		builder.append("]");
		return builder.toString();
	}
	
}
