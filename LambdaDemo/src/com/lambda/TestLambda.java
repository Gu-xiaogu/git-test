package com.lambda;

import org.junit.Test;

import java.sql.Array;
import java.util.*;

public class TestLambda {
    //原来的匿名内部类
    @Test
    public void test1(){
        Comparator<Integer> con = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1,o2);
            }
        };

        TreeSet<Integer> ts = new TreeSet<>(con);
    }

    //Lambda表达式
    @Test
    public void test2(){
        Comparator<Integer> con = (x,y) -> Integer.compare(x,y);
    }

    @Test
    public void test3(){
        List<Employee> list = filterEmployees(employees);

        for (Employee employee : list) {
            System.out.println(employee);

        }
    }

    //获取当前公司中员工年龄大于35的员工信息
    List<Employee> employees = Arrays.asList(
            new Employee("张三",18,9999.0),
            new Employee("李四",43,524.0),
            new Employee("王五",25,5211.0),
            new Employee("赵柳",32,1452.0),
            new Employee("七七",20,3000.0)
    );

    public List<Employee> filterEmployees(List<Employee> list){
        List<Employee> emps = new ArrayList<>();

        for (Employee emp: list) {
            if (emp.getAge() >= 35) {
                emps.add(emp);
            }

        }
        return emps;
    }


}
