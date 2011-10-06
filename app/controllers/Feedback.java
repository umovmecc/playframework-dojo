package controllers;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity(name = "feedback")
public class Feedback extends Model {

	public Feedback(Boolean like) {
		this.like = like;
	}

	public Boolean like;

}
