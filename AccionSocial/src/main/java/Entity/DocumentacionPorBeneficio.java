package Entity;

import jakarta.persistence.*;
import java.util.List;

/**
 * Entidad que representa la documentación requerida por beneficio
 */
@Entity
public class DocumentacionPorBeneficio {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne()
    @JoinColumn(name = "tipo_documentacion_id")
    private TipoDeDocumentacion tipoDeDocumentacion;
    
    @ManyToOne()
    @JoinColumn(name = "beneficio_id")
    private Beneficio beneficio;
    
    @OneToMany(mappedBy = "documentacionPorBeneficio", cascade = CascadeType.ALL)
    private List<DocumentacionPresentada> documentacionesPresentadas;
    
    
    public DocumentacionPorBeneficio() {
    }
    
 
    public DocumentacionPorBeneficio(TipoDeDocumentacion tipoDeDocumentacion, Beneficio beneficio) {
        this.tipoDeDocumentacion = tipoDeDocumentacion;
        this.beneficio = beneficio;
    }
    
   
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public TipoDeDocumentacion getTipoDeDocumentacion() {
        return tipoDeDocumentacion;
    }
    
    public void setTipoDeDocumentacion(TipoDeDocumentacion tipoDeDocumentacion) {
        this.tipoDeDocumentacion = tipoDeDocumentacion;
    }
    
    public Beneficio getBeneficio() {
        return beneficio;
    }
    
    public void setBeneficio(Beneficio beneficio) {
        this.beneficio = beneficio;
    }
    
   
    public List<DocumentacionPresentada> getDocumentacionesPresentadas() {
        return documentacionesPresentadas;
    }
    
    public void setDocumentacionesPresentadas(List<DocumentacionPresentada> documentacionesPresentadas) {
        this.documentacionesPresentadas = documentacionesPresentadas;
    }
    
  
}
