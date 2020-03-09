package com.company;

import javax.swing.*;
import java.awt.*;

public class View extends JFrame {

    JLabel label;
    Display uhranzeige;

    public View() {
        super();
    }

    public void initialise() {
        this.setTitle("Weiltzeituhr");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);



        label = new JLabel(new ImageIcon("urania-weltzeituhr_alexanderplatz_berlin.jpeg"));
        this.add(label, BorderLayout.WEST);
        this.pack();

        //this.getLayout(). setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);

        JPanel p = new JPanel();
        p.setLayout(new BorderLayout());

        JPanel clocks = new JPanel();
        clocks.setLayout(new BoxLayout(clocks, BoxLayout.Y_AXIS));

        JSpinner counter = new JSpinner();
        counter.setModel(new SpinnerNumberModel(0, 0, 5, 1));
        counter.setSize(400, 100);
        Font font = new Font(Font.SANS_SERIF, Font.BOLD,64);
        counter.setFont(font);
        counter.setToolTipText("Erzeugt oder löscht eine Uhr");

        p.add(counter, BorderLayout.SOUTH);
        p.add(clocks, BorderLayout.NORTH);

        uhranzeige = new Display();
        p.add(uhranzeige, BorderLayout.EAST);

        this.add(p, BorderLayout.EAST);
        this.pack();



        this.setVisible(true);

    }
}
