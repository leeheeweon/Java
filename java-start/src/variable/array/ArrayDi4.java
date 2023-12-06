package variable.array;

public class ArrayDi4 {
    public static void main(String[] args) {
        //2*3 2차원 배열을 만든다.
        int[][] arr = new int[4][4];

        int index = 1;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = index++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
            System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
