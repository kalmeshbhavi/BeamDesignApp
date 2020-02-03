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
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        table.getTableHeader().setReorderingAllowed(false);

        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane);
        scrollPane.setMaximumSize(table.getMaximumSize());

        add(new MassForceDetailsPane());

    }
}
