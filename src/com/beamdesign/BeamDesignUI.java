package com.beamdesign;

import com.beamdesign.component.BeamDesignTabbedComponent;
import com.beamdesign.component.TopbarComponent;
import com.beamdesign.controller.Controller;

import javax.swing.*;
import java.awt.*;

public class BeamDesignUI extends JFrame {

    private Controller controller;

    public BeamDesignUI() {
        setLayout(new GridLayout(2, 1));

        controller = new Controller();

//        add(new TopbarComponent());
        add(new BeamDesignTabbedComponent());

        setSize(600, 600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(BeamDesignUI::new);
    }
}
