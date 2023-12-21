package aplicacao;

import entidades.Circulo;
import entidades.Forma;
import entidades.Retangulo;
import enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Forma> list = new ArrayList<>();

        System.out.print("Entre com o número de formas: ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            System.out.println("Forma: # ("+(i + 1)+")");
            System.out.print("Retângulo ou Circulo: (R/C): ");
            char p = sc.next().charAt(0);
            System.out.println("Cor (AZUL/VERMELHO/PRETO): ");
            sc.nextLine();
            Color cor = Color.valueOf(sc.nextLine());

            if(p == 'R'){
                System.out.print("Largura: ");
                double largura = sc.nextDouble();
                System.out.print("Altura: ");
                double altura = sc.nextDouble();

                Forma forma = new Retangulo(cor,largura,altura);

                list.add(forma);

            }else{
                System.out.print("Raio: ");
                double raio = sc.nextDouble();

                Forma forma = new Circulo(cor,raio);

                list.add(forma);
            }
        }

        System.out.println("FORMA DAS AREAS: ");
        for(Forma c: list){
            System.out.println(String.format("%.2f",c.area()));
        }

        sc.close();
    }
}
