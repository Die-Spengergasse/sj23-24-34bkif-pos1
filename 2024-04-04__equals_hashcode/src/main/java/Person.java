import java.util.Objects;

public class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(firstName, person.firstName) &&
                Objects.equals(lastName, person.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }

    public static void main(String[] args) {
        Person person1 = new Person("John", "Doe");
        Person person2 = new Person("John", "Doe");
        Person person3 = new Person("Jane", "Doe");

        System.out.println(person1.equals(person2)); // should print true
        System.out.println(person1.hashCode() == person2.hashCode()); // should print true

        System.out.println(person1.equals(person3)); // should print false
        System.out.println(person1.hashCode() == person3.hashCode()); // should print false
    }
}