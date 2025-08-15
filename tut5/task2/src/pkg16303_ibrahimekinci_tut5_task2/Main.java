/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg16303_ibrahimekinci_tut5_task2;

import jFrames.ColorfulTextsJFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author pc
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Enable anti-aliasing for smoother graphics
        System.setProperty("awt.useSystemAAFontSettings", "on");
        // Run on the Event Dispatch Thread
        SwingUtilities.invokeLater(() -> {
            var frame = new ColorfulTextsJFrame();
            frame.setVisible(true);
        });
    }

}
