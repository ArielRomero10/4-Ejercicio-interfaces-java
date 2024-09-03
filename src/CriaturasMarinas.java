public abstract class CriaturasMarinas {

    private String nombre;
    

    public CriaturasMarinas(String nombre) {
        this.nombre = nombre;
    }


    public abstract void nadar();


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    

}
