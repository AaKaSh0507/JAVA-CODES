public class OOPS {
    public static void main(String args[]) {
        Pen p1 = new Pen(); // created a pen object called P1
        p1.setColor("Blue");
        p1.setTip(5);
        System.out.println(p1.getTip());
        System.out.println(p1.getColor());

        BankAccount mybBankAccount = new BankAccount();
        mybBankAccount.username = "Aakash Malik";
        mybBankAccount.setPassword("abcd123");
        System.out.println(mybBankAccount.username);
        // System.out.println(mybBankAccount.password); this will give me an error
        // because password is private
    }
}

class BankAccount {
    public String username;
    private String password;

    public void setPassword(String new_pwd) {
        password = new_pwd;
    }
}

class Pen {
    private int tip;
    private String color;

    String getColor() {
        return this.color;
    }

    int getTip() {
        return this.tip;
    }

    void setColor(String new_Color) {
        this.color = new_Color;
    }

    void setTip(int Tip) {
        this.tip = Tip;
    }
}
