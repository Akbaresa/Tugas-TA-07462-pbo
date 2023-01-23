package model;

import java.util.ArrayList;

import entity.*;
import viewFull.reg_gui;

public class Siswa {
    public int cek = 0;
    public ArrayList<Peserta> listSiswa;
    public ArrayList<Kursus> listKursus;

    public int getCek() {
        return cek;
    }

    public Siswa() {
        this.listSiswa = new ArrayList<>();
        this.listKursus = new ArrayList<>();
    }

    public void insertKursus(Kursus kursus) {
        listKursus.add(kursus);
    }

    public void insert(Peserta peserta) {
        listSiswa.add(peserta);
    }

    public void getDataPeserta(int index) {
        listSiswa.get(index);
    }

    public Kursus getDataKursus(int index) {
        return listKursus.get(index);
    }

    public void set(Peserta peserta) {
        listSiswa.set(cek, peserta);
    }

    public int cekLogin(String nama, String password) {
        for (int j = 0; j < listSiswa.size(); j++) {
            if (listSiswa.get(j).getNama().equals(nama) && listSiswa.get(j).getPass().equals(password)) {
                cek = j;
            } else {
                cek = -1;
            }
        }
        return cek;
    }

    public ArrayList<Peserta> getListSiswa() {
        return listSiswa;
    }

    public int getArraylistKursus() {
        return listKursus.size();
    }

    public int jumlah_data_array_peserta() {
        return listSiswa.size();
    }

    public int getArrayList() {
        return listSiswa.size();
    }

    public Peserta getPeserta(int index) {
        return listSiswa.get(index);
    }

}