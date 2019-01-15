package com.company;

public class SkyView {

    private static double[][] view;
  public SkyView(int numRows, int numCols, double[] scanned){
 view = new double[numRows][numCols];
  }
  public static double getAverage(int startRow, int endRow, int startCol, int endCol){
      double total = 0;
      for (int i = startRow; i <= endRow; i++)
      {
          for (int c = startCol; c <= endCol; c++)
          {
              total = total + view[i][c];
          }
      }
      return total / ((endRow - startRow + 1) * (endCol - startCol + 1));
  }
  }


