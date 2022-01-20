package models.pens;

import models.Colour;
import models.refils.Refil;
import models.RefilType;
import services.strategies.refilwritestrategy.GellPenRefilWriteStrategy;
import services.strategies.refilwritestrategy.RefilWriteStrategy;
import services.strategies.refilwritestrategy.factory.RefilPenWriteStrategyFactory;

import java.sql.Ref;

public class RefilPen implements Pen {
    private Refil refil;


    RefilPen(Refil refil) {
        this.refil = refil;
    }

    @Override
    public void write() {
        RefilPenWriteStrategyFactory
                .getStrategyForType(refil.getType())
                .write();
    }

    @Override
    public Colour getColour() {
        return null;
    }
}
