package com.beamdesign.table;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;
import java.awt.*;

public class BarWeightTableColorRenderer implements TableCellRenderer {

    public static final DefaultTableCellRenderer DEFAULT_RENDERER = new DefaultTableCellRenderer();

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {

        Component c = DEFAULT_RENDERER.getTableCellRendererComponent(table,
                value, isSelected, hasFocus, row, column);
        // Apply zebra style on table rows
        if (row % 2 == 0) {
            c.setBackground(Constants.EVEN_ROW_COLOR);
        } else {
            c.setBackground(Constants.ODD_ROW_COLOR);
        }

       /* if (column == Constants.CHANGE_IDX
                || column == Constants.PERCENTAGE_CHANGE_IDX) {
            Object priceChangeObj = table.getModel().getValueAt(row,
                    Constants.CHANGE_IDX);
            double priceChange = Double.parseDouble(priceChangeObj.toString());
            Color color;
            if (priceChange > 0) {
                color = Constants.PRICE_UP_COLOR;
            } else {
                color = Constants.PRICE_DOWN_COLOR;
            }
            c.setForeground(color);
        } else {
            c.setForeground(Constants.DEFAULT_FOREGROUND_COLOR);
        }*/

        return c;
    }
}
