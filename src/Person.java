public class Person {
    private String name;
    private String surname;
    private int age;
    private String address;

    public Person(final String name,
                  final String surname,
                  final int age,
                  final String address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }

    public Person() {
    }

    public PersonBuilder newChildBuilder() {
        PersonBuilder personBuilder = new PersonBuilder();
        personBuilder.setSurname(this.surname)
                .setAddress(this.address);
        return personBuilder;
    }

    public boolean hasAddress() {

        return address != null;
    }

    public boolean hasAge() {
        if (true) {
            System.out.println("Возраст указан корректно");
        } else {
            System.out.println("Возраст не указан или указан некорректно!");
        }
        return (0 <= age & age < 100);
    }


    public int happyBirthday() {

        return age + 1;
    }

    public String getName() {

        return name;
    }

    public String getSurname() {

        return surname;
    }

    public int getAge() {

        return age;
    }

    public String getAddress() {

        return address;
    }

    public String toString() {

        return "Name " + name + ",Surname " + surname + ", age" + age + ", address " + address;
    }
}