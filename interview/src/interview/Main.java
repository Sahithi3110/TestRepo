package interview;

import java.util.Scanner;

class LinkedList{
	
	public Node head=null;
	public Node tail=null;
	
	class Node{
		int data;
		Node next;
		public Node(int data)
		{
			this.data=data;
			next=null;
		}
	}void addNodeEnd(int newData)
	{
		Node newNode=new Node(newData);
		if(head==null)
		{
			head=newNode;
			tail=newNode;
		}else
		{
			tail.next=newNode;
			tail=newNode;
		}
	}void countNode()
	{
		Node current=head;
		int count=0;
		while(current!=null)
		{
			count++;
			current=current.next;
		}System.out.println("Total Nodes "+count);
	}void display()
	{
		if(head==null)
			System.out.println("No Nodes");
		else
		{
			Node current=head;
			while(current!=null)
			{
				System.out.print(current.data+" ");
				current=current.next;
			}
		}
	}void deleteNodeStart()
	{
		if(head==null)
		System.out.println("List is empty");
		else {
			if(head != tail) {  
                head = head.next;  
            }  
            else {  
                head = tail = null;  
            }  
		}
	}void deleteNodeEnd()
	{
		if(head==null)
		System.out.println("List is empty");
		else if(head!=tail)
		{
			Node curr=head;
			while(curr.next!=tail)
				curr=curr.next;
			tail=curr;
			tail.next=null;
		}else head=tail=null;
	}void deleteNodeMid(int item)
	{
		if(head==null)
			System.out.println("List is empty");
		else if( head != tail ) { 
			Node temp=head;
		Node current=null; 
		 
			while(temp.data!=item){  
			current = temp;  
			temp = temp.next;  
			}  
			if(current != null) {  
			 current.next = temp.next;  
			 temp = null;  
			 }  else head=tail=null;
	       }
	  }void addNodeBeggining(int item)
	{
		  Node newNode=new Node(item);
		  if(head==null)
			head=newNode; 
		  else
		  { newNode.next=head;
		  head=newNode;}
			  
	}
	
}
public class Main {
	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		Scanner sc=new Scanner(System.in);
		l.addNodeEnd(1);
		l.addNodeEnd(2);
		l.addNodeEnd(3);
		l.addNodeEnd(4);
		//l.countNode();l.display();
		/*l.deleteNodeStart();
		System.out.println("\n"+"After deleting 1st Node");
		l.display();
		l.deleteNodeEnd();
		System.out.println("\n"+"After deleting last Node");
		l.display();*/
		//l.addNodeEnd(5);l.display();
		/*System.out.println("\n"+"Enter the item to be deleted : ");
		int item=sc.nextInt();
		l.deleteNodeMid(item);
		System.out.println("\n"+"After deleting Middle Node");
		l.display();
		System.out.println("\n"+"Enter the item to be added at the beggining : ");
		int item=sc.nextInt();
		l.addNodeBeggining(item);l.display();*/
		System.out.println("\n"+"Enter the item to be added at the beggining : ");
		int item=sc.nextInt();
		l.addNodeBeggining(item);l.display();
		
	}

}
