package models.pens;

import models.Colour;

public interface Pen {
    void write();

    Colour getColour();
}
