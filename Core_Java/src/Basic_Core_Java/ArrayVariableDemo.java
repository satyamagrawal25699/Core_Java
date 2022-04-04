package Basic_Core_Java;

public class ArrayVariableDemo {
	public static void main(String[] args) {
		int arr[]= {10,20,30,40};
		ArrayVariableDemo obj=new ArrayVariableDemo();
		System.out.println("Before Passing "+arr[2]);
		
		obj.pbarray(arr);
		
		System.out.println("After Passing "+arr[2]);
	  //1st Solution:Anonymous Array:
		obj.pbarray(new int[] {102,103,2,3,4});
		
		//2nd solution - create a copy and send
		int copyarr[]=new int[4];
		System.arraycopy(arr, 0, copyarr, 0, 4);
		
		System.out.println("copy arr...........:"+copyarr[1]);
		System.out.println("Before Passing...:"+arr[1]);
		obj.pbarray(copyarr);
		System.out.println("After Passing...:"+arr[1]);	
		
		System.out.println("copy arr............:"+copyarr[1]);
		
		
	}
	
	void pbarray(int a[]) {
		a[1]=304030;
	}
}
