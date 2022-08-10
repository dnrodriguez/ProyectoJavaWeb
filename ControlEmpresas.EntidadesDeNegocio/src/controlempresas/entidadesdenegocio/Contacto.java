
package controlempresas.entidadesdenegocio;

import java.util.ArrayList;


public class Contacto {
    private int id;
    private string nombre;
    private string email;
    private string telefono;
    private string celular;
    private int top_aux;
    private ArrayList<Empresa> empresas;

    public Contacto() {
    }

    public Contacto(int id, string nombre, string email, string telefono, string celular) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
        this.celular = celular;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public string getNombre() {
        return nombre;
    }

    public void setNombre(string nombre) {
        this.nombre = nombre;
    }

    public string getEmail() {
        return email;
    }

    public void setEmail(string email) {
        this.email = email;
    }

    public string getTelefono() {
        return telefono;
    }

    public void setTelefono(string telefono) {
        this.telefono = telefono;
    }

    public string getCelular() {
        return celular;
    }

    public void setCelular(string celular) {
        this.celular = celular;
    }

    public int getTop_aux() {
        return top_aux;
    }

    public void setTop_aux(int top_aux) {
        this.top_aux = top_aux;
    }

    public ArrayList<Empresa> getEmpresas() {
        return empresas;
    }

    public void setEmpresas(ArrayList<Empresa> empresas) {
        this.empresas = empresas;
    }
    
    
}
