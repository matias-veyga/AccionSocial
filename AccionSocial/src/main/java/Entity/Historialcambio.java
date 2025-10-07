package Entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

/**
 * Entidad que representa el historial de cambios de un caso
 */
@Entity

public class Historialcambio {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne
    @JoinColumn(name = "caso_id")
    private Caso caso;
    private LocalDateTime fechaHora;
    private String campoModificado;
    private String valorAnterior;
    private String valorNuevo;
    private String observaciones;
    
 
    public Historialcambio() {
    }
    
 
    public Historialcambio(Caso caso, LocalDateTime fechaHora, String campoModificado, String valorAnterior, String valorNuevo, String observaciones) {
        this.caso = caso;
        this.fechaHora = fechaHora;
        this.campoModificado = campoModificado;
        this.valorAnterior = valorAnterior;
        this.valorNuevo = valorNuevo;
        this.observaciones = observaciones;
    }
    

    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public Caso getCaso() {
        return caso;
    }
    
    public void setCaso(Caso caso) {
        this.caso = caso;
    }
    
    public LocalDateTime getFechaHora() {
        return fechaHora;
    }
    
    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }
    
    public String getCampoModificado() {
        return campoModificado;
    }
    
    public void setCampoModificado(String campoModificado) {
        this.campoModificado = campoModificado;
    }
    
    public String getValorAnterior() {
        return valorAnterior;
    }
    
    public void setValorAnterior(String valorAnterior) {
        this.valorAnterior = valorAnterior;
    }
    
    public String getValorNuevo() {
        return valorNuevo;
    }
    
    public void setValorNuevo(String valorNuevo) {
        this.valorNuevo = valorNuevo;
    }
    
    public String getObservaciones() {
        return observaciones;
    }
    
    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    
   
}
