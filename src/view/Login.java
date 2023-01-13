package view;

import java.awt.Color;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.plaf.ColorUIResource;
import view.AllobjController;

public class Login {

    JRadioButton radioMember, radioDosen;
    JLabel login;
    JTextField textnamalogin;
    JLabel labelnpmlogin, labelpasswordlogin;
    JButton check, backButton;
    JPasswordField passwordlogin;
    JDesktopPane coba;
    boolean checkLogin;

    public Login() {

        JFrame frame = new JFrame();
        frame.getContentPane().setBackground(new ColorUIResource(218, 226, 182));
        frame.setLayout(null);
        frame.setSize(700, 630);

        login = new JLabel("Login");
        login.setBounds(30, -10, 100, 100);
        login.setFont(new Font("Lucida Sans", Font.BOLD, 30));
        frame.add(login);
        radioMember = new JRadioButton("member");
        radioMember.setBounds(220, 150, 100, 30);
        radioMember.setBackground(new ColorUIResource(244, 234, 213));
        frame.add(radioMember);

        radioDosen = new JRadioButton("Admin");
        radioDosen.setBounds(320, 150, 100, 30);
        radioDosen.setBackground(new ColorUIResource(244, 234, 213));
        frame.add(radioDosen);
        labelnpmlogin = new JLabel("Nama");
        labelnpmlogin.setBounds(220, 180, 100, 30);
        frame.add(labelnpmlogin);
        textnamalogin = new JTextField();
        textnamalogin.setBounds(220, 210, 200, 30);
        textnamalogin.setBackground(Color.WHITE);
        frame.add(textnamalogin);
        labelpasswordlogin = new JLabel("Password");
        labelpasswordlogin.setBounds(220, 240, 100, 30);
        frame.add(labelpasswordlogin);
        passwordlogin = new JPasswordField();
        passwordlogin.setBounds(220, 270, 200, 30);
        frame.add(passwordlogin);
        check = new JButton("check");
        check.setBounds(220, 320, 90, 30);
        check.setBackground(ColorUIResource.getHSBColor(0, 0, 26));
        frame.add(check);
        backButton = new JButton("back");
        backButton.setBounds(20, 520, 90, 30);
        backButton.setBackground(ColorUIResource.getHSBColor(0, 0, 26));
        frame.add(backButton);

        coba = new JDesktopPane();
        coba.setBounds(0, 70, 800, 700);
        frame.add(coba);

        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                frame.dispose();
                Reg obj = new Reg();
            }
        });

        radioMember.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (radioMember.isSelected()) {
                    radioDosen.setSelected(false);
                    checkLogin = true;
                }
            }
        });
        radioDosen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (radioDosen.isSelected()) {
                    radioMember.setSelected(false);
                    checkLogin = false;
                }
            }
        });

        check.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (checkLogin == true) {
                    try {
                        String nama = textnamalogin.getText();
                        String pass = passwordlogin.getText();
                        AllobjController.siswaC.login(nama, pass);
                        String namaLogin = AllobjController.siswaC.getDataLogin().getNama();
                        JOptionPane.showMessageDialog(null, "selamat datang " + namaLogin, "information",
                                JOptionPane.INFORMATION_MESSAGE);

                        Course gui = new Course();
                        gui.UIMember();
                        frame.dispose();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "data yang anda masukkan salah ", "information",
                                JOptionPane.INFORMATION_MESSAGE);
                        kosong();
                    }
                } else {
                    String nama = textnamalogin.getText();
                    String pass = passwordlogin.getText();
                    int checkAdmin = AllobjController.adminC.loginAdmin(nama, pass);
                    if (checkAdmin != 0) {

                        System.out.println(checkAdmin);

                        JOptionPane.showMessageDialog(null, "Masuk ke sistem ", "information",
                                JOptionPane.INFORMATION_MESSAGE);
                        Admin admin = new Admin();
                        frame.dispose();

                    }

                }

            }
        });
    }

    public void kosong() {
        textnamalogin.setText(null);
        passwordlogin.setText(null);
    }
}
