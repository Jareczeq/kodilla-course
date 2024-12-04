package pl.jareczeq.patterns.strategy.social;

public final class YGeneration extends User {

    public YGeneration(String name) {
        super(name);
        socialPublisher = new FacebookPublisher();
    }

}
