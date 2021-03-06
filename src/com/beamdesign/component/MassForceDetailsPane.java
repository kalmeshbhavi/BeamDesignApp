package com.beamdesign.component;

import com.beamdesign.table.BarWeightTableColorRenderer;

import javax.swing.*;

public class MassForceDetailsPane extends JPanel {

    public static final Object[] TABLE_HEADER = {"Mass", "Force", "Result"};
    public static final Object[][] TABLE_DATA = {
            {"M 15 = 4", "Fe 250=", 130},
            {"M 20 = 5", "Fe 415=", 190},
            {"M 25 = 6", "Fe 500=", 190},
            {"M 30 = 8", "Fe 500=", 190},
    };


    public MassForceDetailsPane() {
        BarWeightTableColorRenderer colorRenderer = new BarWeightTableColorRenderer();
        JTable table = new JTable(TABLE_DATA, TABLE_HEADER);
        table.setEnabled(false);
        table.setDefaultRenderer(Object.class, colorRenderer);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        table.getTableHeader().setReorderingAllowed(false);
        add(new JScrollPane(table));
    }
}
