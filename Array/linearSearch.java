import java.util.*;
class linearSearch{
	public static int largest(int []array){
		int max=Integer.MIN_VALUE;
		for(int i=0;i<array.length;i++){
					if(max<=array[i]){
						max=array[i];
					}
				}
				return max;
	}
	public static int Search(int []array,int element){
		for(int i=0;i<array.length;i++){
			if(array[i] == element){
				return i;
			}
		}
		return -1;
	}
	public static void show(int[] array){
		System.out.println("Array Elements Are :");
				for(int i=0;i<array.length;i++){
					System.out.println(array[i]);
				}
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		int[] array=new int[size];
		System.out.println("Enter array Elements");
		for(int i=0;i<size;i++){
			array[i]=sc.nextInt();
		}
		int choice;
		do{
			System.out.println("1.Linear Search");
			System.out.println("2.Show array");
			System.out.println("3.Stop");
			System.out.println("4.Find largest Element ");
			choice=sc.nextInt();
			switch(choice){
				
				case 1:
					System.out.println("Enter Element to bo search");
					int Element = sc.nextInt();
					int index=Search(array,Element);
					if(index== -1){
						System.out.println("the element is not found in array");
					}
					else{
						System.out.println("The element is founded at index :" +index);
					}
					break;
				case 2:
					show(array);
					break;
				case 3:
					int max=largest(array);
					System.out.println("The largest element in aaray is : " +max);
				case 4:
					System.out.println("Done");
					break;
				default :
					System.out.println("Invalid Choice ....!");
					break;
			}
		}while(choice!=4);
	}
}