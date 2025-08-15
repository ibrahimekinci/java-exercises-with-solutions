/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jFrames;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

/**
 *
 * @author pc
 */
public class ColorfulTextsPanel extends JPanel {

    private final String word = "COLOR";
    private final int wordCount = 20;

    private final Color[] gradientColors = generateGradientColors(wordCount);

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawTextCircle((Graphics2D) g);
    }

    private void drawTextCircle(Graphics2D g2d) {
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        int centerX = getWidth() / 2;
        int centerY = getHeight() / 2;
        int radius = 200;
        Font font = new Font("SansSerif", Font.BOLD, 16);
        g2d.setFont(font);

        double angleStep = 2 * Math.PI / wordCount;

        for (int i = 0; i < wordCount; i++) {
            double angle = i * angleStep;

            int textX = (int) (centerX + radius * Math.cos(angle));
            int textY = (int) (centerY + radius * Math.sin(angle));

            g2d.setColor(gradientColors[i]);
            g2d.drawString(word, textX - 20, textY);
        }
    }

    private static Color[] generateGradientColors(int steps) {
        Color[] colors = new Color[steps];
        int t = 100 / steps;
        for (int i = 0; i < steps; i++) {
            int r = (int) (100 + 55 + t * i);
            int g = 0;
            int b = (int) (255 - 100 - t * i);
            colors[i] = new Color(r, g, b);
        }
        return colors;
    }
}
