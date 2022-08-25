package Array;

public class ArrayPractice {

	public static void main(String[] args) {
		int arr1[];					//Array Decleration
		arr1 = new int[10];			//initilization of array
		arr1[0]=100;				//Values insertion
		arr1[9]=200;
		arr1[2]=300;
		arr1[3]=100;
		arr1[4]=200;
		arr1[7]=500;
		arr1[8]=300;
		
		for(int i=0;i<arr1.length;i++) {
			for(int j=i+1;j<arr1.length;j++) {
				if(arr1[i]==arr1[j]) {
					System.out.println(arr1[j]);
				}
			}
		}
	}

}
