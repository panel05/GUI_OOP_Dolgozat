package gui_oop;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.PopupMenu;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.border.TitledBorder;

public class GUI_OOP {
    private static final int gomb_db = 10;
    private JFrame frame;
    private JButton[] gombok;
    public static void main(String[] args) {
        new GUI_OOP();
    }
    

        public GUI_OOP() {
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
            
            frame.addWindowListener(new FormWindowAdapter());
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
            bejelent.add(balini());
            bejelent.add(jobini());
            JPanel jatek = new JPanel();
            jatek.add(amoba());
            tbp.add("Bejelentkezés",bejelent);
            tbp.add("Játék",jatek);
            return tbp;
        }
        private JPanel balini(){
           LayoutManager lymGridAlso = new GridLayout(4,1, 5, 5);
           JPanel baloldal = new JPanel(lymGridAlso);
           FlowLayout flow = new FlowLayout(FlowLayout.LEFT);
           JPanel fopanel = new JPanel(flow);
           baloldal.setBorder(new TitledBorder("Pin kód"));
           fopanel.add(baloldal);
           
           gombok = new JButton[gomb_db];
           gombok();
           for (JButton g : gombok){
               baloldal.add(g);
           }
          return baloldal; 
        }
        private JPanel jobini(){
            LayoutManager GridAlso = new GridLayout(3,3);
            JPanel jobb = new JPanel(GridAlso);
            jobb.setBorder(new TitledBorder("Beállítás"));
            jobb.add(chexkbox());
            jobb.add(Label());
            jobb.add(Text());
        return jobb;
            
        }

        private void gombok() {
            JButton gomb = new JButton("1");
            JButton gomb1 = new JButton("2");
            JButton gomb2 = new JButton("3");
            JButton gomb3 = new JButton("4");
            JButton gomb4 = new JButton("5");
            JButton gomb5 = new JButton("6");
            JButton gomb6 = new JButton("7");
            JButton gomb7 = new JButton("8");
            JButton gomb8 = new JButton("9");
            JButton gomb9 = new JButton("0");
            
            
            gombok[0] = gomb;
            gombok[1] = gomb1;
            gombok[2] = gomb2;
            gombok[3] = gomb3;
            gombok[4] = gomb4;
            gombok[5] = gomb5;
            gombok[6] = gomb6;
            gombok[7] = gomb7;
            gombok[8] = gomb8;
            gombok[9] = gomb9;
        }

    private JCheckBox chexkbox() {
        JCheckBox chekBox = new JCheckBox();
        chekBox.setText("kever");
        return chekBox;
    }

    private TextField Text() {
       TextField text = new TextField();
        return text;
    }

    private JLabel Label() {
       JLabel txt = new JLabel("Kód: ");
        return txt;
    }

    private JPanel amoba() {
        JPanel amoba = new JPanel();
        return amoba;
    }
        
        
    

    private static class UjraListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            ujra();
        }

        private void ujra() {
            
        }
    }

    class FormWindowAdapter extends WindowAdapter{
        
        @Override
        public void windowClosing(WindowEvent e) {
           
            super.windowClosing(e);
            kilepes();
        }

        
        
    }
    
    class KilepListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            kilepes();
        }
        
        
        }
    private void kilepes() {
            int valasz = JOptionPane.showConfirmDialog(frame,"Kilépés", "Biztos kilép?", JOptionPane.YES_NO_OPTION);
            if(valasz == JOptionPane.YES_OPTION){
                System.exit(valasz);
            }
    }
    
}
