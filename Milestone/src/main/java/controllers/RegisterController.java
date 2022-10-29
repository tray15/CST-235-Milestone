package controllers;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import beans.User;
import beans.RegisterAndLoginAuthentication;

@ManagedBean(name="registerController")
@ApplicationScoped
public class RegisterController {
	
	@ManagedProperty(value="#{auth}")
	private RegisterAndLoginAuthentication users;
	
	//Setter method. Required to get our application scoped
	//list of users. Will be read as null without.
	public void setUsers(RegisterAndLoginAuthentication users) {
		this.users = users;
	}
	
	/*
	 * Submit for registration.
	 * Will check if the username already exists and return
	 * the user back to registration page if it does.
	 */
	public String onSubmit(User user) {
		
		FacesContext context = FacesContext.getCurrentInstance();
		
		//See if a user with the username already exists.
		for (User existingUser : users.getUsers()) {
			if (existingUser.getUsername().equals(user.getUsername())) {
				
			context.getExternalContext().getRequestMap().put("user", user);
				//Return the user back to registration page
				return "Register.xhtml";
			}
		}
		
		System.out.println("Sucessfully registered the user: " + user.getUsername());

		//We successfully registered, adding the user to our "database".
		users.addUser(user);
		
		//Take the user to login with their new account credentials.
		return "Login.xhtml";
	}
}
