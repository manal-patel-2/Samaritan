package com.motivatedmind.samaritan;

import java.util.LinkedList;

public class StorageManager {
    /*
    Standard for tags:
    lower case, trailing space is removed
     */
    private LinkedList<Tag> tagList = new LinkedList<>(); //stores all favorite tags
    /*
    Stores a temporary (cache) list of blips that have been retrieved from the server
    The blips are stored in string arrays in the following format:
    [name][user id][tags(parsable)][title][content]
     */
    private LinkedList<Blip> blipList = new LinkedList<>();
    /*
    Stores a temporary (cache) list of blips that have been created by the user.
    The user will also have a file that contains all their blips on the server so they can retrieve
    it whenever they need to or if the cache is deleted.
     */
    //private LinkedList<Blip> userBlipList = new LinkedList<>();
    //[user id][email][name][age][occupation][biography]
    //private String[] userProfile = new String[6]; //contains user data
    private Profile userProfile = new Profile();

    /*public boolean addUserBlip(Blip blip) {
        userBlipList.add(blip);
        return true;
    }*/

    public boolean addBlip(Blip blip) {
        blipList.add(blip);
        return true;
    }

    public boolean addTag(Tag tag) {
        tagList.add(tag);
        return true;
    }
}
