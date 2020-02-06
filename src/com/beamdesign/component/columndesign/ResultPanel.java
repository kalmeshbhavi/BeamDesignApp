package com.beamdesign.component.columndesign;

import com.beamdesign.component.columndesign.model.Result;
import com.beamdesign.util.SpringUtilities;

import javax.swing.*;
import java.awt.*;

public class ResultPanel extends JPanel {

    private JLabel pu;
    private JLabel puN;
    private JLabel puNValueUnit;
    private JLabel puKNValueUnit;
    private JTextField puNewton;
    private JTextField puKNewtron;
    private JLabel steelLabel;
    private JTextField steelPerc;

    public void setPuEditorTextValue(ResultPanel resultPanel, Result result) {
        this.puNewton.setText(String.valueOf(result.getPuValue()));
        this.puKNewtron.setText(String.valueOf(result.getPuKNValue()));
        this.steelPerc.setText(String.valueOf(result.getSteelPerc()));
    }

    public ResultPanel() {

        setLayout(new FlowLayout());
        pu = new JLabel("PU:");
        pu.setPreferredSize(new Dimension(30, 30));
        pu.setHorizontalTextPosition(SwingConstants.LEFT);
        pu.setFont(new Font(Font.DIALOG_INPUT, Font.PLAIN, 16));

        puNewton = new JTextField();
        puNewton.setEditable(false);
        puNewton.setPreferredSize(new Dimension(100, 30));
        puNewton.setHorizontalAlignment(SwingConstants.CENTER);
        puNewton.setFont(new Font(Font.DIALOG_INPUT, Font.PLAIN, 16));
        puNewton.setForeground(Color.RED);
        pu.setLabelFor(puKNewtron);

        puNValueUnit = new JLabel("N");
        puNValueUnit.setPreferredSize(new Dimension(20, 30));
        puNValueUnit.setHorizontalTextPosition(SwingConstants.LEFT);
        puNValueUnit.setFont(new Font(Font.DIALOG_INPUT, Font.PLAIN, 10));
        puNValueUnit.setForeground(Color.BLUE);

        puN = new JLabel("PU:");
        puN.setPreferredSize(new Dimension(30, 30));
        puN.setHorizontalTextPosition(SwingConstants.LEFT);
        puN.setFont(new Font(Font.DIALOG_INPUT, Font.PLAIN, 16));


        puKNewtron = new JTextField();
        puKNewtron.setEditable(false);
        puN.setLabelFor(puKNewtron);
        puKNewtron.setPreferredSize(new Dimension(100, 30));
        puKNewtron.setHorizontalAlignment(SwingConstants.CENTER);
        puKNewtron.setFont(new Font(Font.DIALOG_INPUT, Font.PLAIN, 16));
        puKNewtron.setForeground(Color.RED);

        puKNValueUnit = new JLabel("KN");
        puKNValueUnit.setPreferredSize(new Dimension(30, 30));
        puKNValueUnit.setHorizontalTextPosition(SwingConstants.LEFT);
        puKNValueUnit.setFont(new Font(Font.DIALOG_INPUT, Font.PLAIN, 10));
        puKNValueUnit.setForeground(Color.BLUE);

        steelLabel = new JLabel("Steel (%)");
        steelLabel.setPreferredSize(new Dimension(80, 30));
        steelLabel.setHorizontalTextPosition(SwingConstants.RIGHT);
        steelLabel.setFont(new Font(Font.DIALOG_INPUT, Font.PLAIN, 16));

        steelPerc = new JTextField();
        steelPerc.setFont(new Font(Font.DIALOG_INPUT, Font.PLAIN, 16));
        steelPerc.setEditable(false);
        steelPerc.setPreferredSize(new Dimension(100, 30));
        steelPerc.setHorizontalAlignment(SwingConstants.CENTER);
        steelPerc.setForeground(Color.RED);
        steelLabel.setLabelFor(steelPerc);


//        setLayout(layout);
//        JPanel panel = new JPanel();
//        SpringUtilities.makeGrid(panel, 3, 2, 5, 5, 5, 5);


        add(pu);
        add(puNewton);
        add(puNValueUnit);
        add(puN);
        add((puKNewtron));
        add(puKNValueUnit);
        add(steelLabel);
        add(steelPerc);
//        add(panel);
    }
}
