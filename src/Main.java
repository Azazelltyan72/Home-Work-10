public class Main {

    public static void main(String[] args) {
        Author authorName1 = new Author("Haruko", "Ichikawa");
        Author authorName2 = new Author("Tite", "Kubo");
        Book bookTitle1 = new Book("Land of the lustrous", 2012, authorName1);
        Book bookTitle2 = new Book("BLEACH", 2001, authorName2);
        System.out.println(bookTitle1);
        bookTitle1.setPublishingYear(2022);
        System.out.println("Latest publication year: " + bookTitle1.getPublishingYear() + ".");
        System.out.println(bookTitle2);
        bookTitle2.setPublishingYear(2016);
        System.out.println("Latest publication year: " + bookTitle2.getPublishingYear() + ".");
    }
}
