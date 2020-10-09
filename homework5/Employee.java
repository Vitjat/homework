package homework5;

public class Employee {
    private String fullName ;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public int getAge() {
        return age;
    }

    /** конструктор класса сотрудник*/
    public Employee(String fullName, String position, String email, String phone, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }


    public void info(){
        System.out.printf("Сотрудник: %s, профессия - %s, email - %s, телефон - %s, зарплата - %s руб, возраст - %s\n",
                fullName, position, email, phone, salary, age);
    }

}
