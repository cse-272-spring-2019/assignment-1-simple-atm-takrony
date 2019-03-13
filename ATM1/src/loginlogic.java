import java.util.HashMap;

public class loginlogic {

    HashMap userDict;


    public loginlogic() {
        userDict = new HashMap();
        userDict.put("1111", "0000");
        userDict.put("1235", "1111");
        userDict.put("1254", "2222");
    }

    public boolean valid(String cardNumber, String password) {
        boolean validate = false;
        String fetchpassword = (String) userDict.get(cardNumber);
        if (fetchpassword != null) {
            validate = fetchpassword.equals(password);
        }
        return validate;
    }

    private int balance;
    String[]a= new String[15];
    int i=0;

    public void bal(){
      a[i]="Balance: "+balance;
      i++;
    }


public void withdraw(int x){

      balance= balance-x;
      a[i]="Withdraw"+x;
      i++;

}

    public int getI() {
        return i;
    }

    public void deposit(int x) {
        balance = balance + x;
        a[i]="Deposit"+x;
        i++;
    }

    public int getBalance() {
        return balance;
    }
    
    public int minimize() {
        i--;
        return i;
    }

    public int add() {
        i++;
        return i;
    }

    public String[] getA() {
        return a;
    }
}
