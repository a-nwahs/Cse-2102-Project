import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Search_By_Quality extends Search_Panel {
    public Search_By_Quality() {
        JTextField intro = new JTextField("This is the search by quality panel.");
        JButton return_button = new JButton("Return to main menu");

        return_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { go_to_main(); }
        });

        this.add(intro);
        this.add(return_button);
    }
}
