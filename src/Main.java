public class Main {

    public static void main(String[] args) {

        try {
            Person kirill = new PersonBuilder()
                    .setName("Kirill")
                    .setSurname("Zubkov")
                    .setAge(29)
                    .setAddress("NN")
                    .build();
            System.out.println(kirill);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }

        Person artem = new PersonBuilder()
                    .setName("Artem")
                    .setSurname("Pushkin")
                    .setAge(35)
                    .setAddress("MSK")
                    .build();

        Person son = artem.newChildBuilder().setName("Grigory").setAge(6).build();
        System.out.println(son);

        Person nataly = new PersonBuilder().setAge(-2).build();
    }
}