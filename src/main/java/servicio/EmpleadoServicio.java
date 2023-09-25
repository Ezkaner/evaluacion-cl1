package servicio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import interfacesServicios.IServicioEmpleado;
import model.Empleado;
import interfaces.IEmpleado;

@Service
public class EmpleadoServicio implements IServicioEmpleado {

	@Autowired
	private IEmpleado data;

	@Override
	public List<Empleado> listar() {
		// TODO Auto-generated method stub
		return (List<Empleado>)data.findAll();
	}

	@Override
	public Optional<Empleado> listarID(int id) {
		// TODO Auto-generated method stub
		return data.findById(id);
	}

	@Override
	public int guardarEmpleado(Empleado e) {
		int r = 0;
		Empleado p =data.save(e);
		if(!p.equals(null)) {
			r = 1;
		}
		return r;
	}

	@Override
	public void eliminarEmpleado(int id) {
		data.deleteById(id);
		
	}

}
