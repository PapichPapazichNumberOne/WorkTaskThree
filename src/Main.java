public class Main {

    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        Park park = new Park();
        employees[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mail.ru", "892312312", 30000, 30);
        employees[1] = new Employee("Petrov Petr", "Manager", "petrov@mail.ru", "892345678", 35000, 45);
        employees[2] = new Employee("Sidorov Ryslan", "Programmer", "sidorov@mai.ru", "891234567", 40000, 28);
        employees[3] = new Employee("Kozlov Sergey", "Designer", "kozlov@mail.ru", "895678912", 32000, 50);
        employees[4] = new Employee("Orlov Oleg", "Analyst", "orlov@mail.ru", "899876543", 38000, 35);

        Park.Attraction attraction1 = new Park.Attraction("Колесо обозрения", "10:00", "21:00", 10.0);
        Park.Attraction attraction2 = new Park.Attraction("Американские горки", "11:00", "20:00", 15.0);
        System.out.println("Информация об аттракционе 1:");
        attraction1.printInfo();

        System.out.println("\nИнформация об аттракционе 2:");
        attraction2.printInfo();
        for (Employee employee : employees) {
            if (employee.age > 40) {
                employee.printInfo();



                System.out.println("Информация о сотрудниках старше 40 лет:");


            }

        }

    }
}