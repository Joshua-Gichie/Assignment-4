
import java.util.Scanner;
 
class arrays{
	public static void main(){
		int arr[] = new int[5];	
		Scanner scan = new Scanner(System.in);
		int ans = 0;
		int i, n = 0, j = 0,k, temp, y = 0, p, key;
		
		System.out.println("Enter the elements of the array:\n");
 
		//Taking input
		for(int i1 = 0; i1<5; i1++){
			arr[i1] = scan.nextByte(0); 
		}
 
		System.out.println("The elements of the array are:");
		//Printing out
		for(int i1 = 0; i1<10; i1++){
			System.out.println("arr[" + i1 + "] = " + arr[i1]);
		}
		System.out.println("WHICH SORTING TYPE WOULD YOU LIKE?");
		System.out.println("1.Bubble Sort");
		System.out.println("2.Insertion");
		System.out.println("3.Selection");
		
		if(ans== 1) {
			for(k=0; k<(n-1); k++)
			   {
			       for(j=0; j<(n-i-1); j++)
			       {
			           if(arr[j] > arr[j+1])
			           {
			               temp = arr[j];
			               arr[j] = arr[j+1];
			               arr[j+1] = temp;
			               System.out.println(+temp);
			           }
			       }
			   }

			if(ans==2) {
				for (int p1 = 1; j < n; p1++) {  
		            int key1 = arr[j];  
		            int g = j-1;  
		            while ( (y > -1) && ( arr [y] > key1 ) ) {  
		                arr [y+1] = arr [y];  
		                p1--;  
		            }  
		            arr[p1+1] = key1;  
		            System.out.println(+key);
		        }  
		    } 
			if (ans==3) {
				for (int i1 = 0; i1 < arr.length - 1; i1++)  
		        {  
		            int index = i1;  
		            for (int j1 = i1 + 1; j1 < arr.length; j1++){  
		                if (arr[j1] < arr[index]){  
		                    index = j1;//searching for lowest index  
		                }  
		            }  
		            int smallerNumber = arr[index];   
		            arr[index] = arr[i1];  
		            arr[i1] = smallerNumber;  
		            System.out.println(+smallerNumber);
		        }  
		    }  
				
			}
		}
		
	}
	
		
	
}