package com.beamdesign.component.columndesign;

import com.beamdesign.component.columndesign.listener.ColumnAreaCalculationPaneListener;
import com.beamdesign.controller.Controller;
import com.beamdesign.model.Column;
import com.beamdesign.component.columndesign.model.ColumnAreaTableModel;
import com.beamdesign.table.BarWeightTableColorRenderer;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.util.Arrays;
import java.util.List;

public class ColumnAreaCalculationTablePanel extends JPanel {

    private JTable table;
    private ColumnAreaTableModel tableModel;


    public ColumnAreaCalculationTablePanel() {
        BarWeightTableColorRenderer colorRenderer = new BarWeightTableColorRenderer();

        tableModel = new ColumnAreaTableModel();
        setData(new Controller().getAreaColumnDetails());
        table = new JTable(tableModel);

        table.setCellSelectionEnabled(true);


        table.getModel().addTableModelListener(new ColumnAreaCalculationPaneListener());



        /*cellSelectionModel.addListSelectionListener(e -> {

            int[] selectedRow = table.getSelectedRows();
            int[] selectedColumns = table.getSelectedColumns();

            for (int value : selectedRow) {
                for (int selectedColumn : selectedColumns) {
                    System.out.println("Selected: " + table.getValueAt(value, selectedColumn));
                }
            }
        });*/
//        refresh();

        setLayout(new BorderLayout());

        table.setDefaultRenderer(Object.class, colorRenderer);

        add(new JScrollPane(table), BorderLayout.CENTER);
    }


    public void setData(List<Column> columns) {
        tableModel.setData(columns);
    }

    public void refresh() {
        tableModel.fireTableDataChanged();
    }

}
