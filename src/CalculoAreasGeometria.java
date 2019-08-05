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
		
		System.out.println("---- INICIO PROGRAMA �REAS EN GEOMETR�A ----\n\n");
		
		System.out.println("Bienvenido a la calculadora de �reas");
		
		//Mostramos el men� de inicio y esperamos a que el usuario introduzca una opci�n
		do {

				System.out.println("\n1. �rea del C�rculo\n2. �rea del Cuadrado\n3. �rea del Rect�ngulo\n4. �rea del Tri�ngulo\n0. Salir del programa");
			do {	
				System.out.print("Introduzca la opci�n [0-4]: ");
				
				opcion=teclado.nextInt();
				teclado.nextLine();
				
				if(opcion<0 || opcion>4)
					//Cuando la opci�n introducida no est� dentro del rango
					System.out.println("Error! La opci�n no est� dentro del rango 0-4");
				
			}while(opcion<0 || opcion>4); //Si la opci�n introducida est� fuera del rango	
				
				switch(opcion) //Seg�n sea la opci�n escogida realizamos el c�lculo correspondiente
				{
					case 1: //Area del C�rculo
					{
						System.out.println("\nHas seleccionado Calcular el �rea del c�rculo");
						
						do {
							System.out.print("Introduzca el radio [1-100]: ");
							radio=teclado.nextInt();
							teclado.nextLine();
							
							if(radio<1 || radio > 100)
								System.out.println("Error! El r�dio no est� dentro del rango 1-100");
							else {
								//Area del circulo = radio^2*pi
								areacirculo=Math.pow(radio,2)*Math.PI;
								System.out.println("El �rea del c�rculo es " + areacirculo);
							}
						}while(radio<1 || radio > 100);
						break;
					}
					case 2: //�rea del Cuadrado
					{
						System.out.println("\nHas seleccionado Calcular el �rea del cuadrado");
						
						do {
							System.out.print("Introduzca el lado [5-20]: ");
							lado=teclado.nextInt();
							teclado.nextLine();
							
							if(lado<5 || lado>20)
								System.out.println("Error! El lado no est� dentro del rango 5-20");
							else {
								//�rea del cuadrado = lado*lado;
								area=lado*lado;
								System.out.println("El �rea del cuadrado es: " + area);
							}
						}while(lado<5 || lado>20);
						break;
					}
					case 3: //�rea del Rect�ngulo
					{
						System.out.println("\nHas seleccionado Calcular el �rea del rect�ngulo");
						
						do { //Pedimos la base y comprobamos que est� en el rango correcto
							System.out.print("Introduzca la base [2-25]: ");
							base=teclado.nextInt();
							teclado.nextLine();
							
							if(base<2 || base>25)
								System.out.println("Error! La base no est� dentro del rango 2-25");
							else {
								do { //Pedimos la altura y comprobamos que est� en el rango correcto
									System.out.print("Introduzca la altura [2-25]: ");
									altura=teclado.nextInt();
									teclado.nextLine();
									
									if(altura<2 || altura >25)
										System.out.println("Error! La altura no est� dentro del rango 2-25");
									else {
										//�rea del rect�ngulo = base*altura
										area=base*altura;
										System.out.println("El �rea del rect�ngulo es: " + area);
									}
								}while(altura<2 || altura>25); //Si la altura est� fuera del rango
							}
						}while(base<2 || base>25); //Si la base est� fuera del rango
						break;
					}
					case 4: //�rea del Tri�ngulo
					{
						System.out.println("\nHas seleccionado Calcular el �rea del tri�ngulo");
						
						do { //Pedimos la base y comprobamos que est� en el rango correcto
							System.out.print("Introduzca la base [2-25]: ");
							base=teclado.nextInt();
							teclado.nextLine();
							
							if(base<2 || base>25)
								System.out.println("Error! La base no est� dentro del rango 2-25");
							else {
								do { //Pedimos la altura y comprobamos que est� en el rango correcto
									System.out.print("Introduzca la altura [2-25]: ");
									altura=teclado.nextInt();
									teclado.nextLine();
									
									if(altura<2 || altura >25)
										System.out.println("Error! La altura no est� dentro del rango 2-25");
									else { //�rea del tri�ngulo = base*altura/2
										area=base*altura/2.0f;
										System.out.println("El �rea del tri�ngulo es: " + area);
									}
								}while(altura<2 || altura>25); //Si la altura est� fuera del rango
							}
						}while(base<2 || base>25); //Si la base est� fuera del rango
						break;
					}
					case 0:
					{
						//Mensaje de despedida cuando salimos del programa
						System.out.println("\nAdi�s, que tenga un buen d�a ;)");
						break;
					}
					default: 
					{
						//Cuando la opci�n introducida no est� dentro del rango
						System.out.println("Error! La opci�n no est� dentro del rango 0-4");
						break;
					}
				}	
		}while(opcion!=0);
		
		System.out.println("\n\n\n----FIN DEL PROGRAMA �REAS EN GEOMETR�A----");
	}
}
