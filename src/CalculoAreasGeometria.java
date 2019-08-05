import java.util.Scanner;

public class CalculoAreasGeometria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Generamos todas las variables
		Scanner teclado=new Scanner(System.in);
		
		int opcion=-1;
		int radio=0;
		int lado=0;
		int base=0;
		int altura=0;
		float area=0;
		double areacirculo=0;
		//double pi=3.1415; El valor de pi lo sustituimos por la constante Math.PI
		
		System.out.println("---- INICIO PROGRAMA ÁREAS EN GEOMETRÍA ----\n\n");
		
		System.out.println("Bienvenido a la calculadora de áreas");
		
		//Mostramos el menú de inicio y esperamos a que el usuario introduzca una opción
		do {

				System.out.println("\n1. Área del Círculo\n2. Área del Cuadrado\n3. Área del Rectángulo\n4. Área del Triángulo\n0. Salir del programa");
			do {	
				System.out.print("Introduzca la opción [0-4]: ");
				
				opcion=teclado.nextInt();
				teclado.nextLine();
				
				if(opcion<0 || opcion>4)
					//Cuando la opción introducida no está dentro del rango
					System.out.println("Error! La opción no está dentro del rango 0-4");
				
			}while(opcion<0 || opcion>4); //Si la opción introducida está fuera del rango	
				
				switch(opcion) //Según sea la opción escogida realizamos el cálculo correspondiente
				{
					case 1: //Area del Círculo
					{
						System.out.println("\nHas seleccionado Calcular el área del círculo");
						
						do {
							System.out.print("Introduzca el radio [1-100]: ");
							radio=teclado.nextInt();
							teclado.nextLine();
							
							if(radio<1 || radio > 100)
								System.out.println("Error! El rádio no está dentro del rango 1-100");
							else {
								//Area del circulo = radio^2*pi
								areacirculo=Math.pow(radio,2)*Math.PI;
								System.out.println("El área del círculo es " + areacirculo);
							}
						}while(radio<1 || radio > 100);
						break;
					}
					case 2: //Área del Cuadrado
					{
						System.out.println("\nHas seleccionado Calcular el área del cuadrado");
						
						do {
							System.out.print("Introduzca el lado [5-20]: ");
							lado=teclado.nextInt();
							teclado.nextLine();
							
							if(lado<5 || lado>20)
								System.out.println("Error! El lado no está dentro del rango 5-20");
							else {
								//Área del cuadrado = lado*lado;
								area=lado*lado;
								System.out.println("El área del cuadrado es: " + area);
							}
						}while(lado<5 || lado>20);
						break;
					}
					case 3: //Área del Rectángulo
					{
						System.out.println("\nHas seleccionado Calcular el área del rectángulo");
						
						do { //Pedimos la base y comprobamos que esté en el rango correcto
							System.out.print("Introduzca la base [2-25]: ");
							base=teclado.nextInt();
							teclado.nextLine();
							
							if(base<2 || base>25)
								System.out.println("Error! La base no está dentro del rango 2-25");
							else {
								do { //Pedimos la altura y comprobamos que esté en el rango correcto
									System.out.print("Introduzca la altura [2-25]: ");
									altura=teclado.nextInt();
									teclado.nextLine();
									
									if(altura<2 || altura >25)
										System.out.println("Error! La altura no está dentro del rango 2-25");
									else {
										//Área del rectángulo = base*altura
										area=base*altura;
										System.out.println("El área del rectángulo es: " + area);
									}
								}while(altura<2 || altura>25); //Si la altura está fuera del rango
							}
						}while(base<2 || base>25); //Si la base está fuera del rango
						break;
					}
					case 4: //Área del Triángulo
					{
						System.out.println("\nHas seleccionado Calcular el área del triángulo");
						
						do { //Pedimos la base y comprobamos que esté en el rango correcto
							System.out.print("Introduzca la base [2-25]: ");
							base=teclado.nextInt();
							teclado.nextLine();
							
							if(base<2 || base>25)
								System.out.println("Error! La base no está dentro del rango 2-25");
							else {
								do { //Pedimos la altura y comprobamos que esté en el rango correcto
									System.out.print("Introduzca la altura [2-25]: ");
									altura=teclado.nextInt();
									teclado.nextLine();
									
									if(altura<2 || altura >25)
										System.out.println("Error! La altura no está dentro del rango 2-25");
									else { //Área del triángulo = base*altura/2
										area=base*altura/2.0f;
										System.out.println("El área del triángulo es: " + area);
									}
								}while(altura<2 || altura>25); //Si la altura está fuera del rango
							}
						}while(base<2 || base>25); //Si la base está fuera del rango
						break;
					}
					case 0:
					{
						//Mensaje de despedida cuando salimos del programa
						System.out.println("\nAdiós, que tenga un buen día ;)");
						break;
					}
					default: 
					{
						//Cuando la opción introducida no está dentro del rango
						System.out.println("Error! La opción no está dentro del rango 0-4");
						break;
					}
				}	
		}while(opcion!=0);
		
		System.out.println("\n\n\n----FIN DEL PROGRAMA ÁREAS EN GEOMETRÍA----");
	}
}
