import java.util.*;

public class PatternRecognition {

	public static void main(String[] args) {
		int[][] arr = {
				{0,1,0,3,1,6,1},
				{0,1,6,8,6,1,1},
				{4,6,2,4,1,2,5},
				{6,5,3,1,1,8,1},
				{1,3,6,1,9,0,7},
				{3,3,5,9,4,0,7}
		};
		
//		int row, column;
//		
//		Scanner in = new Scanner(System.in);
//
//		System.out.print("Enter rows and columns for table: ");
//		row = in.nextInt();
//		column = in.nextInt();
//		
//		arr = new int[row][column];
//		for(int row = 0; row < arr.length; row++) {
//			for(int column = 0; column < arr[row].length; column++) {
//				arr[row][column] = in.nextInt();
//			}
//		}
		
		for(int row = 0; row < arr.length; row++) {
			for(int column = 0; column < arr[row].length; column++) {
				if (column == arr[row].length - 1)
						System.out.println(arr[row][column]);
				else
					System.out.print(arr[row][column]+" ");
			}
		}
		
		System.out.println("Pattern Recognition: " + isConsecutiveFour(arr));
		
	}
	
	public static boolean isConsecutiveFour(int[][] values) {
		//Checking horizontal consecutive
		for(int i = 0; i < values.length; i++) {
			int[] temp;
			temp = values[i];
			int counter = 0;
			int value = temp[0];
			for(int j = 0; j < temp.length; j++) {
				if(value == temp[j]) {
					counter++;
					if (counter == 4) {
						System.out.println("Consecutive values of "+value+" found!");
						return true;
					}
				}
				else {
					value = temp[j];
					counter = 1;
				}
				
			}
		}
	
		//Checking vertical consecutives
		for(int i = 0; i < values[0].length; i++) {
			int value = values[0][i];
			int counter = 0;
			for(int j = 0; j < values.length; j++) {
				if (values[j][i] == value) {
					counter++;
					if (counter == 4) {
						System.out.println("Consecutive values of "+value+" found!");
						return true;
					}
				}
				else {
					value = values[j][i];
					counter = 1;
				}
			}
		}
		
		//Check left-side - bottom corner
        for (int i = values.length - 1; i > 0; i--) {
        	int y = i;
            int x = 0;
            int counter = 0;
            int value = values[y][x];

            while(y >= 0) {
                if (values[y][x] == value) {
                    counter++;
                    if (counter == 4) {
						System.out.println("Consecutive values of "+value+" found!");
						return true;
					}
                } 
                else {
                    counter = 1;
                    value = values[y][x];
                }
                x++;
                y--;
            }
		
        }
        //check leftside: upleft
        for (int j = values[0].length - 1; j > 0; j--) {

            int x = j;
            int y = values.length - 1;
            int value = values[y][x];
            int counter = 0;

            while (x >= 0 && y >= 0) {

                if (values[y][x] == value) {
                    counter++;
                    if (counter == 4) {
						System.out.println("Consecutive values of "+value+" found!");
						return true;
					}
                } else {
                    counter = 1;
                    value = values[y][x];
                }

                x--;
                y--;
            }
        }
        //Checking bottom right: upright
        for (int j = 0; j < values[0].length; j++) {
            int y = values.length - 1;
            int x = j;
            int counter = 0;
            int value = values[y][x];

            while (x < values[0].length && y >= 0) {
                if (values[y][x] == value) {
                    counter++;
                    if (counter == 4) {
						System.out.println("Consecutive values of "+value+" found!");
						return true;
					}
                } 
            else {
                    counter = 1;
                    value = values[y][x];
                }
                x++;
                y--;
            }

        }
        //Checking bottom right: upleft
        for (int row = 1 ; row < values.length; row++) {
            int x = values[0].length - 1;
            int y = row;
            int counter = 0;
            int value = values[y][x];

            while (y >= 0) {
                if (values[y][x] == value) {
                    counter++;
                    if (counter == 4) {
						System.out.println("Consecutive values of "+value+" found!");
						return true;
					}
                } else {
                    counter = 1;
                    value = values[y][x];
                }
                x--;
                y--;
            }

        }

        
        return false;
	}
}
