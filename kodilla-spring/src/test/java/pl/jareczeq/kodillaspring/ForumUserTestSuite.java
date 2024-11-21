package pl.jareczeq.kodillaspring;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import pl.jareczeq.kodillaspring.forum.ForumUser;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ForumUserTestSuite {

    @Test
    void testGetUsername() {
        //Given
        ForumUser forumUser = new ForumUser();
        //When
        String username = forumUser.getUsername();

        //Then
        assertEquals("John Smith", username);
    }

}
