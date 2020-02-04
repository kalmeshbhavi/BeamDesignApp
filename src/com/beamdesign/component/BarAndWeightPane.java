package com.beamdesign.component;

import com.beamdesign.table.BarWeightTable;
import com.beamdesign.table.BarWeightTableColorRenderer;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class BarAndWeightPane extends JPanel {

    public BarAndWeightPane() {

        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        BarWeightTableColorRenderer colorRenderer = new BarWeightTableColorRenderer();
        JTable table = new JTable(BarWeightTable.DATA, BarWeightTable.TABLE_HEADER);
        table.setEnabled(false);
        table.setDefaultRenderer(Object.class, colorRenderer);
        table.getTableHeader().setReorderingAllowed(false);
        table.setRowHeight(30);
        table.getTableHeader().setPreferredSize(new Dimension(150,32));
        table.getTableHeader().setFont(new Font(Font.DIALOG_INPUT, Font.PLAIN, 15));

        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(),
                "Bar Diameters & Weights",
                TitledBorder.CENTER, TitledBorder.TOP, new Font(Font.DIALOG_INPUT, Font.PLAIN, 15), Color.RED));
        add(scrollPane);

        JTable tableMassPane = new JTable(MassForceDetailsPane.TABLE_DATA, MassForceDetailsPane.TABLE_HEADER);

        tableMassPane.setEnabled(false);
        tableMassPane.setDefaultRenderer(Object.class, colorRenderer);
        tableMassPane.getTableHeader().setReorderingAllowed(false);
        tableMassPane.setRowHeight(30);
        tableMassPane.getTableHeader().setPreferredSize(new Dimension(150,32));
        tableMassPane.getTableHeader().setFont(new Font(Font.DIALOG_INPUT, Font.PLAIN, 15));

        JScrollPane massAndForcePanel = new JScrollPane(tableMassPane);
        massAndForcePanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(),
                "Mass and Force Details",
                TitledBorder.CENTER, TitledBorder.TOP, new Font(Font.DIALOG_INPUT, Font.PLAIN, 15), Color.RED));
        add(massAndForcePanel);
    }
}
