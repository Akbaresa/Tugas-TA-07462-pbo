package entity;

import java.util.Date;

public class Peserta extends Member {
    private String alamat, gmail, mdl, jdwl, kls;
    private int Npm;
    Date tglLahir;

    public Peserta(String nama, String gmail, String password, Date tglLhr) {
        super(nama, password);
        this.gmail = gmail;
        this.tglLahir = tglLhr;
        this.Npm = Npm;
    }

    public int getNpm() {
        return Npm;
    }

    public Date getTglLahir() {
        return tglLahir;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getgmail() {
        return gmail;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setgmail(String gmail) {
        this.gmail = gmail;
    }

    @Override
    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getPass() {
        return pass;
    }

    public String getMdl() {
        return mdl;
    }

    public void setMdl(String mdl) {
        this.mdl = mdl;
    }

    public String getJdwl() {
        return jdwl;
    }

    public void setJdwl(String jdwl) {
        this.jdwl = jdwl;
    }

    public String getKls() {
        return kls;
    }

    public void setKls(String kls) {
        this.kls = kls;
    }
}
