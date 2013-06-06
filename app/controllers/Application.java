package controllers;

import models.Journal;
import models.Posting;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;

public class Application extends Controller {
  
    public static Result index() {

        /*
        * To reproduce an error:
        * 1. play clean compile
        * 2. play run
        * 3. insert a newline anywhere in Application.java
        * 4. F5
        * */
        Posting pos1 = new Posting();
        Posting pos2 = new Posting();
        new Journal(pos1, pos2);

        return ok(index.render("Your new application is ready."));
    }
  
}
