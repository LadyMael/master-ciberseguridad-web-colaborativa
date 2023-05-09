package controllers;


import com.google.gson.JsonObject;
import models.User;
import play.mvc.Controller;

public class Api extends Controller {

    public static void removeAllUsers(){
        response.setHeader("X-Content-Type-Options", "nosniff");
        response.setHeader("Content-Security-Policy", "default-src 'self'; script-src 'self'; style-src 'self'; img-src 'self'; font-src 'self'; frame-src 'self'; connect-src 'self'; object-src 'none'; media-src 'self';");
        User.removeAll();
        renderJSON(new JsonObject());
    }
}
