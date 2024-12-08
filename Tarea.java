public class Tarea {
    private String nombre;
    private String estado; // Ejemplo: "Pendiente", "En Progreso", "Completada"
    private Usuario usuarioAsignado;

    public Tarea(String nombre) {
        this.nombre = nombre;
        this.estado = "Completada";
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

    public Usuario getUsuarioAsignado() {
        return usuarioAsignado;
    }

    public void asignarUsuario(Usuario usuario) {
        this.usuarioAsignado = usuario;
    }

    @Override
    public String toString() {
        return "Tarea{" +
                "nombre='" + nombre + '\'' +
                ", estado='" + estado + '\'' +
                ", usuarioAsignado=" + (usuarioAsignado != null ? usuarioAsignado.getNombre() : "Ninguno") +
                '}';
    }
}
