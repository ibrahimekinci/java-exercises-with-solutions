package domain.tool;

import java.awt.*;

public class ColorBrushTool extends AbstractBrushTool {

    private Color color;

    public ColorBrushTool(int size, Color color) {
        super(size);
        this.color = color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return this.color;
    }

    @Override
    public void apply(Graphics g, int x, int y) {
        drawCircle(g, x, y, color);
    }
}
