import java.util.ArrayList;
import java.util.Date;

interface RMIServer extends java.rmi.Remote {

    //USER
    boolean register(String username, String password) throws java.rmi.RemoteException;
    boolean login(String username, String password) throws java.rmi.RemoteException;
    //AUCTIONS
    boolean create_auction(String owner, long code, String title, String description, Date deadline, int amount) throws java.rmi.RemoteException;
    ArrayList<Auction> search_auction(long code) throws java.rmi.RemoteException;
    Auction detail_auction(int id) throws java.rmi.RemoteException;
    ArrayList<Auction> my_auctions(String name) throws java.rmi.RemoteException;
    boolean bid(int id, int amount) throws java.rmi.RemoteException;
    boolean edit_auction() throws java.rmi.RemoteException;
    boolean message() throws java.rmi.RemoteException;
    ArrayList<String> online_users() throws java.rmi.RemoteException;
    //ADMIN
    boolean cancel_auction(long code) throws java.rmi.RemoteException;
    boolean ban_user(String name) throws java.rmi.RemoteException;
    String stats() throws java.rmi.RemoteException;
    String ping() throws  java.rmi.RemoteException;

}
