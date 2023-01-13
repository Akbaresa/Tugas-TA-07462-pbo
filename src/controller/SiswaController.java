package controller;

import java.util.Date;

import entity.Peserta;

public class SiswaController implements InterfaceController {
    private int cekLogin = 0;
    public int NpmInc = 0;

    public int getNpmInc() {
        return NpmInc;
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

    public void reg(String nama, String alamat, String noTelp, String password, Date tgllahir) {
        AllModelObj.siswa.insert(new Peserta(nama, alamat, noTelp, password, tgllahir, NpmInc++));
    }

    public void set(String nama, String alamat, String noTelp, String password, Date tgllahir) {
        AllModelObj.siswa.set(new Peserta(nama, alamat, noTelp, password, tgllahir, NpmInc));
    }

    @Override
    public int login(String nama, String pasword) {
        cekLogin = AllModelObj.siswa.cekLogin(nama, pasword);
        return cekLogin;
    }

    public int getArrayList() {
        return AllModelObj.siswa.getArrayList();
    }

    public void setName(String newName) {
        AllModelObj.siswa.setName(cekLogin, newName);

    }

    public void setAddres(String newAddres) {
        AllModelObj.siswa.setAddres(cekLogin, newAddres);
    }

    public void setNotTlp(String noTlp) {
        AllModelObj.siswa.setNotTlp(cekLogin, noTlp);

    }

    public void setPass(String newPass) {
        AllModelObj.siswa.setPass(cekLogin, newPass);
    }

    public void delete() {
        AllModelObj.siswa.delete(cekLogin);
    }

    @Override
    public int loginAdmin(String id, String pass) {

        return 0;
    }

}
