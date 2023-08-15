package org.pattern.structural.Adaptor.example1.Pen;

public class PenAdapter implements Pen{
    PilotPen pilotPen = new PilotPen();
    @Override
    public void write(String str) {
        pilotPen.mark(str);
    }
}
