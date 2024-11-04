package org.design_patterns.behaviour.memento;

public class Main {

    public static void main(String[] args) {
        DrawingCanvas canvas = new DrawingCanvas();
        DrawingCanvasHistory history = new DrawingCanvasHistory();

        // Set initial state and save it
        canvas.setContent("Initial Content");
        canvas.setColor("Blue");
        canvas.setBorder("Solid");
        history.saveCanvasHistory(canvas.saveCanvas());

        canvas.setContent("Updated Content 1");
        canvas.setColor("Red");
        canvas.setBorder("Dashed");
        history.saveCanvasHistory(canvas.saveCanvas());

        canvas.setContent("Updated Content 2");
        canvas.setColor("Green");
        canvas.setBorder("Dotted");

        canvas.restoreCanvas(history.undo());
        System.out.println("\nAfter 1nd Undo:");
        printCanvasState(canvas);

        canvas.restoreCanvas(history.undo());
        System.out.println("\nAfter 2nd Undo:");
        printCanvasState(canvas);

        canvas.restoreCanvas(history.redo());
        history.saveCanvasHistory(canvas.saveCanvas());
        System.out.println("\nAfter 1nd redo:");
        printCanvasState(canvas);

    }

    private static void printCanvasState(DrawingCanvas canvas) {
        System.out.println("Content: " + canvas.getContent());
        System.out.println("Color: " + canvas.getColor());
        System.out.println("Border: " + canvas.getBorder());
    }
}
