import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Results_Panel extends JPanel {
    int[] search_results;
    String[][] table_data;
    String[] column_names = {"Hospital ID"};
    JTable results_table;
    JScrollPane table_panel;

    public Results_Panel() {
        JTextField intro = new JTextField("This is the results panel.");
        JButton return_button = new JButton("Return to main menu");
        table_panel = new JScrollPane();

        return_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { Runnable.display_window.go_to_main_panel(); }
        });

        this.add(intro);
        this.add(return_button);
        this.add(table_panel);
    }

    void create_table() {
        search_results = Runnable.display_window.search_results;
        table_data = new String[search_results.length][0];
        for(int i = 0; i < search_results.length; i++) {
            table_data[i] = new String[] { String.format("%04d", search_results[i]) };
        }
        results_table = new JTable(table_data, column_names);
        results_table.setBounds(30, 40, 200, 300);
        table_panel.add(results_table);
        this.add(table_panel);
    }
}
