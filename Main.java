import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner ler = new Scanner(System.in);
        String nome;
        float peso1, altura1;
        float imc1;
        String classifica1;

        System.out.println("Nome da Pessoa 1: ");
        nome = ler.nextLine();
        System.out.println("Peso da Pessoa 1 (kg): ");
        peso1 = ler.nextFloat();
        System.out.println("Altura da Pessoa 1 (m): ");
        altura1 = ler.nextFloat();
        ler.nextLine();

        imc1 = calcularIMC(peso1,altura1);

        classifica1 = resultadoIMC(imc1);

        System.out.printf("IMC de " + nome + " = %.1f - %s\n",imc1,classifica1);
    }

    static float calcularIMC(float p, float h)
    {
        return p/(h*h);
    }


    static String resultadoIMC(float imc)
    {
        String result;
        if (imc <= 19)
            result = "Abaixo do Peso";
        else
        if (imc <= 25)
            result = "Peso ideal";
        else
        if (imc <= 30)
            result = "Acima do Peso";
        else
        if (imc <= 35)
            result = "Obesidade Leve";
        else
            result = "Obesidade";

        return result;
    }
}
