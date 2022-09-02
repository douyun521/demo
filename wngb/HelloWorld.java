import java.util.*;//导入java.util下所有包*/
public class HelloWorld{
	public static void main(String[] args) {
     Scanner scan=new Scanner(System.in);
	 int count=3;
		 while(count!=0){
			  System.out.println("请输入你的密码："); 
			  String password=scan.nextLine();
			  if(password.equals("123456")){
				System.out.println("密码正确，登陆成功！");
                break;
              }else{
				  count--;
				  System.out.println("你还有"+count+"次机会！");
			  }
         }
	}	 
}