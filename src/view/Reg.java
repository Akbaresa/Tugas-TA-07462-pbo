
package view;

import javax.swing.border.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.imageio.plugins.jpeg.JPEGImageReadParam;
import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.FontUIResource;

public class Reg {
    public int Npm = 0;
    JFrame LogReg = new JFrame();
    JLabel login, daftar, top;
    JRadioButton radioKursus, radiopasien;
    JTextField textnamalogin, textnotelp, texttgllahir, textnamadaftar, textAlamat, textLogin;
    JLabel labelnpmlogin, labelpasswordlogin, labelnotelp, labeltgllahir, labelnamadaftar, labelpassworddaftar,
            labelAlamat, loginJLabel;
    JButton check, Reg, JBlogin, loginmasuk;
    JPasswordField passwordlogin, passworddaftar;
    JDesktopPane coba;
    // JCheckBox coba;
    // JOptionPane buat untuk beli
    JPEGImageReadParam halo;
    private ImageIcon rectangle;

    public Reg() {
        ColorUIResource c = new ColorUIResource(255, 212, 149);
        LogReg.setSize(700, 630);
        LogReg.setLayout(null);
        LogReg.getContentPane().setBackground(new ColorUIResource(218, 226, 182));
        top = new JLabel("kursus Hyungnim-ESA");
        top.setBounds(140, 10, 400, 50);
        top.setFont(new FontUIResource("Lucida Sans", Font.BOLD, 30));
        LogReg.add(top);

        daftar = new JLabel("Daftar Kursus");
        daftar.setFont(new Font("Lucida Sans", Font.BOLD, 25));
        daftar.setBounds(240, 50, 200, 100);
        LogReg.add(daftar);

        labelnamadaftar = new JLabel("Nama");
        labelnamadaftar.setBounds(220, 150, 100, 30);
        LogReg.add(labelnamadaftar);
        textnamadaftar = new JTextField();
        textnamadaftar.setBounds(220, 180, 200, 30);
        LogReg.add(textnamadaftar);

        labelpassworddaftar = new JLabel("Password");
        labelpassworddaftar.setBounds(220, 210, 100, 30);
        LogReg.add(labelpassworddaftar);
        passworddaftar = new JPasswordField();
        passworddaftar.setBounds(220, 240, 200, 30);
        LogReg.add(passworddaftar);

        labelnotelp = new JLabel("No Telepon");
        labelnotelp.setBounds(220, 270, 100, 30);
        LogReg.add(labelnotelp);
        textnotelp = new JTextField();
        textnotelp.setBounds(220, 300, 200, 30);
        LogReg.add(textnotelp);

        labeltgllahir = new JLabel("tanggal Lahir (dd/mm/yyyy)");
        labeltgllahir.setBounds(220, 330, 200, 30);
        LogReg.add(labeltgllahir);
        texttgllahir = new JTextField();
        texttgllahir.setBounds(220, 360, 200, 30);
        LogReg.add(texttgllahir);

        labelAlamat = new JLabel("Alamat");
        labelAlamat.setBounds(220, 390, 200, 30);
        LogReg.add(labelAlamat);
        textAlamat = new JTextField();
        textAlamat.setBounds(220, 420, 200, 30);
        LogReg.add(textAlamat);

        Reg = new JButton("Daftar");
        Reg.setBounds(260, 470, 90, 30);
        Reg.setBackground(ColorUIResource.getHSBColor(0, 0, 26));
        LogReg.add(Reg);

        JBlogin = new JButton("Sign in");
        JBlogin.setForeground(new ColorUIResource(37, 23, 73));
        JBlogin.setFont(new FontUIResource("", Font.BOLD, 15));
        JBlogin.setBorder(new LineBorder(Color.white));

        JBlogin.setFocusPainted(false);
        JBlogin.setBounds(260, 540, 90, 30);
        JBlogin.setBackground(Color.WHITE);

        LogReg.add(JBlogin);

        coba = new JDesktopPane();
        coba.setBounds(0, 70, 800, 700);
        LogReg.add(coba);

        LogReg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        LogReg.setVisible(true);
        LogReg.setLocationRelativeTo(null);

        JBlogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                LogReg.dispose();
                Login login = new Login();
            }
        });

        Reg.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {

                try {
                    String nama = textnamadaftar.getText();
                    String pass = passworddaftar.getText();
                    String alamat = textAlamat.getText();
                    String notelp = textnotelp.getText();
                    Date tgllahir = new Date(texttgllahir.getText());
                    AllobjController.siswaC.reg(nama, alamat, notelp, pass, tgllahir);
                    JOptionPane.showMessageDialog(null, "  REGISTRASI BERHASIL",
                            "information", JOptionPane.INFORMATION_MESSAGE);

                    kosong();
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(null, "Format penulisan salah", "registrasi gagal ",
                            JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
    }

    public void kosong() {
        textnamadaftar.setText(null);
        passworddaftar.setText(null);
        textnotelp.setText(null);
        texttgllahir.setText(null);
        textAlamat.setText(null);
    }

}