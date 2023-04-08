package Question1;

public class Question1Program {
    public static void main(String[] args) {
        Question1 question1 = new Question1();

        int rowsInPlane = 30;
        int[] i = {3, 4, 5, 7, 10, 13, 18, 20, 24, 25}; // Rows where passengers want to order coffee
        int time = question1.TimeToServeAllPassengers(rowsInPlane, i);
        System.out.println();
        System.out.println("<------------------------------------------------------------------------------------>");
        System.out.println("Total time taken to serve all the passenger in plane is ::: " + time + " seconds");
        System.out.println("<------------------------------------------------------------------------------------>");

    }
}
