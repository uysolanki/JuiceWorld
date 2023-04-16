import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class MinimumTime {
	private int seconds;
	private PriorityQueue<Integer> pqueue=new PriorityQueue<>(Collections.reverseOrder());
	public void acceptData() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Number of Mango Juices");//4
	pqueue.add(sc.nextInt());
	System.out.println("Enter Number of Orange Juices");//3
	pqueue.add(sc.nextInt());
	System.out.println("Enter Number of Apple Juices");//4
	pqueue.add(sc.nextInt());		
	}

	public void calculateMinTime() {
		Iterator<Integer> list=pqueue.iterator();
		while(!pqueue.isEmpty())
		{
			int val1=0;
			int val2=0;
			
			if(list.hasNext())
			val1=pqueue.remove();  //4
			
			if(list.hasNext())
			val2=pqueue.remove();  //4
			
			if(val1>0 && val2>0)
			{
				seconds++;
				val1--;
				val2--;
			}
			
			if(val1>0)
				pqueue.add(val1);
			
			if(val2>0)
				pqueue.add(val2);
			
			if(val1>0 && val2==0)
			{
				seconds+=val1;
				break;
			}
			
			if(val1==0 && val2>0)
			{
				seconds+=val2;
				break;
			}
			
			
			
		}
		System.out.println("Minimum Time taken to prepare such order is "+ seconds);
		
	}

}
