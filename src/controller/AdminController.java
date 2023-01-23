package controller;

import entity.Peserta;

public class AdminController implements InterfaceController {
    int indexLogin = 0;

    public int login(String id, String passwordlogin) {
        int status = 0;
        if (id.equals(AllModelObj.admin.getId()) && passwordlogin.equals(AllModelObj.admin.getPass())) {
            status = 1;
        } else {
            status = -1;
        }
        return status;
    }

    public void deleteByAdmin(int index) {
        AllModelObj.siswa.listSiswa.remove(index);
    }

    public String getDataAdmin() {
        return AllModelObj.admin.getId();
    }

    public Peserta getData(int index) {
        return AllModelObj.siswa.listSiswa.get(index);
    }

    public int search(String nama, String gmail) {
        for (int i = 0; i < AllModelObj.siswa.listSiswa.size(); i++) {
            if (gmail.equals(AllModelObj.siswa.getListSiswa().get(i).getgmail())
                    && nama.equals(AllModelObj.siswa.getListSiswa().get(i).getNama())) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int loginAdmin(String id, String pass) {
        return indexLogin = AllModelObj.admin.loginAdmin(id, pass);
    }
}