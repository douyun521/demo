/*class Node{
    public int data;//数据
    public Node next;//后继数据
    public Node prev;//前驱信息
    public Node(int data){
        this.data=data;
    }
}
public  class TestWork {
    public Node head;//标志双向链表的头
    public Node tail;//标志当前双向链表的尾
    //头插法
    public void addFirst(int data) {
        Node node = new Node(data);
        if (this.head == null) {
            this.head = node;
            this.tail = node;
        } else {
            node.next = this.head;
            this.head.prev = node;
            this.head = node;
        }
    }

    //打印双向链表
    public void display() {
        Node cur = this.head;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    //尾插法
    public void addLast(int data) {
        Node node = new Node(data);
        if (this.head == null) {
            this.head = node;
            this.tail = node;
        } else {
            this.tail.next = node;
            node.prev = this.tail;
            this.tail = node;
        }
    }

    //查找是否包含关键字key是否在双向链表当中
    public boolean contains(int key) {
        Node cur = this.head;
        while (cur != null) {
            if (cur.data == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    //得到双向链表的长度
    public int size() {
        int count = 0;
        Node cur = this.head;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }
    private void checkIndex(int index) {
        if (index < 0 || index > size()) {
            throw new RuntimeException("index不合法");
        }
    }
    private Node searchIndex(int index) {
        Node cur = this.head;
        while (index != 0) {
            cur = cur.next;
            index--;
        }
        return cur;
    }

    //任意位置插入，第一份数据节点为0号下标
    public void addIndex(int index, int data) {
        checkIndex(index);
        if (index == 0) {
            addFirst(data);
            return;
        }
        if (index == size()) {
            addLast(data);
            return;
        }
        Node cur = searchIndex(index);
        Node node = new Node(data);
        node.next = cur;
        node.prev = cur.prev;
        cur.prev.next = node;
        cur.prev = node;
    }
    //删除第一次出现关键字为key的节点
    public int remove(int key) {
        Node cur = this.head;
        while (cur != null) {
            if (cur.data == key) {
                int oldData = cur.data;
                if (cur == this.head) {
                    this.head = this.head.next;
                    this.head.prev = null;
                } else {
                    cur.prev.next = cur.next;
                    if (cur.next != null) {
                        cur.next.prev = cur.prev;
                    } else {
                        //删除的是尾巴节点 只需要移动tail
                        this.tail = cur.prev;
                    }
                }
                return oldData;
            }
            cur = cur.next;
        }
        return -1;
    }
    //删除所有值为key的节点
    public void removeAllKey(int key) {
        Node cur = this.head;
        while (cur != null) {
            if (cur.data == key) {
                int oldData = cur.data;
                if (cur == this.head) {
                    this.head = this.head.next;
                    if (this.head != null) {
                        this.head.prev = null;
                    }
                } else {
                    cur.prev.next = cur.next;
                    if (cur.next != null) {
                        cur.next.prev = cur.prev;
                    } else {
                        //删除的是尾巴节点 只需要移动tail
                        this.tail = cur.prev;
                    }
                }
            }
            cur = cur.next;
        }
    }
    //清除（一个一个节点进行释放）
    public void clear(){
        while (this.head!=null){
            Node cur=this.head.next;
            this.head.prev=null;
            this.head.next=null;
            this.head=cur;
        }
        this.tail=null;
    }

    public static void main(String[] args) {
        TestWork testWork=new TestWork();
        testWork.addFirst(1);
        testWork.addFirst(2);
        testWork.addLast(3);
        testWork.addLast(4);
        testWork.addLast(4);
        testWork.display();
        System.out.println(testWork.size());
        System.out.println(testWork.contains(4));
        testWork.addIndex(3,7);
        testWork.display();
        testWork.remove(7);
        testWork.display();
        testWork.removeAllKey(4);
        testWork.display();
    }
}
/*class Node {
    public int data;//0
    public Node next;//null

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class TestWork {
    public Node head;//保存单链表头节点的引用
    //头插法
    public void addFirst(int data) {
        Node node = new Node(data);
        if (this.head == null) {//第一次插入节点
            this.head = node;
            return;
        }
        node.next = this.head;
        this.head = node;
    }
    //打印单链表
    public void display(){
        Node cur = this.head;
        while (cur!=null){
            System.out.print(cur.data+" ");
            cur=cur.next;
        }
        System.out.println();
    }
    //尾插法
    public void addLast(int data){
        Node node = new Node(data);
        if (this.head==null){
            this.head=node;
            return;
        }
        Node cur=this.head;
        while (cur.next!=null){
            cur=cur.next;
        }
        cur.next=node;
    }
    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key){
        Node cur=this.head;
        while (cur!=null){
            if (cur.data==key){
                return true;
            }
            cur=cur.next;
        }
        return false;
    }
    //得到单链表的长度
    public int size(){
        int count=0;
        Node cur=this.head;
        while (cur!=null){
            count++;
            cur=cur.next;
        }
        return count;

    }
    //任意位置插入，第一份数据节点为0号下标
    public void addIndex(int index,int data){
        if (index == 0) {//头插法
            addFirst(data);
            return;
        }
            if (index==this.size()){//尾插法
                addLast(data);
                return;
            }
            Node node = new Node(data);
            //先找到 index位置的前一个节点的地址
            Node cur=searchIndex(index);
            //进行插入
            node.next=cur.next;
            cur.next=node;
    }
    public Node searchIndex(int index){
        //对index进行合法性检查
        if (index<0||index>this.size()){
            throw new RuntimeException("index位置不合法");
        }
        Node cur=this.head;//index-1
        while (index-1!=0){
            cur=cur.next;
            index--;
        }
        return cur;
    }
    //查找前驱
    private Node searchPrev(int key){
        Node prev=this.head;
        while (prev.next!=null){
            if (prev.next.data==key){
                return prev;
            }else {
                prev=prev.next;
            }
        }
        return null;
    }
    //删除第一次出现关键字为key的节点
    public void remove(int key){
        if (this.head==null){
            return;
        }
        //删除的是不是节点
        if (this.head.data==key){
            this.head=this.head.next;
            return;
        }
        //找到删除节点的前驱
        Node prev=searchPrev(key);
        if (prev==null){
            System.out.print("根本没有这个节点！");
            return;
        }
        //开始删除
        Node del=prev.next;
        prev.next=del.next;
    }
    //删除所有值为key的节点
    public void removeAllKey(int key){
        Node prev=this.head;
        Node cur=this.head.next;
        while (cur!=null){
            if (cur.data==key){
                prev.next=cur.next;
                cur=cur.next;
            }else {
                prev=cur;
                cur=cur.next;
            }
        }
        if (this.head.data==key){
            this.head=this.head.next;
        }
    }
    //clear释放内存
    public void clear(){
        this.head=null;
    }
    public static void main(String[] args) {
        TestWork testWork=new TestWork();
        testWork.addFirst(10);
        testWork.addFirst(11);
        testWork.addFirst(11);
        testWork.addFirst(20);
        testWork.addLast(30);
        testWork.addLast(11);
        testWork.display();
        System.out.println(testWork.contains(15));
        System.out.println(testWork.size());
        testWork.addIndex(1,40);
        testWork.display();
        System.out.println("删除开始:");
        testWork.remove(40);
        testWork.display();
        testWork.removeAllKey(11);
        testWork.display();
    }
}
/*import java.util.Arrays;
public class TestWork {
    public int[] elem;//数组
    public int usedSize;//有效的数据个数
    public static final int capacity=10;//初始容量
    public TestWork(){
        this.elem=new int[capacity];
        this.usedSize=0;
    }
    //判满
    private boolean isFull(){
        if(this.usedSize==this.elem.length){
            return  true;
        }
        return  false;
    }
    private void checkPos(int pos){
        if(pos<0||pos>this.usedSize){
            throw new RuntimeException("pos位置不合法");
        }
    }
    //在pos位置新增元素
    public void add(int pos,int data) {
        //数组扩大2倍
        checkPos(pos);
        if (isFull()){
            this.elem=
                    Arrays.copyOf(this.elem,2*this.elem.length);
        }
        //移数据了
        for (int i = this.usedSize-1; i >=pos ; i--) {
            this.elem[i+1]=this.elem[i];
        }
        this.elem[pos]=data;
        this.usedSize++;
    }
    //打印顺序表
    public void display(){
        for (int i = 0; i < this.usedSize; i++) {
            System.out.print(this.elem[i]+" ");
        }
        System.out.println();
    }
    //判定是否包含某个元素
    public boolean contains(int toFind){
        for (int i = 0; i < this.usedSize; i++) {
            if(this.elem[i]==toFind){
                return  true;
            }
        }
        return false;
    }
    //查找某个元素对应的位置
    public int search(int toFind){
        for (int i = 0; i < this.usedSize; i++) {
            if(this.elem[i]==toFind){
                return i;
            }
        }
        return -1;
    }
    private  boolean isEmpty(){
        return  this.usedSize==0;
    }
    //获取pos位置的元素
    public int getPos(int pos){
        if(isEmpty()){
            throw new RuntimeException("顺序表为空");
        }
        checkPos(pos);
        return this.elem[pos];
    }
    //获取顺序表长度
    public int size(){
        return this.usedSize;
    }
    //删除第一次出现的关键字key
    public void remove(int toRemove){
        int index=search(toRemove);
        if(index==-1){
            System.out.println("没有需要删除的数字！");
            return;
        }
        for (int i = index; i <this.usedSize-1; i++) {
            this.elem[i]=this.elem[i+1];
        }
        this.usedSize--;
    }
    //清空顺序表
    public void clear(){
        this.usedSize=0;
    }
    //pos位置的值置为value==更新
    public void setPos(int pos,int value){
        checkPos(pos);
        this.elem[pos]=value;
    }

    public static void main(String[] args) {
        TestWork testWork=new TestWork();
        for (int i = 0; i < 10; i++) {
            testWork.add(i,i);
        }
        System.out.println(testWork.isFull());
        testWork.display();
        testWork.add(10,12);
        testWork.display();
        System.out.println(testWork.search(5));
        System.out.println(testWork.contains(15));
        System.out.println(testWork.getPos(8));
        System.out.println(testWork.size());
        testWork.remove(0);
        testWork.display();
        System.out.println("clear()");
        //testWork.clear();
        //testWork.display();
        testWork.setPos(8,56);
        testWork.display();
    }
}
/*class Student {
    private String name;
    private int age;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int ege) {
        this.age = ege;
    }
    @Override
    public String toString() {
        return "Student{" + "name='" + name +
                '\'' + ", age=" + age + '}';
    }
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("douyun");
        String str = student.getName();
        student.setAge(18);
        int a=student.getAge();
        System.out.println(str);
        System.out.println(a);
        System.out.println(student);
    }
}*/
/*class Person {
    public int age=18;//成员属性-字段
    public String name="douyun";
    public void eat() {//成员方法-行为
        System.out.println("eat()!");
    }
    public void show(){//方法
        System.out.println("我叫"+name+"今年"+age+"岁了");
    }
    public static int size=2;//静态成员变量
        public static void main(String[] args) {
            Person per = new Person();
            System.out.println(per.age);
            System.out.println(per.name);//对象的引用.成员变量
            System.out.println(Person.size);//类名.静态成员变量
            per.eat();
            per.show();
        }
}


/*public class TestWork {
    public static void main(String[] args) {
        int[] array={1,2,4,1,4};
        int ret=0;
        for (int i = 0; i < array.length; i++) {
            ret^=array[i];
        }
        System.out.println(ret);
    }
}
/*import java.util.Arrays;
import java.util.Scanner;
public class TestWork {
    public static void move(char pos1,char pos2) {
        System.out.print(pos1+" -> "+pos2+"");
    }
    public static void hanoi(int n,char pos1,char pos2,char pos3){
        if(n==1) {//n盘子个数，pos1起始位置，pos2中途位置，pos3目的地位置//
            move(pos1,pos3);
        }else{
            hanoi(n-1,pos1,pos3,pos2);
            move(pos1,pos3);
            hanoi(n-1,pos2,pos1,pos3);
        }
    }
public class TestWork {
    public static void main2(String[] args) {
        int[] array={1,2,3,4};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }//for循环
        System.out.println();
        for (int val:array) {
            System.out.print(val+" ");
        }//foreach
    }*/
