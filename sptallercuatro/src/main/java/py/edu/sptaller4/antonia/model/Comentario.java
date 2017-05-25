package py.edu.sptaller4.antonia.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Comentario {

	@Id
	@GeneratedValue
	private Integer codigo;
	private String mensaje;
	private String mensajeError;
	private String mensajeOk;
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public String getMensajeError() {
		return mensajeError;
	}
	public void setMensajeError(String mensajeError) {
		this.mensajeError = mensajeError;
	}
	public String getMensajeOk() {
		return mensajeOk;
	}
	public void setMensajeOk(String mensajeOk) {
		this.mensajeOk = mensajeOk;
	}
	
	
}
