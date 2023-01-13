package model;

import java.util.ArrayList;

import entity.Kursus;

public class kursusModel {
    public ArrayList<Kursus> listKursus;

    public kursusModel() {
        listKursus = new ArrayList<>();
    }

    public void insert(Kursus kursus) {
        listKursus.add(kursus);
    }

    public Kursus getListKursus(int index) {
        return listKursus.get(index);
    }
}
