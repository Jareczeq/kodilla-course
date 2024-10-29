package com.kodilla.testing.forum.statistics;

import java.util.List;

public class ForumStatistics {

    private final Statistics statistics;

    private int usersCount;
    private int postsCount;
    private int commentsCount;

    public ForumStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    public int usersCount() {
        return usersCount;
    }

    public int postsCount() {
        return postsCount;
    }

    public int commentsCount() {
        return commentsCount;
    }

    public double averagePostsCountsPerUser() {
        return ((double) postsCount / usersCount);
    }

    public double averageCommentsCountsPerUser() {
        return ((double) commentsCount / usersCount);
    }


    public double averageCommentsCountsPerPost() {
        return ((double) commentsCount / postsCount);
    }

    public void calculateAdvStatistics(Statistics statistics) {
        usersCount = statistics.usersNames().size();
        postsCount = statistics.postsCount();
        commentsCount = statistics.commentsCount();
    }

    public Statistics showStatistics() {
        return statistics;
    }
}
