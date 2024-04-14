package org.example;
import java.util.*;
import java.util.Arrays;
public class App {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Petrov", 1));
        students.add(new Student("Sidorov", 2));
        students.add(new Student("Ivanov", 3));
        students.get(1);
        students.remove(2);
        System.out.println(students);

        Set<Student> hashSet = new HashSet<>();
        hashSet.add(new Student("Timofej",1));
        hashSet.add(new Student("Albert",2));
        hashSet.add(new Student("Arnold",3));
        hashSet.remove(1);
        System.out.println(hashSet);

        Set<Student> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(new Student("Timofej",1));
        linkedHashSet.add(new Student("Albert",2));
        linkedHashSet.add(new Student("Arnold",3));
        linkedHashSet.remove(3);
        System.out.println(linkedHashSet);

        Set<Student> treeSet = new TreeSet<>();
        treeSet.add(new Student("Timofej",1));
        treeSet.add(new Student("Albert",2));
        treeSet.add(new Student("Arnold",3));
        for (Student student: students) {
            System.out.println(student);
        }

        Map<Integer, Student> hashMap = new HashMap<>();

        hashMap.put(4, new Student("Ivanov",4));
        hashMap.put(5, new Student("Petrov",4));
        hashMap.put(7, new Student("Sidorov",4));
        hashMap.get(5);
        hashMap.remove(4);

        for (Map.Entry<Integer, Student> a: hashMap.entrySet()) {
            System.out.println(a.getKey() + " " + a.getValue());
        }
    }
}


