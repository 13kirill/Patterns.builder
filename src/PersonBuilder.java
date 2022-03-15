public class PersonBuilder {

    private String name;
    private String surname;
    private int age;
    private String address;

    public PersonBuilder() {
    }

    public PersonBuilder setName(String name) throws IllegalStateException {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) throws IllegalArgumentException {
        this.age = age;
        if (age < 0 || age > 100) {
            throw new IllegalArgumentException("Неверно указано значение возраста!" + "\n" +
                    "Возраст может быть от 0 до 100!");
        }
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        return new Person(name, surname, age, address);
    }
}
