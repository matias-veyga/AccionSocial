package Entity;

import jakarta.persistence.*;

/**
 * Entidad que representa la documentación presentada en un legajo
 */
@Entity
public class DocumentacionPresentada {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne
    @JoinColumn(name = "legajo_id")
    private Legajo legajo;
    
    @ManyToOne
    @JoinColumn(name = "documentacion_por_beneficio_id")
    private DocumentacionPorBeneficio documentacionPorBeneficio;
    private String presentadoFaltante;
    private String observaciones;
    
   
    public DocumentacionPresentada() {
    }
    
    
    public DocumentacionPresentada(Legajo legajo, DocumentacionPorBeneficio documentacionPorBeneficio, String presentadoFaltante) {
        this.legajo = legajo;
        this.documentacionPorBeneficio = documentacionPorBeneficio;
        this.presentadoFaltante = presentadoFaltante;
    }
  
    public DocumentacionPresentada(Legajo legajo, DocumentacionPorBeneficio documentacionPorBeneficio, String presentadoFaltante, String observaciones) {
        this.legajo = legajo;
        this.documentacionPorBeneficio = documentacionPorBeneficio;
        this.presentadoFaltante = presentadoFaltante;
        this.observaciones = observaciones;
    }
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public Legajo getLegajo() {
        return legajo;
    }
    
    public void setLegajo(Legajo legajo) {
        this.legajo = legajo;
    }
    
    public DocumentacionPorBeneficio getDocumentacionPorBeneficio() {
        return documentacionPorBeneficio;
    }
    
    public void setDocumentacionPorBeneficio(DocumentacionPorBeneficio documentacionPorBeneficio) {
        this.documentacionPorBeneficio = documentacionPorBeneficio;
    }
    
    public String getPresentadoFaltante() {
        return presentadoFaltante;
    }
    
    public void setPresentadoFaltante(String presentadoFaltante) {
        this.presentadoFaltante = presentadoFaltante;
    }
    
    public String getObservaciones() {
        return observaciones;
    }
    
    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    
   
}
