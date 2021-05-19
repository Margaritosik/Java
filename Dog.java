package HomeWork6;

public class Dog extends Animal {

    public static int amountDog = 0;
    public Dog(String name, int lengthRun, int lengthSwim){

       super("Пёс", name, lengthRun, lengthSwim);
        ++amountDog;

    }
    @Override
    public void run(int lengthRun){
        if(lengthRun > 500){
            System.out.println(type + " " + name + " не может пробежать " + lengthRun + " метров, он устанет!");
        } else super.run(lengthRun);
    }

    @Override
    public void swim(int lengthSwim){
        if(lengthSwim > 10){
            System.out.println(type + " " + name + " не может доплыть до " + lengthSwim + " метров, он устанет!");
        } else super.swim(lengthSwim);
    }


}
