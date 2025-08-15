/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jFrames;

import javax.swing.*;

/**
 *
 * @author pc
 */
public class ColorfulTextsJFrame extends JFrame {

    public ColorfulTextsJFrame() {
        // Set up the frame
        setTitle("16303_IbrahimEkinci_tut5_task3 - Art");
        setSize(800, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the frame on screen
        // Add main panel to frame
        var mainPanel = new ColorfulTextsPanel();
        add(mainPanel);

        Timer timer = new Timer(10, e -> mainPanel.repaint());
        timer.start();
    }
}
