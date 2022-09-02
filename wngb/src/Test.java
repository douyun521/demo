import java.io.Console;
import java.util.*;
/*
 * @program: wngb
 * @description
 * @author: dajitui
 * @create: 2021-01-09 20:39
 *
 public class Test {
    public static void main(String[] args) {
        try {
            throw new AccessViolationException();
            Console.WriteLine("error1");
        } catch (Exception e) {
            Console.WriteLine("error2");
        } catch (AccessViolationException e) {
            e.printStackTrace();
        }
        Console.WriteLine("error3");
    }
}*/

public class Test<T>{
    public T[] elem;
    public int usedSize;
    public Test(){
        this.elem=(T[])new Object[10];
        this.usedSize=0;
    }
    public void add(T val){
        this.elem[this.usedSize]=val;
        this.usedSize++;
    }
    public T getVal( int pos){
        return this.elem[pos];
    }
}
/*public class Test {
    public static void main(String[] args) {
      MyArrayList<Integer>myArrayList=new MyArrayList<>();
      myArrayList.add(2);
      myArrayList.add(3);
      int val=myArrayList.getVal(1);
      System.out.println(val);
      MyArrayList<String>myArrayList2=new MyArrayList<>();
      myArrayList2.add("hello");
    }
}

/*public class Test {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
        String str=scanner.nextLine();
        StringBuffer sb=new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            String tmp=sb.toString();
            if (!tmp.contains(ch+"")) {
                sb.append(ch);
            }
        }
        System.out.println(sb);
        }
    }
}
/*public class Test {
    public static void main(String[] args) {
        Integer a=100;
        Integer b=100;
        Integer c=200;
        Integer d=200;//i>=-128 & i<=127
        System.out.println(a==b);
        System.out.println(c==d);

    }
    public static void main2(String[] args) {
        Integer a=10;//自动装箱
        int b=a;//自动拆箱
    }
    public static void main1(String[] args) {
        int i=10;//手动装箱
        //装箱操作，新建一个integer类型对象，将i的值放入对象的某个属性中
        Integer ii=Integer.valueOf(i);
        Integer ij=new Integer(i);
        //拆箱操作，将integer对象中的值取出，放入一个基本数据类型中
        int j=ii.intValue();
    }
}
/*public class Test {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put("国民女神","高圆圆");//(k,v)
        map.put("国民老公","王思聪");
        map.put("美女","豆豆");
        System.out.println(map);
        String c=map.get("美女");
        System.out.println(c);
        String s=map.getOrDefault("美女呀","豆芽");
        System.out.println(s);
        System.out.println(map.containsKey("国民老公"));
        System.out.println(map.containsValue("豆芽"));
        System.out.println("===============");
        Set<Map.Entry<String,String>> set=map.entrySet();
        for (Map.Entry<String,String>entry:set) {
            System.out.println(entry.getKey()+ "=>" +entry.getValue());
        }
    }
}
/*public class Test {
     public static void main(String[]args){
         Collection<String>collection=new ArrayList<>();
         collection.add("bit");
         collection.add("java");
         collection.add("张三");
         collection.add("李四");
         collection.add("javac");
         System.out.println(collection);
         System.out.println("==========");
         for (String s:collection) {
             System.out.println(s);
         }
         System.out.println(collection.isEmpty());
         collection.remove("java");
         System.out.println(collection);
         System.out.println(collection.size());
         Object[] objects=collection.toArray();
         System.out.println(Arrays.toString(objects));
         collection.clear();
         System.out.println(collection);
     }
}
/*import java.util.*;
public interface Test {
    public  static  int maxThreeNum(int num1,int num2,int num3){
        return maxNum(maxNum(num1,num2),num3);
        int max=maxNum(num1,num2);
        return maxNum(max,num3);
    }

    static int maxNum(int max, int num3) {
        return max>num3?max:num3;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n1=scanner.nextInt();
        int n2=scanner.nextInt();
        int n3=scanner.nextInt();
        System.out.println(maxThreeNum(n1,n2,n3));



    }
}
  /*public class Test {
      public static void main1(String[] args) {
          Scanner scanner=new Scanner(System.in);
          int n=scanner.nextInt();
          int num=1;
          int sum=0;
        while(num<=5){
            int i=1;
            int ret=1;
            while (i<=num){
                ret*=i;
                i++;
            }
            sum+=ret;
            num++;
        }
        System.out.println(sum);
      }
}*/
/*public  class Test{
      public  static  int sum(int a,int b);{
          return a+b;
      }
      public  static  double sum(int a,int b);{
          return a+b;

    }
    public static void main(String[] args) {
          int a=10;
          int b=20;
        System.out.println(sum(a,b));

    }
}/*public class Test {
    public static int JumpFloor(int target){
        if(target==1) {
            return 1;
        }else if(target==2){
            return  2;
        }else {
            return JumpFloor(target-1)+JumpFloor(target-2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n1=scanner.nextInt();
        int ret=JumpFloor(n1);
        System.out.println(ret);
    }
}*/
