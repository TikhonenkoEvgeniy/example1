package generics.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team <T extends Participant> {
    private String name;
    private List<T> participants = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public void addNewParticipant(T participant) {
        this.participants.add(participant);
        System.out.println("Participant " + participant.getName() + " was added to team " + this.name);
    }

    public void play(Team <T> team) {
        String winnerTeam;
        Random random = new Random();
        int i = random.nextInt(2);
        if (i == 0) {
            winnerTeam = this.name;
        } else {
            winnerTeam = team.name;
        }
        System.out.println("The team " + winnerTeam + " won!");
    }
}
