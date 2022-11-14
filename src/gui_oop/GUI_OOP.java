package gui_oop;

import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.WindowConstants;

public class GUI_OOP {
    public static void main(String[] args) {
        new Bejelent();
    }
    private static JFrame frame;
    private static class Bejelent {
        
        public Bejelent() {
            ini();
        }

        private void ini() {
            kinezet();
        }

        public void kinezet() {
            frame = new JFrame("GUI- OOP 1.dolgozat");
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            frame.setSize(410, 350);
            
            
            
            frame.setJMenuBar(menu());
            frame.add(tabedpane());
            
            frame.setVisible(true);
        }

        private JMenuBar menu() {
            JMenuBar menubar = new JMenuBar();
            JMenu program = new JMenu("Program");
            JMenu menu2 = new JMenu("Játék elrendezése");
            menubar.add(program);
            menubar.add(menu2);
            
            
            JMenuItem ujra = new JMenuItem("Újra");
            JMenuItem kilep = new JMenuItem("Kilépés");
            JMenuItem vizszint = new JMenuItem("Vízszintes");
            JMenuItem fugg = new JMenuItem("fugg");
            kilep.addActionListener(new KilepListener());
            ujra.addActionListener(new UjraListener());
            program.add(ujra);
            program.addSeparator();
            program.add(kilep);
            menu2.add(vizszint);
            menu2.add(fugg);
            
            return menubar;
        }
        
        private JTabbedPane tabedpane() {
            JTabbedPane tbp = new JTabbedPane();
            JPanel bejelent = new JPanel();
            JPanel jatek = new JPanel();
            tbp.add("Bejelentkezés",bejelent);
            tbp.add("Játék",jatek);
            return tbp;
        }
        
        
    }

    private static class UjraListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            ujra();
        }

        private void ujra() {
            
        }
    }

    private static class KilepListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            kilepes();
        }

        private void kilepes() {
            int valasz = JOptionPane.showConfirmDialog(frame, "Kilépés", "Biztos kilép?", JOptionPane.YES_NO_OPTION);
            if(valasz == JOptionPane.YES_OPTION){
                System.exit(valasz);
            }
        }
    }
    
}
