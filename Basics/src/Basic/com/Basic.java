package Basic.com;

import java.util.Scanner;

public class Basic {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size;

        System.out.print("Enter the value of size:");
        size = sc.nextInt();

        int[] arr1 = new int[size];
       
        System.out.println("Enter 1st array element:");

        for (int i = 0; i < size; i++) {
            System.out.print("Enter " + i + " index value of an array:");
            arr1[i] = sc.nextInt();
        }
        int sum=0,count=0;
        System.out.println("target:");
        int target=sc.nextInt();
        for(int i=0;i<size;i++) {
        	sum=0;
        	for (int j=i+1;j<size;j++) {
        		sum=arr1[i]+arr1[j];
        		if(sum==target) {
        			count++;
        			System.out.println("sum of two value is == to target is:"+arr1[i]+" "+arr1[j]);
        			
        		}
        	}
        	if(count==1) {
            	break;
            }
         }
        
        
    }
}