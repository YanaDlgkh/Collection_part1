package ru.dolgikh.homeworks.collection.part1;

import java.util.ArrayList;
import java.util.List;

public class Employee {

    public static void main(String[] args) {

        System.out.println("ВТОРАЯ ЧАСТЬ");

        List<Employee> employee = new ArrayList<>();
        employee.add(new Employee("Иван", 25));
        employee.add(new Employee("Андрей", 35));
        employee.add(new Employee("Анна", 24));
        employee.add(new Employee("Петр", 21));

        System.out.println(employee);

        System.out.println(listOfName(employee));

        System.out.println(listOfMinAge(employee, 23));

        System.out.println(averageAgeExceeds(employee, 28));

        System.out.println(theYoungestOfEmployee(employee));

    }

    // 5. Создайте класс Сотрудник с полями: имя, возраст;

    private String name;

    private int age;


    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    //    6. Реализуйте метод, принимающий в качестве аргумента список сотрудников,
//    и возвращающий список их имен;


    public static ArrayList<String> listOfName(List<Employee> employees) {

        ArrayList<String> names = new ArrayList<>();

        for (var employee :
                employees) {
            names.add(employee.getName());
        }
        return names;
    }

//    7. Реализуйте метод, принимающий в качестве аргумента список сотрудников и минимальный возраст,
//    и возвращающий список сотрудников, возраст которых больше либо равен указанному аргументу;

    public static ArrayList<Employee> listOfMinAge(List<Employee> employees, int minAge) {

        ArrayList<Employee> minAgeList = new ArrayList<>();

        for (var employee :
                employees) {

            if (employee.getAge() >= minAge) {
                minAgeList.add(employee);
            }

        }
        return minAgeList;
    }

//    8. Реализуйте метод, принимающий в качестве аргумента список сотрудников и минимальный средний возраст,
//    и проверяющий что средний возраст сотрудников превышает указанный аргумент;


    public static boolean averageAgeExceeds(List<Employee> employees, int minAverageAge) {

        int ageOfEmployees = 0;

        for (var employee : employees) {
            ageOfEmployees += employee.getAge();
        }
        var averageEmployees = ageOfEmployees / employees.size();

        return averageEmployees > minAverageAge;

    }

//    9. Реализуйте метод, принимающий в качестве аргумента список сотрудников,
//    и возвращающий ссылку на самого молодого сотрудника.

    public static Employee theYoungestOfEmployee(List<Employee> employees) {

        Employee youngest = employees.get(0);
        for (var employee : employees) {
            if (employee.getAge() < youngest.getAge()) {
                youngest = employee;
            }
        }
        return youngest;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
