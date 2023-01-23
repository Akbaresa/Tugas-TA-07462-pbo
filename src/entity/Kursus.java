package entity;

public class Kursus {
    private String modul, jam, kelas;

    public Kursus(String mdl, String jdwl, String kls) {
        this.modul = mdl;
        this.jam = jdwl;
        this.kelas = kls;
    }

    public void setjam(String jam) {
        this.jam = jam;
    }

    public String getjam() {
        return jam;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public String getKelas() {
        return kelas;
    }

    public void setModul(String modul) {
        this.modul = modul;
    }

    public String getModul() {
        return modul;
    }
}
