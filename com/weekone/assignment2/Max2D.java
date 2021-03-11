package com.weekone.assignment2;

/**
 * get the maximum nuber and its position ine a 2d array
 */
public class Max2D {
    
    /**
     * creates and populates a 2d array
     * @param row
     * @param column
     * @return int[row][column]
     */
    public int[][] createPopulateArr(int row, int column)
    {
        int [][] arr = new int[row][column];
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[i].length; j++){
                // opulates 2d array with random values
                int randNum = (int) (Math.random() * 100 + 1);
                arr[i][j] = randNum;
            }
        return arr;
    }

    /**
     * gets index of maxiumum value
     * @param arr
     * @return {row,column}
     */
    public int [] getMaxIndex(int [][] arr){
        int row = 0; 
        int column = 0;

        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[i].length; j++){
                if (arr[row][column] < arr[i][j]){
                    row = i;
                    column = j;
                }
            }
        return new int [] {row, column};
    }

    /**
     * prints content of 2d array
     * @param arr
     */
    public void printarr(int [][] arr){
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++)
                System.out.print("["+arr[i][j]+"]"); 
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Max2D a = new Max2D();
        
        int [][] arr = a.createPopulateArr(5,5);
        a.printarr(arr);

        int [] rowColumn = a.getMaxIndex(arr);
        int r = rowColumn[0];
        int c = rowColumn[1];

        System.out.println("Max value : " +arr[r][c]);
        System.out.println("index : "+r+","+c);
    }
}
