package com.company;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.beans.*;
import java.lang.annotation.Annotation;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Display extends JPanel implements ItemListener {
    transient SimpleDateFormat formatter;
    String date;
    JLabel label;
    transient Timer timer;

    public Display() {
        formatter = new SimpleDateFormat(String.valueOf(SimpleDateFormat.FULL), Locale.getDefault());

        label = new JLabel();
        label.setForeground(Color.RED);

        Font font = new Font(Font.SANS_SERIF, Font.BOLD,48);
        label.setFont(font);
        label.setText(date);

        JComboBox<String> timezone = new JComboBox<String>();
        timezone.addItem("Asia/Bangkok");
        timezone.addItem("Asia/Beirut");
        timezone.addItem("Asia/Damascus");
        timezone.addItem("Asia/Istanbul");
        timezone.addItem("Asia/Jakarta");
        timezone.addItem("Asia/Shanghai");
        timezone.addItem("Asia/Tokyo");
        timezone.addItem("Europe/Berlin");
        timezone.addItem("Europe/Lisbon");
        timezone.addItem("Europe/Moscow");

        timezone.setSelectedIndex(7);

        this.setPreferredSize(new Dimension(600,120));
        this.setBackground(Color.LIGHT_GRAY);
        this.setBorder(new LineBorder(Color.green, 5));
        this.setLayout(new BorderLayout());

        this.add(timezone, BorderLayout.SOUTH);
        this.add(label, BorderLayout.NORTH);

        this.setVisible(true);
        

    }

    @Override
    public void itemStateChanged(ItemEvent itemEvent) {

    }
}
