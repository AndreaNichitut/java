package isp.lab6.exercise3;
import java.util.Set;

public class LoginSystem {
    private Set<User> users;
    private OnlineStore store;

    public void register(String username, String password) {
      for(User user:users) {
          if(user.getUsername().equals(username)) {
              System.out.println("User already exists");
              return;
          }
      }
      User newuser=new User(username,password);
      users.add(newuser);
    }
    public boolean login(String username, String password) {
      for(User user:users) {
          if(user.getUsername().equals(username)) {
              if(user.getPassword().equals(password)) {
                  return true;
              }
              else
              {
                  System.out.println("Wrong password");
                  return false;
              }
          }
      }
      return false;
    }
    public boolean logout(String username) {
       for(User user:users) {
           if(user.getUsername().equals(username)) {
               return true;
           }
       }
       System.out.println("User not found");
       return false;
    }
}
