package Entity;

import jakarta.persistence.*;
import java.time.LocalDate;

/**
 * Entidad que representa el historial de novedades en el sistema de acción social
 */
@Entity
@Table(name = "historial")
public class Historial {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idNovedad;
    @ManyToOne
    @JoinColumn(name = "legajo_id")
    private Legajo legajo;
    private String tipoAccion;
    private LocalDate fecha;
    @ManyToOne
    @JoinColumn(name = "beneficio_id")
    private Beneficio beneficio;
    
    @ManyToOne
    @JoinColumn(name = "documentacion_presentada_id")
    private DocumentacionPresentada documentacionPresentada;
    
    private String observacion;
    
    public Historial() {
    }
    
    public Historial(Legajo legajo, String tipoAccion, LocalDate fecha, Beneficio beneficio, 
                     DocumentacionPresentada documentacionPresentada, String observacion) {
        this.legajo = legajo;
        this.tipoAccion = tipoAccion;
        this.fecha = fecha;
        this.beneficio = beneficio;
        this.documentacionPresentada = documentacionPresentada;
        this.observacion = observacion;
    }
    
    public Long getIdNovedad() {
        return idNovedad;
    }
    
    public void setIdNovedad(Long idNovedad) {
        this.idNovedad = idNovedad;
    }
    
    public Legajo getLegajo() {
        return legajo;
    }
    
    public void setLegajo(Legajo legajo) {
        this.legajo = legajo;
    }
    
    public String getTipoAccion() {
        return tipoAccion;
    }
    
    public void setTipoAccion(String tipoAccion) {
        this.tipoAccion = tipoAccion;
    }
    
    public LocalDate getFecha() {
        return fecha;
    }
    
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    
    public Beneficio getBeneficio() {
        return beneficio;
    }
    
    public void setBeneficio(Beneficio beneficio) {
        this.beneficio = beneficio;
    }
    
    public DocumentacionPresentada getDocumentacionPresentada() {
        return documentacionPresentada;
    }
    
    public void setDocumentacionPresentada(DocumentacionPresentada documentacionPresentada) {
        this.documentacionPresentada = documentacionPresentada;
    }
    
    public String getObservacion() {
        return observacion;
    }
    
    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }
}
