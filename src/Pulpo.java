import Interfaces.Comunicable;

// NO SE PUEDE EXTENDER DE MAS DE UNA CLASE ABSTRACTA, PERO SI SE PUEDE IMPLEMENTAR MAS DE UNA INTERFAZ.
public class Pulpo extends CriaturasMarinas implements Comunicable {

    private int tentaculos;
    
    public Pulpo(String nombre , int tentaculos) {
        super(nombre);
        this.tentaculos = tentaculos;
    }

    @Override
    public void nadar() {

        System.out.println(getNombre() + " Esta nadando con sus " + getTentaculos() + " Tentaculos" );

    }

    public int getTentaculos(){
        return tentaculos;
    }
    
    public void setTentaculos( int tentaculos){
        this.tentaculos = tentaculos;
    }

    @Override
    public void comunicarse() {
        System.out.println(getNombre() + " Se comunica con el Tacto, la visualización y el oído");
    }



}
