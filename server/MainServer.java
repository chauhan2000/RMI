import java.rmi.*;
public class MainServer{
public static void main(String args[]){
try{
RemoteInterface st=new RIImplement();
RemoteInterface sq=new RIImplement();
RemoteInterface sw=new RIImplement();
RemoteInterface se=new RIImplement();
Naming.rebind("rmi://localhost:1021/add",st);
Naming.rebind("rmi://localhost:1022/sub",sq);
Naming.rebind("rmi://localhost:1023/div",sw);
Naming.rebind("rmi://localhost:1024/mul",se);
System.out.print("Server is ready");
}
catch(Exception e){
System.out.println("Server not ready ..");
}
}
}