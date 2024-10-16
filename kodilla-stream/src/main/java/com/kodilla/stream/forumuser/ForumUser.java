package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {

    private final int id;
    private final String username;
    private char gender;
    private LocalDate dateOfBirth;
    private int countOfPublishedPosts = 0;

    public ForumUser(int id, String username, char gender, LocalDate dateOfBirth, int countOfPublishedPosts) {
        this.id = id;
        this.username = username;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.countOfPublishedPosts = countOfPublishedPosts;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public char getGender() {
        return gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getCountOfPublishedPosts() {
        return countOfPublishedPosts;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ForumUser that = (ForumUser) o;
        return id == that.id;
    }

    @Override
    public String toString() {
        return "ForumUser { '" + id + "', '" + username + "', '" + gender + "', '" + dateOfBirth + "', '" + countOfPublishedPosts + "' }";
    }

}