package services.strategies.refilwritestrategy.factory;

import models.RefilType;
import services.strategies.refilwritestrategy.BallPenRefilWriteStrategy;
import services.strategies.refilwritestrategy.GellPenRefilWriteStrategy;
import services.strategies.refilwritestrategy.RefilWriteStrategy;

public class RefilPenWriteStrategyFactory {
    public static RefilWriteStrategy getStrategyForType(RefilType type) {
        if (type.equals(RefilType.BALL)) {
            return new BallPenRefilWriteStrategy();
        } else {
            return new GellPenRefilWriteStrategy();
        }
    }
}
