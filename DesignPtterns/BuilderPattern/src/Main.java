public class Main {

    public static void main(String[] args) {

        Book.Builder builder = new Book.Builder(1,"The Count of Montecristo");
        Book book=builder.price(750.00).category("Novel").build();
        System.out.println(book);
    }
}
