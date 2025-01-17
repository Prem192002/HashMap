package bank;
public class account{
    int accountno;
    public String name;
    private String password;


    public void setPssword(String pass){
        this.password=pass;
    }

    public String getPassword(){
        return this.password;
    }
}
