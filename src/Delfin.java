import Interfaces.Comunicable;

public class Delfin extends CriaturasMarinas implements Comunicable{

    public Delfin(String nombre){

        super(nombre);

    }

    @Override
    public void nadar(){

        System.out.println(getNombre() + " Esta saltando en el agua......");
    }

    @Override
    public void comunicarse() {
        System.out.println(getNombre() + " Emite sonido para comunicarse..");
    }
}
