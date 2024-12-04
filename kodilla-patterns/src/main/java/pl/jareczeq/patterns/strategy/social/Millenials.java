package pl.jareczeq.patterns.strategy.social;

public final class Millenials extends User {

    public Millenials(String name) {
        super(name);
        socialPublisher = new TwitterPublisher();
    }

}