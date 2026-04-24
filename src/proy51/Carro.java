package proy51;
public class Carro {
    private String placa;
    private Motor motor;
    public Carro(Motor motor){
        this.motor = motor;
    }
    public void avanzar (){
        motor.arrancar();
        System.out.println("Carro avanzando...");
    }
}
