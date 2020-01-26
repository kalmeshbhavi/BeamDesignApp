package com.beamdesign.component;

import javax.swing.*;

public class BeamDesignTabbedComponent extends JTabbedPane {
    public BeamDesignTabbedComponent() {

        addTab("Column Design", new ColumnDesignPane());
        addTab("Footer Design", new FooterDesignPane());
    }
}
