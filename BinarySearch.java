package Search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

public class BinarySearch {
	
	public Integer BinarySearching(int[]a, int number, int value){
		
		int length = a.length;
		int inspectionIndex = length/2;

		if(length==1 && a[0]!=number)
			{System.out.println("NOT FOUND!!");
				return -1;
			}
		
		if(number==a[inspectionIndex])
		{	System.out.println("Found "+number+" at index "+(value+inspectionIndex));
			return inspectionIndex;
		}
		
		if (number>a[inspectionIndex])
			{   System.out.println("Chopping at "+a[inspectionIndex]+". New search array is  "+Arrays.toString(Arrays.copyOfRange(a, inspectionIndex+1, length)));
				value = value + inspectionIndex+1;
				BinarySearching(Arrays.copyOfRange(a, inspectionIndex+1, length), number, value);
				
			}
		else
			{	System.out.println("Chopping at "+a[inspectionIndex]+". New search array is  "+Arrays.toString(Arrays.copyOfRange(a, 0, inspectionIndex)));
			    BinarySearching(Arrays.copyOfRange(a, 0, inspectionIndex), number, value);
			}
			
			
		return null;
			
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int a[] = {1,2,3,4,5,10,11,12,13};
//		int number = 101;
//
//		System.out.println("Binary search of "+Arrays.toString(a)+" for number "+number);
//		BinarySearch bn = new BinarySearch();
//		bn.BinarySearching(a, number, 0);
//		
	      // Create an array list
	      ArrayList al = new ArrayList();
	      // add elements to the array list
	      al.add("C");
	      al.add("A");
	      al.add("E");
	      al.add("B");
	      al.add("D");
	      al.add("F");

	      // Use iterator to display contents of al
	      System.out.print("Original contents of al: ");
	      Iterator itr = al.iterator();
	      while(itr.hasNext()) {
	         Object element = itr.next();
	         System.out.print(element + " ");
	      }
	      System.out.println();
	      
		  // Modify objects being iterated
	      ListIterator litr = al.listIterator();
	      while(litr.hasNext()) {
	         Object element = litr.next();
	         litr.set(element + "+");
	      }
	      System.out.print("Modified contents of al: ");
	      itr = al.iterator();
	      while(itr.hasNext()) {
	         Object element = itr.next();
	         System.out.print(element + " ");
	      }
	      System.out.println();

	      // Now, display the list backwards
	      System.out.print("Modified list backwards: ");
	      while(litr.hasPrevious()) {
	         Object element = litr.previous();
	         System.out.print(element + " ");
	       }
	       System.out.println();
	    
	}
	

}
