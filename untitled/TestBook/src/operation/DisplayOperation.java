package operation;

import book.Book;
import book.BookList;

/**
 * @program: TestBook
 * @description
 * @author: dajitui
 * @create: 2021-02-02 13:55
 **/
public class DisplayOperation implements IOperation {

    @Override
    public void work(BookList bookList) {
        System.out.println("显示所有书籍");
        for (int i = 0; i < bookList.getUsedSize(); i++) {
            Book book=bookList.getBooks(i);
            System.out.println(book);

        }
    }
}
