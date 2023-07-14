package LowLevelDesign.LLDCricbuzz.Team.Player;

import java.util.LinkedList;
import java.util.Queue;

public class PlayerBattingController {

    Queue<PlayerDetails> yetToPlay;
    PlayerDetails striker;
    PlayerDetails nonStriker;

    public PlayerBattingController(Queue<PlayerDetails> playing11) {
        this.yetToPlay = new LinkedList<>();
        this.yetToPlay.addAll(playing11);
    }

    public void getNextPlayer() throws Exception {

        if (yetToPlay.isEmpty()) {
            throw new Exception();
        }

        if (striker == null) {
            striker = yetToPlay.poll();
        }

        if (nonStriker == null) {
            nonStriker = yetToPlay.poll();
        }
    }

    public PlayerDetails getStriker() {
        return striker;
    }

    public PlayerDetails getNonStriker() {
        return nonStriker;
    }

    public void setStriker(PlayerDetails playerDetails) {
        striker = playerDetails;
    }

    public void setNonStriker(PlayerDetails playerDetails) {
        nonStriker = playerDetails;
    }

}
