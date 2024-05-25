import java.util.Scanner;

public class Numeros {
//if else
    private int numero1, numero2, numero3;

    public Numeros(int numero1, int numero2, int numero3) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.numero3 = numero3;
    }

    public int getNumero1() {
        return numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public int getNumero3() {
        return numero3;
    }

    public void determinarSigno() {
        if (numero1 > 0) {
            System.out.println("El número es positivo.");
        } else if (numero1 < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es cero.");
        }
    }

    public void verificarParidad() {
        if (numero2 % 2 == 0) {
            System.out.println("El número es par.");
        } else {
            System.out.println("El número es impar.");
        }
    }

    public void encontrarMayor() {
        int mayor = numero1;
        if (numero2 > mayor) {
            mayor = numero2;
        }
        if (numero3 > mayor) {
            mayor = numero3;
        }
        System.out.println("El mayor de los tres números es: " + mayor);
    }

    public void verificarBisiesto() {
        if ((numero1 % 4 == 0 && numero1 % 100 != 0) || (numero1 % 400 == 0)) {
            System.out.println("El año " + numero1 + " es bisiesto.");
        } else {
            System.out.println("El año " + numero1 + " no es bisiesto.");
        }
    }
//bucles for
    public void imprimirAscendente() {
        System.out.println("Números del 1 al 20 en orden ascendente:");
        for (int i = 1; i <= 20; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public void imprimirHasta(int numero) {
        System.out.println("Números del 1 al " + numero + ":");
        for (int i = 1; i <= numero; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public void sumarPositivos() {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        int num;
        do {
            System.out.print("Ingrese un número positivo (ingrese un negativo para terminar): ");
            num = scanner.nextInt();
            if (num >= 0) {
                suma += num;
            }
        } while (num >= 0);
        System.out.println("La suma de los números positivos ingresados es: " + suma);
        scanner.close();
    }

    public void generarFibonacciHasta(int limite) {
        int a = 0, b = 1;
        System.out.print("Secuencia de Fibonacci hasta " + limite + ": ");
        while (a <= limite) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
        System.out.println();
    }
//bucles for
    public void imprimirPares() {
        System.out.println("Números pares del 2 al 20:");
        for (int i = 2; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public void mostrarTablaMultiplicar(int numero) {
        System.out.println("Tabla de multiplicar del " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }

    public int sumarParesHastaN(int n) {
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                suma += i;
            }
        }
        return suma;
    }

    public int calcularFactorial(int numero) {
        int factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
