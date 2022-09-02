package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

/**
 * @program: TestBook
 * @description
 * @author: dajitui
 * @create: 2021-02-02 13:56
 **/
public class ReturnOperation implements IOperation{

    @Override
    public void work(BookList bookList) {
        System.out.println("归还书籍");
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入书籍的名字:");
        String name=scanner.nextLine();
        for (int i = 0; i < bookList.getUsedSize(); i++) {
            Book book=bookList.getBooks(i);
            if (book.getName().equals(name)) {
                book.setBorrowed(false);
                System.out.println("归还成功！");
                return;
            }
        }
        System.out.println("没有你要归还的书籍！");
    }
}
