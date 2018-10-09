import java.util.Scanner;
class Node
{
    int data;
    Node next;
    Node prev;
    Node head=null;
    public Node()
    {
        this.data=0;
        this.next=null;
        this.prev=null;
    }
    public Node(int data)
    {
        this.data=data;
        this.next=null;
        this.prev=null;
    }
    public Node add(int data)
    {
        Node n=new Node(data);
        if(head==null)
        {
            head=n;
        }
        else
        {
            Node temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }

            temp.next=n;
            n.prev=temp;
        }
        return head;
    }
    public void display(Node head)
    {
        Node temp=head;
        while(temp.next!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
        System.out.println(temp.data);
    }
    public void CheckPal(Node head,int i)
    {
        int j,k;
        int flag=-1;
        Node temp1=head;
        Node temp2=head;
        while(temp2.next!=null)
        {
            temp2=temp2.next;
        }
                for(k=i-1,j=0;j!=k;k--,j++)
        {
            if(temp2.data==temp1.data)
            {
                flag=1;
            }
            else
            {
                flag=0;
                break;
            }
            temp2=temp2.prev;
            temp1=temp1.next;
        }
        if(flag==1)
        {
            System.out.println("The list is Palindrome");
        }
        else if(flag==0)
        {
            System.out.println("The list is not palindrome");
        }
    }
}

class Palcheck
{
    public static void main(String[] args)
    {
        Node n1=new Node();
        int a;
        Node x;
        Scanner s=new Scanner(System.in);
        int i;
        System.out.println("Enter the size of list: ");
        i=s.nextInt();
        int num=i;
        System.out.println("Enter the elements: ");
        a=s.nextInt();
        x=n1.add(a);
        do {
            a=s.nextInt();
            if(i>0)
            {
                x=n1.add(a);
                i--;
            }
        } while (i>1);
        System.out.println("The doubly link list: ");
        n1.display(x);
        n1.CheckPal(x,num);
        s.close();
    }
}