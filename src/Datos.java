import java.util.Stack;

public class Datos {
	
	Stack pilad = new Stack();
	Stack pilar = new Stack();
	Stack pilaaux = new Stack();
    Stack pilah = new Stack();
    String auxiliar;
    
	public Datos() {
		/*pilah.push("50");
		pilah.push("mundo");
		pilah.push("hola");*/
	}
	
	public void agregar(String h) {
		pilah.push(h);
		pilad.push(h);
	}
	
	/*public void consulta(Stack pilad) {
		System.out.println("El ultimo elemento en la pila es: "+pilad.peek());
	}*/
	
	public void listar() {
		while(pilah.empty()==false) {
			System.out.println(pilah.peek());
			auxiliar=(String) pilah.pop();
			pilaaux.push(auxiliar);
		}
		while(pilaaux.empty()==false) {
			auxiliar=(String) pilaaux.pop();
			pilah.push(auxiliar);
		}
	}
	
	public void deshacer() {
		auxiliar=(String) pilad.pop();
		pilar.push(auxiliar);
	}
	
	public void rehacer() {
		auxiliar=(String) pilar.pop();
		pilad.push(auxiliar);
	}
	/*public static void main(String[] args) {
		Datos d = new Datos();
		d.listar();

	}*/
	

}
