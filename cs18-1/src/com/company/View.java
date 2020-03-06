package com.company;

import javax.swing.*;
import java.awt.*;

public class View extends JFrame {

    JLabel label;

    public View() {
        super();
    }

    public void initialise() {
        this.setTitle("Weiltzeituhr");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        label = new JLabel(new ImageIcon("urania-weltzeituhr_alexanderplatz_berlin.jpeg"));

        this.add(label);
        this.pack();


        //BorderLayout bl = new BorderLayout();

        //this.setLayout(bl);
        //bl.addLayoutComponent(label, BorderLayout.WEST);
        this.setVisible(true);

    }
}
