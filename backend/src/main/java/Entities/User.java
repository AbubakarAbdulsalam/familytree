package Entities;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity
public class User {

    @Id
    @GeneratedValue
    private int id;

    private String firstName;
    private String lastName;
    private String preferredName;

    private User father;
    private User mother;


    public User()
    {

    }

    /**
     *
     * @param firstName
     * @param lastName
     * @param father
     * @param mother
     */
    public User(String firstName, String lastName,
                User father,
                User mother)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.preferredName = firstName;
        this.father = father;
        this.mother = mother;
    }

    /**
     *
     * @param firstName
     * @param lastName
     * @param preferredName
     * @param father
     * @param mother
     */
    public User(String firstName, String lastName,
                String preferredName, User father,
                User mother)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.preferredName = preferredName;
        this.father = father;
        this.mother = mother;
    }

    /**
     * gets the user's identification number
     * @return
     */
    public int getId()
    {
        return  this.id;
    }

    /**
     * Sets the user's firstName
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * gets the user's firstName
     * @return
     */
    public String getFirstName()
    {
        return this.firstName;
    }

    /**
     * get the user's lastname
     * @return
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * set the user's LastName
     * @param lastName: user's lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * get the user's preferredName.
     * Name the user prefers being called
     * with
     * @return
     */
    public String getPreferredName() {
        return this.preferredName;
    }

    /**
     * set the user's preferredName.
     * Name the user prefers being called
     * with
     * @param preferredName
     */
    public void setPreferredName(String preferredName) {
        this.preferredName = preferredName;
    }

    /**
     * if the user's father is a User in the system
     * get reference to that user
     * @return father: reference to user's father
     */
    public User getFather() {
        return this.father;
    }

    /**
     * if the user's father is a User in the system
     * set reference to that user
     * @param father
     */
    public void setFather(User father) {
        this.father = father;
    }

    /**
     * if the user's mother is a User in the system
     * get reference to that user
     * @return reference to user's mother
     */
    public User getMother() {
        return this.mother;
    }

    /**
     if the user's father is a User in the system
     * set reference to that user
     * @param mother
     */
    public void setMother(User mother) {
        this.mother = mother;
    }


}
