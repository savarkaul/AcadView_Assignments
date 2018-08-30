class Animal
{
    String breed,color;
    void Speak()
    {
        System.out.println("Animal Voice");
    }
}
class Dog extends Animal
{
    void Speak()
    {
        System.out.println("Dogs bark");
        breed="German Shephard";
        color="Brown";
    }
}
class Cat extends Animal
{
    void Speak()
    {
        System.out.println("Cats meow");
        breed="Persian Flatface";
        color="Orange";
    }
}
class AnimalDetail
{
    public static void main(String[] args)
    {
        Dog d1=new Dog();
        Cat c1=new Cat();
        d1.Speak();
        System.out.println("I own a dog named Simba. He is a "+d1.breed+" and is "+d1.color+" in color." );
        c1.Speak();
        System.out.println("I also own a cat named Kurama. He is a "+c1.breed+" and is "+c1.color+" in color." );
    }
}