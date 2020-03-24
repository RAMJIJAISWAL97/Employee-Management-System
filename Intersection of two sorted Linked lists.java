// { Driver Code Starts
import java.util.Scanner;
import java.util.*; 

class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }


public class Intersect
{
    Node head;  

public void addToTheLast(Node node) 
{

  if (head == null) {
   head = node;
  } else {
   Node temp = head;
   while (temp.next != null)
    temp = temp.next;

   temp.next = node;
  }
}




  /* Function to print linked list */
    public void printList(Node head)
    {
        Node temp = head;
		if(temp == null)
			System.out.print("NO");
		else{
        while (temp != null)
        {
           System.out.print(temp.data+" ");
           temp = temp.next;
        }  
		}
    }

     /* Drier program to test above functions */
    public static void main(String args[])
    {
       
        /* Constructed Linked List is 1->2->3->4->5->6->
           7->8->8->9->null */
         Scanner sc = new Scanner(System.in);
		 int t=sc.nextInt();
		 
		 while(t>0)
         {
			 Intersect llist1 = new Intersect();
			 Intersect llist2 = new Intersect();
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			
					int a1=sc.nextInt();
							Node head1= new Node(a1);
							llist1.addToTheLast(head1);
							
							for (int i = 1; i < n1; i++) 
							{
									int a = sc.nextInt(); 
									llist1.addToTheLast(new Node(a));
								 
							}
			    
						int b1=sc.nextInt();
						Node head2 = new Node(b1);
						llist2.addToTheLast(head2);
						 
						for (int i = 1; i < n2; i++) 
						{
							//int b;
							
							 int b = sc.nextInt(); 
							llist2.addToTheLast(new Node(b));
						}
				
				GfG obj = new GfG();
				obj.getIntersection(llist1.head,llist2.head);
				//llist1.printList();
				llist2.printList(obj.llist3.head);
				System.out.println();
			t--;
			
         }
          
    }
}// } Driver Code Ends
class GfG
{
    Intersect llist3 = new Intersect(); // object of LinkedList having Intersection of two LinkedLists
    // Function  to find Intersection of two LinkedLists
    void getIntersection(Node head1, Node head2) {   
         Node h1 = head1, h2 = head2;
         while(h1 != null && h2 != null) {
             if(h1.data == h2.data) {
                 llist3.addToTheLast(new Node(h1.data));
                 h1 = h1.next;
                 h2 = h2.next;
             } else if(h1.data < h2.data) {
                 h1 = h1.next;
             } else {
                 h2 = h2.next;
             }
         }
    }
}