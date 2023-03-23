package collection;

import java.util.PriorityQueue;

public class QueInterface {
public static void main(String[]args) {
// type of queue- priority queue, LinkedList, dequeue. blockdqueue.
//different type of methods
//add- adding- true , not adding- exception
//offer	-adding- true , not adding- false
//element -queue is empty throw - exception	
//peek	-queue is empty shows- null
//remove-queue is empty throw - exception		
//poll -queue is empty shows- null
PriorityQueue p=new PriorityQueue();
p.add(1);
p.add(2);
p.add(3);
//System.out.print(p);//duplicates allows, insertion is maintained.
//System.out.print(p.element());
//return, remove element from the queue/
System.out.println(p.remove());
System.out.println(p);





























}
}
