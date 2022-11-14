package gui_oop;

import javax.swing.JFrame;

public class GUI_OOP {
    private JFrame frame;
    public static void main(String[] args) {
        new Bejelent();
        //ini();
    }

    public Bejelent(){
        ini();
    }
    private void ini() {
        frame = new JFrame("GUI- OOP 1.dolgozat ");
    }
    
}
