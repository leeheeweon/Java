package variable.array;

public class Array1Ref1 {
    public static void main(String[] args) {
        int[] students = new int[5];
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        for (int i = 0; i < students.length; i++) {
            System.out.println("students" + i + " = " + students[i]);
        }
    }
}