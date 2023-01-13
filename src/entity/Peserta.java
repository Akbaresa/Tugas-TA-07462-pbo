package entity;

import java.util.Date;

public class Peserta extends Member {
    private String alamat, noTelpon, mdl, jdwl, kls;
    private int Npm;
    Date tglLahir;

    public Peserta(String nama, String alamat, String noTelpon, String password, Date tglLhr, int Npm) {
        super(nama, password);
        this.alamat = alamat;
        this.noTelpon = noTelpon;
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

    public String getNoTelpon() {
        return noTelpon;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setNoTelpon(String noTelpon) {
        this.noTelpon = noTelpon;
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
