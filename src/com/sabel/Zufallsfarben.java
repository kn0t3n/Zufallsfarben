package com.sabel;

import javax.swing.*;
import java.awt.*;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;


public class Zufallsfarben extends JFrame {


    public Zufallsfarben() throws HeadlessException {

        this.setTitle("Zufallsfarben");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 200);

        initEvents();

        this.setVisible(true);

    }

    private void initEvents() {

        Random r = new Random();

        this.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                getContentPane().setBackground(new Color(r.nextInt(256),r.nextInt(256),r.nextInt(256)));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                getContentPane().setBackground(new Color(r.nextInt(256),r.nextInt(256),r.nextInt(256)));
            }
        });


    }


}
