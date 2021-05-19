package HomeWork6;

public abstract class Animal {
    String name;
    String type;
    int lengthRun;
    int lengthSwim;
    public static int amount = 0;

    public Animal(String type, String name, int lengthRun, int lengthSwim){
        this.type = type;
        this.name = name;
        this.lengthRun = lengthRun;
        this.lengthSwim = lengthSwim;
        ++amount;
    }

    public int getLengthRun() {
        return lengthRun;
    }

    public int getLengthSwim() {
        return lengthSwim;
    }

    public String getName() {
        return name;
    }
    public String getType(){
        return type;
    }

    protected void run(int lengthRun){
        System.out.println(type + " " + name + " пробежал " + lengthRun + " метров.");
    }

    protected void swim(int lengthSwim){
        System.out.println(type + " " + name + " проплыл " + lengthSwim + " метров.");
    }
}

