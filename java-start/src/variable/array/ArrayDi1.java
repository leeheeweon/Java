package variable.array;

public class ArrayDi1 {
    public static void main(String[] args) {
        //2*3 2차원 배열을 만든다.
        int[][] arr = new int[2][3];
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 6;

        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[0][0] = " + arr[i][0]);
            System.out.println("arr[0][1] = " + arr[i][1]);
            System.out.println("arr[0][2] = " + arr[i][2]);
        }
    }
}
