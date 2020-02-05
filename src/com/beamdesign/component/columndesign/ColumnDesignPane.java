package com.beamdesign.component.columndesign;

import com.beamdesign.component.BarAndWeightPane;

import javax.swing.*;
import java.awt.*;

public class ColumnDesignPane extends JPanel {
    public ColumnDesignPane() {

        BarAndWeightPane barAndWeightPane = new BarAndWeightPane();
        ColumnCalculationPane columnCalculationPane = new ColumnCalculationPane();

        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, barAndWeightPane, columnCalculationPane);

        splitPane.setDividerLocation(0.10);

        setBackground(Color.LIGHT_GRAY);
        add(splitPane);

        /*setLayout(new GridLayout(1,2, 5,5));
        add(new BarAndWeightPane());
        add(new ColumnCalculationPane());*/
    }
}
