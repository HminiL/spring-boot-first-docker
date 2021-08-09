package com.javis.UserService.util;

import java.util.ArrayList;
import java.util.HashMap;
public class Matrix {

    public int[][] createMatrix(int row, int col){
        int[][] matrix = new int[row][col];
        int k = 1;
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                matrix[i][j] = k;
                k++;
            }
        }
        return matrix;
    }

    public ArrayList<String> getNames(){
        ArrayList<String> names = new ArrayList<>();
        return names;
    }

    public HashMap<String, Integer> findSome(){
        HashMap<String, Integer> some = new HashMap<>();
        return some;
    }
}
