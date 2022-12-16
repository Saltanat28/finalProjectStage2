import enums.Gender;
import enums.Genre;
import enums.Language;
import model.Book;
import model.User;
import serviceImpl.BookImpl;
import serviceImpl.UserImpl;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Бардык Id лер уникальный болуш керек. Эгер уникальный болбосо озубуз тузгон UniqueConstraintException класс ыргытсын.
        // User дин email адресси уникальный болуш керек жана @ болуусу керек. Эгер уникальный болбосо UniqueConstraintException класс,
        // @ болбосо озубуз тузгон BadRequestException класс ыргытсын.
        // User дин телефон номери +996 дан башталып 13 символдон турсун. Болбосо BadRequestException класс ыргытсын.
        // Китептин баасы терс сан болбошу керек. Болбосо NegativeNumberException ыргытсын.
        // Китептин чыккан жылы келечек убакыт болбошу керек.Болбосо DateTimeException ыргытсын.
        // Китептин автору бош болбошу керек. Болбосо EmptyStackException ыргытсын.
        BookImpl book = new BookImpl();
        UserImpl user = new UserImpl();
        System.out.println(book.createBooks(list));
        System.out.println(book.getAllBooks());
        System.out.println(book.getBooksByGenre());
        System.out.println(book.removeBookById());
        List<Book> list = new ArrayList<>(Arrays.asList(
                new Book(1L, "Poliana", Genre.HISTORICAL, BigDecimal.TEN,
                        "E.POrter", Language.ENGLISH, LocalDate.ofYearDay(2015 ,15)),
                new Book(2L, "Zhamila",Genre.ROMANCE,BigDecimal.TEN,
                        "Ch.Ayitmatov",Language.KYRGYZ,LocalDate.ofYearDay(1995,10)),
                new Book(3L, "Kamila",Genre.ROMANCE, BigDecimal.TEN,
                        "K.Akyiev", Language.KYRGYZ,LocalDate.ofYearDay(2000,4)),
                new Book(4L, "Ak keme", Genre.HISTORICAL,BigDecimal.TEN,
                        "Ch.Aytmatov", Language.KYRGYZ,LocalDate.ofYearDay(1998,9)),
                 new Book(4L, "Asia Aristandary", Genre.HISTORICAL,BigDecimal.TEN,
                "N. Kadyrbekov", Language.KYRGYZ,LocalDate.ofYearDay(2019,4))

        ));


        List<User> list1 = new ArrayList<>(Arrays.asList(
                new User(9L, "Saltanat","Neamtilla kyzy","saltanat@mail.com",
                        "+996221707014", Gender.FEMALE, BigDecimal.TEN,List<Book> list),
                new User(11L, "KANYKEY", "Aakarbekova","kanu@gmail.com",
                        "+996 700 700 700", Gender.FEMALE, BigDecimal.TEN,List<Book>  list)

        ));

    }
}