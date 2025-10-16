package Entity;

import jakarta.persistence.*;
import java.util.List;

/**
 * Entidad que representa el tipo de beneficio (unidades o monto)
 */
@Entity
@Table(name = "tipos_beneficio")
public class TipoBeneficio {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String unidadDeDatos;
    private Double montoCantidad;
    
    @OneToMany(mappedBy = "tipoBeneficio", cascade = CascadeType.ALL)
    private List<Beneficio> beneficios;
    
    public TipoBeneficio() {
    }
    
    public TipoBeneficio(String unidadDeDatos, Double montoCantidad) {
        this.unidadDeDatos = unidadDeDatos;
        this.montoCantidad = montoCantidad;
    }
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getUnidadDeDatos() {
        return unidadDeDatos;
    }
    
    public void setUnidadDeDatos(String unidadDeDatos) {
        this.unidadDeDatos = unidadDeDatos;
    }
    
    public Double getMontoCantidad() {
        return montoCantidad;
    }
    
    public void setMontoCantidad(Double montoCantidad) {
        this.montoCantidad = montoCantidad;
    }
    
    public List<Beneficio> getBeneficios() {
        return beneficios;
    }
    
    public void setBeneficios(List<Beneficio> beneficios) {
        this.beneficios = beneficios;
    }
}


