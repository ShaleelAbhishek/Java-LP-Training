import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable {
    private String ShopName;
    List<Book> bookList = new ArrayList<>();

    public String getShopName() {
        return ShopName;
    }

    public void setShopName(String shopName) {
        ShopName = shopName;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public void loadBookData(){
        for(int i=1;i<=10;i++){
            Book book = new Book();
            book.setBookId(i);
            book.setBookName("book"+i);
            getBookList().add(book);
        }
    }

    @Override
    public String toString() {
        return "BookShop{" +
                "ShopName='" + ShopName + '\'' +
                ", bookList=" + bookList +
                '}';
    }

    /**without deep cloning*/
//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }

    /**with deep clonig*/
    @Override
    protected BookShop clone() throws CloneNotSupportedException {
        BookShop bookShop = new BookShop();

            //fetching data to new object from old object(bookShop1 in main method)
            //but we didnt call the loadData method. its cloning from previous object, bookShop1
        for(Book book : this.getBookList()){
            bookShop.getBookList().add(book);
        }
        return bookShop;
    }

}
