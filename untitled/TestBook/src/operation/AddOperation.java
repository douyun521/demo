package operation;
import book.Book;
import book.BookList;

import java.util.Scanner;

/**
 * @program: TestBook
 * @description 新增图书
 * @author: dajitui
 * @create: 2021-02-02 13:52
 **/
public class AddOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("新增书籍");
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入书籍的名字:");
        String name=scanner.nextLine();
        System.out.println("请输入书籍的作者:");
        String author=scanner.nextLine();
        System.out.println("请输入书籍的价格:");
        int price=scanner.nextInt();
        System.out.println("请输入书籍的类型:");
        String type=scanner.next();

        Book book=new Book(name,author,price,type);
        int curSize=bookList.getUsedSize();
        bookList.setBooks(curSize,book);
        bookList.setUsedSize(curSize+1);;
        System.out.println("新增成功！");


    }
}
