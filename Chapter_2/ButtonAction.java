package Java_8_Lambdas.Chapter_2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonAction {

    public static void main(String[] args) {
        Frame f = new Frame("ActionListener Example");
        final TextField tf = new TextField();
        tf.setBounds(50, 50, 150, 20);
        Button button = new Button("Click Here");
        button.setBounds(50, 100, 60, 30);
        //2nd step
        f.add(button);
        f.add(tf);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                System.out.println("button clicked");
            }
        });
        button.addActionListener(event -> System.out.println("button clicked"));


    }
}
