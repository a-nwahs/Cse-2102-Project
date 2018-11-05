import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main_Panel extends JPanel {
    public Main_Panel(){
        JButton name_button = new JButton("Search by hospital name");
        JButton type_button = new JButton("Search by hospital type");
        JButton quality_button = new JButton("Search by hospital qualities");

        name_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Runnable.display_window.go_to_name_panel();
            }
        });

        type_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Runnable.display_window.go_to_type_panel();
            }
        });

        quality_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Runnable.display_window.go_to_quality_panel();
            }
        });

        this.add(name_button);
        this.add(type_button);
        this.add(quality_button);
    }
}
