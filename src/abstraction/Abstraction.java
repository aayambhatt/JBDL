package abstraction;

public class Abstraction {
    public static void main(String[] args) {
        PetrolEngine pe = new PetrolEngine();
        pe.startEngine();

    }

}

/*
An abstract class is just like a class.
- We cannot create an object of an abstract class
- It can contain abstract and non-abstract members
 */
abstract class Engine{
    double torque;
    double energyOutput;
    long engineNumber;
    String type;
    boolean isAutomatic;

    /*
    abstract methods don't have body or implementation
     */
    abstract public void startEngine();

    abstract public void engineStop();

}

class PetrolEngine implements EngineI{

    @Override
    public void startEngine()
    {
        System.out.println("Petrol Engine Start");
    }

    @Override
    public void engineStop(){
        System.out.println("Petrol Engine stopped");
    }

}

class ElectricEngine extends Engine{

    @Override
    public void startEngine()
    {
        System.out.println("Electric Engine Start");
    }

    @Override
    public void engineStop(){
        System.out.println("Electric Engine stopped");
    }

}