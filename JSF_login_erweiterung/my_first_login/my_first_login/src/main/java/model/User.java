package model;

import javax.faces.context.FacesContext;

public class User {
	private String name;
	private String password;
	private boolean loggedIn;
    private String truename = "tester";
    private String truepw = "Password";

	public User() {
		loggedIn = false;
	}

	/**
	 * @return the loggedIn
	 */
	public boolean isLoggedIn() {
		return loggedIn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
        System.out.println("asdad");
		this.password = password;
	}

	public String login() {
		String ret = "failed";
		// DONE name und password ueberpruefen - im Fehlerfall "failed" returnen,
		// ansonsten "loggedIn" auf true setzen und "success" returnen
        System.out.println(name+","+password);
        if(name.equals(truename)&& password.equals(truepw)){
            loggedIn=true;
            ret = "success";
        }
		
		return ret;
	}

	public String logout() {
		loggedIn = false;
		// This session is now invalid!
		FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
		return "logout";
	}
}