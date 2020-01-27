package com.beamdesign.component.columndesign;

import javax.swing.*;
import java.awt.*;

public class ResultPanel extends JPanel {

    private JLabel pu;
    private TextField puNewton;
    private TextField puKNewtron;
    private JLabel steelLabel;
    private JTextField steelPerc;

    public ResultPanel(Integer puNValue, Integer puKNvalue, Integer steelPValue) {

        pu = new JLabel("PU");
        puNewton = new TextField(puNValue);
        puKNewtron = new TextField(puKNvalue);
        steelLabel = new JLabel("Steel (%)");
        steelPerc = new JTextField(steelPValue);

        add(pu);
        add(puNewton);
        add((puKNewtron));
        add(steelLabel);
        add(steelPerc);
    }
}
