import java.rmi.*;
public interface RemoteInterface extends Remote{
public int add(int x, int y) throws RemoteException;
public int sub(int x, int y) throws RemoteException;
public int div(int x, int y) throws RemoteException;
public int mul(int x, int y) throws RemoteException;
}