public class Main {
    public static void main(String[] args) {
        Article article = new Article(1, "My Article");
        article.setContent("Welcome to Java");    //first content
        System.out.println(article);

        ArticleMemento memento = article.createMemento();   //created immutable memento

        article.setContent("Java basics");      //changed content
        System.out.println(article);

        article.restore(memento);       //UNDO change
        System.out.println(article);    //first content
    }
}