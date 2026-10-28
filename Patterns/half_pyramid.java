import java.io.*;
import java.util.*;
class half_pyramid{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter total no of rows");
		int total_rows=sc.nextInt();
		System.out.println("Enter total no of cols");
		int total_cols=sc.nextInt();
		int temp=total_cols;
		for(int i=total_rows;i>0;i--){
			for(int j=1;j<=total_cols;j++){
				if(j>=temp){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}	
			}
			temp--;
			System.out.println();
		}
	}
}