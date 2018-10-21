/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;
import java.util.Scanner;
/**
 *
 * @author Riya
 */
public class fact {
   int len,front,rear;
   int[] arr=new int[20];
   fact()
   {
       len=0;
       front=-1;
       rear=-1;
   }
   
   void enque(int n)
   {
       if(rear==-1&&front==-1){
           arr[++rear]=n;
           front++;
           len++;
       }
       else if(rear<arr.length-1)
       {
           arr[++rear]=n;
           len++;
       }
       else
       {
           System.out.println("Queue is full");
       }
   }
   
   int deque()
   {
       if(len!=0){
           len--;
           return arr[front++];
       }
       else{
           System.out.println("Queue is empty");
           return-1;
       }
   }
   
   void display()
   {
       System.out.println();
       for(int i=front;i<=rear;i++)
       {
           System.out.print(arr[i]+" ");
       }
   }
   boolean IsEmpty()
   {
       if(len==0)
           return true;
       else
           return false;
   }
    
    public static void main(String[] args)
    {
        fact q=new fact();
        q.enque(10);
        q.display();
        q.enque(20);
        q.display();
        q.enque(30);
        q.display();
        System.out.println();
        System.out.println("item removed "+q.deque());
        q.display();
        System.out.println();
        System.out.println("System empty : "+q.IsEmpty());
        System.out.println("item removed "+q.deque());
        System.out.println("item removed "+q.deque());
        System.out.println("System empty : "+q.IsEmpty());
        q.deque();


    }
    
}
