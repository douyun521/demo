package operation;

import book.BookList;

/**
 * @program: TestBook
 * @description
 * @author: dajitui
 * @create: 2021-02-02 13:55
 **/
public class ExitOperation implements IOperation {

    @Override
    public void work(BookList bookList) {
        System.out.println("退出系统");
        System.exit(1);
    }
}
