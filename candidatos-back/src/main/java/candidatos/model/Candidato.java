package candidatos.model;

import javax.persistence.*;

@Entity
public class Candidato {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    @Column
    private String nomyapp;

    @Column
    private long dni;

    @Column
    private String fechaNacimiento;

    @Column
    private String descrDomicilio;

    @Column
    private long telefono;

    @Column
    private String mail;

    @Column
    private String foto;

    @Column
    private String descrExperiencia;

    @Column
    private boolean rechazado = false;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNomyapp() {
        return nomyapp;
    }

    public void setNomyapp(String nomyapp) {
        this.nomyapp = nomyapp;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDescrDomicilio() {
        return descrDomicilio;
    }

    public void setDescrDomicilio(String descrDomicilio) {
        this.descrDomicilio = descrDomicilio;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getDescrExperiencia() {
        return descrExperiencia;
    }

    public void setDescrExperiencia(String descrExperiencia) {
        this.descrExperiencia = descrExperiencia;
    }

    public boolean isRechazado() {
        return rechazado;
    }

    public void setRechazado(boolean rechazado) {
        this.rechazado = rechazado;
    }
}
