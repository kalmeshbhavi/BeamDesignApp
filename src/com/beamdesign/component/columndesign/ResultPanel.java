package com.beamdesign.component.columndesign;

import javax.swing.*;
import java.awt.*;
import java.util.function.DoubleBinaryOperator;

public class ResultPanel extends JPanel {

    private JLabel pu;
    private JLabel puN;
    private TextField puNewton;
    private TextField puKNewtron;
    private JLabel steelLabel;
    private JTextField steelPerc;
    private Integer puNValue;
    private Double steelPValue;

    public JLabel getPu() {
        return pu;
    }

    public void setPu(JLabel pu) {
        this.pu = pu;
    }

    public JLabel getPuN() {
        return puN;
    }

    public void setPuN(JLabel puN) {
        this.puN = puN;
    }

    public TextField getPuNewton() {
        return puNewton;
    }

    public void setPuNewton(TextField puNewton) {
        this.puNewton = puNewton;
    }

    public TextField getPuKNewtron() {
        return puKNewtron;
    }

    public void setPuKNewtron(TextField puKNewtron) {
        this.puKNewtron = puKNewtron;
    }

    public JLabel getSteelLabel() {
        return steelLabel;
    }

    public void setSteelLabel(JLabel steelLabel) {
        this.steelLabel = steelLabel;
    }

    public JTextField getSteelPerc() {
        return steelPerc;
    }

    public void setSteelPerc(JTextField steelPerc) {
        this.steelPerc = steelPerc;
    }

    public Integer getPuNValue() {
        return puNValue;
    }

    public void setPuNValue(Integer puNValue) {
        this.puNValue = puNValue;
    }

    public Double getSteelPValue() {
        return steelPValue;
    }

    public void setSteelPValue(Double steelPValue) {
        this.steelPValue = steelPValue;
    }

    public ResultPanel(int puNValue, double steelValue) {
        setLayout(new FlowLayout());

        pu = new JLabel("PU");
        pu.setSize(100,25);
        puNewton = new TextField(String.valueOf(puNValue));
        puNewton.setEditable(false);
        puNewton.setSize(100,25);
        puN = new JLabel("PU /N");
        puN.setSize(100,25);

        Integer puNValueDouble =  (puNValue + 1000 -1) / 1000;
        puKNewtron = new TextField(String.valueOf(puNValueDouble));
        puKNewtron.setEditable(false);
        puKNewtron.setSize(100,25);
        steelLabel = new JLabel("Steel (%)");
        steelLabel.setSize(100,25);
        steelPerc = new JTextField(String.valueOf(steelValue));
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
