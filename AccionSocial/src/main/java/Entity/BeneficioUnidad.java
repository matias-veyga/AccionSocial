package Entity;

import jakarta.persistence.*;

/**
 * Entidad que representa un beneficio por unidad
 */
@Entity

public class BeneficioUnidad {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer cantidad;
    
    @ManyToOne()
    @JoinColumn(name = "beneficio_id")
    private Beneficio beneficio;
    
   
    public BeneficioUnidad() {
    }
    
   
    public BeneficioUnidad(Integer cantidad, Beneficio beneficio) {
        this.cantidad = cantidad;
        this.beneficio = beneficio;
    }
    
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public Integer getCantidad() {
        return cantidad;
    }
    
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
    
    public Beneficio getBeneficio() {
        return beneficio;
    }
    
    public void setBeneficio(Beneficio beneficio) {
        this.beneficio = beneficio;
    }
    
  
}
