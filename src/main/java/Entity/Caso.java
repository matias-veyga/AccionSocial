package Entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

/**
 * Entidad que representa un caso de acción social
 */
@Entity
public class Caso {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellido;
    private String numeroCaso;
    private String gmail;
    private LocalDateTime fechaHoraRegistro;
    private Boolean esAdultoMayor;
    private Boolean tieneDiscapacidad;
    private String estadoCivil;
    private String dni;
    private String descripcion;
    private Integer cantidadHijos;
    private String numeroDeCasa;
    private String nombreCalle;
    
    @ManyToOne
    @JoinColumn(name = "localidad_id")
    private Localidades localidad;
    
    @OneToMany(mappedBy = "caso", cascade = CascadeType.ALL)
    private List<Legajo> legajos;
    
    @OneToMany(mappedBy = "caso", cascade = CascadeType.ALL)
    private List<Historial> historial;
    
   
    public Caso() {
    }
   
    public Caso(String nombre, String apellido, String numeroCaso, LocalDateTime fechaHoraRegistro, 
                Boolean esAdultoMayor, Boolean tieneDiscapacidad, Localidades localidad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroCaso = numeroCaso;
        this.fechaHoraRegistro = fechaHoraRegistro;
        this.esAdultoMayor = esAdultoMayor;
        this.tieneDiscapacidad = tieneDiscapacidad;
        this.localidad = localidad;
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
    
    public String getApellido() {
        return apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public String getNumeroCaso() {
        return numeroCaso;
    }
    
    public void setNumeroCaso(String numeroCaso) {
        this.numeroCaso = numeroCaso;
    }
    
    public String getGmail() {
        return gmail;
    }
    
    public void setGmail(String gmail) {
        this.gmail = gmail;
    }
    
    public LocalDateTime getFechaHoraRegistro() {
        return fechaHoraRegistro;
    }
    
    public void setFechaHoraRegistro(LocalDateTime fechaHoraRegistro) {
        this.fechaHoraRegistro = fechaHoraRegistro;
    }
    
    public Boolean getEsAdultoMayor() {
        return esAdultoMayor;
    }
    
    public void setEsAdultoMayor(Boolean esAdultoMayor) {
        this.esAdultoMayor = esAdultoMayor;
    }
    
    public Boolean getTieneDiscapacidad() {
        return tieneDiscapacidad;
    }
    
    public void setTieneDiscapacidad(Boolean tieneDiscapacidad) {
        this.tieneDiscapacidad = tieneDiscapacidad;
    }
    
    public String getEstadoCivil() {
        return estadoCivil;
    }
    
    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    
    public String getDni() {
        return dni;
    }
    
    public void setDni(String dni) {
        this.dni = dni;
    }
    
    public String getDescripcion() {
        return descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public Integer getCantidadHijos() {
        return cantidadHijos;
    }
    
    public void setCantidadHijos(Integer cantidadHijos) {
        this.cantidadHijos = cantidadHijos;
    }
    
    public String getNumeroDeCasa() {
        return numeroDeCasa;
    }
    
    public void setNumeroDeCasa(String numeroDeCasa) {
        this.numeroDeCasa = numeroDeCasa;
    }
    
    public String getNombreCalle() {
        return nombreCalle;
    }
    
    public void setNombreCalle(String nombreCalle) {
        this.nombreCalle = nombreCalle;
    }
    
    
    public Localidades getLocalidad() {
        return localidad;
    }
    
    public void setLocalidad(Localidades localidad) {
        this.localidad = localidad;
    }
    
    
    public List<Legajo> getLegajos() {
        return legajos;
    }
    
    public void setLegajos(List<Legajo> legajos) {
        this.legajos = legajos;
    }
    
    
    public List<Historial> getHistorial() {
        return historial;
    }
    
    public void setHistorial(List<Historial> historial) {
        this.historial = historial;
    }
    
   
}
