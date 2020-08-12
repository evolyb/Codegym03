package com.codegym.model;

public abstract class Note {
    private int typeID;
    private String title;
    private String content;

    public Note() {}

    public Note(String title) {
        this.title = title;
    }

    public int getTypeID() {
        return typeID;
    }

    public void setTypeID(int typeID) {
        this.typeID = typeID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void save() {

    }
    public void delete() {

    }
}
