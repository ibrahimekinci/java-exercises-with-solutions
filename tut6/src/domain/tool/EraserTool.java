package domain.tool;

import java.awt.*;

public class EraserTool extends AbstractBrushTool {

    public EraserTool(int size) {
        super(size);
    }

    @Override
    public void apply(Graphics g, int x, int y) {
        drawCircle(g, x, y, Color.WHITE);
    }
}
