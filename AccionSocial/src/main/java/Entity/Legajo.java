package Entity;

import jakarta.persistence.*;
import java.util.List;

/**
 * Entidad que representa un legajo de acción social
 */
@Entity

public class Legajo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne
    @JoinColumn(name = "beneficio_id")
    private Beneficio beneficio;
    
    @ManyToOne
    @JoinColumn(name = "caso_id")
    private Caso caso;
    private String aprobadoDesaprobado;
    private String descripcion;
    private String numeroLegajo;

    @OneToMany(mappedBy = "legajo", cascade = CascadeType.ALL)
    private List<DocumentacionPresentada> documentacionesPresentadas;
    
   
    public Legajo() {
    }
    
   
    public Legajo(Beneficio beneficio, Caso caso, String aprobadoDesaprobado, String descripcion, String numeroLegajo) {
        this.beneficio = beneficio;
        this.caso = caso;
        this.aprobadoDesaprobado = aprobadoDesaprobado;
        this.descripcion = descripcion;
        this.numeroLegajo = numeroLegajo;
    }
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public Beneficio getBeneficio() {
        return beneficio;
    }
    
    public void setBeneficio(Beneficio beneficio) {
        this.beneficio = beneficio;
    }
    
    public Caso getCaso() {
        return caso;
    }
    
    public void setCaso(Caso caso) {
        this.caso = caso;
    }
    
    public String getAprobadoDesaprobado() {
        return aprobadoDesaprobado;
    }
    
    public void setAprobadoDesaprobado(String aprobadoDesaprobado) {
        this.aprobadoDesaprobado = aprobadoDesaprobado;
    }
    
    public String getDescripcion() {
        return descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public String getNumeroLegajo() {
        return numeroLegajo;
    }
    
    public void setNumeroLegajo(String numeroLegajo) {
        this.numeroLegajo = numeroLegajo;
    }
    
    
    public List<DocumentacionPresentada> getDocumentacionesPresentadas() {
        return documentacionesPresentadas;
    }
    
    public void setDocumentacionesPresentadas(List<DocumentacionPresentada> documentacionesPresentadas) {
        this.documentacionesPresentadas = documentacionesPresentadas;
    }
    
   
}
