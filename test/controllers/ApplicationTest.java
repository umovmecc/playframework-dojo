package controllers;

import org.junit.Test;

import play.mvc.Http.Response;
import play.test.FunctionalTest;

public class ApplicationTest extends FunctionalTest {

	@Test
	public void testThatIndexPageWorks() {
		Response response = GET("/");
		assertIsOk(response);
		assertContentType("text/html", response);
		assertCharset(play.Play.defaultWebEncoding, response);
	}

	@Test
	public void shouldBeAbleOpenFeedbackPage() {
		Response response = GET("/Application/feedback");
		assertIsOk(response);
		assertContentMatch("usuarios gostaram do play framework", response);
	}
}