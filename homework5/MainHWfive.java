package homework5;

public class MainHWfive {
        public static void main(String[] args) {

//        /** ввод каждого сотрудника без использования массивов и вывод в консоль */
//        Employee emp1 = new Employee("Петров Пётр Петрович", "программист",
//                "petrov@mail.ru", "89233234567", "90000", "30");
//        Employee emp2 = new Employee("Иванов Иван Иванович", "техник",
//                "tehivan@mail.ru", "89253254555", "50000", "29");
//        emp1.info();
//        emp2.info();

            /**Массив из 5 сотрудников*/
            Employee[] empArray = new Employee[5];
            empArray[0] = new Employee("Петров Пётр Петрович", "программист",
                    "petrov@mail.ru", "89233234567", 90000, 30);
            empArray[1] = new Employee("Иванов Иван Иванович", "техник",
                    "tehivan@mail.ru", "89253254555", 50000, 29);
            empArray[2] = new Employee("Васильев Александр Сергеевич", "музыкант",
                    "alexvanya@mail.ru", "89555553535", 60000, 45);
            empArray[3] = new Employee("Федоров Анатолий Андреевич", "системный администратор",
                    "feloradmin@mail.ru", "89456786789", 75000, 43);
            empArray[4] = new Employee("Уткин Сергей Анатольевич", "тестировщик",
                    "sergtest@mail.ru", "89607504488", 90000, 50);

            for (int i = 0; i >= empArray.length; i++) {
                if (empArray[i].getAge() > 40) {
                    empArray[i].info();
                }
            }
        }
}
