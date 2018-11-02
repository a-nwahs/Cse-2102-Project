import javax.swing.*;

public class Window extends JFrame {
    Main_Panel main_pnl;
    Search_By_Name name_pnl;
    Search_By_Quality quality_pnl;
    Search_By_Type type_pnl;
    Results_Panel results_pnl;

    /*public static void main(String[] args){
        Window object = new Window();
    }*/

    public Window(){
        this.setSize(600, 400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Hospital Database Search");

        main_pnl = new Main_Panel();
        name_pnl = new Search_By_Name();
        quality_pnl = new Search_By_Quality();
        type_pnl = new Search_By_Type();
        results_pnl = new Results_Panel();

        this.go_to_main_panel();

        this.setVisible(true);
    }

    public void go_to_main_panel(){
        this.getContentPane().removeAll();
        this.add(main_pnl);
    }

    public void go_to_name_panel(){
        this.getContentPane().removeAll();
        this.add(name_pnl);
    }

    public void go_to_quality_panel(){
        this.getContentPane().removeAll();
        this.add(quality_pnl);
    }

    public void go_to_type_panel(){
        this.getContentPane().removeAll();
        this.add(type_pnl);
    }

    public void go_to_results_panel(){
        this.getContentPane().removeAll();
        this.add(results_pnl);
    }
}
