package carnet.v1;

import java.awt.BorderLayout;
import java.awt.event.*;
import javax.swing.*;

public class Menu extends JFrame implements ActionListener {
    
    protected JButton bAdd;
    protected JButton bDel;
    protected JButton bRead;
    
    protected JPanel GUI(){
        bAdd = new JButton("Ajouter un contact");
        bAdd.addActionListener(this);
        
        JPanel topPanel = new JPanel();
        topPanel.add(bAdd);
        
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.add(BorderLayout.NORTH, topPanel);
        
        return mainPanel;
    }
    
    public Menu(){
        //getContentPane().setLayout(new BorderLayout());
        getContentPane().add(BorderLayout.CENTER, GUI());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Carnet d\'adresse");
        pack();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == bAdd){
            JTextField nomField = new JTextField(10);
            JTextField prenomField = new JTextField(10);
            JTextField adrField = new JTextField(10);
            
            JPanel myPanel = new JPanel();
            myPanel.add(new JLabel("Nom : "));
            myPanel.add(nomField);
            myPanel.add(new JLabel("Prénom : "));
            myPanel.add(prenomField);
            myPanel.add(new JLabel("Adresse : "));
            myPanel.add(adrField);

            
            int result = JOptionPane.showConfirmDialog(null, myPanel, 
                "Ajouter un contact", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
        System.out.println("Nom : " + nomField.getText());
         System.out.println("Prénom: " + prenomField.getText());
         System.out.println("Adresse : " + adrField.getText());
        }
            
        }
        
        if(e.getSource() == bDel){
        	
        }
    }
    
}
