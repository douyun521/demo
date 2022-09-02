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
public class FindOperation implements IOperation{

    @Override
    public void work(BookList bookList) {
        System.out.println("查找书籍");
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入书籍的名字:");
        String name=scanner.nextLine();
        for (int i = 0; i < bookList.getUsedSize(); i++) {
            Book book=bookList.getBooks(i);
            if (book.getName().equals(name)){
                System.out.println(book);
                System.out.println("查找成功！");
                return;
            }
        }
        System.out.println("没有你查找的书！");
    }
}
