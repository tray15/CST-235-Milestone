package controllers;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.application.FacesMessage;

import beans.RegisterAndLoginAuthentication;
import beans.User;

@ManagedBean
@ViewScoped
public class LoginController {
	
	@ManagedProperty(value="#{auth}")
	private RegisterAndLoginAuthentication users;
	
	public void setUsers(RegisterAndLoginAuthentication users) {
		this.users = users;
	}
	
	public String onSubmit(User user) {
		FacesContext context = FacesContext.getCurrentInstance();
		//Pass username and password through authentication
		if (users.authenticateUser(user.getUsername(), user.getPassword()))
			//If username and password match, take to home page
			return "Index.xhtml";
		else 
			//username or password incorrect, returned to login page.
			context.addMessage("LoginController error", new FacesMessage("The username and/or password are incorrect."));
		
		return "Login.xhtml";
	}
}
