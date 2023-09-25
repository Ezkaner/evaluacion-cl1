package controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import interfaces.IEmpleado;
import interfacesServicios.IServicioEmpleado;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;

import model.Empleado;
import servicio.EmpleadoServicio;

@Controller
@RequestMapping

public class Controlador {
	@Autowired
	private IServicioEmpleado service;
	
	@GetMapping("/listar")
	public String listar(Model model) {
		List<Empleado>empleados=service.listar();
		model.addAttribute("empleados", empleados);
		return "index";
	}
	
	@GetMapping("/new")
	public String agregar(Model model) {
		model.addAttribute("empleado", new Empleado());
		return "formulario";
	}
	@PostMapping("/save")
	public String save(@Validated Empleado e, Model model) {
		service.guardarEmpleado(e);
		return "redirect:/listar";
	}
	
	@GetMapping("/editar/{id}")
	public String editar(@PathVariable int id, Model model) {
		Optional<Empleado> emp = service.listarID(id);
		model.addAttribute("empleado", emp);
		return "form";
	}
	
	@GetMapping("/eliminar/{id}")
	public String eliminar(Model model, @PathVariable int id) {
		service.eliminarEmpleado(id);
		return "redirect:/listar";
	}
}
