package ex_15_array;

public class Lab156_2D_array {
    public static void main(String[] args){
        int[][] array_2d = {{1,2,3}, {4,5,6}, {7,8,9}};
        //Row -3, column - 3
        //1 2 3
        //4 5 6
        //7 8 9
        int[][] array2d_1 = {{1,2}, {3,4}};
        //Row - 2, Column - 2
        // 1 2
        // 3 4
        int[][] array_2d_2 = {{1}, {2}, {3}};
        //Row -3, Column - 1
        // 1
        // 2
        // 3
        for(int i=0; i< array_2d.length;i++){
            for(int j=0; j< array_2d[i].length;j++){
                System.out.print(array_2d[i][j] +"|");
            }
            System.out.println();
        }
    }
}
