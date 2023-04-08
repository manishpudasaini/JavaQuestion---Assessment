package Question1;

public class Question1 {

    public int TimeToServeAllPassengers(int rowsInPlane, int[] i) {
        int timeToServePasseger = 0;
        int potServeAtTime = 7;
        int currentPositionOfFlighrAttendant = 1;
        for (int row = 0; row < i.length; row++) {
            int nextRow = i[row];
            if (nextRow > currentPositionOfFlighrAttendant) {
                timeToServePasseger += (nextRow - currentPositionOfFlighrAttendant) * 1;
                currentPositionOfFlighrAttendant = nextRow;
            }

            if (potServeAtTime == 0) {
                timeToServePasseger += 30;
                potServeAtTime = 7;
            }


            timeToServePasseger += 3;
            potServeAtTime--;
            currentPositionOfFlighrAttendant++;
        }
        timeToServePasseger += (rowsInPlane - currentPositionOfFlighrAttendant + 1) * 1; // Moving to the front of the plane - takes 1sec for 1 row
        return timeToServePasseger;
    }

}

