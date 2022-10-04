/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.domain;


public class Learner {
  
    
    private int studnumber;
    private String firstname;
    private String surname;
    private String course;

    public Learner(int studnumber, String firstname, String surname, String course) {
        this.studnumber = studnumber;
        this.firstname = firstname;
        this.surname = surname;
        this.course = course;
    }

    public int getStudnumber() {
        return studnumber;
    }

    public void setStudnumber(int studnumber) {
        this.studnumber = studnumber;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Learner{" + "studnumber=" + studnumber + ", firstname=" + firstname + ", surname=" + surname + ", course=" + course + '}';
    }
    
    
}
