package view;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JDesktopPane;
import javax.swing.*;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.FontUIResource;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Admin {

    JFrame frame = new JFrame();
    JDesktopPane coba, searchDesktopPane;
    JLabel member, search;
    JTable tabelUser = new JTable();
    JScrollPane scrollUser = new JScrollPane(tabelUser);
    JButton back, verif, update, delete;
    JLabel dokterlabel, userlabel, passlabel;
    JTextField usertext, passtext;

    public Admin() {

        frame.setSize(700, 630);

        member = new JLabel("Admin");
        member.setBounds(50, -5, 500, 100);
        member.setFont(new Font("Lucida Sans", Font.BOLD, 30));
        frame.add(member);

        scrollUser.setBounds(40, 100, 600, 200);
        tabelUser.setModel(AllobjController.kursusC.daftarPeserta());
        frame.add(scrollUser);

        search = new JLabel("search");
        search.setBounds(150, 330, 100, 20);
        search.setFont(new FontUIResource("Lucida Sans", Font.BOLD, 20));
        frame.add(search);

        userlabel = new JLabel("Username");
        userlabel.setBounds(65, 370, 100, 30);
        frame.add(userlabel);

        usertext = new JTextField();
        usertext.setBounds(65, 400, 100, 30);
        frame.add(usertext);

        passlabel = new JLabel("Npm");
        passlabel.setBounds(215, 370, 100, 30);
        frame.add(passlabel);

        passtext = new JTextField();
        passtext.setBounds(215, 400, 100, 30);
        frame.add(passtext);

        update = new JButton("Update");
        update.setBounds(500, 350, 100, 30);
        update.setBackground(Color.white);
        frame.add(update);

        delete = new JButton("Delete");
        delete.setBounds(500, 400, 100, 30);
        delete.setBackground(Color.white);
        frame.add(delete);

        back = new JButton("back");
        back.setBounds(50, 520, 100, 30);
        back.setBackground(Color.white);
        frame.add(back);

        searchDesktopPane = new JDesktopPane();
        searchDesktopPane.setBounds(25, 310, 340, 170);
        searchDesktopPane.setBackground(new ColorUIResource(244, 234, 213));
        searchDesktopPane.setBorder(new LineBorder(Color.white, 10, true));
        frame.add(searchDesktopPane);

        coba = new JDesktopPane();
        coba.setBounds(0, 70, 800, 700);
        frame.add(coba);
        frame.getContentPane().setBackground(new ColorUIResource(218, 226, 182));

        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                frame.dispose();
                Login loginn = new Login();
            }
        });

        update.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                int pass = new Integer(passtext.getText());
                int check = AllobjController.siswaC.search(usertext.getText(), pass);
                if (check != -1) {
                    try {
                        String namaLogin = AllobjController.siswaC.getDataLogin().getNama();
                        int npm = AllobjController.siswaC.getDataLogin().getNpm();
                        JOptionPane.showMessageDialog(null, "update akun " + namaLogin + " Npm : " + npm,
                                "information", JOptionPane.INFORMATION_MESSAGE);
                        frame.dispose();
                        updateDash update = new updateDash();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Data yang anda masukkan salah", "registrasi gagal ",
                                JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }
        });

        delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                int pass = new Integer(passtext.getText());
                AllobjController.siswaC.search(usertext.getText(), pass);
                int check = AllobjController.siswaC.search(usertext.getText(), pass);
                if (check != -1) {
                    try {

                        String namaLogin = AllobjController.siswaC.getDataLogin().getNama();
                        int npm = AllobjController.siswaC.getDataLogin().getNpm();
                        JOptionPane.showMessageDialog(null, "  Delete akun " + namaLogin + " Npm : " + npm,
                                "Warning", JOptionPane.INFORMATION_MESSAGE);
                        AllobjController.siswaC.delete();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Data yang anda masukkan salah", "Information",
                                JOptionPane.INFORMATION_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Data yang anda masukkan salah", "Information",
                            JOptionPane.INFORMATION_MESSAGE);
                }

            }
        });

    }
}
