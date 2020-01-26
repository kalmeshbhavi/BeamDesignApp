package com.beamdesign.component;

import com.beamdesign.table.BarWeightTable;
import com.beamdesign.table.BarWeightTableColorRenderer;

import javax.swing.*;

public class ColumnAreaCalculationPane extends JPanel {
    public ColumnAreaCalculationPane() {
        BarWeightTableColorRenderer colorRenderer = new BarWeightTableColorRenderer();

        JTable table = new JTable(BarWeightTable.DATA, BarWeightTable.TABLE_HEADER);

        table.setDefaultRenderer(Object.class, colorRenderer);

        add(table);
    }
}
