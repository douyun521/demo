package ueser;

import operation.*;

import java.util.Scanner;

/**
 * @program: TestBook
 * @description
 * @author: dajitui
 * @create: 2021-02-02 14:09
 **/
public class NormalUser extends User{
    public NormalUser(String name) {
        super(name);
        this.operations=new IOperation[]{
                new ExitOperation(),
                new FindOperation(),
                new BorrowOperation(),
                new ReturnOperation()
        };
    }

    @Override
    public int menu() {
        System.out.println("==================");
        System.out.println("hello"+ this.name + "欢迎来到图书系统");
        System.out.println("1.查找书籍");
        System.out.println("2.借阅书籍");
        System.out.println("3.归还书籍");
        System.out.println("0.退出系统");
        System.out.println("==================");
        Scanner scanner=new Scanner(System.in);
        int choice=scanner.nextInt();
        return choice;

    }
}
