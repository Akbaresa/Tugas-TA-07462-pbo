package com;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        CRUD obj1 = new CRUD();
        Scanner inp = new Scanner(System.in);
        do {
            System.out.println("\n Kursus Coding ESA.com");
            System.out.println("=======================");
            System.out.println("1. Daftar Akun");
            System.out.println("2. Login ");
            System.out.println("3. Edit ");
            System.out.println("4. Hapus");
            System.out.println("5. lihat ");
            System.out.println("6. Exit");
            System.out.print("pilih : ");
            obj1.pilih = inp.nextInt();
            switch (obj1.pilih){
                case 1:
                System.out.print("\033[H\033[2J");
                System.out.flush();
                obj1.Daftar();
                break;
                case 2:
                System.out.print("\033[H\033[2J");
                System.out.flush();
                obj1.Login();
                break;
                case 3:
                System.out.print("\033[H\033[2J");
                System.out.flush();
                obj1.upDate();
                break;
                case 4:
                System.out.print("\033[H\033[2J");
                System.out.flush();
                obj1.delete();
                break;
                case 5:
                System.out.print("\033[H\033[2J");
                System.out.flush();
                obj1.display();      
            }
        } while (obj1.pilih != 6);
    }
}
