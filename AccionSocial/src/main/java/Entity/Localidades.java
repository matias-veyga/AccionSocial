package Entity;

import jakarta.persistence.*;
import java.util.List;

/**
 * Entidad que representa una localidad
 */
@Entity
public class Localidades {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    @OneToMany(mappedBy = "localidad", cascade = CascadeType.ALL)
    private List<Caso> casos;
    
    
    public Localidades() {
    }
    
   
    public Localidades(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    
    
    public Localidades(String nombre) {
        this.nombre = nombre;
    }
    
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    public List<Caso> getCasos() {
        return casos;
    }
    
    public void setCasos(List<Caso> casos) {
        this.casos = casos;
    }
    

}
