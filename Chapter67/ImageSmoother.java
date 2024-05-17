// Description: This program smooths an image by computing the average of each pixel and its surrounding pixels, excluding edge pixels.
// Name: Viovicente, Kenneth Reniel C.

import java.io.*;

public class ImageSmoother {
  public static void main ( String[] args )
  {
    int[][] image  = {{0,0,0,0,0,0,0,0,0,0,0,0},
                      {0,0,0,0,0,0,0,0,0,0,0,0},
                      {0,0,5,5,5,5,5,5,5,5,0,0},
                      {0,0,5,5,5,5,5,5,5,5,0,0},
                      {0,0,5,5,5,5,5,5,5,5,0,0},
                      {0,0,5,5,5,5,5,5,5,5,0,0},
                      {0,0,5,5,5,5,5,5,5,5,0,0},
                      {0,0,5,5,5,5,5,5,5,5,0,0},
                      {0,0,5,5,5,5,5,5,5,5,0,0},
                      {0,0,5,5,5,5,5,5,5,5,0,0},
                      {0,0,0,0,0,0,0,0,0,0,0,0},
                      {0,0,0,0,0,0,0,0,0,0,0,0}};

    // Assume a rectangular image
    int[][] smooth = new int[image.length][image[0].length];
    
    // Compute the smoothed value for non-edge locations in the image.
    for (int row = 1; row < image.length - 1; row++) {
      for (int col = 1; col < image[row].length - 1; col++) {
        int sum = 0;
        for (int i = -1; i <= 1; i++) {
          for (int j = -1; j <= 1; j++) {
            sum += image[row + i][col + j];
          }
        }
        smooth[row][col] = sum / 9; // Divide sum by 9 to get the average
      }
    }
      
    // Write out the input
    System.out.println("Input:");
    for (int row = 0; row < image.length; row++) {
      for (int col = 0; col < image[row].length; col++) {
        System.out.print(image[row][col] + " ");
      }
      System.out.println();
    }
    
    // Write out the result
    System.out.println("\nOutput:");
    for (int row = 0; row < smooth.length; row++) {
      for (int col = 0; col < smooth[row].length; col++) {
        System.out.print(smooth[row][col] + " ");
      }
      System.out.println();
    }
  }
}