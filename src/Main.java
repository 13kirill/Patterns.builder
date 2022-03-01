public class Main {

    public static void main(String[] args) {

        //Person kirill = new Person();
        Person kirill = new PersonBuilder()
                .setName("Kirill")
                .setSurname("Zubkov")
                .setAge(29)
                .setAddress("NN")
                .build();
        System.out.println(kirill);


        try {
            // методы с exception нужно писать в мэйне?
            // какие могут быть недопустимые значения кроме возраста?
            // ведь все остальные данные String, там может быть что угодно
            new PersonBuilder().build();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

    }
}
