package com.martial.law.jeremiah.martiallaw.models;

import jakarta.persistence.Entity;

enum Standing{
    Hero, Villian, Vigilante
}
@Entity
public class Avatar {
    String Firstname;
    String Lastname;
    String Alias;
    String Gender;
    Integer age;
    Integer ranking;
    Integer tier;
    Double bankBalance = 0.0;
    String Superpower = null;
    Standing standing;
    //Base of operations example, Batman is in Gotham City
    String CityBase;
    String jobTitle;



}
