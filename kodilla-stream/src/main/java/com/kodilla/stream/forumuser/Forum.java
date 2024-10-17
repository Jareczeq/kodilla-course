package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public final class Forum {

    public static List<ForumUser> getForumUsers() {

        List<ForumUser> forumUsers = new ArrayList<>();
        forumUsers.add(new ForumUser(1, "jareczeq", 'M', LocalDate.of(1999, Month.AUGUST, 9), 4));
        forumUsers.add(new ForumUser(2, "mateuszryndak", 'M', LocalDate.of(1991, Month.OCTOBER, 25), 13));
        forumUsers.add(new ForumUser(2, "screamking1337", 'M', LocalDate.of(2005, Month.MARCH, 13), 54));

        return new ArrayList<>(forumUsers);

    }

}
