interface Animal
{
void speak();
void eat();
}
class Dog implements Animal
{
public void speak()
{
System.out.println("Dog barks");
}
public void eat()
{
System.out.println("Dog eats");
}
}
class Cat implements Animal
{
public void speak()
{
System.out.println("Cat purrs");
}
public void eat()
{
System.out.println("Cat eats");
}
}
class DogCat
{
public static void main(String[] args)
{
Animal x=new Dog();
Animal y=new Cat();
x.speak();
x.eat();
y.speak();
y.eat();
}
}