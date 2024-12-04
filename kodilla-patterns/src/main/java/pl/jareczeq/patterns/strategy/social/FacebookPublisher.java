package pl.jareczeq.patterns.strategy.social;

public class FacebookPublisher implements SocialPublisher {

    @Override
    public String share() {
        return "[Facebook]";
    }

}
