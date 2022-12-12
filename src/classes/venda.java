package classes;

import formularios.frmlogin;

public class venda {

    public static void main(String[] args) {
        
        dados msdados = new dados();
        frmlogin login = new frmlogin();
        login.setdados(msdados);
        login.setLocationRelativeTo(null);
        login.setVisible(true);
    }
    
}
