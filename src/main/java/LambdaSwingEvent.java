import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LambdaSwingEvent {

    public static void main(String[] args) {

        JTextField textField = new JTextField();
        textField.setBounds(50, 50,150,20);

        JButton button = new JButton("click");
        button.setBounds(50,100,70,30);

        JButton buttonL = new JButton("lambda click");
        buttonL.setBounds(130, 100, 120, 30);

        //event listener
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("button clicked!");
                textField.setText("Arshiva Marsaint!");

                System.out.println(e.paramString());
            }
        });

        buttonL.addActionListener( e -> {
            System.out.println("buttonL clicked");
            textField.setText("Kenji!");

            System.out.println(e.paramString());
        } );



        JFrame f = new JFrame();
        f.add(textField);
        f.add(button);
        f.add(buttonL);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setLayout(null);

        f.setSize(300, 200);

        f.setVisible(true);


    }

}
