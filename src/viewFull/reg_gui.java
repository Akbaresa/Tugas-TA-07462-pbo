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
import java.util.Date;
import java.awt.Image;
import java.awt.Color;
import java.awt.Font;

public class reg_gui {
    JFrame frame = new JFrame("Pendaftaran akun");
    JLabel bgWhite, ball, hiasanLabel, creatLabel, createAccountlLabel, namLabel, already, format, passFormat;
    JLabel gmailSet;
    JButton lockButton, signUpButton, loginButton;
    JDesktopPane line;
    JTextField namaText, gmaTextField, ttlText, passField;
    JPasswordField passwordField;
    JCheckBox lBox;

    public void reg() {
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
        lBox = new JCheckBox();
        lBox.setBackground(Color.white);
        lBox.setIcon(iconLock);
        lBox.setForeground(Color.black);
        lBox.setBorder(new LineBorder(Color.white));
        lBox.setBounds(1070, 370, 20, 20);
        lBox.setFocusPainted(false);
        frame.add(lBox);
        // create Account
        Font pop1 = new FontUIResource("poppinsBOLD", Font.BOLD, 20);
        createAccountlLabel = new JLabel("Create Account");
        createAccountlLabel.setForeground(new ColorUIResource(38, 42, 47));
        createAccountlLabel.setFont(pop1);
        createAccountlLabel.setBounds(800, 100, 400, 100);
        frame.add(createAccountlLabel);

        // format penulisan salah
        Font pop2 = new FontUIResource("poppinsBOLD", Font.BOLD, 13);
        format = new JLabel("Format penulisan salah");
        format.setForeground(new ColorUIResource(181, 12, 12));
        format.setFont(pop2);
        format.setBounds(800, 50, 400, 100);
        format.setVisible(false);
        frame.add(format);
        // password haru terdiri dari 8 password
        passFormat = new JLabel("Password harus terdiri dari 5 karakter");
        passFormat.setForeground(new ColorUIResource(181, 12, 12));
        passFormat.setFont(pop2);
        passFormat.setBounds(800, 70, 400, 100);
        passFormat.setVisible(false);
        frame.add(passFormat);

        // gmail set
        gmailSet = new JLabel("Masukkan gmail dengan benar");
        gmailSet.setForeground(new ColorUIResource(181, 12, 12));
        gmailSet.setFont(pop2);
        gmailSet.setBounds(800, 30, 400, 100);
        gmailSet.setVisible(false);
        frame.add(gmailSet);

        // line nama
        line = new JDesktopPane();
        line.setBackground(new ColorUIResource(190, 188, 188));
        line.setBounds(800, 215, 300, 3);
        frame.add(line);
        // nama text field
        namaText = new JTextField("name");
        namaText.setForeground(Color.gray);
        namaText.setFont(new FontUIResource(null, 0, 15));
        namaText.setBounds(800, 180, 300, 35);
        namaText.setBorder(new LineBorder(Color.white));
        frame.add(namaText);

        // line gmail
        line = new JDesktopPane();
        line.setBackground(new ColorUIResource(190, 188, 188));
        line.setBounds(800, 275, 300, 3);
        frame.add(line);
        // gmail text field
        gmaTextField = new JTextField("gmail");
        gmaTextField.setForeground(Color.gray);
        gmaTextField.setFont(new FontUIResource(null, 0, 15));
        gmaTextField.setBounds(800, 240, 300, 35);
        gmaTextField.setBorder(new LineBorder(Color.white));
        frame.add(gmaTextField);

        // day of birth line
        line = new JDesktopPane();
        line.setBackground(new ColorUIResource(190, 188, 188));
        line.setBounds(800, 335, 300, 3);
        frame.add(line);
        // day of birth text field
        ttlText = new JTextField("day of birth (dd/mm/yy)");
        ttlText.setForeground(Color.gray);
        ttlText.setFont(new FontUIResource(null, 0, 15));
        ttlText.setBounds(800, 300, 300, 35);
        ttlText.setBorder(new LineBorder(Color.white));
        frame.add(ttlText);

        // passwrodline
        line = new JDesktopPane();
        line.setBackground(new ColorUIResource(190, 188, 188));
        line.setBounds(800, 395, 300, 3);
        frame.add(line);
        // password text field
        passwordField = new JPasswordField("password");
        passwordField.setEchoChar((char) 0);
        passwordField.setForeground(Color.gray);
        passwordField.setFont(new FontUIResource(null, 0, 15));
        passwordField.setBounds(800, 360, 250, 35);
        passwordField.setBorder(new LineBorder(Color.white));
        frame.add(passwordField);

        // create account Button
        ImageIcon signUpIcon = new ImageIcon("./src/resourceImage/Rectangle 4.png");
        Image signUpImage;
        signUpImage = signUpIcon.getImage().getScaledInstance(300, 35, Image.SCALE_SMOOTH);
        signUpIcon = new ImageIcon(signUpImage);
        signUpButton = new JButton("Create Account", signUpIcon);
        signUpButton.setHorizontalTextPosition(JButton.CENTER);
        signUpButton.setBackground(Color.white);
        signUpButton.setForeground(Color.white);
        signUpButton.setFont(pop1);
        signUpButton.setBorder(new LineBorder(Color.WHITE));
        signUpButton.setFont(new Font(null, Font.BOLD, 15));
        signUpButton.setBounds(790, 410, 310, 45);
        frame.add(signUpButton);

        // Already have account ?
        Font popinsM = new FontUIResource("poppinsMedium", Font.PLAIN, 14);
        already = new JLabel("Already have account ?");
        already.setForeground(Color.black);
        already.setFont(popinsM);
        already.setBounds(800, 425, 300, 100);
        frame.add(already);

        // Login
        loginButton = new JButton("Sign in");
        loginButton.setBorder(new LineBorder(Color.white));
        loginButton.setForeground(Color.BLACK);
        loginButton.setFont(new FontUIResource("", Font.BOLD, 14));
        loginButton.setFocusPainted(false);
        loginButton.setBounds(960, 460, 50, 30);
        loginButton.setBackground(Color.WHITE);
        frame.add(loginButton);

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

        lBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (lBox.isSelected()) {
                    passwordField.setEchoChar('*');
                } else {
                    passwordField.setEchoChar((char) 0);
                }
            }
        });

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                frame.dispose();
                login_gui obj = new login_gui();
                obj.log();
            }
        });
        signUpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String pass = passwordField.getText();
                String gmail = gmaTextField.getText();
                if (pass.length() != 5) {
                    passFormat.setVisible(true);
                } else if (!gmail.contains("@") || !gmail.endsWith("gmail.com")) {
                    gmailSet.setVisible(true);
                } else {
                    try {
                        String nama = namaText.getText();
                        Date tgllahir = new Date(ttlText.getText());
                        AllobjController.siswaC.reg(nama, gmail, pass, tgllahir);
                        JOptionPane.showMessageDialog(null, "  REGISTRASI BERHASIL",
                                "information", JOptionPane.INFORMATION_MESSAGE);
                        frame.dispose();
                        login_gui obj = new login_gui();
                        obj.log();
                        kosong();
                    } catch (Exception exception) {
                        format.setVisible(true);

                    }
                }
            }
        });
    }

    public void kosong() {
        namaText.setText(null);
        passwordField.setText(null);
        gmaTextField.setText(null);
        ttlText.setText(null);
    }
}
