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
    public void display_rev(Node head)
    {
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        while(temp.prev!=null)
        {
            System.out.println(temp.data);
            temp=temp.prev;
        }
        System.out.println(temp.data);
    }
}
class Reverse
{
    public static void main(String[] args)
    {
        Node n1=new Node();
        int a;
        Node x;
        Scanner s=new Scanner(System.in);
        System.out.println("The size of link list: ");
        int i=s.nextInt();
        System.out.println("Enter elemens : ");
        a=s.nextInt();
        x=n1.add(a);
        i--;
        do {
            a=s.nextInt();
            if(i>0)
            {
                x=n1.add(a);
                i--;
            }
        } while (i>0);
        n1.display(x);
        System.out.println("The reverse of entered link list is: ");
        n1.display_rev(x);
        s.close();
    }
}