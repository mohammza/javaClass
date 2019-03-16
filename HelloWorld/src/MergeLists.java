import java.util.Scanner;

public class MergeLists {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter list1: ");
		int a = input.nextInt();
		int[] list1 = new int[a];
		list1[0] = a;
		for (int i = 0; i < a; i++) {
			list1[i] = input.nextInt();
		}
		System.out.print("Enter list2: ");
		int b = input.nextInt();
		int[] list2 = new int[b];
		for (int i = 0; i < b; i++) {
			list2[i] = input.nextInt();
		}
		
		//Print List 1:
		System.out.print("list 1: ");
		for (int i = 0; i < a; i++) {
			System.out.print(list1[i]+ " ");
		}
		System.out.println("");
		//Print List 2:
		System.out.print("list 2: ");
		for (int i = 0; i < b; i++) {
			System.out.print(list2[i]+ " ");
		}
		System.out.println("");
		
		int[] mergedList = merge(list1, list2);
		System.out.println("The merged list is: ");
		for (int i = 0; i < mergedList.length; i++) {
			System.out.print(" " +mergedList[i]);
		}
		
		input.close();
	}
		public static int[] merge(int[] list1, int[] list2) {
			int[] answer = new int[list1.length + list2.length];
			int i = list1.length - 1;
			int j = list2.length - 1;
			int k = answer.length;

		   while (k > 0)
			   answer[--k] = (j < 0 || (i >= 0 && list1[i] >= list2[j])) ? list1[i--] : list2[j--];
			   
		   return answer;
		 }
}
