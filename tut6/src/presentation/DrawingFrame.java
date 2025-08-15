package presentation;

import application.ToolManager;
import shared.Constants;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class DrawingFrame extends JFrame implements KeyListener {

    private final ToolManager toolManager;

    public DrawingFrame() {
        toolManager = new ToolManager();
        DrawingPanel panel = new DrawingPanel(toolManager);

        setTitle("DrawSomething - OOP Version");
        setSize(1000, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        topPanel.setBackground(Color.LIGHT_GRAY);

        addColorButton(topPanel, "Red", Color.RED);
        addColorButton(topPanel, "Green", Color.GREEN);
        addColorButton(topPanel, "Cyan", Color.CYAN);
        addColorButton(topPanel, "Yellow", Color.YELLOW);
        addColorButton(topPanel, "Black", Color.BLACK);
        addEraserButton(topPanel);
        addBrushSizeButtons(topPanel);

        add(topPanel, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);

        ImageIcon icon = new ImageIcon(getClass().getResource("/icons/apple-icon-57x57.png"));
        setIconImage(icon.getImage());

        addKeyListener(this);
        setFocusable(true);
        setVisible(true);
    }

    private void addColorButton(JPanel panel, String name, Color color) {
        JButton btn = new JButton();
        btn.setPreferredSize(new Dimension(100, 100));
        btn.setBackground(color);
        btn.setToolTipText(name + " Brush");
        btn.setFocusPainted(false);
        btn.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));

        btn.addActionListener(e -> toolManager.setColor(color));
        panel.add(btn);
    }

    private void addEraserButton(JPanel panel) {
        JButton eraserBtn = new JButton("Eraser");
        eraserBtn.setPreferredSize(new Dimension(100, 100));
        eraserBtn.setBackground(Color.WHITE);
        eraserBtn.setFocusPainted(false);
        eraserBtn.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));

        eraserBtn.addActionListener(e -> toolManager.setEraser());
        panel.add(eraserBtn);
    }

    private void addBrushSizeButtons(JPanel panel) {
        JButton increaseBtn = new JButton("+");
        increaseBtn.setPreferredSize(new Dimension(100, 100));
        increaseBtn.setFont(new Font("Arial", Font.BOLD, 40));
        increaseBtn.addActionListener(e -> toolManager.increaseBrushSize());

        JButton decreaseBtn = new JButton("-");
        decreaseBtn.setPreferredSize(new Dimension(100, 100));
        decreaseBtn.setFont(new Font("Arial", Font.BOLD, 40));
        decreaseBtn.addActionListener(e -> toolManager.decreaseBrushSize());

        panel.add(increaseBtn);
        panel.add(decreaseBtn);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        char keyChar = e.getKeyChar();

        // Brush size controls
        if (code == KeyEvent.VK_EQUALS && e.isShiftDown() || keyChar == '+') {
            toolManager.increaseBrushSize();
        } else if (keyChar == '-' || code == KeyEvent.VK_MINUS) {
            toolManager.decreaseBrushSize();
        }

        // Color and eraser controls
        switch (Character.toLowerCase(keyChar)) {
            case 'r' ->
                toolManager.setColor(Constants.COLORS[0]); // Red
            case 'g' ->
                toolManager.setColor(Constants.COLORS[1]); // Green
            case 'c' ->
                toolManager.setColor(Constants.COLORS[2]); // Cyan
            case 'y' ->
                toolManager.setColor(Constants.COLORS[3]); // Yellow
            case 'b' ->
                toolManager.setColor(Constants.COLORS[4]); // Black
            case 'e' ->
                toolManager.setEraser();                   // Eraser
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }
}
