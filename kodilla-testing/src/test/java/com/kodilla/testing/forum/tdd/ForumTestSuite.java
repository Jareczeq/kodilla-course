package com.kodilla.testing.forum.tdd;

import com.kodilla.testing.forum.ForumComment;
import com.kodilla.testing.forum.ForumPost;
import com.kodilla.testing.forum.ForumUser;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Nested;

@DisplayName("TDD: Forum Test Suite \\uD83D\\uDE31")
public class ForumTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Nested
    @DisplayName("Tests for posts")
    @Test
    void testAddPost() {
        //Given
        ForumUser forumUser = new ForumUser("jareczeq", "Jakub Śliwczyński");

        //When
        forumUser.addPost("jareczeq", "Hej wszystkim! To mój pierwszy post!");

        //Then
        Assertions.assertEquals(1, forumUser.getPostsQuantity());
    }

    @Test
    void testAddComment() {
        //Given
        ForumUser forumUser = new ForumUser("jareczeq", "Jakub Śliwczyński");
        ForumPost thePost = new ForumPost("Hej wszystkim! To mój pierwszy post!", "jareczeq");

        //When
        forumUser.addComment(thePost, "jarezeq", "Dziękuję wam za wszystkie miłe słowa!");

        //Then
        Assertions.assertEquals(1, forumUser.getCommentsQuantity());
    }

    @Test
    void testGetPost() {
        //Given
        ForumUser forumUser = new ForumUser("jareczeq", "Jakub Śliwczyński");
        ForumPost thePost = new ForumPost("Hej wszystkim! To mój pierwszy post!", "jareczeq");
        forumUser.addPost(thePost.getAuthor(), thePost.getPostBody());

        //When
        ForumPost retrievedPost;
        retrievedPost = forumUser.getPost(0);

        //Then
        Assertions.assertEquals(thePost, retrievedPost);
    }

    @Test
    void testGetComment() {
        //Given
        ForumUser forumUser = new ForumUser("jareczeq", "Jakub Śliwczyński");
        ForumPost thePost = new ForumPost("Hej wszystkim! To mój pierwszy post!", "jareczeq");
        ForumComment theComment = new ForumComment(thePost, "Hej wszystkim! To mój pierwszy post!", "jareczeq");

        forumUser.addComment(thePost, theComment.getAuthor(), theComment.getCommentBody());

        //When
        ForumComment retrievedComment = forumUser.getComment(0);

        //Then
        Assertions.assertEquals(theComment, retrievedComment);
    }

    @Test
    void testRemovePostNotExisting() {
        //Given
        ForumUser forumUser = new ForumUser("jareczeq", "Jakub Śliwczyński");
        ForumPost thePost = new ForumPost("Hej wszystkim! To mój pierwszy post!", "jareczeq");

        //When
        boolean result = forumUser.removePost(thePost);

        //Then
        Assertions.assertFalse(result);
    }

    @Test
    void testRemoveCommentNotExisting() {
        //Given
        ForumUser forumUser = new ForumUser("jareczeq", "Jakub Śliwczyński");
        ForumPost thePost = new ForumPost("Hej wszystkim! To mój pierwszy post!", "jareczeq");
        ForumComment theComment = new ForumComment(thePost, "Hej wszystkim! To mój pierwszy post!", "jareczeq");

        //When
        boolean result = forumUser.removeComment(theComment);

        //Then
        Assertions.assertFalse(result);
    }

    @Test
    void testRemovePost() {
        //Given
        ForumUser forumUser = new ForumUser("jareczeq", "Jakub Śliwczyński");
        ForumPost thePost = new ForumPost("Hej wszystkim! To mój pierwszy post!", "jareczeq");
        forumUser.addPost(thePost.getAuthor(), thePost.getPostBody());

        //When
        boolean result = forumUser.removePost(thePost);

        //Then
        Assertions.assertTrue(result);
        Assertions.assertEquals(0, forumUser.getPostsQuantity());
    }

    @Test
    void testRemoveComment() {
        //Given
        ForumUser forumUser = new ForumUser("jareczeq", "Jakub Śliwczyński");
        ForumPost thePost = new ForumPost("Hej wszystkim! To mój pierwszy post!", "jareczeq");
        ForumComment theComment = new ForumComment(thePost, "Hej wszystkim! To mój pierwszy post!", "jareczeq");
        forumUser.addComment(thePost, theComment.getAuthor(), theComment.getCommentBody());

        //When
        boolean result = forumUser.removeComment(theComment);

        //Then
        Assertions.assertTrue(result);
        Assertions.assertEquals(0, forumUser.getCommentsQuantity());
    }

}
