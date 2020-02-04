package com.beamdesign;

import com.beamdesign.component.BeamDesignTabbedComponent;
import com.beamdesign.component.TopbarComponent;
import com.beamdesign.controller.Controller;
import javafx.scene.paint.Material;

import javax.swing.*;
import javax.swing.plaf.metal.MetalLookAndFeel;
import javax.swing.plaf.metal.OceanTheme;
import java.awt.*;

public class BeamDesignUI extends JFrame {

    private Controller controller;

    public BeamDesignUI() {

        // Set metl look and feel
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
            MetalLookAndFeel.setCurrentTheme(new OceanTheme());
        } catch (Exception e) {
            e.printStackTrace();
        }

        setLayout(new BorderLayout());

        controller = new Controller();

        add(new BeamDesignTabbedComponent(), BorderLayout.CENTER);
        pack();
        setDefaultLookAndFeelDecorated(true);
        setSize(600, 600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(BeamDesignUI::new);
    }
}
