package org.example;

public class Ex3_Area_Perim {

    public int area(int base, int altura) {
        int area = base * altura;
        return area;
    }

    public int perimetro(int baseP, int alturaP){
        int perim= 2*baseP + 2* alturaP;
        return perim;
        }


    public int isTriangle(int a, int b, int c) {
        if (a < b + c && b < a + c && c < a + b) {
            System.out.println("é um triângulo!!");
            return 1;
        } else{
            System.out.println("Não é um triângulo");
            return 0;
        }
    }
}

