package com.beamdesign.component.columndesign.model;

import com.beamdesign.model.Column;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class ColumnAreaTableModel extends AbstractTableModel {

    private List<Column> columns;

    private String[] colNames = {"Length", "Width", "Area", "Unit"};

    public ColumnAreaTableModel() {

    }

    public void setData(List<Column> columns) {
        this.columns = columns;
    }

    @Override
    public String getColumnName(int column) {
        return colNames[column];
    }

    @Override
    public int getRowCount() {
        return this.columns.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int row, int col) {
        Column column = columns.get(row);

        switch (col) {
            case 0:
                return column.getLength();
            case 1:
                return column.getWidth();
            case 2:
                return column.getArea();
            case 3:
                return column.getUnit();
            default:
                return null;
        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return columnIndex != 2 && columnIndex != 3;
    }
}
