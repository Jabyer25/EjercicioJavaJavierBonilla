import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Selecciona un ejercicio: \n");
        System.out.println("Seleccione el ejercicio que desea ejecutar:");
        System.out.println("1. Determinar si un número ingresado por el usuario es positivo, negativo o cero.");
        System.out.println("2. Verificar si un número ingresado por el usuario es par o impar.");
        System.out.println("3. Encontrar el mayor de tres números ingresados por el usuario.");
        System.out.println("4. Determinar si un año ingresado por el usuario es bisiesto o no.");
        System.out.println("5. Imprimir los números del 1 al 20 en orden ascendente.");
        System.out.println("6. Imprimir todos los números desde 1 hasta un número ingresado por el usuario.");
        System.out.println("7. Sumar números positivos ingresados por el usuario, deteniéndose cuando ingresa un número negativo.");
        System.out.println("8. Generar la secuencia de Fibonacci hasta un número ingresado por el usuario.");
        System.out.println("9. Imprimir los números pares del 2 al 20.");
        System.out.println("10. Mostrar la tabla de multiplicar de un número ingresado por el usuario del 1 al 10.");
        System.out.println("11. Calcular la suma de todos los números pares desde 1 hasta un número ingresado por el usuario.");
        System.out.println("12. Calcular el factorial de un número ingresado por el usuario.");

        int opcion = scanner.nextInt();

        Numeros numeros = new Numeros(0, 0, 0);

        switch (opcion) {
            case 1:
                System.out.print("Ingrese un número: ");
                int num1 = scanner.nextInt();
                numeros = new Numeros(num1, 0, 0);
                numeros.determinarSigno();
                break;
            case 2:
                System.out.print("Ingrese un número: ");
                int num2 = scanner.nextInt();
                numeros = new Numeros(0, num2, 0);
                numeros.verificarParidad();
                break;
            case 3:
                System.out.println("Ingrese tres números separados por espacios: ");
                int num3 = scanner.nextInt();
                int num4 = scanner.nextInt();
                int num5 = scanner.nextInt();
                numeros = new Numeros(num3, num4, num5);
                numeros.encontrarMayor();
                break;
            case 4:
                System.out.print("Ingrese un año: ");
                int year = scanner.nextInt();
                numeros = new Numeros(year, 0, 0);
                numeros.verificarBisiesto();
                break;
            case 5:
                numeros.imprimirAscendente();
                break;
            case 6:
                System.out.print("Ingrese un número: ");
                int num6 = scanner.nextInt();
                numeros.imprimirHasta(num6);
                break;
            case 7:
                numeros.sumarPositivos();
                break;
            case 8:
                System.out.print("Ingrese un número para generar la secuencia de Fibonacci: ");
                int num7 = scanner.nextInt();
                numeros.generarFibonacciHasta(num7);
                break;
            case 9:
                numeros.imprimirPares();
                break;
            case 10:
                System.out.print("Ingrese un número para mostrar su tabla de multiplicar: ");
                int num8 = scanner.nextInt();
                numeros.mostrarTablaMultiplicar(num8);
                break;
            case 11:
                System.out.print("Ingrese un número entero positivo: ");
                int num9 = scanner.nextInt();
                int sumaPares = numeros.sumarParesHastaN(num9);
                System.out.println("La suma de todos los números pares hasta " + num9 + " es: " + sumaPares);
                break;
            case 12:
                System.out.print("Ingrese un número para calcular su factorial: ");
                int num10 = scanner.nextInt();
                int factorial = numeros.calcularFactorial(num10);
                System.out.println("El factorial de " + num10 + " es: " + factorial);
                break;
            default:
                System.out.println("Opción inválida.");
        }

        scanner.close();
    }
}
