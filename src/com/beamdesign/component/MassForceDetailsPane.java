package com.beamdesign.component;

import com.beamdesign.table.BarWeightTable;
import com.beamdesign.table.BarWeightTableColorRenderer;

import javax.swing.*;

public class MassForceDetailsPane extends JPanel {

    public static final Object[] TABLE_HEADER = {"A", "B", "C", "D"};
    public static final Object[][] TABLE_DATA = {
            {"M 15 = 4", "M 20 = 5", "M 25 = 6", "M 30 = 8"},
            {"Fe 250=", "Fe 415=", "Fe 500=", "Fe 500="},
            {130, 190, 190, 190}
    };


    public MassForceDetailsPane() {
        BarWeightTableColorRenderer colorRenderer = new BarWeightTableColorRenderer();


        JTable table = new JTable(TABLE_DATA, TABLE_HEADER);

        table.setDefaultRenderer(Object.class, colorRenderer);

        add(table);
    }
}
