package com.motivatedmind.samaritan;

import android.media.Image;

public class Profile {
    String name;
    String age;
    String occupation; //job, education etc.
    String biography;
    Image profilePicture;

    public Profile(String name, String age, String occupation, String biography, Image profilePicture) {
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
}
