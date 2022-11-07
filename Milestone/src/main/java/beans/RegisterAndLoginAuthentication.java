package beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

/*
 * @author Tanner Ray
 * @RegisterAndLoginAuthentication
 * 
 * this class handles registration and login authentication
 * this class is also a pseudo database for the time being and will
 * be converted to jdbc at a later time.
 * 
 * @RegisterAndLoginAuthentication method initializes a list of users
 * this bean can be injected to other views 
 * 
 * @authenticateuser method for registration it will verify that a user does
 * not already exist in the list of users. For the login form it will verify
 * that the user credentials being used are in the list
 */

@ManagedBean(name="auth")
@ApplicationScoped
public class RegisterAndLoginAuthentication {
	
	private List<User> usersList;
	
	/*
	 * Temporary list of users to act as database
	 */
	public RegisterAndLoginAuthentication() {
		usersList = new ArrayList<>();
		
		usersList.add(new User("xUser", "xLast", "xemail@email.com", "867-5309", "xuser", "xpass"));
		usersList.add(new User("yUser", "yLast", "yemail@email.com", "867-5309", "yuser", "ypass"));
		usersList.add(new User("zUser", "zLast", "zemail@email.com", "867-5309", "zuser", "zpass"));
		usersList.add(new User("tUser", "tLast", "temail@email.com", "867-5309", "tuser", "tpass"));
	}
	
	/*
	 * Verify username and password match what is in our list.
	 */
	public boolean authenticateUser(String username, String password) {
		
		boolean access = false;
		
		for (User user: usersList) {
			if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
				access = true;
			}
		}
		
		return access;
	}
	
	public void addUser(User user) {
		usersList.add(user);
	}
	
	public List<User> getUsers() {
		return usersList;
	}

	public void setUsers(List<User> users) {
		this.usersList = users;
	}
}
