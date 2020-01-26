package com.beamdesign.component;

import javax.swing.*;
import java.awt.*;

public class ColumnCalculationPane extends JPanel {

    public ColumnCalculationPane() {
        super(new GridLayout(2,1));
        
        add(new MassForceDetailsPane());
        add(new ColumnAreaCalculationPane());
    }
}
