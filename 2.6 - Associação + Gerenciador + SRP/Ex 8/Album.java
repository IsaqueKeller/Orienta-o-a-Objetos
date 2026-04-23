package com.mycompany.exerciciooo;
import java.util.ArrayList;
import java.util.List;

public class Album {
    private String nameOfTheAlbum;
    private int yearOfLaunch;
    private List<Musica> listOfMusics;
    
    public Album () {
        nameOfTheAlbum = "";
        yearOfLaunch = 0;
        listOfMusics = new ArrayList <>();
    }

    public void addMusics (List listOfMusics) {
        for (Musica music:listOfMusics) {
            music.preencher();
        }
    }
    
    public String getNameOfTheAlbum() {
        return nameOfTheAlbum;
    }

    public void setNameOfTheAlbum(String nameOfTheAlbum) {
        this.nameOfTheAlbum = nameOfTheAlbum;
    }

    public int getYearOfLaunch() {
        return yearOfLaunch;
    }

    public void setYearOfLaunch(int yearOfLaunch) {
        this.yearOfLaunch = yearOfLaunch;
    }

    public List getListOfMusics() {
        return listOfMusics;
    }

    public void setListOfMusics(List listOfMusics) {
        this.listOfMusics = listOfMusics;
    }
}
