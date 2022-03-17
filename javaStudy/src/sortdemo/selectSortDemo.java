package sortdemo;

public class selectSortDemo {
	public static void main(String[] arg) {
		int[] arr = {9,6,5,4,32,1,2,3,7,8,-8,-6};
		selectSort(arr);
		printArray(arr);
	}
	public static void selectSort(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = i+1; j< arr.length; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	
	public static void printArray(int[] arr) {
		System.out.print("[");
		for(int i = 0; i < arr.length ; i++) {
			if(i == arr.length-1) {
				System.out.println(arr[i]+"]");
			}else {
				System.out.print(arr[i]+",");
			}
		}
	}
}
