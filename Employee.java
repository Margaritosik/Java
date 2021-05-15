package HomeWork5;

public class Employee {
    private String fio;
    private String position;
    private String email;
    private String numberPhone;
    private int salary;
    private int age;

    public Employee(String fio, String position, String email, String numberPhone, int salary, int age){
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.numberPhone = numberPhone;
        this.salary = salary;
        this.age = age;
    }

    String getFio(){
        return fio;
    }

    String getPosition(){
        return position;
    }

    String getEmail(){
        return email;
    }

    String getNumberPhone(){
        return numberPhone;
    }

    int getSalary(){
        return salary;
    }

    int getAge(){
        return age;
    }

    String getFullInfo() {
        return this.fio + ", " +
                this.position + ", email: " +
                this.email + ", телефон: " +
                this.numberPhone + ", зарплата - " +
                this.salary + ", возраст - " +
                this.age + "";
    }
}
