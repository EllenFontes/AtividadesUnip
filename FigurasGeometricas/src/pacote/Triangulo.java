package pacote;

public class Triangulo implements FiguraGeometricaa {
    
    private String nome = "Triangulo";
    private int base;
    private int altura;
    private int ladoA;
    private int ladoB;
    private int ladoC;
    
    @Override
    public String getNome() {
        return nome;
    }
    
    @Override
    public int getArea() {
        int area = (base * altura) / 2;
        return area;
    }
    
    @Override
    public int getPerimetro() {
        int perimetro = ladoA + ladoB + ladoC;
        return perimetro;
    }
    
    
    
}
