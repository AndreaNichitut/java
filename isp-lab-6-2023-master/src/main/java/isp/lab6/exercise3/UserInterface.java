package isp.lab6.exercise3;

public class UserInterface {
    private LoginSystem loginSyst;
    private OnlineStore store;

    public UserInterface(LoginSystem loginSyst, OnlineStore store) {
        this.loginSyst = loginSyst;
        this.store = store;
    }

    public void loadInterface() {
     LoginSystem loginSystem=new LoginSystem();
     OnlineStore onlineStore=new OnlineStore();
     Product product1=new Product("book",32);

     store.addToCart("a",product1,1);

     UserInterface userInterface=new UserInterface(loginSystem,onlineStore);
    }
}
