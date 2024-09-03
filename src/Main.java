public class Main {
    public static void main(String[] args) throws Exception {
        // INSTANCIAMIENTO DE LAS CLASES

        Delfin delfin1 = new Delfin("Juan");
        Pulpo pulpo1 = new Pulpo("Paul", 8);

        System.out.println("---------INFORMACIÓN----------");
        
        System.out.println("-------------PULPO------------");
        System.out.println("El nombre del pulpo es: " + pulpo1.getNombre() + "\n" + "Tiene " + pulpo1.getTentaculos() + " Tentaculos");
        pulpo1.nadar();
        pulpo1.comunicarse();
        
        System.out.println("-----------DELFIN--------------");
        System.out.println("El nombre del delfin es: " + delfin1.getNombre());
        delfin1.nadar();
        delfin1.comunicarse();

    }
}
