import javafx.util.Builder;

public class Book {

    private  Integer bookId;
    private  String bookName;
    private  double bookPrice;
    private String bookCategory;

    public Book(Builder builder) {
        this.bookId=builder.bookId;
        this.bookName=builder.bookName;
        this.bookPrice=builder.bookPrice;
        this.bookCategory=builder.bookCategory;
    }

    static class Builder{

        private Integer bookId;
        private String bookName;
        private double bookPrice;
        private String bookCategory;

        public Book build(){
            return new Book(this);
        }

        public Builder(Integer bookId, String bookName){

            this.bookId=bookId;
            this.bookName=bookName;

        }

        public Builder price(double bookPrice){
            this.bookPrice=bookPrice;
            return this;
        }

        public Builder category(String bookCategory){
            this.bookCategory=bookCategory;
            return this;
        }
    }

    @Override
    public String toString() {
        return "Book{" +
                "Book Id = " + bookId +
                ", Book Name = " + bookName + '\'' +
                ", Price = " + bookPrice +
                ", Category = " + bookCategory +

                '}';
    }
}
