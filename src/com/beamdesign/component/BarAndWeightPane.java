package com.beamdesign.component;

import com.beamdesign.table.BarWeightTable;
import com.beamdesign.table.BarWeightTableColorRenderer;

import javax.swing.*;
import java.awt.*;

public class BarAndWeightPane extends JPanel {

    public BarAndWeightPane() {
        BarWeightTableColorRenderer colorRenderer = new BarWeightTableColorRenderer();
        JTable table = new JTable(BarWeightTable.DATA, BarWeightTable.TABLE_HEADER);
        table.setEnabled(false);
        table.setDefaultRenderer(Object.class, colorRenderer);
        add(new JScrollPane(table));
    }
}
