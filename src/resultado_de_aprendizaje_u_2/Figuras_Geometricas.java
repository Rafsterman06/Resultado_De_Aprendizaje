package resultado_de_aprendizaje_u_2;
/**
 *
 * @author rafael
 */
public class Figuras_Geometricas {
    /**
     * Atributos de la clase, sirven para realizar las operaciones, NO EN TODAS
     * LAS OPERACIONES SE USAN LOS TRES ATRIBUTOS, SOLO ACEPTA NUMEROS ENTEROS
     */
    private int num1,num2;
    /*
    Constructor sin parametros, rellena los atributos de la clase con valor 0
    por default
    */
    public Figuras_Geometricas(){
        this.num1=0;
        this.num2=0;
    }
    /*
    Constructor con parametros, rellena los atributos de la clase con los
    valores que se les asignen como argumentos
    */
    public Figuras_Geometricas(int num1, int num2){
        this.num1=num1;
        this.num2=num2;
    }
    /*
    Metodos get y set del atributo num1
    */
    public void setnum1(int num1){
        this.num1=num1;
    }
    public int getnum1(){
        return this.num1;
    }
    /*
    Metodos get y set del atributo num2
    */
    public void setnum2(int num1){
        this.num2=num1;
    }
    public int getnum2(){
        return this.num2;
    }
    /*
    Area y perimetro de un triangulo equilatero
    */
    public double area_triangulo(int lado, int altura){
        return ((lado*altura)/2);
    }
    public double perimetro_triangulo(int lado){
        return 3*lado;
    }
    /*
    Area y perimetro de un cuadrado
    */
    public double area_cuadrado(int lado){
        return lado*lado;
    }
    public double perimetro_cuadrado(int lado){
        return lado*4;
    }
    /*
    Area y perimetro de un rectangulo
    */
    public double area_rectangulo(int altura, int base){
        return altura*base;
    }
    public double perimetro_rectangulo(int altura, int base){
        return (2*altura)+(2*base);
    }
    /*
    Area y perimetro o circuferencia de un circulo
    */
    public double area_circulo(double radio){
        double area=radio*radio*3.1415926;
        return area;
    }
    public double perimetro_circulo(double radio){
        double perimetro=2*radio*3.1415926;
        return perimetro;
    }
    /*
    Area y perimetro de un pentagono
    */
    public double area_pentagono(double lado, double apotema){
        double area=2.5*lado*apotema;
        return area;
    }
    public double perimetro_pentagono(double lado){
        return 5*lado;
    }
    /*
    Area y perimetro de un hexagono
    */
    public double area_hexagono(double lado, double apotema){
        double area=3*lado*apotema;
        return area;
    }
    public double perimetro_hexagono(double lado){
        return 6*lado;
    }
}
