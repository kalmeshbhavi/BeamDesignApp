package com.beamdesign.component.columndesign;

import com.beamdesign.component.BarAndWeightPane;

import javax.swing.*;
import java.awt.*;

public class ColumnDesignPane extends JPanel {
    public ColumnDesignPane() {

        setLayout(new GridLayout(1,2, 5,5));
        add(new BarAndWeightPane());
        add(new ColumnCalculationPane());
    }
}
