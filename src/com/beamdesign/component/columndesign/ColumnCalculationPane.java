package com.beamdesign.component.columndesign;

import com.beamdesign.component.columndesign.model.ColumnAreaTableModel;
import com.beamdesign.component.columndesign.model.Result;
import com.beamdesign.controller.Controller;
import com.beamdesign.model.Column;
import com.beamdesign.model.MassForceDetails;
import com.beamdesign.table.BarWeightTableColorRenderer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ColumnCalculationPane extends JPanel {

    private JTable table;
    private ColumnAreaTableModel tableModel;
    private Controller controller;
    private int selectedIndex;

    private static final Map<Integer, List<Integer>> massMapp= new HashMap(){{
        put(0, Arrays.asList(4, 130));
        put(1, Arrays.asList(5, 190));
        put(2, Arrays.asList(6, 190));
        put(3, Arrays.asList(8, 190));
    }};

    public ColumnCalculationPane() {
//        super(new GridLayout(3,0));
        controller = new Controller();

        BarWeightTableColorRenderer colorRenderer = new BarWeightTableColorRenderer();

        tableModel = new ColumnAreaTableModel();
        tableModel.setData(controller.getAreaColumnDetails());
        table = new JTable(tableModel);

        table.setCellSelectionEnabled(true);

        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        table.getTableHeader().setReorderingAllowed(false);
        table.setDefaultRenderer(Object.class, colorRenderer);

        add(new JScrollPane(table));

        List<Column> columns = tableModel.getColumns();

        Result result = getResultPanelValues(columns, selectedIndex);
        ResultPanel resultPanel = new ResultPanel();
        resultPanel.setPuEditorTextValue(resultPanel, result);

        String[] massForceList = controller.getMassForceList();
        JComboBox<String> massForceDetailsJList = new JComboBox<>(massForceList);

        massForceDetailsJList.setSelectedIndex(0);
        selectedIndex = massForceDetailsJList.getSelectedIndex();

        add(massForceDetailsJList);
        massForceDetailsJList.addItemListener(e -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                String item = (String) e.getItem();
                int i = Arrays.asList(massForceList).indexOf(item);
                System.out.println(i);
                selectedIndex = i;
                Result res = getResultPanelValues(tableModel.getColumns(), selectedIndex);
                resultPanel.setPuEditorTextValue(resultPanel, res);
            }
        });


        add(resultPanel);

        tableModel.addTableModelListener(e -> {
            Result resultPanelValues = getResultPanelValues(tableModel.getColumns(), selectedIndex);
            resultPanel.setPuEditorTextValue(resultPanel, resultPanelValues);
        });
    }

    private Result getResultPanelValues(List<Column> columns, int index) {
        Integer firstColArea = columns.get(0).getArea();
        int remainingColumnSum = columns.stream().skip(1).mapToInt(Column::getArea).sum();

        Integer puMassValue = massMapp.get(index).get(0) * (firstColArea - remainingColumnSum);
        Integer puForceValue = massMapp.get(index).get(1) * remainingColumnSum;
        double steelValue = (remainingColumnSum * 100) / firstColArea;
        Integer puNValueDouble = (puMassValue + puForceValue + 1000 - 1) / 1000;

        Result result = new Result();
        result.setPuValue(puMassValue + puForceValue);
        result.setSteelPerc(steelValue);
        result.setPuKNValue(puNValueDouble);

        return result;
    }
}

