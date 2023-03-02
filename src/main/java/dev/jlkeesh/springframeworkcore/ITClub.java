package dev.jlkeesh.springframeworkcore;

import java.util.List;

public class ITClub {
    private final List<String> members = List.of("Shengo", "Javohir", "Uktam", "Elshod");

    public boolean isMember(String username) {
        return members.contains(username);
    }
}
