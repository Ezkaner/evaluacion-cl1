package interfacesServicios;
import java.util.List;
import java.util.Optional;
import model.Empleado;

public interface IServicioEmpleado {
	public List<Empleado>listar();
	public Optional<Empleado>listarID(int id);
	public int guardarEmpleado(Empleado e);
	public void eliminarEmpleado(int id);
	
}
