package Entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;

/**
 * Entidad que representa un beneficio de acción social
 */
@Entity
@Table(name = "beneficios")
public class Beneficio {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String estado;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    
    @ManyToOne
    @JoinColumn(name = "tipo_beneficio_id")
    private TipoBeneficio tipoBeneficio;
    
    @OneToMany(mappedBy = "beneficio", cascade = CascadeType.ALL)
    private List<DocumentacionPorBeneficio> documentacionesPorBeneficio;
    
    @OneToMany(mappedBy = "beneficio", cascade = CascadeType.ALL)
    private List<Legajo> legajos;
    
    
    public Beneficio() {
    }
    
 
    
    public Beneficio(String nombre, String estado, LocalDate fechaInicio, LocalDate fechaFin) {
        this.nombre = nombre;
        this.estado = estado;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
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
    
    public String getEstado() {
        return estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public LocalDate getFechaInicio() {
        return fechaInicio;
    }
    
    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    
    public LocalDate getFechaFin() {
        return fechaFin;
    }
    
    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }
    
    public TipoBeneficio getTipoBeneficio() {
        return tipoBeneficio;
    }
    
    public void setTipoBeneficio(TipoBeneficio tipoBeneficio) {
        this.tipoBeneficio = tipoBeneficio;
    }
    
    
    public List<DocumentacionPorBeneficio> getDocumentacionesPorBeneficio() {
        return documentacionesPorBeneficio;
    }
    
    public void setDocumentacionesPorBeneficio(List<DocumentacionPorBeneficio> documentacionesPorBeneficio) {
        this.documentacionesPorBeneficio = documentacionesPorBeneficio;
    }
    public List<Legajo> getLegajos() {
        return legajos;
    }
    
    public void setLegajos(List<Legajo> legajos) {
        this.legajos = legajos;
    }
    
    
}
