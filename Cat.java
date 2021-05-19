package HomeWork6;

public class Cat extends Animal {

    public static int amountCat = 0;
    public Cat(String name, int lengthRun, int lengthSwim){
        super("Кот", name, lengthRun, lengthSwim);
        ++amountCat;
    }

    @Override
    public void run(int lengthRun){
        if(lengthRun > 200){
            System.out.println(type + " " + name + " не может пробежать " + lengthRun + " метров, он устанет!");
        }else super.run(lengthRun);
    }

    @Override
    public void swim(int lehgthSwim){
        System.out.println("Котик не хочет плавать!");
    }

}
