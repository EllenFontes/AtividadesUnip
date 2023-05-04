package pacote;

public class Quadrado implements FiguraGeometricaa {
    private String nome;
    private int area;
    private int perimetro;
    
    @Override
    public String getNome(){
        this.nome = "Quadrado";
        return nome;
    }
    
    @Override
    public int getArea(){
        return area;
    }
    
    @Override
    public int getPerimetro(){
        return perimetro;
    }
}
