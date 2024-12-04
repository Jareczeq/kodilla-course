package pl.jareczeq.patterns.strategy;

public sealed interface BuyPredictor permits AggressivePredictor, BalancedPredictor, ConservativePredictor {
    String predictWhatToBuy();
}
