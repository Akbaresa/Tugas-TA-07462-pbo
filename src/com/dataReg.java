package com;

public class dataReg extends induk{
    public dataReg(String fname , String lnama , String adres , String tlp ,  
    String pw , int inpdtkrs  ){
        super.fnama = fname;
        super.lname = lnama;
        super.addrs = adres;
        super.notlp = tlp;
        super.pw = pw;
        super.inpdtkrs = inpdtkrs;
    }
    public String getAddrs() {
        return addrs;
    }
    public String getFnama() {
        return fnama;
    }
    public int getInpdtkrs() {
        return inpdtkrs;
    }
    public String getLname() {
        return lname;
    }
    public String getNotlp() {
        return notlp;
    }
    public String getPw() {
        return pw;
    }   
}
class induk {
    public String fnama , lname , addrs , notlp , pw  ;
    public int inpdtkrs;
}