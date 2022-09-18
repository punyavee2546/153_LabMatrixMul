package test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {

    private JFrame f;
    private JLabel lbLogo;
    private JButton btnNew;
    private JButton tileLeft;
    private JButton tileRight;
    private JLabel lbYourScore;
    private JLabel lbScore;
    private  JButton btnNext;
    private Icon img1, img2, img3, img4;
    private int ans;
    private boolean isClicked;
    private int score;
    
    public App() {

       f = new JFrame("fifty-fifty");
       f.setSize(500, 480);
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       detailInitialization();
       f.setVisible(true);
    }

    private void detailInitialization() {

        try {
            img1 = new ImageIcon("test/busted.jpg");
            img2 = new ImageIcon("test/download.png");
            img3 = new ImageIcon("test/blue600x600.png");
            img4 = new ImageIcon("test/orange600x600.jpg");
        } catch (Exception ex) {
            System.out.println(ex);
        }

        lbLogo = new JLabel("MYLogo");
        btnNew = new JButton("new");
        tileLeft = new JButton(img3);
        tileRight = new JButton(img4);
        lbYourScore = new JLabel("Your Score");
        lbScore = new JLabel("0");
        btnNext = new JButton("next");
        lbLogo.setPreferredSize(new Dimension(200,100));
        btnNew.setPreferredSize(new Dimension(200,100));
        tileLeft.setPreferredSize(new Dimension(200,200));
        tileRight.setPreferredSize(new Dimension(200,200));
        lbYourScore.setPreferredSize(new Dimension(100,100));
        lbScore.setPreferredSize(new Dimension(100,100));
        btnNext.setPreferredSize(new Dimension(200,100));
        f.setLayout(new FlowLayout());
        f.add(lbLogo);
        f.add(btnNew);
        f.add(tileLeft);
        f.add(tileRight);
        f.add(lbYourScore);
        f.add(lbScore);
        f.add(btnNext);
        AllBtnListener lis = new AllBtnListener();
        tileLeft.addActionListener(lis);
        tileRight.addActionListener(lis);
        btnNew.addActionListener(lis);
        btnNext.addActionListener(lis);
        newGame();
    }

    private void newGame() {

        isClicked = false;
        play();
    }

    private void play() {

        isClicked = false;
        ans = Math.random() < 0.5 ? 0 : 1;
    }

    private class AllBtnListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ev) {
            JButton source = (JButton)ev.getSource();
            if ((source == tileLeft) && (!isClicked)) {
                if (ans == 0) {
                    tileLeft.setIcon(img2);
                    score++;
                    lbScore.setText(" " + score);
                }
                else {
                    tileLeft.setIcon(img1);
                }
                isClicked = true;

            } else if ((source == tileRight) && (!isClicked)) {
                if (ans == 1) {
                    tileRight.setIcon(img2);
                    score++;
                    lbScore.setText(" " + score);
                }
                else {
                    tileRight.setIcon(img1);
                }
                isClicked = true;

            } else if (source == btnNext) {
                tileLeft.setIcon(img3);
                tileRight.setIcon(img4);
                play();
            }
        }
    }
}