package com.beamdesign.component.columndesign;

import com.beamdesign.component.MassForceDetailsPane;
import com.beamdesign.component.columndesign.model.ColumnAreaTableModel;
import com.beamdesign.controller.Controller;
import com.beamdesign.model.Column;
import com.beamdesign.table.BarWeightTableColorRenderer;

import javax.swing.*;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import java.awt.*;
import java.util.List;

public class ColumnCalculationPane extends JPanel {

    private JTable table;
    private ColumnAreaTableModel tableModel;

    public ColumnCalculationPane() {
        super(new GridLayout(2, 1));


        BarWeightTableColorRenderer colorRenderer = new BarWeightTableColorRenderer();

        tableModel = new ColumnAreaTableModel();
        tableModel.setData(new Controller().getAreaColumnDetails());
        table = new JTable(tableModel);

        table.setCellSelectionEnabled(true);

        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        table.getTableHeader().setReorderingAllowed(false);
        table.setDefaultRenderer(Object.class, colorRenderer);
        setLayout(new GridLayout(2,1));


        add(new JScrollPane(table), BorderLayout.CENTER);

        List<Column> columns = tableModel.getColumns();


        /*Component columnAreaCalculationTablePanel = add(new ColumnAreaCalculationTablePanel());
        columnAreaCalculationTablePanel.setSize(300, 400);*/



        /*Integer firstColArea = columns.get(0).getArea();
        int remainingColumnSum = columns.stream().skip(1).mapToInt(Column::getArea).sum();
        System.out.println("firstColArea =" + firstColArea);
        System.out.println("remainingColumnSum =" + remainingColumnSum);

        Integer puMassValue = 6 * (firstColArea - remainingColumnSum);
        Integer puForceValue = 190 * remainingColumnSum;
        System.out.println("puMassValue =" + puMassValue);
        double steelValue = (remainingColumnSum * 100) / firstColArea;
        System.out.println("steelValue =" + steelValue);*/

        Result result = getResultPanelValues(columns);
        ResultPanel resultPanel = new ResultPanel(result.getPuValue(), result.getSteelPerc());
//        ResultPanel resultPanel = new ResultPanel(puMassValue + puForceValue, steelValue);
        add(resultPanel);

        tableModel.addTableModelListener(e -> {
            if (e.getType() == TableModelEvent.UPDATE) {
                Result resultPanelValues = getResultPanelValues(tableModel.getColumns());
                System.out.println(resultPanelValues);
                resultPanel.setSteelPValue(resultPanelValues.getSteelPerc());
                resultPanel.setPuNValue(resultPanelValues.getPuValue());
            }
        });
    }

    private Result getResultPanelValues(List<Column> columns) {
        Integer firstColArea = columns.get(0).getArea();
        int remainingColumnSum = columns.stream().skip(1).mapToInt(Column::getArea).sum();
        System.out.println("firstColArea =" + firstColArea);
        System.out.println("remainingColumnSum =" + remainingColumnSum);

        Integer puMassValue = 6 * (firstColArea - remainingColumnSum);
        Integer puForceValue = 190 * remainingColumnSum;
        System.out.println("puMassValue =" + puMassValue);
        double steelValue = (remainingColumnSum * 100) / firstColArea;
        System.out.println("steelValue =" + steelValue);

        Result result = new Result();
        result.setPuValue(puMassValue + puForceValue);
        result.setSteelPerc(steelValue);
        return result;
    }
}

class Result {

    private Integer puValue;
    private Double steelPerc;

    public Integer getPuValue() {
        return puValue;
    }

    public void setPuValue(Integer puValue) {
        this.puValue = puValue;
    }

    public Double getSteelPerc() {
        return steelPerc;
    }

    public void setSteelPerc(Double steelPerc) {
        this.steelPerc = steelPerc;
    }

    @Override
    public String toString() {
        return "Result{" +
                "puValue=" + puValue +
                ", steelPerc=" + steelPerc +
                '}';
    }
}

