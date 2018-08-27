public class SecondLarge {
 
	public static void main(String[] args) {
 
		int arr[] = { 10,20,30,40,50,60,70 };
		int large = arr[0];
		int secondLarge = arr[0];
		for (int i = 0; i < arr.length; i++) {
 
			if (arr[i] > large) {
				secondLarge = large;
				large = arr[i];
 
			} else if (arr[i] > secondLarge) {
				secondLarge = arr[i];
 
			}
		}
 
		System.out.println("Second largest number is:" + secondLarge);
}
}