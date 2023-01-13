package model;

import java.util.ArrayList;

import entity.*;

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

    public void insert(Peserta peserta) {
        listSiswa.add(peserta);
    }

    public void getDataPeserta(int index) {
        listSiswa.get(index);
    }

    public void set(Peserta peserta) {
        listSiswa.set(cek, peserta);
    }

    public int cekLogin(String nama, String password) {
        for (int j = 0; j < listSiswa.size(); j++) {
            if (getPeserta(j).getNama().equals(nama) && getPeserta(j).getPass().equals(password)) {
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

    public int jumlah_data_array_peserta() {
        return listSiswa.size();
    }

    public int getArrayList() {
        return listSiswa.size();
    }

    public Peserta getPeserta(int index) {
        return listSiswa.get(index);
    }

    public void setName(int index, String nama_baru) {

        listSiswa.get(index).setNama(nama_baru);
    }

    public void setAddres(int index, String alamat_baru) {
        listSiswa.get(index).setAlamat(alamat_baru);
    }

    public void setNotTlp(int index, String nomor_telepon_baru) {
        listSiswa.get(index).setNoTelpon(nomor_telepon_baru);
    }

    public void setPass(int index, String password_baru) {
        listSiswa.get(index).setPass(password_baru);
    }

    public void delete(int index) {
        listSiswa.remove(index);
    }

}