package com.beamdesign.component.columndesign.model;

import com.beamdesign.model.Column;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class ColumnAreaTableModel extends AbstractTableModel {

    private List<Column> columns;

    private String[] colNames = {"Length", "Width", "Area", "Unit"};

    public ColumnAreaTableModel() {}

    public void setData(List<Column> columns) {
        this.columns = columns;
    }

    @Override
    public String getColumnName(int column) {
        return colNames[column];
    }

    @Override
    public int getRowCount() {
        return 6;
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Column column = columns.get(rowIndex);
        switch (columnIndex) {
            case 0:
                column.setLength(Integer.valueOf((String)aValue));
                break;
            case 1:
                column.setWidth(Integer.valueOf((String)aValue));
                break;
            default:
        }
        column.setArea(column.getLength()*column.getWidth());
        fireTableDataChanged();
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

        if (columnIndex == 0) {
            return true;
        }

        return columnIndex == 1 && rowIndex < 1;
    }

    @Override
    public String toString() {
        return "ColumnAreaTableModel{" +
                "columns=" + columns +
                '}';
    }

    public List<Column> getColumns() {
        return this.columns;
    }
}
