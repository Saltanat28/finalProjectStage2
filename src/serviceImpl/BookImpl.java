package serviceImpl;

import model.Book;
import service.BookService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookImpl implements BookService {
    private final List<Book> list = new ArrayList<>();


    @Override
    public List<Book> createBooks(List<Book> books) {
        list.addAll(books);

        return this.list;
    }

    @Override
    public List<Book> getAllBooks() {
        return list;
    }

    @Override
    public List<Book> getBooksByGenre(String genre) {

        try {
            System.out.println("Which Gener you will choose?");
            String genre1 = new Scanner(System.in).nextLine();
            if (genre1.isEmpty()) throw new Exception("Gender validation Error!");

            for (Book book : list) {
                if (genre1.equals(getBooksByGenre(genre1))) {
                    return (List<Book>) book;
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Book removeBookById(Long id) {

            System.out.println("Remove book by id: ");
            String idremove = new Scanner(System.in).nextLine();

            return null;


    }

        @Override
        public List<Book> sortBooksByPriceInDescendingOrder () {
            return null;
        }

        @Override
        public List<Book> filterBooksByPublishedYear () {
            return null;
        }

        @Override
        public List<Book> getBookByInitialLetter () {
            return null;
        }

        @Override
        public Book maxPriceBook () {
            return null;
        }
    }

