package resultado_de_aprendizaje_u_2;
/**
 *
 * @author rafael
 */
public class Calculadora_Cientifica {
    /**
     * Atributos de la clase, sirven para realizar las operaciones, NO EN TODAS
     * LAS OPERACIONES SE USAN LOS TRES ATRIBUTOS, SOLO ACEPTA NUMEROS ENTEROS
     */
    private int num1,num2;
    /*
    Constructor sin parametros, rellena los atributos de la clase con valor 0
    por default
    */
    public Calculadora_Cientifica(){
        this.num1=0;
        this.num2=0;
    }
    /*
    Constructor con parametros, rellena los atributos de la clase con los
    valores que se les asignen como argumentos
    */
    public Calculadora_Cientifica(int num1, int num2){
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
    Realiza una suma de dos numeros
    */
    public int Suma(int num1,int num2){
        return (num1+num2);
    }
    /*
    Realiza una resta de dos numeros
    */
    public int Resta(int num1,int num2){
        return (num1-num2);
    }
    /*
    Realiza una multiplicacion de dos numeros
    */
    public int Multiplicacion(int num1,int num2){
        return (num1*num2);
    }
    /*
    Realiza una divicion de dos numeros
    */
    public String Divicion(float num1,float num2){
        try {
            return ""+(num1/num2);
        } catch (Exception e) {
            System.out.println("No se puede dividir entre cero");
        }
        return "Syntax error";
    }
    /*
    Saca el valor absoluto de un numero o la distancia respecto a 0
    */
    public int valor_absoluto(int num1){
        if (num1>0) {
            return num1;
        }
        else if (num1<0) {
            return (num1*(-1));
        }
        else if (num1==0) {
            return num1;
        }
        return num1;
    }
    /*
    Sacamos la potencia de un numero elevado a cierta potencia
    */
    public double potencia(int base,int exponente){
        double acumulador;
        acumulador=base;
        if (exponente>0) {
            for (int i = 1; i < exponente; i++) {
                acumulador*=base;
            }
            return acumulador;
        }
        else if (exponente<0) {
            exponente=valor_absoluto(exponente);
            for (int i = 1; i < exponente; i++) {
                acumulador*=base;
            }
            return (1/acumulador);
        }
        else if (exponente==0) {
            return 1;
        }
        return acumulador;
    }
    /*
    Convercion de grados a radianes
    */
    public double grad_rad(double grado){
        double rad;
        rad=grado*3.1415926/180;
        return rad;
    }
    /*
    Convercion de radianes a grados
    */
    public double rad_grad(double radian){
        double grado=radian*180/3.1415926;
        return grado;
    }
}
