package models;

import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Posting extends Model {

    @Id
    Integer id;

}
