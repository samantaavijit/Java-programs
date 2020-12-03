package com.avijitsamanta.competitiveProgramming.LeedCode;

/*
Input: points = [[1,1],[3,4],[-1,0]]
Output: 7
Explanation: One optimal path is [1,1] -> [2,2] -> [3,3] -> [3,4] -> [2,3] -> [1,2] -> [0,1] -> [-1,0]   
Time from [1,1] to [3,4] = 3 seconds 
Time from [3,4] to [-1,0] = 4 seconds
Total time = 7 seconds
*/
public class MinimumTimeVisitingAllPoints {

    private int minTimeToVisitAllPoints(int[][] points) {
        int cost = 0;
        for (int i = 1; i < points.length; i++) {
            if(points[i][0]==points[i-1][0]){// x same
                if(points[i][1]>points[i-1][1]){
                    
                }

            }
        }

        return cost;
    }

    public static void main(String[] args) {

    }
}