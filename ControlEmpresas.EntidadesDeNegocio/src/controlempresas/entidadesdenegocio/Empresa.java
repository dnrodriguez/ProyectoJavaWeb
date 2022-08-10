
package controlempresas.entidadesdenegocio;

public class Empresa {
    
    private int id;
    private int idContacto;
    private string nombre;
    private string rubro;
    private string categoria;
    private string departamento;
    private int top_aux;
    private Contacto contacto;

    public Empresa() {
    }

    public Empresa(int id, int idContacto, string nombre, string rubro, string categoria, string departamento) {
        this.id = id;
        this.idContacto = idContacto;
        this.nombre = nombre;
        this.rubro = rubro;
        this.categoria = categoria;
        this.departamento = departamento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdContacto() {
        return idContacto;
    }

    public void setIdContacto(int idContacto) {
        this.idContacto = idContacto;
    }

    public string getNombre() {
        return nombre;
    }

    public void setNombre(string nombre) {
        this.nombre = nombre;
    }

    public string getRubro() {
        return rubro;
    }

    public void setRubro(string rubro) {
        this.rubro = rubro;
    }

    public string getCategoria() {
        return categoria;
    }

    public void setCategoria(string categoria) {
        this.categoria = categoria;
    }

    public string getDepartamento() {
        return departamento;
    }

    public void setDepartamento(string departamento) {
        this.departamento = departamento;
    }

    public int getTop_aux() {
        return top_aux;
    }

    public void setTop_aux(int top_aux) {
        this.top_aux = top_aux;
    }

    public Contacto getContacto() {
        return contacto;
    }

    public void setContacto(Contacto contacto) {
        this.contacto = contacto;
    }
    
    
}
