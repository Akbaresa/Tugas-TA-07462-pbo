package viewFull;

import javax.swing.JFrame;
import javax.sound.sampled.Line;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.DimensionUIResource;
import javax.swing.plaf.FontUIResource;
import java.awt.Image;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;

public class admin_gui {
    JFrame frame = new JFrame();
    JLabel bg, bgPutih, searchLabel, adminlabel;
    JDesktopPane namaLine, npmline;
    JTextField namaTextField, npmTextField;
    JButton edit1, delete1, delete2, edit2;
    JButton searchkan, backButton;
    JTable tabelUser = new JTable();
    JScrollPane scrollUser = new JScrollPane(tabelUser);
    int checkWarna;

    public void admin() {
        AllobjController.siswaC.reg("esa", "gmel", "123", null);
        frame.setSize(1500, 800);
        frame.setLayout(null);

        // search
        Font pop1 = new FontUIResource("poppinsBOLD", Font.BOLD, 25);
        // searchLabel = new JLabel("Search");
        // searchLabel.setFont(pop1);
        // searchLabel.setForeground(new ColorUIResource(38, 42, 47));
        // searchLabel.setBounds(1100, 100, 400, 100);
        // frame.add(searchLabel);

        // member
        Font popMember = new FontUIResource("poppinsBOLD", Font.PLAIN, 10);
        ImageIcon memberIcon = new ImageIcon("./src/resourceImage/Member.png");
        Image memberImage;
        memberImage = memberIcon.getImage().getScaledInstance(100, 25,
                Image.SCALE_SMOOTH);
        memberIcon = new ImageIcon(memberImage);
        delete1 = new JButton("delete", memberIcon);
        delete1.setHorizontalTextPosition(JButton.CENTER);
        delete1.setBackground(Color.white);
        delete1.setForeground(Color.white);
        delete1.setFont(new FontUIResource("", Font.LAYOUT_LEFT_TO_RIGHT, 10));
        delete1.setBorder(new LineBorder(Color.white));
        delete1.setFont(new Font(null, Font.BOLD, 13));
        delete1.setBounds(1050, 165, 105, 30);
        frame.add(delete1);
        // member selected
        ImageIcon memberIcon1 = new ImageIcon("./src/resourceImage/Rectangle 3.png");
        Image memberImage1;
        memberImage1 = memberIcon1.getImage().getScaledInstance(100, 25,
                Image.SCALE_SMOOTH);
        memberIcon1 = new ImageIcon(memberImage1);
        delete2 = new JButton("delete", memberIcon1);
        delete2.setHorizontalTextPosition(JButton.CENTER);
        delete2.setBackground(Color.white);
        delete2.setForeground(Color.white);
        delete2.setFont(new FontUIResource("", Font.LAYOUT_LEFT_TO_RIGHT, 10));
        delete2.setBorder(new LineBorder(Color.white));
        delete2.setFont(new Font(null, Font.BOLD, 13));
        delete2.setBounds(1050, 165, 105, 30);
        frame.add(delete2);

        // Admin
        edit1 = new JButton("Edit", memberIcon);
        edit1.setHorizontalTextPosition(JButton.CENTER);
        edit1.setBackground(Color.white);
        edit1.setForeground(Color.white);
        edit1.setFont(new FontUIResource("", Font.LAYOUT_LEFT_TO_RIGHT, 10));
        edit1.setBorder(new LineBorder(Color.white));
        edit1.setFocusPainted(false);
        edit1.setFont(new Font(null, Font.BOLD, 13));
        edit1.setBounds(1160, 165, 105, 30);
        frame.add(edit1);
        // Admin selected
        edit2 = new JButton("Edit", memberIcon1);
        edit2.setHorizontalTextPosition(JButton.CENTER);
        edit2.setBackground(Color.white);
        edit2.setForeground(Color.white);
        edit2.setFont(new FontUIResource("", Font.LAYOUT_LEFT_TO_RIGHT, 10));
        edit2.setBorder(new LineBorder(Color.white));
        edit2.setFocusPainted(false);
        edit2.setFont(new Font(null, Font.BOLD, 13));
        edit2.setBounds(1160, 165, 105, 30);
        frame.add(edit2);

        // admin label
        adminlabel = new JLabel("adminlabel");
        adminlabel.setFont(pop1);
        adminlabel.setForeground(new ColorUIResource(38, 42, 47));
        adminlabel.setBounds(225, 100, 400, 100);
        frame.add(adminlabel);

        // tabel
        scrollUser.setBounds(220, 180, 700, 200);
        scrollUser.setBackground(Color.white);
        scrollUser.setForeground(Color.white);
        scrollUser.setBorder(new LineBorder(Color.white));
        scrollUser.getViewport().setBackground(Color.white);
        tabelUser.setModel(AllobjController.kursusC.daftarPeserta());
        tabelUser.getColumnModel().getColumn(2).setMinWidth(130);

        frame.add(scrollUser);

        // back Button
        backButton = new JButton("Back");
        backButton.setHorizontalTextPosition(JButton.CENTER);
        backButton.setBackground(Color.white);
        backButton.setForeground(Color.black);
        backButton.setFont(new FontUIResource(null, Font.BOLD, 15));
        backButton.setBorder(new LineBorder(Color.WHITE));
        backButton.setFont(new Font(null, Font.BOLD, 15));
        backButton.setBounds(200, 650, 50, 20);
        frame.add(backButton);

        // nama line
        namaLine = new JDesktopPane();
        namaLine.setBackground(new ColorUIResource(190, 188, 188));
        namaLine.setBounds(1050, 235, 200, 3);
        frame.add(namaLine);
        // nama text field
        namaTextField = new JTextField("Name");
        namaTextField.setForeground(Color.gray);
        namaTextField.setFont(new FontUIResource(null, 0, 15));
        namaTextField.setBounds(1050, 200, 150, 35);
        namaTextField.setBorder(new LineBorder(Color.white));
        frame.add(namaTextField);

        // npm line
        npmline = new JDesktopPane();
        npmline.setBackground(new ColorUIResource(190, 188, 188));
        npmline.setBounds(1050, 295, 200, 3);
        frame.add(npmline);
        // npm text field
        npmTextField = new JTextField("gmail");
        npmTextField.setForeground(Color.gray);
        npmTextField.setFont(new FontUIResource(null, 0, 15));
        npmTextField.setBounds(1050, 260, 150, 35);
        npmTextField.setBorder(new LineBorder(Color.white));
        frame.add(npmTextField);

        ImageIcon signUpIcon = new ImageIcon("./src/resourceImage/Rectangle 4.png");
        Image signUpImage;
        signUpImage = signUpIcon.getImage().getScaledInstance(200, 45, Image.SCALE_SMOOTH);
        signUpIcon = new ImageIcon(signUpImage);
        searchkan = new JButton("Search", signUpIcon);
        searchkan.setHorizontalTextPosition(JButton.CENTER);
        searchkan.setBackground(Color.white);
        searchkan.setForeground(Color.white);
        searchkan.setFont(pop1);
        searchkan.setBorder(new LineBorder(Color.WHITE));
        searchkan.setFont(new Font(null, Font.BOLD, 15));
        searchkan.setBounds(1047, 320, 205, 50);
        frame.add(searchkan);

        // bg putih
        ImageIcon iconWhite = new ImageIcon("./src/resourceImage/bg_admin.png");
        Image img;
        img = iconWhite.getImage().getScaledInstance(1300, 680, Image.SCALE_SMOOTH);
        iconWhite = new ImageIcon(img);
        bgPutih = new JLabel();
        // bgPutih.setBorder(new LineBorder(Color.BLACK));
        bgPutih.setForeground(Color.white);
        bgPutih.setBounds(100, 50, 1300, 680);
        bgPutih.setIcon(iconWhite);
        frame.add(bgPutih);

        // bg biru
        ImageIcon iconBlue = new ImageIcon("./src/resourceImage/Group 1.png");
        Image imgBlue;
        imgBlue = iconBlue.getImage().getScaledInstance(1500, 800, Image.SCALE_SMOOTH);
        iconBlue = new ImageIcon(imgBlue);
        bg = new JLabel();
        bg.setBounds(0, 0, 1500, 800);
        bg.setIcon(iconBlue);
        frame.add(bg);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        AllobjController.siswaC.reg("test", "test", "test", null);

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                frame.dispose();
                login_gui gui = new login_gui();
                gui.log();
            }
        });

        edit1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (checkWarna == 0) {
                    edit1.setVisible(false);
                    edit2.setVisible(true);
                    delete1.setVisible(true);
                }
                edit1.setVisible(false);
                edit2.setVisible(true);
                checkWarna = 1;
            }
        });

        delete1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (checkWarna == 1) {
                    delete1.setVisible(false);
                    delete2.setVisible(true);
                    edit1.setVisible(true);
                }
                delete1.setVisible(false);
                delete2.setVisible(true);
                checkWarna = 0;

            }
        });

        searchkan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String nama = namaTextField.getText();
                String gmail = npmTextField.getText();
                int check = AllobjController.adminC.search(nama, gmail);
                if (check != -1) {
                    JOptionPane.showMessageDialog(null, "   akun " + nama + " telah ditemukan");
                }
            }
        });
    }
}
