package org.design_patterns.behaviour.memento;

import java.util.Stack;

public class DrawingCanvasHistory {

    private final Stack<DrawingCanvasState> prevState;
    private final Stack<DrawingCanvasState> nextState;

    public DrawingCanvasHistory() {
        this.prevState = new Stack<>();
        this.nextState = new Stack<>();
    }

    public void saveCanvasHistory(DrawingCanvasState drawingCanvasState){
        prevState.push(drawingCanvasState);
        nextState.clear();
    }

    public DrawingCanvasState undo(){
        if(!prevState.isEmpty()){
            DrawingCanvasState state = prevState.pop();
            nextState.push(state);
            return state;
        }
        throw new RuntimeException("Something went wrong!!!!");
    }

    public DrawingCanvasState redo(){
        if(!nextState.isEmpty()){
            DrawingCanvasState state = nextState.pop();
            prevState.push(state);
            return state;
        }
        throw new RuntimeException("Something went wrong!!!!");
    }

}
