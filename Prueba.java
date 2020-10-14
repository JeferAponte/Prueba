import java.util.Scanner;
public class Scanner1
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("\nDigite su nombre: ");
		String nombre_completo = sc.nextLine();
		System.out.println("\nBienvenido: "+nombre_completo);
	}
}
