import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        MyForm frame = new MyForm();
        frame.setContentPane(new MyForm().panel1);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
