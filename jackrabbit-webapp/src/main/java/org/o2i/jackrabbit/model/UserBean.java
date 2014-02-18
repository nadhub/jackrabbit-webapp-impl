package org.o2i.jackrabbit.model;

public class UserBean {
	
	private Long userId;
	private String firstName;
	private String name;
	private String login;
	private String password;
	private boolean isValid = true;
	
	public UserBean() {
	}

	public UserBean(String firstName, String name, String login, String password,
			boolean isValid) {
		this.firstName = firstName;
		this.name = name;
		this.login = login;
		this.password = password;
		this.isValid = isValid;
	}
	
	

	public UserBean(String firstName, String login, String password) {
		super();
		this.firstName = firstName;
		this.login = login;
		this.password = password;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isValid() {
		return isValid;
	}

	public void setValid(boolean isValid) {
		this.isValid = isValid;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", firstName=" + firstName
				+ ", name=" + name + ", login=" + login + ", isValid="
				+ isValid + "]";
	}
	
	
	
	
	

}
