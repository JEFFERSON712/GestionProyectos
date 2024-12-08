import java.util.ArrayList;
import java.util.List;

public class SistemaGestion {
    private final List<Proyecto> proyectos;
    private final List<Usuario> usuarios;

    public SistemaGestion() {
        proyectos = new ArrayList<>();
        usuarios = new ArrayList<>();
    }

    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void agregarProyecto(Proyecto proyecto) {
        proyectos.add(proyecto);
    }

    public List<Proyecto> getProyectos() {
        return proyectos;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public Proyecto buscarProyectoPorNombre(String nombre) {
        for (Proyecto proyecto : proyectos) {
            if (proyecto.getNombre().equalsIgnoreCase(nombre)) {
                return proyecto;
            }
        }
        return null;
    }

    public Usuario buscarUsuarioPorNombre(String nombre) {
        for (Usuario usuario : usuarios) {
            if (usuario.getNombre().equalsIgnoreCase(nombre)) {
                return usuario;
            }
        }
        return null;
    }
}
