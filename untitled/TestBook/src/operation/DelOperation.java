package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

/**
 * @program: TestBook
 * @description
 * @author: dajitui
 * @create: 2021-02-02 13:54
 **/
public class DelOperation implements IOperation {

    @Override
    public void work(BookList bookList) {
        System.out.println("删除书籍");
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入删除书籍的名字:");
        String name=scanner.nextLine();
        int i = 0;
        for (; i < bookList.getUsedSize(); i++) {
            Book book = bookList.getBooks(i);
            if (book.getName().equals(name)) {
                break;
            }
        }
        if (i==bookList.getUsedSize()){
            System.out.println("没有这本书！");
            return;
        }
        //删除
        for (int pos = i; pos <bookList.getUsedSize()-1 ; pos++) {
            Book book=bookList.getBooks(pos+1);
            bookList.setBooks(pos,book);
        }
        bookList.setUsedSize(bookList.getUsedSize()-1);
        System.out.println("删除成功！");
    }
}
