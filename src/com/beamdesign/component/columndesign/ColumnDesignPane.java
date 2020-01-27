package com.beamdesign.component.columndesign;

import com.beamdesign.component.BarAndWeightPane;

import javax.swing.*;
import java.awt.*;

public class ColumnDesignPane extends JPanel {
    public ColumnDesignPane() {

        super(new GridLayout(1,2));
        add(new BarAndWeightPane());
        add(new ColumnCalculationPane());
    }
}
