package variable.array;

public class ArrayDi3 {
    public static void main(String[] args) {
        //2*3 2차원 배열을 만든다.
        int[][] arr = {
                {1,2,3},
                {4,5,6}
        };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
            System.out.println("arr = " + arr[i][j]);
            }
        }
    }
}
