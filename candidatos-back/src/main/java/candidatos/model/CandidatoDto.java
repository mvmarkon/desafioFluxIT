package candidatos.model;

public class CandidatoDto {

    private String nomyapp;

    private long dni;

    private String fechaNacimiento;

    private String descrDomicilio;

    private long telefono;

    private String mail;

    private String foto;

    private String descrExperiencia;

    private boolean rechazado;

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
