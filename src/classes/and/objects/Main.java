package classes.and.objects;

public class Main {
    public static void main(String[] args) {
        try {
            Book bookOne = new Book(
                    "BookOne",
                    new Author("FirstNameOne", "MiddleNameOne", "LastNameOne"),
                    2012
            );
            Book bookTwo = new Book(
                    "BookTwo",
                    new Author("FirstNameTwo", "MiddleNameTwo", "LastNameTwo"),
                    2012
            );
            Book bookFour = new Book(
                    "BookFour",
                    new Author("FirstNameFour", "MiddleNameFour", "LastNameFour"),
                    2012
            );
            Book bookFive = new Book(
                    "BookOne",
                    new Author("FirstNameOne", "MiddleNameOne", "LastNameOne"),
                    2012
            );

            System.out.println(bookOne);

            bookTwo.setPublishYear(2020);
            System.out.println(bookTwo);

            Book bookThree = bookOne;

            System.out.println(bookThree.equals(bookTwo));
            System.out.println(bookThree.equals(bookOne));
            System.out.println(bookThree.equals(bookFour));
            System.out.println(bookThree.equals(bookFive));
        } catch (AuthorNotFilled e) {
            System.out.println("Нельзя создавать книгу без автора...");
        }
    }
}
