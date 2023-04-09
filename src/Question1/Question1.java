package Question1;

public class Question1 {

    public static int TimeToServeAllPassengers(int rowsInPlane, int[] i) {
        int timeToServePasseger = 0;
        int potServeAtTime = 7;

        for (int row = 1; row <= rowsInPlane; row++) {
            if (checkRow(i, row)) {
                if (potServeAtTime == 0) {
                    potServeAtTime = 7;
                    timeToServePasseger += 30;
                }

                timeToServePasseger += 3;
                potServeAtTime--;
            }

            timeToServePasseger++;
        }

        // After serving all passengers, return to the front of the plane, add 1 second for each row
        timeToServePasseger += rowsInPlane;

        return timeToServePasseger;
    }


    //check if this is the row where passenger want to order coffee
    public static boolean checkRow(int[] i, int row) {
        for (int r : i) {
            if (r == row) {
                return true;
            }
        }
        return false;
    }


}

