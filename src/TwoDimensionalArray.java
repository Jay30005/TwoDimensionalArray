
    // Sep 29 (Edited Sep 29)
    //Suppose the weekly hours for all employees are stored in a two-dimensional array. Each row records an employee’s seven-day work hours with seven columns. Write a program that displays employees and their total hours in inc
        /*
         * To change this license header, choose License Headers in Project Properties.
         * To change this template file, choose Tools | Templates
         * and open the template in the editor.


/**
 *
 *
 *
 * Suppose the weekly hours for all employees are stored in a two-dimensional array.
 * Each row records an employee’s seven-day work hours with seven columns. Write
 * a program that displays employees and their total hours in increasing order of
 *  * the total hours.
 *
 */
    import java.util.Arrays;
    import java.util.Scanner;

    public class TwoDimensionalArray {

        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            double [][]workHours;
            double [] totalHours;
            int numEmployee;

            System.out.println("How many employee are there? ");
            numEmployee = input.nextInt();

            workHours = new double[numEmployee][7];
            totalHours = new double[numEmployee];

            for (int row = 0 ; row < workHours.length; row++)
            {
                for(int day=0; day < workHours[row].length; day++){
                    System.out.println("Enter the work hour for employee "+ row + "on day " + day);
                    workHours[row][day]= input.nextDouble();
                    totalHours[row] += workHours[row][day];
                }
            }

            Arrays.sort(totalHours);

            for (double hours: totalHours)
            {
                System.out.print(hours + "  ");
            }
        }

    }
