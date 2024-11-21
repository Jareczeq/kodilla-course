package pl.jareczeq.kodillaspring.forum;

import org.junit.jupiter.api.Test;

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
