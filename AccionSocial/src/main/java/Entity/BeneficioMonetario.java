package Entity;

import jakarta.persistence.*;


/**
 * Entidad que representa un beneficio monetario
 */
@Entity

public class BeneficioMonetario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double presupuesto;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "beneficio_id")
    private Beneficio beneficio;
    
    
    public BeneficioMonetario() {
    }
    
    public BeneficioMonetario(double presupuesto, Beneficio beneficio) {
        this.presupuesto = presupuesto;
        this.beneficio = beneficio;
    }
    
   
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public double getPresupuesto() {
        return presupuesto;
    }
    
    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }
    
    public Beneficio getBeneficio() {
        return beneficio;
    }
    
    public void setBeneficio(Beneficio beneficio) {
        this.beneficio = beneficio;
    }
    
 
}
