package calorietracker;


import java.util.*;
public class CalorieTracker {

    static final int DAYS_OF_THE_WEEK = 3;//7;
    static final int NUMBER_OF_MEALS = 3;//4; 
    
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        double[][] table;
        table = new double[DAYS_OF_THE_WEEK][NUMBER_OF_MEALS];
        
         for(int row = 0; row < DAYS_OF_THE_WEEK; row++){
            for(int col = 0; col < NUMBER_OF_MEALS; col++){
            System.out.println("Enter the calories: ");
            table[row][col] = scan.nextDouble();
            
            }
        }
        System.out.println("Day\tBreakfast\tLunch\tDinner\tSnacks");
         for(int row = 0; row < DAYS_OF_THE_WEEK; row++){
            
             double caloriesPerDay = 0;
             double averageOfCaloriesPerDay = 0;
             
            String dates;
            switch (row){
                case 0: dates = "Sunday";
                    break;
                case 1: dates = "Monday";
                    break;
                case 2: dates = "Tuesday";
                    break;
                case 3: dates = "Wednesday";
                    break;
                case 4: dates = "Thursday";
                    break;
                case 5: dates = "Friday";
                    break;
                default: dates = "Saturday";
                    break;
                    
            }
            System.out.print(dates + "\t");
             for(int col = 0; col < NUMBER_OF_MEALS; col++){
            
            
            System.out.print(table[row][col]+"\t");
            
            //Store the Sum of the TOTAL of the calories per day on var "caloriesPerDay"
            caloriesPerDay += table[row][col];
            //Store the Average daily caloric consumption per day on var "averageOfCaloriesPerDay"
            averageOfCaloriesPerDay = caloriesPerDay / table.length;
            }
            
            System.out.println(caloriesPerDay +"\t"+ averageOfCaloriesPerDay);
            
         }
         System.out.println("Max: "+ getMaxValue(table)+"\t"+"Min: "+ getMinValue(table));
         
    }
      public static double getMaxValue(double[][] numbers) {
        double maxValue = numbers[0][0];
        
        for (int j = 0; j < numbers.length; j++) {
            for (int i = 0; i < numbers[j].length; i++) {
                if (numbers[j][i] > maxValue) {
                    maxValue = numbers[j][i];
                }
            }
        }
        return maxValue;
    }

    public static double getMinValue(double[][] numbers) {
        double minValue = numbers[0][0];
        
        for (int j = 0; j < numbers.length; j++) {
            for (int i = 0; i < numbers[j].length; i++) {
                if (numbers[j][i] < minValue ) {
                    minValue = numbers[j][i];
                }
            }
        }
        return minValue ;
    }
}


