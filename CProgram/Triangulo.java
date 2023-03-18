public class Triangulo {
    private double lado1;
    private double lado2;
    private double lado3;

    public void setLados(double l1, double l2, double l3) {
        this.lado1 = l1;
        this.lado2 = l2;
        this.lado3 = l3;
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }

    public String definirTipo() {
        if (lado1 == lado2 && lado2 == lado3) {
            return "Equilátero";
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            return "Isósceles";
        } else {
            return "Escaleno";
        }
    }

    public static void main(String[] args) {
        Triangulo[] triangulos = new Triangulo[10];

        triangulos[0] = new Triangulo();
        triangulos[0].setLados(3, 4, 5);

        triangulos[1] = new Triangulo();
        triangulos[1].setLados(2, 2, 3);

        // ... adicione os outros triângulos como desejar

        for (int i = 0; i < triangulos.length; i++) {
            if (triangulos[i] != null) {
                System.out.println("Triângulo " + (i + 1) + ":");
                System.out.println("Lados: " + triangulos[i].getLado1() + ", " + triangulos[i].getLado2() + ", "
                        + triangulos[i].getLado3());
                System.out.println("Perímetro: " + triangulos[i].calcularPerimetro());
                System.out.println("Tipo: " + triangulos[i].definirTipo());
                System.out.println();
            }
        }
    }

}
