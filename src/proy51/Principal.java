package proy51;
public class Principal {
    public static void main(String[] args) {
       Motor m1 = new Motor();
       Carro c1 = new Carro(m1);
       c1.avanzar();
    }
    
}
