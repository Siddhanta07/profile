import java.util.*;
public class OrderDetails 
{
    int ordno[];
    int icode[],qty[];
    int front,rear;
    OrderDetails()
    {
        ordno=new int[50];
        icode=new int[50];
        qty=new int[50];
        rear=-1;
        front=-1;
    }  
    int isEmpty()
    {
        if(rear==-1)
        return 1;
        else 
        return 0;
    }
    int is_Full()
    {
        if(rear==ordno.length-1)
        return 1;
        else 
        return 0;
    }
    void add(int ic,int qy)
    {
        if(is_Full()==0)
        {
            rear++;
            icode[rear]=ic;
            qty[rear]=qy;
        }
        else
        {
             System.out.println("Order is full");
             return;           
        }        
    }
    void remove()
    {
        if(isEmpty()==1)
        System.out.println("Empty queue");         
        front=0;
        System.out.println("Quantity: "+(front+1));
        System.out.println("Ice-cream code: "+icode[front]);
        System.out.println("Quantity :"+qty[front]);
        for(int i=0;i<rear;i++)
        {
            icode[i]=icode[i+1];
            qty[i]=icode[i+1];
            rear--;
            System.out.println("Order number: "+(++front));
            System.out.println("Ice-cream code: "+icode[i]);
            System.out.println("Quantity :"+qty[i]);
        }
    }
}