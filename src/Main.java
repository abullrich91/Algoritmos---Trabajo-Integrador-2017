public class Main {
	public static void main(String[] args) {
		SistemaSolar sol = new Sol();
		SistemaSolar alderaan = new Planeta("Alderaan", new Horario(1), 500);
		SistemaSolar felucia = new Planeta("Felucia", new Horario(3), 2000);
		SistemaSolar peragus = new Planeta("Peragus", new Antihorario(5), 1000);
	}
}
