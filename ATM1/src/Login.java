import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.awt.*;

public class Login extends Application {
    Scene  scene1;
    Scene scene2;
    Scene scene3;
    Scene scene4;
    Scene scene5;
    Stage window1;
    loginlogic back = new loginlogic();
    String[]k= back.getA();
    int p;
    public static  void main(String[] args) {
        launch (args);

    }

    @Override
    public  void start(Stage primaryStage) throws Exception {
        window1 = primaryStage;

        window1.setTitle("ATM");

        //variables
        Label welcome = new Label( "Welcome");
        Label cardNumber = new Label("Card number");
        TextField cardNumberField = new TextField();
        Button next = new Button("Next");
        Button n1 = new Button("1");
        Button n2 = new Button("2");
        Button n3 = new Button("3");
        Button n4 = new Button("4");
        Button n5 = new Button("5");
        Button n6 = new Button("6");
        Button n7 = new Button("7");
        Button n8 = new Button("8");
        Button n9 = new Button("9");
        Button n0 = new Button("0");
        Button clear = new Button("clear all");

        //layout
        GridPane grid = new GridPane();
        grid.add(welcome,1,0);
        grid.add(cardNumber,0,1);
        grid.add(cardNumberField,1,1);
        grid.add(next,2,1);
        grid.add(n1,0,5);
        grid.add(n2,1,5);
        grid.add(n3,2,5);
        grid.add(n4,0,6);
        grid.add(n5,1,6);
        grid.add(n6,2,6);
        grid.add(n7,0,7);
        grid.add(n8,1,7);
        grid.add(n9,2,7);
        grid.add(n0,1,8);
        grid.add(clear,2,8);


         scene1 = new Scene(grid,400,200);


        //variables
        Label password = new Label("Password     ");
       PasswordField passwordfield = new PasswordField();
        Button per = new Button("per");
        Button log = new Button("Login");
        Label error = new Label();
        Button b1 = new Button("1");
        Button b2 = new Button("2");
        Button b3 = new Button("3");
        Button b4 = new Button("4");
        Button b5 = new Button("5");
        Button b6 = new Button("6");
        Button b7 = new Button("7");
        Button b8 = new Button("8");
        Button b9 = new Button("9");
        Button b0 = new Button("0");
        Button clear1 = new Button("clear all");

         //layout
        GridPane grid1 = new GridPane();
        grid1.add(password,0,1);
        grid1.add(passwordfield,1,1);
        grid1.add(per,2,1);
        grid1.add(log,3,1);
        grid1.add(b1,0,5);
        grid1.add(b2,1,5);
        grid1.add(b3,2,5);
        grid1.add(b4,0,6);
        grid1.add(b5,1,6);
        grid1.add(b6,2,6);
        grid1.add(b7,0,7);
        grid1.add(b8,1,7);
        grid1.add(b9,2,7);
        grid1.add(b0,1,8);
        grid1.add(clear1,2,8);
        grid1.add(error,3,2);


        scene2 = new Scene(grid1,600,200);

        //variables
        Label home = new Label("Home");
        Button withdraw = new Button ("Withdraw");
        Button deposit = new Button ("Deposit");
        Button balance = new Button ("Balance inquiry");
        Label balanceAppear = new Label();
        Button backToLogin = new Button("Back to login ");
        Button nexthis = new Button("Next");
        Button perhis = new Button("pre");
        Label showHis = new Label();

        //layout
        GridPane grid2 = new GridPane();
        grid2.add(home,1,0);
        grid2.add(withdraw,0,1);
        grid2.add(deposit,1,1);
        grid2.add(balance,0,2);
        grid2.add(balanceAppear,1,2);
        grid2.add(nexthis,0,3);
        grid2.add(showHis,1,3);
        grid2.add(perhis,3,3);
        grid2.add(backToLogin,0,4);

        scene3 = new Scene(grid2,600,200);



        //variables
        Label depositAmount = new Label("Deposit Amount");
        TextField dm = new TextField();
        Label rty = new Label();
        Button done = new Button("Done");
        Button backkk = new Button("back");
        Button m1 = new Button("1");
        Button m2 = new Button("2");
        Button m3 = new Button("3");
        Button m4 = new Button("4");
        Button m5 = new Button("5");
        Button m6 = new Button("6");
        Button m7 = new Button("7");
        Button m8 = new Button("8");
        Button m9 = new Button("9");
        Button m0 = new Button("0");
        Button clear2 = new Button("clear all");


//layout
        GridPane grid3 = new GridPane();
        grid3.add(depositAmount,0,0);
        grid3.add(dm,1,0);
        grid3.add(rty,1,2);
        grid3.add(done,2,0);
        grid3.add(backkk,0,2);
        grid3.add(m1,0,5);
        grid3.add(m2,1,5);
        grid3.add(m3,2,5);
        grid3.add(m4,0,6);
        grid3.add(m5,1,6);
        grid3.add(m6,2,6);
        grid3.add(m7,0,7);
        grid3.add(m8,1,7);
        grid3.add(m9,2,7);
        grid3.add(m0,1,8);
        grid3.add(clear2,2,8);


        scene4 = new Scene(grid3,500, 200);

//variables
        Label withdrawamount = new Label ("Withdraw Amount");
        TextField wdm = new TextField();
        Label empty = new Label();
        Button done1 = new Button("Done");
        Button backk = new Button("back");
        Button c1 = new Button("1");
        Button c2 = new Button("2");
        Button c3 = new Button("3");
        Button c4 = new Button("4");
        Button c5 = new Button("5");
        Button c6 = new Button("6");
        Button c7 = new Button("7");
        Button c8 = new Button("8");
        Button c9 = new Button("9");
        Button c0 = new Button("0");
        Button clear3 = new Button("clear all");

        //layout
        GridPane grid4 = new GridPane();
        grid4.add(withdrawamount,0,0);
        grid4.add(wdm,1,0);
        grid4.add(empty,1,2);
        grid4.add(done1,2,0);
        grid4.add(backk,0,2);
        grid4.add(c1,0,5);
        grid4.add(c2,1,5);
        grid4.add(c3,2,5);
        grid4.add(c4,0,6);
        grid4.add(c5,1,6);
        grid4.add(c6,2,6);
        grid4.add(c7,0,7);
        grid4.add(c8,1,7);
        grid4.add(c9,2,7);
        grid4.add(c0,1,8);
        grid4.add(clear3,2,8);


        scene5 = new Scene(grid4,500,200);


//actions

        per.setOnAction(e->{window1.setScene(scene1);
            cardNumberField.setText("");
            error.setText(null);
        });
        next.setOnAction(e -> {
            window1.setScene(scene2);
            passwordfield.setText("");
        });
        backToLogin.setOnAction(event ->{window1.setScene(scene1);
        cardNumberField.setText("");
        passwordfield.setText("");
        balanceAppear.setText(null);
        showHis.setText("");

        });
        deposit.setOnAction(event -> window1.setScene(scene4));
        withdraw.setOnAction(event -> window1.setScene(scene5));
        backk.setOnAction(event -> { window1.setScene(scene3);
        wdm.setText("");
        balanceAppear.setText(null);
        empty.setText(null);
        });
        backkk.setOnAction(event -> { window1.setScene(scene3);
        dm.setText("");
        balanceAppear.setText(null);
        rty.setText("");

        });
        balance.setOnAction(event -> {
            int ll = back.getBalance();
            String jll = Integer.toString(ll);
            balanceAppear.setText(jll);
            back.bal();

        });

        n1.setOnAction(event -> cardNumberField.setText(cardNumberField.getText()+"1"));
        n2.setOnAction(event -> cardNumberField.setText(cardNumberField.getText()+"2"));
        n3.setOnAction(event -> cardNumberField.setText(cardNumberField.getText()+"3"));
        n4.setOnAction(event -> cardNumberField.setText(cardNumberField.getText()+"4"));
        n5.setOnAction(event -> cardNumberField.setText(cardNumberField.getText()+"5"));
        n6.setOnAction(event -> cardNumberField.setText(cardNumberField.getText()+"6"));
        n7.setOnAction(event -> cardNumberField.setText(cardNumberField.getText()+"7"));
        n8.setOnAction(event -> cardNumberField.setText(cardNumberField.getText()+"8"));
        n9.setOnAction(event -> cardNumberField.setText(cardNumberField.getText()+"9"));
        n0.setOnAction(event -> cardNumberField.setText(cardNumberField.getText()+"0"));
        clear.setOnAction(event ->  cardNumberField.setText(""));



        b1.setOnAction(event -> passwordfield.setText(passwordfield.getText()+"1"));
        b2.setOnAction(event -> passwordfield.setText(passwordfield.getText()+"2"));
        b3.setOnAction(event -> passwordfield.setText(passwordfield.getText()+"3"));
        b4.setOnAction(event -> passwordfield.setText(passwordfield.getText()+"4"));
        b5.setOnAction(event -> passwordfield.setText(passwordfield.getText()+"5"));
        b6.setOnAction(event -> passwordfield.setText(passwordfield.getText()+"6"));
        b7.setOnAction(event -> passwordfield.setText(passwordfield.getText()+"7"));
        b8.setOnAction(event -> passwordfield.setText(passwordfield.getText()+"8"));
        b9.setOnAction(event -> passwordfield.setText(passwordfield.getText()+"9"));
        b0.setOnAction(event -> passwordfield.setText(passwordfield.getText()+"0"));
        clear1.setOnAction(event -> {
            passwordfield.setText("");
            error.setText(null);
        });



        m1.setOnAction(event -> dm.setText(dm.getText()+"1"));
        m2.setOnAction(event -> dm.setText(dm.getText()+"2"));
        m3.setOnAction(event -> dm.setText(dm.getText()+"3"));
        m4.setOnAction(event -> dm.setText(dm.getText()+"4"));
        m5.setOnAction(event -> dm.setText(dm.getText()+"5"));
        m6.setOnAction(event -> dm.setText(dm.getText()+"6"));
        m7.setOnAction(event -> dm.setText(dm.getText()+"7"));
        m8.setOnAction(event -> dm.setText(dm.getText()+"8"));
        m9.setOnAction(event -> dm.setText(dm.getText()+"9"));
        m0.setOnAction(event -> dm.setText(dm.getText()+"0"));
        clear2.setOnAction(event -> {
            dm.setText("");
            rty.setText("");
        });


        c1.setOnAction(event -> wdm.setText(wdm.getText()+"1"));
        c2.setOnAction(event -> wdm.setText(wdm.getText()+"2"));
        c3.setOnAction(event -> wdm.setText(wdm.getText()+"3"));
        c4.setOnAction(event -> wdm.setText(wdm.getText()+"4"));
        c5.setOnAction(event -> wdm.setText(wdm.getText()+"5"));
        c6.setOnAction(event -> wdm.setText(wdm.getText()+"6"));
        c7.setOnAction(event -> wdm.setText(wdm.getText()+"7"));
        c8.setOnAction(event -> wdm.setText(wdm.getText()+"8"));
        c9.setOnAction(event -> wdm.setText(wdm.getText()+"9"));
        c0.setOnAction(event -> wdm.setText(wdm.getText()+"0"));
        clear3.setOnAction(event -> {
            wdm.setText("");
            empty.setText(null);
        });




        log.setOnAction(event -> {
           String cardNumber1 = cardNumberField.getText();
            String password1 = passwordfield.getText();
            boolean valid = back.valid(cardNumber1,password1);
            if (valid){
                window1.setScene(scene3);
            }
            else
              error.setText("wrong card number or password");

        });


        done.setOnAction(event -> {
            int se = Integer.parseInt(dm.getText());
            back.deposit(se);
            p=back.getI();
            rty.setText("Successful Transaction");




        });


        done1.setOnAction(event -> {
            int see = Integer.parseInt(wdm.getText());
            int balanceee = back.getBalance();
            if (see<=balanceee) {
                back.withdraw(see);
                p = back.getI();
                empty.setText("Successful Transaction");
            }
            else
             empty.setText("You don't have enough balance");


        });

       nexthis.setOnAction(event -> {
            int j = back.add();
           if (j>p)
               showHis.setText("NO More Next Transaction");
           else
               showHis.setText(k[j]);
        });


            perhis.setOnAction(event -> {
                int j = back.minimize();
                if (back.getI()<0)
                    showHis.setText("NO More Previous Transaction");
                else
                    showHis.setText(k[j]);



            });







        window1.setScene(scene1);
        window1.show();









    }
}
