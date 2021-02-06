package com.motivatedmind.samaritan;

import android.media.Image;

public class User {
    String name;
    String age;
    String occupation; //job, education etc.
    String biography;
    Image profilePicture;

    //default constructor
    public User() {

    }

    public User(String name, String age, String occupation, String biography, Image profilePicture) {
        this.name = name;
        this.age = age;
        this.occupation = occupation;
        this.biography = biography;
        this.profilePicture = profilePicture;
    }

    public String getName() {
        return name;
    }

    public Image getProfilePicture() {
        return profilePicture;
    }

    public String getAge() {
        return age;
    }

    public String getBiography() {
        return biography;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public void setProfilePicture(Image profilePicture) {
        this.profilePicture = profilePicture;
    }
}
