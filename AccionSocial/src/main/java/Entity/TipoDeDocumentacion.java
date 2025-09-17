package Entity;

import jakarta.persistence.*;
import java.util.List;

/**
 * Entidad que representa un tipo de documentación
 */

@Entity

public class TipoDeDocumentacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tipoDocumento;
    
    @OneToMany(mappedBy = "tipoDeDocumentacion", cascade = CascadeType.ALL)
    private List<DocumentacionPorBeneficio> documentacionesPorBeneficio;
    
   
    public TipoDeDocumentacion() {
    }
    
  
    public TipoDeDocumentacion(Long id, String tipoDocumento) {
        this.id = id;
        this.tipoDocumento = tipoDocumento;
    }
    
    
    public TipoDeDocumentacion(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }
    
  
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
   
    public String getTipoDocumento() {
        return tipoDocumento;
    }
    
    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }
    
    
    public List<DocumentacionPorBeneficio> getDocumentacionesPorBeneficio() {
        return documentacionesPorBeneficio;
    }
    
    public void setDocumentacionesPorBeneficio(List<DocumentacionPorBeneficio> documentacionesPorBeneficio) {
        this.documentacionesPorBeneficio = documentacionesPorBeneficio;
    }
    
}
