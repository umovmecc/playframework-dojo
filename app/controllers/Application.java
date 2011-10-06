package controllers;

import play.mvc.Controller;

public class Application extends Controller {

	public static void index() {
		render();
	}

	public static void feedback() {
		String message = "usuarios gostaram do play framework";
		long total = Feedback.count();
		render(total, message);
	}

}