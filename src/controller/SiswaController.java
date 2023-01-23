package controller;

import java.util.Date;

import entity.Kursus;
import entity.Peserta;

public class SiswaController implements InterfaceController {
    public int cekLogin = 0;
    public int NpmInc = 0;

    public int getNpmInc() {
        return NpmInc;
    }

    public void insertKursus(String modul, String jam, String kelas) {
        AllModelObj.siswa.insertKursus(new Kursus(modul, jam, kelas));
    }

    public Kursus getDatakKursus(int index) {
        return AllModelObj.siswa.getDataKursus(index);
    }

    public int getCekLogin() {
        return this.cekLogin;
    }

    public int search(String nama, int npm) {
        for (int i = 0; i < AllModelObj.siswa.getArrayList(); i++) {
            if (nama.equals(AllModelObj.siswa.listSiswa.get(i).getNama()) && npm == getNpmInc()) {
                return i;
            }
        }
        return -1;
    }

    public Peserta getData(int index) {
        return AllModelObj.siswa.getPeserta(index);
    }

    public Peserta getDataLogin() {
        return AllModelObj.siswa.getPeserta(cekLogin);
    }

    public void reg(String nama, String gmail, String password, Date tgllahir) {
        AllModelObj.siswa.insert(new Peserta(nama, gmail, password, tgllahir));
    }

    public void set(String nama, String gmail, String password, Date tgllahir) {
        AllModelObj.siswa.set(new Peserta(nama, gmail, password, tgllahir));
    }

    @Override
    public int login(String nama, String pasword) {
        cekLogin = AllModelObj.siswa.cekLogin(nama, pasword);
        return cekLogin;
    }

    public int getArrayList() {
        return AllModelObj.siswa.getArrayList();
    }

    @Override
    public int loginAdmin(String id, String pass) {
        return 0;
    }

}
