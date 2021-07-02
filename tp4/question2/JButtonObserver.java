package question2;

import java.awt.event.*;
import java.awt.TextArea;

public class JButtonObserver implements ActionListener {

    private String nom;
    private TextArea contenu;

    public JButtonObserver(String nom, TextArea contenu) {
        this.nom = nom;
        this.contenu = contenu;
    }

    public void actionPerformed(ActionEvent e) {
        String message = "observeur "+this.nom+" : clic du bouton "+e.getActionCommand(); 
        contenu.append(message + "\n");
    }

}

