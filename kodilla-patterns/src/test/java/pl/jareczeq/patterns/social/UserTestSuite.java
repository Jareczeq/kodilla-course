package pl.jareczeq.patterns.social;

import org.junit.jupiter.api.Test;
import pl.jareczeq.patterns.strategy.social.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        //Given
        User user1 = new Millenials("Jareczeq");
        User user2 = new ZGeneration("Cramber");
        User user3 = new YGeneration("AndrzejJaromin");

        //When
        String sharedPost1 = user1.sharePost();
        String sharedPost2 = user2.sharePost();
        String sharedPost3 = user3.sharePost();

        //Then
        assertEquals("[Twitter] Jareczeq", sharedPost1);
        assertEquals("[Snapchat] Cramber", sharedPost2);
        assertEquals("[Facebook] AndrzejJaromin", sharedPost3);

    }

    @Test
    void testIndividualSharingStrategy() {
        //Given
        User user1 = new Millenials("Jareczeq");

        //When
        String sharedPost = user1.sharePost();
        System.out.println(sharedPost);
        user1.setSocialPublisher(new FacebookPublisher());
        sharedPost =  user1.sharePost();

        //Then
        assertEquals("[Facebook] Jareczeq", sharedPost);
    }

}
