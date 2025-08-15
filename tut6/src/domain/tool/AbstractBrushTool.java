package domain.tool;

import java.awt.*;

public abstract class AbstractBrushTool implements DrawableTool {

    protected int size;

    public AbstractBrushTool(int size) {
        this.size = size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    protected void drawCircle(Graphics g, int x, int y, Color color) {
        g.setColor(color);
        g.fillOval(x - size / 2, y - size / 2, size, size);
    }
}
