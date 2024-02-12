package org.example.example_01_02;

public class NewThema {
    //Создать класс Person, который содержит:
    //a) поля fullName, age.
    //б) методы move() и talk(), в которых просто вывести на консоль сообщение –
    // “Person <имя> идёт.”, "Person <имя> <возраст> говорит".
    //в) Добавьте два конструктора  - Person() и Person(fullName, age).
    //Создайте два объекта этого класса. Один объект инициализируется
    // конструктором Person(), другой - Person(fullName, age).

    public static void main(String[] args) {
        Person person1 = new Person("Tantiana", 20);
        Person person2 = new Person("Tantiana", 20);
        Person person3 = new Person("Alex", 25);
        System.out.println(person1);
        System.out.println("-----------------------");
        System.out.println(person2.equals(person1));
        System.out.println(person3.equals(person1));
        System.out.println("-----------------------");

        System.out.println(person2.hashCode());
        System.out.println(person1.hashCode());
        System.out.println(person3.hashCode());
        System.out.println("-----------------------");

        person1.move();
        person1.talk();

        person1.setName("Alex");
        person1.setAge(25);
        System.out.println();
        person1.talk();
        person1.move();
    }

}
