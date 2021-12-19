public class Gestor extends Ciudadano {
	private int _id_gestor;

	public void gestor(int aId_gesto) {
		throw new UnsupportedOperationException();
	}

	public void verListadoDeEnfermedades() {
		throw new UnsupportedOperationException();
	}

	public void verListadoDePacientes() {
		throw new UnsupportedOperationException();
		
		int[] pacientes = "SELECT * FROM Pacientes";
		for(int i=0; i<pacientes.length(); i++){
			System.out.println(pacientes[i]);
		}
	}

	public void verListadoDeCampanias() {
		throw new UnsupportedOperationException();
	}

	public void verInformacionCiudadano() {
		throw new UnsupportedOperationException();
	}

	public void realizarEstadisticas() {
		throw new UnsupportedOperationException();
	}

	public void enviarSMS(String aTelefono) {
		throw new UnsupportedOperationException();
	}

	public void alertarContacto(String aTelefono) {
		throw new UnsupportedOperationException();
	}

	public void mostrarVacunasDisponibles() {
		throw new UnsupportedOperationException();
	}

	public void realizarCampaniaDeVacunacion() {
		throw new UnsupportedOperationException();
	}
}
