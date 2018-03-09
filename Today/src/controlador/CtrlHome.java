
package controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.Registrar;
import vista.principal;

public class CtrlHome implements ActionListener{
    private principal home; 
//    private Entrar entrar;
    private Registrar registrar;
    public void iniciar(){
        home.setTitle("Today");
        home.setLocationRelativeTo(null);
        home.setResizable(false);
        home.setUndecorated(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==home.btnSalir){
            home.dispose();
        }
        if (e.getSource()==home.btnEntrar){
//            entrar.setVisible(true);
            home.setVisible(false);
            
        }
        if (e.getSource()==home.btnRegistrarse){
            registrar.setVisible(true);
            home.setVisible(false);}
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
