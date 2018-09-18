abstract class Animal
{
  String breed,color,name;

  abstract void eat(String b,String c,String n);

  void speak()
{
    System.out.println("Animal speaks");
  }

}

class Dog extends Animal
{
  void eat(String b,String c,String n)
{
    
   breed=b;
   color=c;
   name=n;
   System.out.println("Hi! My name is "+name+" and my breed is "+breed+" and my colour is "+color);

  }

  void speak()
{

    System.out.println("Dog barks");

  }

}

public class Abs
{

  public static void main(String[] args)
{

    Animal x=new Dog();

    x.eat("German","Brown","Simba");

    x.speak();

  }

}