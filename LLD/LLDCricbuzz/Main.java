package LowLevelDesign.LLDCricbuzz;

import LowLevelDesign.LLDCricBuzz.Match.Team.Player.Person;
import LowLevelDesign.LLDCricBuzz.Match.Team.Player.PlayerDetails;
import LowLevelDesign.LLDCricBuzz.Match.Team.Player.PlayerType;
import LowLevelDesign.LLDCricBuzz.Match.Team.Team;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {

    public static void main(String args[]) {

        Main ob = new Main();

        Team teamA = ob.addTeam("India");
        Team teamB = ob.addTeam("SriLanka");

        MatchType matchType = new T20MatchType();
        Match match = new Match(teamA, teamB, null, "SMS STADIUM", matchType);
        match.startMatch();

    }


    private Team addTeam(String name) {

        Queue<PlayerDetails> playerDetails = new LinkedList<>();

        PlayerDetails p1 = addPlayer(name+"1", PlayerType.ALLROUNDER);
        PlayerDetails p2 = addPlayer(name+"2", PlayerType.ALLROUNDER);
        PlayerDetails p3 = addPlayer(name+"3", PlayerType.ALLROUNDER);
        PlayerDetails p4 = addPlayer(name+"4", PlayerType.ALLROUNDER);
        PlayerDetails p5 = addPlayer(name+"5", PlayerType.ALLROUNDER);
        PlayerDetails p6 = addPlayer(name+"6", PlayerType.ALLROUNDER);
        PlayerDetails p7 = addPlayer(name+"7", PlayerType.ALLROUNDER);
        PlayerDetails p8 = addPlayer(name+"8", PlayerType.ALLROUNDER);
        PlayerDetails p9 = addPlayer(name+"9", PlayerType.ALLROUNDER);
        PlayerDetails p10 = addPlayer(name+"10", PlayerType.ALLROUNDER);
        PlayerDetails p11 = addPlayer(name+"11", PlayerType.ALLROUNDER);

        playerDetails.add(p1);
        playerDetails.add(p2);
        playerDetails.add(p3);
        playerDetails.add(p4);
        playerDetails.add(p5);
        playerDetails.add(p6);
        playerDetails.add(p7);
        playerDetails.add(p8);
        playerDetails.add(p9);
        playerDetails.add(p10);
        playerDetails.add(p11);

        List<PlayerDetails> bowlers = new ArrayList<>();
        bowlers.add(p8);
        bowlers.add(p9);
        bowlers.add(p10);
        bowlers.add(p11);

        Team team = new Team(name, playerDetails, new ArrayList<>(), bowlers);
        return team;

    }

    private PlayerDetails addPlayer(String name, PlayerType playerType) {

        Person person = new Person();
        person.name = name;
        PlayerDetails playerDetails = new PlayerDetails(person, playerType);
        return playerDetails;
    }
}
