
package clase2java;

public class ingreso {
    private String usuario,pass;
    private String miUsuario="Larisa";
    private String miPass="123456";
    
    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String us){
        usuario=us;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    public boolean validar() {
       return usuario.equals(miUsuario) && pass.equals(miPass);
    }
}
