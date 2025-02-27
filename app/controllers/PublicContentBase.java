package controllers;


import helpers.HashUtils;
import models.User;
import play.mvc.Controller;

public class PublicContentBase extends Controller {

    public static void register(){
        response.setHeader("X-Content-Type-Options", "nosniff");
        render();
    }

    public static void processRegister(String username, String password, String passwordCheck, String type){
        User u = new User(username, HashUtils.getMd5(password), type, -1);
        u.save();
        registerComplete();
    }

    public static void registerComplete(){
        response.setHeader("X-Content-Type-Options", "nosniff");
        render();
    }
}
