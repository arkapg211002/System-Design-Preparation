package LowLevelDesign.LLDCricbuzz;

import LowLevelDesign.LLDCricBuzz.Match.Inning.InningDetails;
import LowLevelDesign.LLDCricBuzz.Match.Team.Team;

import java.util.Date;

public class Match {

    Team teamA;
    Team teamB;
    Date matchDate;
    String venue;
    Team tossWinner;
    InningDetails[] innings;
    MatchType matchType;

    public Match(Team teamA, Team teamB, Date matchDate, String venue, MatchType matchType) {

        this.teamA = teamA;
        this.teamB = teamB;
        this.matchDate = matchDate;
        this.venue = venue;
        this.matchType = matchType;
        innings = new InningDetails[2];
    }

    public void startMatch() {

        //1. Toss
        tossWinner = toss(teamA, teamB);

        //start The Inning, there are 2 innings in a match
        for(int inning=1; inning<=2; inning++){

            InningDetails inningDetails;
            Team bowlingTeam;
            Team battingTeam;

            //assuming here that tossWinner batFirst
            boolean isChasing = false;
            if(inning == 1){
                battingTeam = tossWinner;
                bowlingTeam = tossWinner.getTeamName().equals(teamA.getTeamName()) ? teamB : teamA;
                inningDetails = new InningDetails(battingTeam, bowlingTeam, matchType);
                inningDetails.start( -1);

            }else {
                bowlingTeam = tossWinner;
                battingTeam = tossWinner.getTeamName().equals(teamA.getTeamName()) ? teamB : teamA;
                inningDetails = new InningDetails(battingTeam, bowlingTeam, matchType);
                inningDetails.start(innings[0].getTotalRuns());
                if(bowlingTeam.getTotalRuns() > battingTeam.getTotalRuns()) {
                    bowlingTeam.isWinner = true;
                }
            }


            innings[inning-1] = inningDetails;

            //print inning details
            System.out.println();
            System.out.println("INNING " + inning + " -- total Run: " + battingTeam.getTotalRuns());
            System.out.println("---Batting ScoreCard : " + battingTeam.teamName + "---");

            battingTeam.printBattingScoreCard();

            System.out.println();
            System.out.println("---Bowling ScoreCard : " + bowlingTeam.teamName + "---");
            bowlingTeam.printBowlingScoreCard();

        }

        System.out.println();
        if(teamA.isWinner){
            System.out.println("---WINNER---" + teamA.teamName);

        }else {
            System.out.println("---WINNER---" + teamB.teamName);

        }

    }

    private Team toss(Team teamA, Team teamB){
        //random function return value between 0 and 1
        if(Math.random() < 0.5) {
            return teamA;
        } else {
            return teamB;
        }
    }
}
