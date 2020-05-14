public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        BookShop bookShop1 = new BookShop();
        bookShop1.setShopName("Shop1");
        bookShop1.loadBookData();
            System.out.println(bookShop1);
            System.out.println();

        /***here, withot loading the book data again, we have to clone that data from bookShop1.
         * use this code for doing that. but if you make any changes to bookShop1, it will affect bookShop2.
         * to avoid this, deepCloning is used.
         */
//        BookShop bookShop2 = (BookShop)bookShop1.clone();
//          //making changes to bookShop1
//        bookShop1.getBookList().remove(2);
//        bookShop2.setShopName("Shop2");
//          //in both bookShops the book3 will be removed.
//        System.out.println(bookShop1);
//        System.out.println(bookShop2);


    /**deep cloning*/
        BookShop bookShop2 = (BookShop)bookShop1.clone();
        bookShop2.setShopName("Shop2");
            //making changes to bookShop1
        bookShop1.getBookList().remove(2);
            //in both bookShops the book3 will be removed.
        System.out.println(bookShop1);
        System.out.println(bookShop2);

}

}
