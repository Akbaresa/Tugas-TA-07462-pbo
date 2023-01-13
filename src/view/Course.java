package view;

import java.awt.*;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.plaf.ColorUIResource;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Course {
    JFrame frame = new JFrame();
    JLabel member, labelPhyton, labelJavascript, deskPhyton, deskPhyton2, deskJs, deskJs2;
    JDesktopPane coba, coursePhyton, courseJavascript, coursePhyton2, courseJavascript2;
    JRadioButton radioPhyton, radioJavascript;
    JButton buy, backButton;
    JScrollBar scrollBar;
    private int checkButton = 0;

    public void UIMember() {
        frame.getContentPane().setBackground(new ColorUIResource(204, 214, 166));
        frame.setLayout(null);
        frame.setSize(700, 630);

        member = new JLabel("Daftar Course");
        member.setBounds(30, -5, 500, 100);
        member.setFont(new Font("Lucida Sans", Font.BOLD, 30));
        frame.add(member);

        // Phyton course
        labelPhyton = new JLabel("Phyton");
        labelPhyton.setBounds(160, 150, 200, 50);
        labelPhyton.setFont(new Font("Lucida Sans", Font.BOLD, 20));
        frame.add(labelPhyton);
        deskPhyton = new JLabel("time      :  7 hour ");
        deskPhyton.setBounds(130, 200, 200, 50);
        deskPhyton.setFont(new Font("", Font.BOLD, 13));
        frame.add(deskPhyton);
        deskPhyton2 = new JLabel("dosen  :  esa putra ");
        deskPhyton2.setBounds(130, 230, 200, 50);
        deskPhyton2.setFont(new Font("", Font.CENTER_BASELINE, 13));
        frame.add(deskPhyton2);
        radioPhyton = new JRadioButton("7.99$");
        radioPhyton.setBounds(170, 320, 60, 20);
        radioPhyton.setBackground(new ColorUIResource(255, 251, 233));
        frame.add(radioPhyton);

        labelJavascript = new JLabel("Javascript");
        labelJavascript.setBounds(440, 150, 200, 50);
        labelJavascript.setFont(new Font("Lucida Sans", Font.BOLD, 20));
        frame.add(labelJavascript);
        deskJs = new JLabel("time      :  11 hour ");
        deskJs.setBounds(440, 200, 200, 50);
        deskJs.setFont(new Font("", Font.BOLD, 13));
        frame.add(deskJs);
        deskJs2 = new JLabel("dosen  :  esa putra ");
        deskJs2.setBounds(440, 230, 200, 50);
        deskJs2.setFont(new Font("", Font.CENTER_BASELINE, 13));
        frame.add(deskJs2);
        radioJavascript = new JRadioButton("5.99$");
        radioJavascript.setBounds(470, 320, 60, 20);
        radioJavascript.setBackground(new ColorUIResource(255, 251, 233));
        frame.add(radioJavascript);

        buy = new JButton("Buy");
        buy.setBounds(300, 450, 90, 30);
        buy.setBackground(ColorUIResource.getHSBColor(100, 10, 26));
        frame.add(buy);

        backButton = new JButton("back");
        backButton.setBounds(20, 520, 90, 30);
        backButton.setBackground(ColorUIResource.getHSBColor(0, 0, 26));
        frame.add(backButton);

        // frame Phyton
        coursePhyton2 = new JDesktopPane();
        coursePhyton2.setBounds(100, 150, 200, 50);
        coursePhyton2.setBackground(new ColorUIResource(218, 226, 182));
        frame.add(coursePhyton2);
        coursePhyton = new JDesktopPane();
        coursePhyton.setBounds(100, 150, 200, 200);
        coursePhyton.setBackground(new ColorUIResource(244, 234, 213));
        frame.add(coursePhyton);

        // frame javascript
        courseJavascript2 = new JDesktopPane();
        courseJavascript2.setBounds(400, 150, 200, 50);
        courseJavascript2.setBackground(new ColorUIResource(218, 226, 182));
        frame.add(courseJavascript2);
        courseJavascript = new JDesktopPane();
        courseJavascript.setBounds(400, 150, 200, 200);
        courseJavascript.setBackground(new ColorUIResource(244, 234, 213));
        frame.add(courseJavascript);

        coba = new JDesktopPane();
        coba.setBounds(0, 70, 800, 700);
        coba.setBackground(new ColorUIResource(255, 251, 233));
        frame.add(coba);

        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                frame.dispose();
                Login login = new Login();
            }
        });
        radioJavascript.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (radioJavascript.isSelected()) {
                    radioPhyton.setSelected(false);
                    checkButton = 1;
                }
            }
        });
        radioPhyton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (radioPhyton.isSelected()) {
                    radioJavascript.setSelected(false);
                    checkButton = 0;
                }
            }
        });

        buy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (checkButton != -1) {
                    try {
                        AllobjController.kursusC.Kursus();
                        String jadwal = AllobjController.kursusC.getData(checkButton).getJadwal();
                        String kelas = AllobjController.kursusC.getData(checkButton).getKelas();
                        String modul = AllobjController.kursusC.getData(checkButton).getModul();
                        JOptionPane.showMessageDialog(null, "Berhasil membeli " + modul, "information",
                                JOptionPane.INFORMATION_MESSAGE);
                        AllobjController.kursusC.addKursus(modul, jadwal, kelas);

                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "pilih dulu woe", "information",
                                JOptionPane.INFORMATION_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "pilih dulu woe", "information",
                            JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

    }
}
