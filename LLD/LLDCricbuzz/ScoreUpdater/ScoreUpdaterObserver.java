package LowLevelDesign.LLDCricbuzz.ScoreUpdater;

import LowLevelDesign.LLDCricBuzz.Match.Inning.BallDetails;

public interface ScoreUpdaterObserver {

    public void update(BallDetails ballDetails);
}
