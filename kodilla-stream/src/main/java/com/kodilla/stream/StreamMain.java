package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.lambda.Executor;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.person.Person;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Map<Integer, ForumUser> par = Forum.getForumUsers().stream()
                .filter(forumUser -> forumUser.getGender() == 'M')
                .filter(forumUser -> ChronoUnit.YEARS.between(forumUser.getDateOfBirth(), LocalDate.now()) >= 20)
                .filter(forumUser -> forumUser.getCountOfPublishedPosts() >= 1)
                .collect(Collectors.toMap(ForumUser::getId, forumUser -> forumUser));

        par.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}