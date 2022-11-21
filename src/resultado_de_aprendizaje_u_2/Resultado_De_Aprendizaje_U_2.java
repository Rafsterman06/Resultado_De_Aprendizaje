package resultado_de_aprendizaje_u_2;
import java.util.Scanner;
/**
 *
 * @author rafael
 * La clase Calculadora cientifica hace operaciones matematicas basicas, ademas
 * de realizar operaciones de una calculadora cientifica, como puede ser: valor
 * absoluto, un numero elevado a alguna potencia
 * @see Calculadora_Cientifica
 * @see Figuras_Geometricas
 * @see Scanner
 */
public class Resultado_De_Aprendizaje_U_2 {
    /*
    metodos de entrada de datos
    */
    public static int intentrada(String mensaje){
        Scanner sc=new Scanner(System.in);
        System.out.print(mensaje);
        return sc.nextInt();
    }
    /*
     Menus
     */
    public static void menufiguras(){
        /*
        objetos de la clase Figuras_Geometricas
        */
        Figuras_Geometricas triangulo=new Figuras_Geometricas();
        Figuras_Geometricas cuadrado=new Figuras_Geometricas();
        Figuras_Geometricas rectangulo=new Figuras_Geometricas();
        Figuras_Geometricas circulo=new Figuras_Geometricas();
        Figuras_Geometricas pentagono=new Figuras_Geometricas();
        Figuras_Geometricas hexagono=new Figuras_Geometricas();
        int opc=0;
        System.out.println("Ingresa una Opcion");
        System.out.println("'1' Triangulo");
        System.out.println("'2' Cuadrado");
        System.out.println("'3' Rectangulo");
        System.out.println("'4' Circulo");
        System.out.println("'5' Pentagono");
        System.out.println("'6' Hexagono");
        System.out.println("'7' Salir");
        opc=intentrada("");
        switch (opc) {
            case 1:
                //Triangulo
                triangulo.setnum1(intentrada("ingresa la base del triangulo "));
                triangulo.setnum2(intentrada("ingresa la altura triangulo "));
                System.out.println("El area de un triangulo con base "+triangulo.getnum1()+" y altura "+triangulo.getnum2()+" es "+triangulo.area_triangulo(triangulo.getnum1(), triangulo.getnum2()));
                System.out.println("El perimetro de un triangulo equilatero es "+triangulo.perimetro_triangulo(triangulo.getnum1())+"\n");
                menuprincipal();
                break;
            case 2:
                //Cuadrado
                cuadrado.setnum1(intentrada("ingresa el lado del cuadrado "));
                System.out.println("El area de un cuadrado con lado "+cuadrado.getnum1()+" es "+cuadrado.area_cuadrado(cuadrado.getnum1()));
                System.out.println("El perimetro de un triangulo con lado "+cuadrado.getnum1()+" es "+cuadrado.perimetro_cuadrado(cuadrado.getnum1())+"\n");
                menuprincipal();
                break;
            case 3:
                //Rectangulo
                rectangulo.setnum1(intentrada("ingresa el lado a del rectangulo "));
                rectangulo.setnum2(intentrada("ingresa el lado b del rectangulo "));
                System.out.println("El area de un rectangulo de altura "+rectangulo.getnum1()+" y base "+rectangulo.getnum2()+" es "+rectangulo.area_rectangulo(rectangulo.getnum1(), rectangulo.getnum2()));
                System.out.println("El perimetro de un rectangulo de altura "+rectangulo.getnum1()+" y base "+rectangulo.getnum2()+" es "+rectangulo.perimetro_rectangulo(rectangulo.getnum1(), rectangulo.getnum2())+"\n");
                menuprincipal();
    
                break;
            case 4:
                //Circulo
                circulo.setnum1(intentrada("ingresa el radio del circulo "));
                System.out.println("El area de un circulo con radio "+circulo.getnum1()+" es "+circulo.area_circulo(circulo.getnum1()));
                System.out.println("La circunferencia de un circulo con radio +"+circulo.getnum1()+" es "+circulo.perimetro_circulo(circulo.getnum1())+"\n");
                menuprincipal();
                break;
            case 5:
                //Pentagono
                pentagono.setnum1(intentrada("ingresa el valor del apotema del pentagno "));
                pentagono.setnum2(intentrada("ingresa el valor del lado del pentagono "));
                System.out.println("El area de un pentagono con apotema "+pentagono.getnum1()+" y lado "+pentagono.getnum2()+" es "+pentagono.area_pentagono(pentagono.getnum1(),pentagono.getnum2()));
                System.out.println("El perimetro de un pentagono con valor de un lado "+pentagono.getnum2()+" es "+pentagono.perimetro_pentagono(pentagono.getnum2())+"\n");
                menuprincipal();
                break;
            case 6:
                //Hexagono
                hexagono.setnum1(intentrada("ingresa el valor del apotema del hexagono "));
                hexagono.setnum2(intentrada("ingresa el valor del lado del hexagono "));
                System.out.println("El area de un hexagono con apotema "+hexagono.getnum1()+" y lado "+hexagono.getnum2()+" es "+hexagono.area_pentagono(pentagono.getnum1(),pentagono.getnum2()));
                System.out.println("El perimetro de un hexagono con valor de un lado "+hexagono.getnum2()+" es "+hexagono.perimetro_hexagono(hexagono.getnum2()));
                menuprincipal();
                break;
            case 7:
            break;
            default:
                System.out.println("Opcion NO valida");
                menufiguras();
                break;
        }
    }
    public static void menucalculadora(){
        /*
        objeto de la clase Calculadora_Cientifica
        */
        Calculadora_Cientifica cal=new Calculadora_Cientifica();
        int opc=0;
        System.out.println("Ingresa una Opcion");
        System.out.println("'1' Sumar");
        System.out.println("'2' Restar");
        System.out.println("'3' Multiplicar");
        System.out.println("'4' Dividir");
        System.out.println("'5' Valor Abdoluto");
        System.out.println("'6' Potencia");
        System.out.println("'7' Grados=>Radianes");
        System.out.println("'8' Radianes=>Grados");
        System.out.println("'9' Salir");
        opc=intentrada("");
        switch (opc) {
            case 1:
                //Sume
                cal.setnum1(intentrada("Ingresa un numero"));
                cal.setnum2(intentrada("Ingresa un numero"));
                System.out.println(cal .getnum1()+"+"+cal.getnum2()+"="+cal.Suma(cal.getnum1(), cal.getnum2()));
                menuprincipal();
                break;
            case 2:
                //Resta
                cal.setnum1(intentrada("Ingresa un numero"));
                cal.setnum2(intentrada("Ingresa un numero"));
                System.out.println(cal.getnum1()+"-"+cal.getnum2()+"="+cal.Resta(cal.getnum1(), cal.getnum2()));
                menuprincipal();
                break;
            case 3:
                //Multiplicacion
                cal.setnum1(intentrada("Ingresa un numero"));
                cal.setnum2(intentrada("Ingresa un numero"));
                System.out.println(cal.getnum1()+"*"+cal.getnum2()+"="+cal.Multiplicacion(cal.getnum1(), cal.getnum2()));
                menuprincipal();
                break;
            case 4:
                //Divicion
                cal.setnum1(intentrada("Ingresa un numero"));
                cal.setnum2(intentrada("Ingresa un numero"));
                System.out.println(cal.getnum1()+"/"+cal.getnum2()+"="+cal.Divicion(cal.getnum1(), cal.getnum2()));
                menuprincipal();
                break;
            case 5:
                //Valor Absoluto
                cal.setnum1(intentrada("Ingresa un numero"));
                System.out.println("Valor absoluto de "+cal.getnum1()+"="+cal.valor_absoluto(cal.getnum1()));
                menuprincipal();
                break;
            case 6:
                //Potencia de un numero
                cal.setnum1(intentrada("Ingresa un numero"));
                cal.setnum2(intentrada("Ingresa un numero"));
                System.out.println(cal.getnum1()+" elevado a "+cal.getnum2()+"="+cal.potencia(cal.getnum1(),cal.getnum2()));
                menuprincipal();
                break;
            case 7:
                //Grados=>Radianes
                cal.setnum1(intentrada("Ingresa un numero"));
                System.out.println("Grados==>Radianes = "+cal.grad_rad(cal.getnum1()));
                menuprincipal();
                break;
            case 8:
                //Radianes=>Grado
                cal.setnum1(intentrada("Ingresa un numero"));
                System.out.println("Radianes==>Grados = "+cal.rad_grad(cal.getnum1()));
                menuprincipal();
                break;
            case 9:
                break;
            default:
                System.out.println("Opcion NO valida");
                menucalculadora();
                break;
        }
    }
    public static void menuprincipal() {
        int menu1=0;
        System.out.println("Ingresa una Opcion");
        System.out.println("'1' Calculadora Cientifica");
        System.out.println("'2' Figuras Geometricas");
        System.out.println("'3' Salir");
        menu1=intentrada("");
        switch (menu1){
            case 1:
                menucalculadora();
                break;
            case 2:
                menufiguras();
                break;
            case 3:
                break;
            default:
                System.out.println("Opcion NO valida");
                menuprincipal();
        }
    }
    public static void main(String[] args) {
        menuprincipal();
    }
}
