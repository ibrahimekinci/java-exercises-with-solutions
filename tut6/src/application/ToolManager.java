package application;

import domain.tool.*;
import shared.Constants;
import java.awt.*;

public class ToolManager {

    private DrawableTool currentTool;
    private final ColorBrushTool brushTool;
    private final EraserTool eraserTool;
    private int sizeIndex = 2;

    public ToolManager() {
        brushTool = new ColorBrushTool(Constants.BRUSH_SIZES[sizeIndex], Color.BLACK);
        eraserTool = new EraserTool(Constants.BRUSH_SIZES[sizeIndex]);
        currentTool = brushTool;
    }

    public DrawableTool getCurrentTool() {
        return currentTool;
    }

    public DrawableTool getCurrentToolSnapshot() {
        int size = Constants.BRUSH_SIZES[sizeIndex];
        if (currentTool == brushTool) {
            return new ColorBrushTool(size, brushTool.getColor());
        } else {
            return new EraserTool(size);
        }
    }

    public void setColor(Color color) {
        brushTool.setColor(color);
        currentTool = brushTool;
    }

    public void setEraser() {
        currentTool = eraserTool;
    }

    public void increaseBrushSize() {
        if (sizeIndex < Constants.BRUSH_SIZES.length - 1) {
            sizeIndex++;
            updateSizes();
        }
    }

    public void decreaseBrushSize() {
        if (sizeIndex > 0) {
            sizeIndex--;
            updateSizes();
        }
    }

    private void updateSizes() {
        int newSize = Constants.BRUSH_SIZES[sizeIndex];
        brushTool.setSize(newSize);
        eraserTool.setSize(newSize);
    }
}
