import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        LBT_Form frame = new LBT_Form();
        frame.setContentPane(new LBT_Form().LBT_Panel);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
