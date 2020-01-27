package com.beamdesign.component.columndesign;

import com.beamdesign.component.MassForceDetailsPane;

import javax.swing.*;
import java.awt.*;

public class ColumnCalculationPane extends JPanel {

    public ColumnCalculationPane() {
        super(new GridLayout(3, 1));

        add(new MassForceDetailsPane());
        add(new ColumnAreaCalculationTablePanel());
//        add(new ResultPanel());
    }
}
