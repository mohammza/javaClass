import java.util.*;
public class NoDuplicates {

	   public static void main(String args[]){
	       
	       Scanner in = new Scanner(System.in);
	       System.out.print("Enter 10 numbers: ");
	       int arr[] = new int[10];
	       for(int i = 0; i < 10; i++){
	           arr[i] = in.nextInt();
	       }
	       int x[] = eliminateDuplicates(arr);
	       System.out.print("The distinct numbers are: ");
	       for(int i = 0; i < x.length; i++){
	           System.out.print(x[i] + " ");
	           }
	       
	       in.close();
	       }
	   
	   public static int[] eliminateDuplicates(int[] list){
	       int count = list.length, j = 0;
	       boolean flag[] = new boolean[list.length];
	       for(int i = 0; i < list.length; i++) flag[i] = false;
	       for(int i = 0; i < list.length; i++){
	           for(j = 0; j < i; j++){
	               if(list[i] == list[j]){
	                   flag[i] = true;
	                   count--;
	                   break;
	               }
	           }
	       }
	       j = 0;
	       int arr[] = new int[count];
	       for(int i = 0; i < list.length; i++){
	           if(flag[i] == false){
	               arr[j++] = list[i];
	           }
	       }
	       return arr;
	   }

}
