package beans;

import javax.faces.bean.ManagedBean;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/*
 * @author Tanner Ray
 * 
 * User model class
 * 
 */

@ManagedBean
public class User {
	
	@NotNull()
	@Size(min=2, max=15)
	private String firstName;
	
	@NotNull()
	@Size(min=2, max=15)
	private String lastName;
	
	@NotNull()
	@Size(min=2, max=50)
	private String email;
	
	@NotNull()
	@Size(min=6, max=12)
	private String phoneNumber;
	
	@NotNull()
	@Size(min=3, max=15)
	private String username;
	
	@NotNull()
	@Size(min=5, max=15)
	private String password;
	
	public User() {
		firstName = "Tanner";
		lastName = "Ray";
		email = "someemail@someemailprovider.com";
		phoneNumber = "867-5309";
		username = "tanner.ray";
		password = "somepass";
	}
	
	public User(String firstName, String lastName, String email, String phoneNumber, String username, String password) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.username = username;
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
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
}
