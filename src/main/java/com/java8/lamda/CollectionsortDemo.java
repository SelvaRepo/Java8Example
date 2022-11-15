package com.java8.lamda;

import java.util.*;

class Employee{
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
public class CollectionsortDemo {
    public static void main(String s[]) {
        List<Employee> emplist =new ArrayList();

        /*Employee selva = new Employee();
        selva.setId(11);
        selva.setName("Selva");
        emplist.add(selva);

        Employee elaya = new Employee();
        elaya.setId(21);
        elaya.setName("Elaya");
        emplist.add(elaya);

        Employee bai = new Employee();
        bai.setId(22);
        bai.setName("bai");
        emplist.add(bai);*/

        Employee firstelement= emplist.stream().findFirst().get();

        System.out.println("firstelement="+firstelement);
        //Collections.sort(emplist,(Employee o1, Employee o2) -> o1.getName().compareTo(o2.getName()));
        //System.out.println("After="+emplist);

        //emplist.stream().sorted((Employee o1, Employee o2) -> o1.getName().compareTo(o2.getName())).forEach(System.out::println);

        //emplist.stream().sorted(Comparator.comparing(emp -> emp.getName())).forEach(System.out::println);

        //emplist.stream().sorted(Comparator.comparing(Employee::getId)).forEach(System.out::println);
    }
}