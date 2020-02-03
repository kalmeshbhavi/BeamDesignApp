package com.beamdesign.component;

import com.beamdesign.component.columndesign.ColumnDesignPane;
import com.beamdesign.component.footerdesign.FooterDesignPane;

import javax.swing.*;
import java.awt.*;

public class BeamDesignTabbedComponent extends JTabbedPane {
    public BeamDesignTabbedComponent() {

        addTab("Column Design", new ColumnDesignPane());
        addTab("Footer Design", new FooterDesignPane());
    }
}
