package org.example.example_01_02;

public class Person {
    private int age;
    private String fullName;

    public Person() {

    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{"
                + "fullName = '" + fullName + '\''
                + ", age = " + age
                + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Person)) {
            return false;
        }
        Person that = (Person) o;
        return age == that.age && fullName.equals(that.fullName);
    }

    @Override
    public int hashCode() {
        int result = age;
        result = 31 * result + fullName.hashCode();
        return result;
    }

    public void move() {

        System.out.println("Person " + fullName + " идёт.");
    }

    public void talk() {
        System.out.println("Person " + fullName + " " + age + " говорит.");
    }

    public String getName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        fullName = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
