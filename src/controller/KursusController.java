package controller;

import java.text.SimpleDateFormat;

import javax.swing.table.DefaultTableModel;

import entity.Kursus;
import entity.Peserta;

public class KursusController {
    int indexLogin = 0;

    public void Kursus() {
        String kelas[] = { "A101", "A102", "A103", "B101" };
        String jadwal[] = { "7 hour", "11 hour", "12 hour", "11 hour" };
        String modul[] = { "phyton", "javascript", "dart", "php" };

        for (int i = 0; i < modul.length; i++) {
            AllModelObj.modelKursus.insert(new Kursus(modul[i], jadwal[i], kelas[i]));
        }
    }

    public Kursus getData(int index) {
        Kursus();
        return AllModelObj.modelKursus.getListKursus(index);
    }

    public Peserta getSiswaEntity() {
        return AllModelObj.siswa.getPeserta(indexLogin);
    }

    public void addKursus(String modul, String jadwal, String kelas) {
        AllModelObj.modelKursus.insert(new Kursus(modul, jadwal, kelas));
    }

    public DefaultTableModel daftarPeserta() {
        DefaultTableModel dtmDataUser = new DefaultTableModel();
        Object[] kolom = { "Nama", "Password", "No Telp", "Tgl Lahir", "course", "waktu", "Npm" };
        dtmDataUser.setColumnIdentifiers(kolom);
        int size = AllModelObj.siswa.getArrayList();

        for (int i = 0; i < size; i++) {
            Object[] data = new Object[7];
            data[0] = AllModelObj.siswa.getListSiswa().get(i).getNama();
            data[1] = AllModelObj.siswa.getListSiswa().get(i).getPass();
            data[2] = AllModelObj.siswa.getListSiswa().get(i).getNoTelpon();
            data[3] = new SimpleDateFormat("dd-MM-yyyy").format(AllModelObj.siswa.getListSiswa().get(i).getTglLahir());
            data[4] = getData(i).getModul();
            data[5] = AllModelObj.modelKursus.getListKursus(i).getJadwal();
            data[6] = AllModelObj.siswa.getListSiswa().get(i).getNpm();

            dtmDataUser.addRow(data);
        }
        return dtmDataUser;
    }
}
