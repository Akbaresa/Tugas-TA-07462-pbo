package viewFull;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import javax.swing.plaf.FontUIResource;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Image;
import java.awt.Color;
import java.awt.Font;

public class toko_gui {
    JFrame frame = new JFrame();
    JLabel bgPutih, bg, bgPhyton, imgPhytonlabel, imgTimelabel, imgBooklabel;
    JLabel wordPy, timePy;
    JButton buyButton, backButton;
    JLabel tokoLabel;

    public void tokoPage() {
        frame.setSize(1500, 800);
        frame.setLayout(null);

        tokoLabel = new JLabel("Esa Course");
        tokoLabel.setFont(new FontUIResource("Lucida Sans", Font.PLAIN, 50));
        tokoLabel.setBounds(600, 100, 500, 50);
        frame.add(tokoLabel);

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

        // buy botton
        ImageIcon iconBuy = new ImageIcon("./src/resourceImage/Rectangle 4.png");
        Image imgBuy;
        imgBuy = iconBuy.getImage().getScaledInstance(150, 30, Image.SCALE_SMOOTH);
        iconBuy = new ImageIcon(imgBuy);
        buyButton = new JButton("BELI", iconBuy);
        buyButton.setHorizontalTextPosition(JButton.CENTER);
        buyButton.setBackground(Color.white);
        buyButton.setFont(new FontUIResource(null, Font.BOLD, 13));
        buyButton.setBorder(new LineBorder(Color.white));
        buyButton.setForeground(Color.white);
        buyButton.setBounds(490, 350, 160, 35);
        frame.add(buyButton);
        // word Py
        wordPy = new JLabel(AllobjController.kursusC.getData(0).getModul());
        wordPy.setBounds(535, 300, 100, 50);
        wordPy.setFont(new FontUIResource("consolas", Font.BOLD, 18));
        frame.add(wordPy);
        // timePy
        timePy = new JLabel(AllobjController.kursusC.getData(0).getjam());
        timePy.setBounds(535, 260, 100, 50);
        timePy.setFont(new FontUIResource("consolas", Font.BOLD, 18));
        frame.add(timePy);
        // img book
        ImageIcon iconBook = new ImageIcon("./src/resourceImage/BookMark.png");
        Image imgBook;
        imgBook = iconBook.getImage().getScaledInstance(20, 23, Image.SCALE_SMOOTH);
        iconBook = new ImageIcon(imgBook);
        imgBooklabel = new JLabel();
        imgBooklabel.setIcon(iconBook);
        imgBooklabel.setBackground(Color.white);
        imgBooklabel.setForeground(Color.white);
        imgBooklabel.setBorder(new LineBorder(Color.white));
        imgBooklabel.setBounds(500, 310, 22, 27);
        frame.add(imgBooklabel);

        // img phyton
        ImageIcon iconPy = new ImageIcon("./src/resourceImage/Python-Symbol.png");
        Image imgPy;
        imgPy = iconPy.getImage().getScaledInstance(300, 200, Image.SCALE_SMOOTH);
        iconPy = new ImageIcon(imgPy);
        imgPhytonlabel = new JLabel();
        imgPhytonlabel.setIcon(iconPy);
        imgPhytonlabel.setBackground(Color.white);
        imgPhytonlabel.setForeground(Color.white);
        imgPhytonlabel.setBorder(new LineBorder(Color.white));
        imgPhytonlabel.setBounds(180, 270, 300, 200);
        frame.add(imgPhytonlabel);

        // img time
        ImageIcon iconTime = new ImageIcon("./src/resourceImage/Time-Circle.png");
        Image imgTime;
        imgTime = iconTime.getImage().getScaledInstance(21, 21, Image.SCALE_SMOOTH);
        iconTime = new ImageIcon(imgTime);
        imgTimelabel = new JLabel();
        imgTimelabel.setIcon(iconTime);
        imgTimelabel.setBackground(Color.white);
        imgTimelabel.setForeground(Color.white);
        imgTimelabel.setBorder(new LineBorder(Color.white));
        imgTimelabel.setBounds(500, 270, 23, 23);
        frame.add(imgTimelabel);

        // bg phyton
        ImageIcon iconWhitePy = new ImageIcon("./src/resourceImage/birumuda.png");
        Image imgWhitePy;
        imgWhitePy = iconWhitePy.getImage().getScaledInstance(550, 290, Image.SCALE_SMOOTH);
        iconWhitePy = new ImageIcon(imgWhitePy);
        bgPhyton = new JLabel();
        bgPhyton.setIcon(iconWhitePy);
        bgPhyton.setBounds(185, 225, 600, 300);
        frame.add(bgPhyton);

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

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                frame.dispose();
                login_gui gui = new login_gui();
                gui.log();
            }
        });
        buyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                JOptionPane.showMessageDialog(null, "   BERHASIL MEMBELI",
                        "information", JOptionPane.INFORMATION_MESSAGE);
                AllobjController.siswaC.insertKursus(AllobjController.kursusC.getData(0).getModul(),
                        AllobjController.kursusC.getData(0).getjam(), AllobjController.kursusC.getData(0).getKelas());
            }
        });
    }

}
