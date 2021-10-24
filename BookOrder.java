import java.util.*;
import java.lang.Thread;

interface Queue{
public void add(Object obj);
public Object first();
public Object remove();
public int size();

}


public class BookOrder extends Thread implements Queue {

        private static class Node{
        Object object;
        Node prev= this, next=this;

        Node (Object obj){
        this.object=obj;
        }

        Node (Object obj, Node prev, Node next){
            this.object=obj;
            this.prev=prev;
            this.next=next;
        }

    }
    private int size;
    private Node head = new Node (null);

    public int size (){
        return size;
    }
    public boolean isEmpty(){
        return (size==0);
    }
    public Object first(){
        if (size==0)
            throw new IllegalStateException("No any Order Placed");
        return head.next.object;
    }
    public void add(Object obj){
        head.prev.next= new Node (obj, head.prev, head);
        head.prev=head.prev.next;
        size++;
    }
    public Object remove(){
        if (size==0)throw new IllegalStateException("No any Order Placed");
        Object obj=head.next.object;
        head.next=head.next.next;
        head.next.prev=head;
        --size;
        return obj;
    }

public static void main(String[] args){


	Scanner obj = new Scanner(System.in);
	BookOrder b = new BookOrder();
	String s=" ",q=" ",book=" ";   // s=q=yes/no,book=haalim, etc;
	int i=0,quant=0; // quant= book quantity, i= order no. , totalmoney= money of complete order.
    long totalmoney=1;
    System.out.println("\n\n********** BOOK Order System **********\n\nHaalim by Nimra Ahmed= 950 pkr\n\nNamal by Nimra Ahmed= 1000 pkr\n\nAlif by Umera Ahmed= 750 pkr\n\nAks by Umera Ahmed= 570 pkr\n\nJannat kay pattay by Nimra Ahmed= 700 pkr\n\nMushaf by Umera Ahmed=800\n\n");

    do{

    	System.out.println("Please Place your Order!\n\n");

    	do{


			System.out.println("What do you want to order?");
			book=obj.next();
			obj.nextLine();

			System.out.println("\nHow many book do you want?");
        	quant=obj.nextInt();
        	                                          if(book.equalsIgnoreCase("Haalim  by Nimra Ahmed")){ //The equalsIgnoreCase() method compares two strings irrespective of the case (lower or upper) of the string.
														  int k=950;
														  totalmoney=k*quant;
												      }
												      else if(book.equalsIgnoreCase("Namal by Nimra Ahmed")){
													  	  int k=1000;
														  totalmoney=k*quant;
												      }
												      else if(book.equalsIgnoreCase("Alif by Umera Ahmed")){
													  	  int k=750;
														  totalmoney=k*quant;
												      }
												      else if(book.equalsIgnoreCase("Aks by Umera Ahmed")){
													  	  int k=570;
														  totalmoney=k*quant;
												      }
												      else if(book.equalsIgnoreCase("Jannat kay pattay by Nimra Ahmed")){
													  	  int k=700;
														  totalmoney=k*quant;
			                                          }
                                                      else if(book.equalsIgnoreCase("Mushaf by Umera Ahmed")){
                                                          int k=800;
                                                          totalmoney=k*quant;

                                                      }


	    	System.out.println("\nDo you want to order more(yes/no)?");
	    	s=obj.next();







	  	} while(s.equalsIgnoreCase("yes"));


	    System.out.println("\nYour Order no is "+(++i)+". Please pay "+totalmoney+"  pkr at the counter, it will be ready in a moment");
	    b.add("Order no: "+(i));



	  System.out.println("\nAre there any more orders to take(yes/no)?");
	  q=obj.next();

      } while(q.equalsIgnoreCase("yes"));

      if(b.size==1){
		  System.out.println(b.size+" Order is being prepared");}
      else {
		  System.out.println(b.size+" Orders are being prepared");}



	try{ 
        for(int j=1; j<=i; j++){

    sleep(5000);
	System.out.println(b.remove()+"is prepared, please collect it from the shipper!\n");
}

} 
    catch(Exception e){

     }




    }

}
