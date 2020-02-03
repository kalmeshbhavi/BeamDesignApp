package com.beamdesign.component.columndesign;

import com.beamdesign.component.columndesign.model.Result;

import javax.swing.*;
import java.awt.*;

public class ResultPanel extends JPanel {

    private JLabel pu;
    private JLabel puN;
    private TextField puNewton;
    private TextField puKNewtron;
    private JLabel steelLabel;
    private JTextField steelPerc;

    public void setPuEditorTextValue(ResultPanel resultPanel, Result result) {
        this.puNewton.setText(String.valueOf(result.getPuValue()));
        this.puKNewtron.setText(String.valueOf(result.getPuKNValue()));
        this.steelPerc.setText(String.valueOf(result.getSteelPerc()));
    }

    public ResultPanel() {
        setLayout(new FlowLayout());

        pu = new JLabel("PU");
//        pu.setSize(100,25);
        puNewton = new TextField();
        puNewton.setEditable(false);
//        puNewton.setSize(100,25);
        puN = new JLabel("PU /N");
//        puN.setSize(100,25);

//        Integer puNValueDouble =  (puNValue + 1000 -1) / 1000;
        puKNewtron = new TextField();
        puKNewtron.setEditable(false);
//        puKNewtron.setSize(100,25);
        steelLabel = new JLabel("Steel (%)");
//        steelLabel.setSize(100,25);
        steelPerc = new JTextField();
        steelPerc.setEditable(false);
        steelPerc.setSize(100,25);


        add(pu);
        add(puNewton);
        add(puN);
        add((puKNewtron));
        add(steelLabel);
        add(steelPerc);
    }
}
