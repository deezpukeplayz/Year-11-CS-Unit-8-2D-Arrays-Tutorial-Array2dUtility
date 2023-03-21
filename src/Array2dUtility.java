
public class Array2dUtility {

    // Declare all methods as static.

    // 1. print
    // Implement a method called print that prints out the values of a 2D array of integers row by row.

    public static void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int k = 0; k < arr[i].length; k++) {
                System.out.print(arr[i][k]);
            }
            System.out.println();
        }


    }

    // 2. sum
    // Implement a method called sum that returns the sum of a 2D array of integers
    public static int sum(int[][] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int k = 0; k < arr[i].length; k++) {
                total += arr[i][k];
            }
            System.out.println();

        }
        return total;

    }

    // 3. average
    // Implement a method called average that returns the average value of a 2D array of integers.
    // You may assume that the 2D array is a square. That is, it has the same number of rows and columns.
    // Reminder: call your sum method within the average method.

    public static double average(int[][] arr) {
        int total = sum(arr);
        int count = 0;
        double average = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int k = 0; k < arr[i].length; k++) {
                count++;
                average = (double) total / count;
            }
        }
        return average;
    }

    // 4. minimum
    // Implement a method called minimum that returns the minimum value of a 2D array of integers.
    public static int minimum(int[][] arr) {
        int minimum = arr[0][0];
        for (int row[] : arr) {
            for (int col : row) {
                if (col < minimum) {
                    minimum = col;
                }
            }
        }
        return minimum;
    }

    // 5. maximum
    // Implement a method called maximum that returns the maximum value of a 2D array of integers.
    public static int maximum(int[][] arr) {
        int maximum = arr[0][0];
        for (int row[] : arr) {
            for (int col : row) {
                if (col > maximum) {
                    maximum = col;
                }
            }
        }
        return maximum;
    }

    // 6. evenCountStandard
    // Implement a method called evenCountStandard that returns the number of even numbers in a 2D array of integers.
    // Use a standard for loop to implement this method.
    public static int evenCountStandard(int[][] arr) {
        int evenCount = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int k = 0; k < arr[i].length; k++) {
                if (arr[i][k] % 2 == 0) {
                    evenCount++;
                }
            }
        }
        return evenCount;
    }

    // 7. evenCountEnhanced
    // Implement a method called evenCountEnhanced that returns the number of even numbers in a 2D array of integers.
    // Use an enhanced for loop to implement this method.
    public static int evenCountEnhanced(int[][] arr) {
        int evenCount = 0;
        for (int row[] : arr) {
            for (int col : row) {
                if (col % 2 == 0) {
                    evenCount++;
                }
            }
        }
        return evenCount;
    }

    // 8. allPositive
    // Implement a method called allPositive that returns true if all the values in a 2D array of integers are positive.
    public static boolean allPositive(int[][] arr){
        boolean positive = true;
        for(int row[] : arr){
            for(int col : row){
                if(col < 0){
                    positive = false;
                    break;
                }
            }
        }
        return positive;
    }

    // 9. rowSums
    // Implement a method called rowSums that returns a one dimensional array that contains the sum of each row at each index.
    public static int[] rowSums(int[][] arr){
        int[] sums = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            for(int k = 0; k < arr[i].length; k++){
                sums[i] += arr[i][k];
            }
        }
        return sums;
    }

    // 10. colSums
    // Implement a method called colSums that returns a one dimensional array that contains the sum of each col at each index.
    public static int[] colSums(int[][] arr){
        int[] sums = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            for(int k = 0; k < arr[i].length; k++){
                sums[k] += arr[i][k];
            }
        }
        return sums;
    }

}










