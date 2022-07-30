public class Main {
    public static void main(String[] args) {
        Employee[] employee = new Employee[10];
        employee[0] = new Employee("Иванов Иван Петрович", 1, 35743);
        employee[1] = new Employee("Митяев Дмитрий Алексеевич", 2, 52523);
        employee[2] = new Employee("Ильясов Артур Арсенович", 3, 45658);
        employee[3] = new Employee("Трунькин Михаил Анатольевич", 1, 24592);
        employee[4] = new Employee("Петрова Анастасия Алексеевна", 5, 99245);
        employee[5] = new Employee("Жучкин Жерар Депардье", 3, 9000);
        employee[6] = new Employee("Волшин Илья Андреевич", 4, 92552);
        employee[7] = new Employee("Клюев Антон Иванович", 2, 44677);
        employee[8] = new Employee("Мошкина Катерина Юрьевга", 5, 23521);
        employee[9] = new Employee("Мухоморова Мария Ивановна ", 1, 99999);

        totalSalary(employee);
        maxSalary(employee);
        minSalary(employee);
        averageSalary(employee);
        System.out.println(employee[0]);
        System.out.println(employee[1]);
        System.out.println(employee[2]);
        System.out.println(employee[3]);
        System.out.println(employee[4]);
        System.out.println(employee[5]);
        System.out.println(employee[6]);
        System.out.println(employee[7]);
        System.out.println(employee[8]);
        System.out.println(employee[9]);
    }

    public static void totalSalary(Employee[] employees) {
        int total = 0;
        for (int i = 0; i < employees.length; i++) {
            total = total + employees[i].getSalary();
        }
        System.out.println("Общая сумма всей зарплаты " + total);
    }

    public static void minSalary(Employee[] employees) {
        if (employees == null) {
            System.out.println("Массив пустой");
        } else {
            Employee emMinSalary = employees[0];
            for (int i = 0; i < employees.length; i++) {
                if (emMinSalary.getSalary() > employees[i].getSalary()) {
                    emMinSalary = employees[i];
                }
            }
            System.out.println("Сотрудник с минимальной зарплатой " + emMinSalary);
        }
    }

    public static void maxSalary(Employee[] employees) {
        if (employees == null) {
            System.out.println("Массив пустой");
        } else {
            Employee emMaxSalary = employees[0];
            for (int i = 0; i < employees.length; i++) {
                if (emMaxSalary.getSalary() < employees[i].getSalary()) {
                    emMaxSalary = employees[i];
                }
            }
            System.out.println("Сотрудник с максимальной зарплатой " + emMaxSalary);

        }
    }
    public static void averageSalary (Employee[] employees) {
            int total = 0;
        for (int i = 0; i < employees.length; i++) {
           total = total + employees[i].getSalary();
        }
        System.out.println("Cредняя заработная плата " +total/ employees.length);
    }

}