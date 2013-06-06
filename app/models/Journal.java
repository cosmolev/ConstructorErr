package models;

import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Journal extends Model {

    @Id
    Integer id;

    public Journal(Posting... postings) {
        this.id = 3;
    }
}
