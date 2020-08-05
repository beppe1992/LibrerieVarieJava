package it.prova.springaop.service;

/**
 * Created by arx50011 on 12/06/2015.
 */
public class MioSitoService {

    private String login = "Mario";

    public String loginSuMioSito(String username) {
        this.login = username;
        return "Login avvenuto con successo";
    }

    public String getLogin() {
        return login;
    }

    public String getLoginUpperCase() {
        return login.toUpperCase();
    }
    
    public String metodoInErrore(){
    	String s = null;
    	return s.toString();
    }
}
