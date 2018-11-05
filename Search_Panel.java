import javax.swing.*;

abstract public class Search_Panel extends JPanel {
    void go_to_main() {
        Runnable.display_window.go_to_main_panel();
    }

    void go_to_results(int[] results) {
        Runnable.display_window.search_results = results;
        Runnable.display_window.results_pnl.create_table();
        Runnable.display_window.go_to_results_panel();
    }
}
