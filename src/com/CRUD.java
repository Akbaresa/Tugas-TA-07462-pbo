package com;
import java.util.Scanner;
import java.util.ArrayList;
public class CRUD {
    Scanner inp = new Scanner(System.in);
    public int pilih;
    ArrayList<dataKursus> arr = new ArrayList<>();
    ArrayList<dataReg> arrReg = new ArrayList<>();
    int idxLogin;
    public int inpDatakursus;
    public String Fname , Lname , Alamat, Tanggal ;
    public String pw , telp;
    public boolean log = false ;
    //getter 
    public String getAlamat() {
        return Alamat;
    }
    public String getFname() {
        return Fname;
    }
    public String getLname() {
        return Lname;
    }
    public String getTanggal() {
        return Tanggal;
    }
    public String getPw() {
        return pw;
    }
    public String getTelp() {
        return telp;
    }

    public void upDate(){
        if (log == true){
            System.out.println("\nSISTEM EDIT\n");
            System.out.println("akun " + arrReg.get(idxLogin).getFnama() + " " + arrReg.get(idxLogin).getLname() + " yang akan diedit");
            System.out.println("=============================");
                System.out.print("nama depan    : ");
                Fname = inp.next();
                Fname = getFname();
                System.out.print("nama belakang : ");
                Lname = inp.next();
                Lname = getLname();
                System.out.print("Alamat        : ");
                Alamat = inp.next();
                Alamat = getAlamat();
                System.out.print("No telp       : ");
                telp = inp.next();
                telp = getTelp();
                System.out.print("Password      : ");
                pw = inp.next();
                pw = getPw();
                viewDatakursus();
                System.out.print("pilih kursus : ");
                inpDatakursus = inp.nextInt();
                System.out.println("=============================");
                System.out.println("nama lengkap    : " + getFname()+ " " + getLname());
                System.out.println("Alamat          : " + getAlamat());
                System.out.println("No telp         : " + getTelp());
                if(inpDatakursus == 1){
                    System.out.println("kursus          : " + arr.get(inpDatakursus - 1).getKursus());
                }
                else if (inpDatakursus == 2 ){
                    System.out.println("kursus          : " + arr.get(inpDatakursus - 1).getKursus());
                }
                else if (inpDatakursus == 3 ){
                    System.out.println("kursus          : " + arr.get(inpDatakursus - 1).getKursus());
                }System.out.println("=============================");
                
                    arrReg.set(idxLogin, new dataReg(Fname, Lname, Alamat, telp, pw, inpDatakursus));
        }else if(log == false){
            System.out.println("LOGIN terlebih dahulu yaa hehe");
        }else if(arrReg.isEmpty()){
            System.out.println("DAFTAR DULU WOE");
        }
    }

    public void Daftar(){        
        System.out.println("=========================================");
        System.out.println("Daftar Akun kursus \n");
        System.out.print("nama depan    : ");
        Fname = inp.next();
        Fname = getFname();
        System.out.print("nama belakang : ");
        Lname = inp.next();
        Lname = getLname();
        System.out.print("Alamat        : ");
        Alamat = inp.next();
        Alamat = getAlamat();
        System.out.print("No telp       : ");
        telp = inp.next();
        telp = getTelp();
        System.out.print("Password      : ");
        pw = inp.next();
        pw = getPw();
        dataKursus();
        System.out.println("=========================================");
        System.out.println("Daftar Kursus di Kursus ESA : \n");
        viewDatakursus();
        System.out.print("pilih kursus : ");
        inpDatakursus = inp.nextInt();
        arrReg.add(new dataReg(Fname, Lname, Alamat, telp, pw,inpDatakursus));
        System.out.println("\nAKUN ANDA BERHASIL DIBUAT");
        System.out.println("=============================");
        System.out.println("nama lengkap    : " + getFname()+ " " + getLname());
        System.out.println("Alamat          : " + getAlamat());
        System.out.println("No telp         : " + getTelp());
        if(inpDatakursus == 1){
            System.out.println("kursus          : " + arr.get(inpDatakursus - 1).getKursus());
        }
        else if (inpDatakursus == 2 ){
            System.out.println("kursus          : " + arr.get(inpDatakursus - 1).getKursus());
        }
        else if (inpDatakursus == 3 ){
            System.out.println("kursus          : " + arr.get(inpDatakursus - 1).getKursus());
        }
    }
    
    public void viewDatakursus(){
        System.out.println("1. " + arr.get(0).getKursus());
        System.out.println("2. " + arr.get(1).getKursus());
        System.out.println("3. " + arr.get(2).getKursus());
    }
    public void display() {
        if(arrReg.isEmpty() == false){
            for(int i = 0 ; i < arrReg.size() ; i++){
                System.out.println("account ke-" + (i+1));
                System.out.println("=============================");
                System.out.println("Nama lengkap    : " + arrReg.get(i).getFnama()+ " " + arrReg.get(i).getLname());
                System.out.println("Alamat          : " + arrReg.get(i).getAddrs());
                System.out.println("No telp         : " + arrReg.get(i).getNotlp());
                if(inpDatakursus == 1){
                    System.out.println("kursus          : " + arr.get(inpDatakursus - 1).getKursus());
                }
                else if (inpDatakursus == 2 ){
                    System.out.println("kursus          : " + arr.get(inpDatakursus - 1).getKursus());
                }
                else if (inpDatakursus == 3 ){
                    System.out.println("kursus          : " + arr.get(inpDatakursus - 1).getKursus());
                }System.out.println("=============================");
            }
        }
        else if (arrReg.isEmpty() == true){
            System.out.println("\nTIDAK ADA AKUN YANG DIISI");
            System.out.println("YAAAAA KOSONG AOKAOWKOAWK");
        }
    }
    public int l;
    public void Login() {
        String login;
        String pwS;
        System.out.println("=========================================");
        System.out.println("Login akun kursus di kursus ESA ");
        System.out.print("nama depan    : ");
        login = inp.next();
        System.out.print("Password      : ");
        pwS = inp.next();
        if (arrReg.isEmpty()){
            System.out.println("DAFTAR DULU WOE");
        }
        for( l = 0 ; l < arrReg.size(); l++){
            if (login.equals(arrReg.get(l).getFnama()) && pwS.equals(arrReg.get(l).getPw())){
                {
                    System.out.println("\n--ANDA SUDAH LOGIN--");
                    System.out.println("=============================");
                    System.out.println("nama lengkap  : " + arrReg.get(l).getFnama()+ " " + arrReg.get(l).getLname());
                    System.out.println("Alamat        : " + arrReg.get(l).getAddrs());
                    System.out.println("No telp       : " + arrReg.get(l).getNotlp());
                    System.out.println("kursus        : " + arr.get(inpDatakursus-1).getKursus());
                    System.out.println("=============================");  
                    log = true;
                    idxLogin = l;
                }
                
                }else if(login != arrReg.get(l).getFnama() && pwS != arrReg.get(l).getPw()){
                    System.out.println("data yang anda masukkan salah");
                }
            }
    }
    void delete(){
        if (log == true){
            System.out.println("=============================");
            System.out.println("ini adalah sistem DELETE");
            System.out.println("apakah anda ingin menghapus akun " + arrReg.get(idxLogin).getFnama() 
            + " " + arrReg.get(idxLogin).getLname() + " (y/t)?");
            String y = inp.next();
            if (y.equals("y")){
                arrReg.remove(idxLogin);
            }else if(y.equals("t")){
                System.out.println("delete dibatalkan");
            }
        }else if (log == false){
            System.out.println("LOGIN DULU YA HEHE");
        }else if(arrReg.isEmpty()){
            System.out.println("DAFTAR DULU WOE");
        }
    }
    void dataKursus(){
        String dataK[] = {"kursus coding java" , "kursus coding phyton" , "kursus coding javascript"};
        for (int i = 0 ; i < dataK.length ; i++){
            arr.add(new dataKursus(dataK[i]));
        }
     }
}

