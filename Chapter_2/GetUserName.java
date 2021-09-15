package Java_8_Lambdas.Chapter_2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GetUserName {
    public static String getUserName(){
        String name = "Hitesh Sardar";
        return name;
    }

    public static String formatUserName(){
        String name = "Sardar";
        return name;
    }

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



        String name = getUserName();
//        name = formatUserName();
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                System.out.println("hi " + name);
            }
        });

        button.addActionListener(event -> System.out.println("hi " + name));
    }
}
