package com.codegym.model;

public class NoteManagement {
    private Note note;

    public void changeNoteStore(String noteType){
        if (noteType.equals("File")){
            note = new NoteFile();
        } else {
            note = new NoteDB();
        }
    }
    public Note[] searchNotes(String keyWord){
        return null;
    }
    public void addNote(int typeID, String title, String content){

    }
    public void removeNote(){

    }
}
