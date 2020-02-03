package com.beamdesign.component;

import com.beamdesign.model.MassForceDetails;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class MassForceDetailsTableModel extends AbstractTableModel {
    private List<MassForceDetails> massForceDetails;

    @Override
    public int getRowCount() {
        return massForceDetails.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return null;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return columnIndex > 2;
    }
}
