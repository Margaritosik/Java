package HomeWork5;
public class HomeWork5 {

    public static void main(String[] args) {
        Employee employee1 = new Employee("Петров Петр Петрович","инженер",
                "petrov@mail.ru", "79522090909",
                25000, 25 );

        Employee[] general = {
            employee1,
                new Employee("Андреев Андей Андреевич","старший инженер",
                        "andreev@mail.ru","79522490909",40000, 35),
                new Employee("Петрова Татьяна Андреевна","старший инженер",
                        "tat@mail.ru","79022490909",28000, 41),
                new Employee("Левый Иван Иванович","инженер",
                        "left@mail.ru","79522456909",35000, 35),
                new Employee("Правый Иван Иванович","инженер",
                        "right@mail.ru","79522434909",31000, 55)
        };

        getAllEmployee(general);
        getOverForty(general);

    }

    public static void getAllEmployee(Employee[] general) {
        System.out.println("Все сотрудники:");
        for(int i = 0; i < general.length; i++) {
            System.out.println(general[i].getFullInfo());
        }
    }

    public static void getOverForty(Employee[] general){
        System.out.println("=====");
        System.out.println("Сотрудники старше 40 лет:");
        for (int i = 0; i < general.length; i++) {
            if(general[i].getAge() > 40){
                System.out.println(general[i].getFullInfo());
            }
        }
    }


}
