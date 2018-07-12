package Paquete;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Departamento {
	@Id
	@GeneratedValue
	private Long id;
	private String nombre;
	
	public Departamento(){}
	
	@ManyToOne
	private Departamento departamento;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
