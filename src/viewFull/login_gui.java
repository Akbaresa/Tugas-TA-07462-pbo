package viewFull;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.FontUIResource;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Image;
import java.awt.Color;
import java.awt.Font;

public class login_gui {
    JFrame frame = new JFrame("Pendaftaran account");
    JLabel bgWhite, ball, hiasanLabel, creatLabel, createAccountlLabel, namLabel, already;
    JButton lockButton, signUpButton, loginButton, bakButton;
    JButton member, member2, admin, admin2;
    JDesktopPane line;
    JCheckBox lockCheckBox;
    JTextField namaText, passtext;
    JPasswordField passwordField;
    int checkMemberAdmin;

    public void log() {
        frame.getContentPane().setBackground(new ColorUIResource(26, 74, 96));
        frame.setSize(1500, 800);
        frame.setLayout(null);

        // hiasan
        ImageIcon iconhiasan = new ImageIcon("./src/resourceImage/hiasan.png");
        Image imghiasan;
        imghiasan = iconhiasan.getImage().getScaledInstance(450, 493, Image.SCALE_SMOOTH);
        iconhiasan = new ImageIcon(imghiasan);
        hiasanLabel = new JLabel();
        hiasanLabel.setIcon(iconhiasan);
        hiasanLabel.setBounds(260, 140, 800, 700);
        frame.add(hiasanLabel);

        // ball
        ImageIcon iconBall = new ImageIcon("./src/resourceImage/ball.png");
        Image imgBall;
        imgBall = iconBall.getImage().getScaledInstance(105, 87, Image.SCALE_SMOOTH);
        iconBall = new ImageIcon(imgBall);
        ball = new JLabel();
        ball.setIcon(iconBall);
        ball.setBounds(60, 40, 115, 97);
        frame.add(ball);

        // create with esa
        Font pop = new FontUIResource("poppinsBlack", Font.PLAIN, 40);
        creatLabel = new JLabel("Getting");
        creatLabel.setForeground(Color.WHITE);
        creatLabel.setFont(pop);
        creatLabel.setBounds(70, 120, 400, 100);
        frame.add(creatLabel);
        creatLabel = new JLabel("Started with");
        creatLabel.setForeground(Color.WHITE);
        creatLabel.setFont(pop);
        creatLabel.setBounds(70, 170, 400, 100);
        frame.add(creatLabel);
        creatLabel = new JLabel("Esa");
        creatLabel.setForeground(Color.WHITE);
        creatLabel.setFont(pop);
        creatLabel.setBounds(71, 220, 400, 100);
        frame.add(creatLabel);

        // lock
        ImageIcon iconLock = new ImageIcon("./src/resourceImage/lock.png");
        Image imglock;
        imglock = iconLock.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
        iconLock = new ImageIcon(imglock);
        lockCheckBox = new JCheckBox();
        lockCheckBox.setBackground(Color.white);
        lockCheckBox.setIcon(iconLock);
        lockCheckBox.setForeground(Color.black);
        lockCheckBox.setBorder(new LineBorder(Color.white));
        lockCheckBox.setBounds(1070, 270, 20, 20);
        lockCheckBox.setFocusPainted(false);
        frame.add(lockCheckBox);

        // Login Account
        Font pop1 = new FontUIResource("poppinsBOLD", Font.BOLD, 20);
        createAccountlLabel = new JLabel("Login Account");
        createAccountlLabel.setForeground(new ColorUIResource(38, 42, 47));
        createAccountlLabel.setFont(pop1);
        createAccountlLabel.setBounds(800, 90, 400, 100);
        frame.add(createAccountlLabel);

        // nama line
        line = new JDesktopPane();
        line.setBackground(new ColorUIResource(190, 188, 188));
        line.setBounds(800, 235, 300, 3);
        frame.add(line);
        // nama text field
        namaText = new JTextField("Name");
        namaText.setForeground(Color.gray);
        namaText.setFont(new FontUIResource(null, 0, 15));
        namaText.setBounds(800, 200, 300, 35);
        namaText.setBorder(new LineBorder(Color.white));
        frame.add(namaText);

        // passwrodline
        line = new JDesktopPane();
        line.setBackground(new ColorUIResource(190, 188, 188));
        line.setBounds(800, 295, 300, 3);
        frame.add(line);
        // password text field
        passwordField = new JPasswordField("password");
        passwordField.setEchoChar((char) 0);
        passwordField.setForeground(Color.gray);
        passwordField.setFont(new FontUIResource(null, 0, 15));
        passwordField.setBounds(800, 260, 240, 35);
        passwordField.setBorder(new LineBorder(Color.white));
        frame.add(passwordField);

        // login account Button
        ImageIcon signUpIcon = new ImageIcon("./src/resourceImage/Rectangle 4.png");
        Image signUpImage;
        signUpImage = signUpIcon.getImage().getScaledInstance(300, 35, Image.SCALE_SMOOTH);
        signUpIcon = new ImageIcon(signUpImage);
        signUpButton = new JButton("Login", signUpIcon);
        signUpButton.setHorizontalTextPosition(JButton.CENTER);
        signUpButton.setBackground(Color.white);
        signUpButton.setForeground(Color.white);
        signUpButton.setFont(pop1);
        signUpButton.setBorder(new LineBorder(Color.WHITE));
        signUpButton.setFont(new Font(null, Font.BOLD, 15));
        signUpButton.setBounds(795, 310, 310, 45);
        frame.add(signUpButton);

        // member
        Font popMember = new FontUIResource("poppinsBOLD", Font.PLAIN, 10);
        ImageIcon memberIcon = new ImageIcon("./src/resourceImage/Member.png");
        Image memberImage;
        memberImage = memberIcon.getImage().getScaledInstance(110, 25,
                Image.SCALE_SMOOTH);
        memberIcon = new ImageIcon(memberImage);
        member = new JButton("Member", memberIcon);
        member.setHorizontalTextPosition(JButton.CENTER);
        member.setBackground(Color.white);
        member.setForeground(Color.white);
        member.setFont(new FontUIResource("", Font.LAYOUT_LEFT_TO_RIGHT, 10));
        member.setBorder(new LineBorder(Color.white));
        member.setFont(new Font(null, Font.BOLD, 13));
        member.setBounds(800, 165, 120, 30);
        frame.add(member);
        // member selected
        ImageIcon memberIcon1 = new ImageIcon("./src/resourceImage/Rectangle 3.png");
        Image memberImage1;
        memberImage1 = memberIcon1.getImage().getScaledInstance(110, 25,
                Image.SCALE_SMOOTH);
        memberIcon1 = new ImageIcon(memberImage1);
        member2 = new JButton("Member", memberIcon1);
        member2.setHorizontalTextPosition(JButton.CENTER);
        member2.setBackground(Color.white);
        member2.setForeground(Color.white);
        member2.setFont(new FontUIResource("", Font.LAYOUT_LEFT_TO_RIGHT, 10));
        member2.setBorder(new LineBorder(Color.white));
        member2.setFont(new Font(null, Font.BOLD, 13));
        member2.setBounds(800, 165, 120, 30);
        frame.add(member2);

        // Admin
        admin = new JButton("Admin", memberIcon);
        admin.setHorizontalTextPosition(JButton.CENTER);
        admin.setBackground(Color.white);
        admin.setForeground(Color.white);
        admin.setFont(new FontUIResource("", Font.LAYOUT_LEFT_TO_RIGHT, 10));
        admin.setBorder(new LineBorder(Color.white));
        admin.setFocusPainted(false);
        admin.setFont(new Font(null, Font.BOLD, 13));
        admin.setBounds(920, 165, 120, 30);
        frame.add(admin);
        // Admin selected
        admin2 = new JButton("Admin", memberIcon1);
        admin2.setHorizontalTextPosition(JButton.CENTER);
        admin2.setBackground(Color.white);
        admin2.setForeground(Color.white);
        admin2.setFont(new FontUIResource("", Font.LAYOUT_LEFT_TO_RIGHT, 10));
        admin2.setBorder(new LineBorder(Color.white));
        admin2.setFocusPainted(false);
        admin2.setFont(new Font(null, Font.BOLD, 13));
        admin2.setBounds(920, 165, 120, 30);
        frame.add(admin2);

        // back
        bakButton = new JButton("Back");
        bakButton.setHorizontalTextPosition(JButton.CENTER);
        bakButton.setBackground(Color.white);
        bakButton.setForeground(Color.black);
        bakButton.setFont(pop1);
        bakButton.setBorder(new LineBorder(Color.WHITE));
        bakButton.setFont(new Font(null, Font.BOLD, 15));
        bakButton.setBounds(790, 365, 50, 20);
        frame.add(bakButton);

        // background putih
        ImageIcon iconWhite = new ImageIcon("./src/resourceImage/bg_white.png");
        Image img;
        img = iconWhite.getImage().getScaledInstance(750, 700, Image.SCALE_SMOOTH);
        iconWhite = new ImageIcon(img);
        bgWhite = new JLabel();
        bgWhite.setIcon(iconWhite);
        bgWhite.setBounds(620, 30, 750, 700);
        frame.add(bgWhite);

        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        bakButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                frame.dispose();
                reg_gui gui = new reg_gui();
                gui.reg();
            }
        });
        lockCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (lockCheckBox.isSelected()) {
                    passwordField.setEchoChar('*');
                } else {
                    passwordField.setEchoChar((char) 0);
                }
            }
        });

        admin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (checkMemberAdmin == 0) {
                    admin.setVisible(false);
                    admin2.setVisible(true);
                    member.setVisible(true);
                }
                admin.setVisible(false);
                admin2.setVisible(true);
                checkMemberAdmin = 1;
            }
        });

        member.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (checkMemberAdmin == 1) {
                    member.setVisible(false);
                    member2.setVisible(true);
                    admin.setVisible(true);
                }
                member.setVisible(false);
                member2.setVisible(true);
                checkMemberAdmin = 0;

            }
        });

        signUpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

                String nama = namaText.getText();
                String password = passwordField.getText();
                if (checkMemberAdmin == 1) {
                    int check = AllobjController.adminC.login(nama, password);
                    if (check != -1) {
                        try {
                            JOptionPane.showMessageDialog(null, "  LOGIN Admin",
                                    "information", JOptionPane.INFORMATION_MESSAGE);
                            frame.dispose();
                            admin_gui admin = new admin_gui();
                            admin.admin();
                        } catch (Exception e) {
                            // TODO: handle exception
                            JOptionPane.showMessageDialog(null, "  Data yang anda masukkan salah",
                                    "information", JOptionPane.INFORMATION_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "  Data yang anda masukkan salah",
                                "information", JOptionPane.INFORMATION_MESSAGE);
                    }

                } else if (checkMemberAdmin == 0) {
                    int check = AllobjController.siswaC.login(nama, password);
                    if (check != -1) {
                        try {
                            JOptionPane.showMessageDialog(null, "  LOGIN User",
                                    "information", JOptionPane.INFORMATION_MESSAGE);
                            frame.dispose();
                            toko_gui gui = new toko_gui();
                            gui.tokoPage();
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, "  Data yang anda masukkan salah",
                                    "information", JOptionPane.INFORMATION_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "  Data yang anda masukkan salah",
                                "information", JOptionPane.INFORMATION_MESSAGE);
                    }

                }

            }
        });
    }
}
