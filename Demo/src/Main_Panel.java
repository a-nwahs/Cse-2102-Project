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
                name_button.setText("Butttttsssss");
            }
        });

        type_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                type_button.setText("Butttttsssss");
            }
        });

        quality_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                quality_button.setText("Butttttsssss");
            }
        });

        this.add(name_button);
        this.add(type_button);
        this.add(quality_button);
    }
}
