package LowLevelDesign.DesignBookMyShow;

import LowLevelDesign.DesignBookMyShow.Enums.SeatCategory;

public class Seat {

    int seatId;
    int row;
    SeatCategory seatCategory;

    public int getSeatId() {
        return seatId;
    }

    public void setSeatId(int seatId) {
        this.seatId = seatId;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public SeatCategory getSeatCategory() {
        return seatCategory;
    }

    public void setSeatCategory(SeatCategory seatCategory) {
        this.seatCategory = seatCategory;
    }
}
