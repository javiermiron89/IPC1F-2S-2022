/**
 *
 * @author javie
 */
public class Cliente {
    
    public int cui;
    public String nombre;
    public String apellido;
    public Cuenta[] cuentasAsociadas;
    
    public Cliente(int cui, String nombre, String apellido) {
        this.cui = cui;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cuentasAsociadas = new Cuenta[5];
    }
    
    public void Imprimir() {
        System.out.println("CUI: " + this.cui + ", Nombre: " + this.nombre + ", Apellido: " + this.apellido);
    }
    
}
