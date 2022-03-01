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

//    public PersonBuilder newChildBuilder(Person person) {
//
//        // почему в мэйне это работает, а в этом классе нет? непонимаю
//
//        Person personBuilder = new PersonBuilder()
//                .setAddress(person.getAddress())
//                .setAge(0)
//                .setSurname(person.getSurname())
//                .build();
//        return personBuilder;
//    }

    public boolean hasAddress() {

        return address != null;
    }

    public boolean hasAge() {

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