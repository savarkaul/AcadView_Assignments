abstract class Vehicle
{
    abstract void Start();
    void Stop()
    {
        System.out.println("Stop");
    }
}
class Two_Wheeler extends Vehicle
{
    void Start()
    {
        System.out.println("Start method of Two_wheeler class");
    }
    void Stop()
    {
        System.out.println("Stop method of Two_wheeler class");
    }
}
class Four_Wheeler extends Vehicle
{
    void Start()
    {
        System.out.println("Start method of Four_wheeler class");
    }
    void Stop()
    {
        System.out.println("Stop method of Four_wheeler class");
    }
}
class VehicleDetails
{
    public static void main(String[] args)
    {
        Two_Wheeler two=new Two_Wheeler();
        Four_Wheeler four= new Four_Wheeler();
        two.Start();
        two.Stop();
        four.Start();
        four.Stop();
    }
    
}