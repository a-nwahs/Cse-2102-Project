import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Search_By_Name extends Search_Panel {
    public Search_By_Name() {
        JTextField intro = new JTextField("This is the search by name panel.");
        JButton return_button = new JButton("Return to main menu");
        JButton search_button = new JButton("Search");

        return_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { go_to_main(); }
        });

        search_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                go_to_results(new int[] {1, 2, 3, 221});
            }
        });

        this.add(intro);
        this.add(return_button);
        this.add(search_button);
    }


}
