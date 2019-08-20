import java.rmi.*;
import java.util.*;
public class MainClient{
	private static Scanner scan;
	
public static void main(String args[]){
try{
RemoteInterface st=(RemoteInterface)Naming.lookup("rmi://localhost:1021/add");
RemoteInterface sq=(RemoteInterface)Naming.lookup("rmi://localhost:1022/add");
RemoteInterface sw=(RemoteInterface)Naming.lookup("rmi://localhost:1023/add");
RemoteInterface se=(RemoteInterface)Naming.lookup("rmi://localhost:1024/add");
Scanner sc=new Scanner(System.in);
int x;
int y;
System.out.print("Enter two values for addition:");
x=sc.nextInt();
y=sc.nextInt();
System.out.print("The sum of "+x+"&"+y+"is:"+st.add(x,y));
System.out.print("The sub of "+x+"&"+y+"is:"+sq.sub(x,y));
System.out.print("The div of "+x+"&"+y+"is:"+sw.div(x,y));
System.out.print("The mul of "+x+"&"+y+"is:"+se.mul(x,y));
}
catch(Exception e){
System.out.print(e);
}
}
}