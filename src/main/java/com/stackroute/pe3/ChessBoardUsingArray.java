
package com.stackroute.pe3;

public class ChessBoardUsingArray {

    public String[][] display(int rows, int cols) {
        {
            String output[][] = new String[rows][cols];
            for (int j = 0; j < rows; j++) {
                for (int k = 0; k < cols; k++) {
                    if (((k + j) % 2) == 0) {
                        output[j][k] = "WW";
                    } else {
                        output[j][k] = "BB";
                    }

                }


            }

            return output;
        }
    }
}