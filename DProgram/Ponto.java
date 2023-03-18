public class Ponto {
    private double x; // atributo para armazenar coordenada x
    private double y; // atributo para armazenar coordenada y

    // método construtor que inicializa os valores de x e y
    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // método para calcular a distância euclidiana entre dois pontos
    public double calcularDistancia(Ponto p) {
        double deltaX = this.x - p.x; // calcula a diferença entre as coordenadas x
        double deltaY = this.y - p.y; // calcula a diferença entre as coordenadas y
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY); // retorna a raiz quadrada da soma dos quadrados das
                                                             // diferenças
    }

    // getters e setters para os atributos x e y
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public static void main(String[] args) {
        // Criando dois objetos Ponto
        Ponto ponto1 = new Ponto(0, 0);
        Ponto ponto2 = new Ponto(0, 0);

        // Inicializando as coordenadas dos pontos
        ponto1.setX(2.0);
        ponto1.setY(3.0);
        ponto2.setX(5.0);
        ponto2.setY(7.0);

        // Calculando a distância entre os pontos
        double distancia = ponto1.calcularDistancia(ponto2);

        // Imprimindo os valores
        System.out.println("Coordenadas do ponto 1: (" + ponto1.getX() + ", " + ponto1.getY() + ")");
        System.out.println("Coordenadas do ponto 2: (" + ponto2.getX() + ", " + ponto2.getY() + ")");
        System.out.println("Distância entre os pontos: " + distancia);
    }
}