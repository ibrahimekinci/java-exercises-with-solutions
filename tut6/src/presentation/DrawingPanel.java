package presentation;

import application.ToolManager;
import domain.tool.DrawableTool;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

public class DrawingPanel extends JPanel implements MouseListener, MouseMotionListener {

    private final ToolManager toolManager;
    private final List<StrokeAction> strokes = new ArrayList<>();

    public DrawingPanel(ToolManager toolManager) {
        this.toolManager = toolManager;
        setBackground(Color.WHITE);
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    private static class StrokeAction {

        int x, y;
        DrawableTool tool;

        public StrokeAction(int x, int y, DrawableTool tool) {
            this.x = x;
            this.y = y;
            this.tool = tool;
        }

        public void draw(Graphics g) {
            tool.apply(g, x, y);
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (StrokeAction action : strokes) {
            action.draw(g);
        }
    }

    private void drawAt(int x, int y) {
        DrawableTool toolCopy = toolManager.getCurrentToolSnapshot();
        strokes.add(new StrokeAction(x, y, toolCopy));
        repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {
        drawAt(e.getX(), e.getY());
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        drawAt(e.getX(), e.getY());
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }
}
