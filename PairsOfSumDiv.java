package Surprise;

public class PairsOfSumDiv {

	public static void main(String[] args) {
		int [] arr= {1,2,3,4,5,6};
		int k=5;
		int sum=0;
		int n=arr.length;
		int count=0;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				sum=arr[i]+arr[j];
				if(sum%k==0) {
					System.out.print("["+arr[i]+" "+arr[j]+"]");
					count++;
				}
			}
		}
		System.out.println("\nThere are "+count+" pairs");
	}

}
