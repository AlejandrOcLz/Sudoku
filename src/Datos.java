import java.util.Stack;

public class Datos {
	//pilas de almacenamiento 
	Stack pilad = new Stack();//pila deshacer
	Stack pilar = new Stack();//pila rehacer
	Stack pilaaux = new Stack();//pila auxicila para no perder los datos al relisar un listar 
    Stack pilah = new Stack();//pila historial 
    String auxiliar;
    
	public Datos() {
		/*pilah.push("50");
		pilah.push("mundo");
		pilah.push("hola");*/
	}
	
	public void agregar(String h) {
		pilah.push(h);// push nos permite almacemar la informacion en la pila 
		System.out.println(pilah.peek());
		// almacenamos en ambas pilas para de esta manera poder hacer un deshacer sin eliminar la informacion almacenada en el historial
		pilad.push(h);
	}
	
	/*public void consulta(Stack pilad) {
		System.out.println("El ultimo elemento en la pila es: "+pilad.peek());
	}*/
	
	public void listar() {
		System.out.println("******HISTORIAL******");
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
	
	public String deshacer() {
		if(!pilad.empty()) {
			auxiliar=(String) pilad.pop();
			pilar.push(auxiliar);
			String[] separar = auxiliar.split(",");
			pilah.push(separar[0]+","+separar[1]+","+separar[3]+","+separar[2]+","+"1");
			
			return auxiliar;
		}
		return "";
	}
	
	public String rehacer() {
		if(!pilar.empty()) {
		auxiliar=(String) pilar.pop();
		pilad.push(auxiliar);
		String[] separar = auxiliar.split(",");
		pilah.push(separar[0]+","+separar[1]+","+separar[3]+","+separar[2]+","+"2");
		return auxiliar;
		}
		return "";
	}

}
