package com.beamdesign.component.columndesign.listener;

import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;

public class ColumnAreaCalculationPaneListener implements TableModelListener {

    public ColumnAreaCalculationPaneListener() {
        System.out.println("listener added");
    }


    @Override
    public void tableChanged(TableModelEvent e) {
        int firstRow = e.getFirstRow();
        int lastRow = e.getLastRow();
        int index = e.getColumn();
        System.out.println("Listing");

        switch (e.getType()) {
            case TableModelEvent.UPDATE:
                if (firstRow != TableModelEvent.HEADER_ROW) {
                    for (int i = firstRow; i <= lastRow; i++) {
                        if (index == TableModelEvent.ALL_COLUMNS) {
                            System.out.println("All columns have changed");
                        } else {
                            System.out.println(index);
                        }
                    }
                }
        }
    }
}
