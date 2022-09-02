package ueser;

import book.BookList;
import operation.IOperation;

/**
 * @program: TestBook
 * @description
 * @author: dajitui
 * @create: 2021-02-02 14:08
 **/
public abstract class User {
    protected String name;
    protected IOperation[] operations;
    public User(String name){
        this.name=name;
    }
    public abstract int menu();
    public void doOperation(BookList bookList,int choice){
        this.operations[choice].work(bookList);

    }

}
