public class Coche_CRUD_Impl implements Coche_CRUD{

    @Override
    public void save() {
        System.out.println("estoy guardando un elemento");
    }

    @Override
    public String findAll() {
        String mensaje="estoy consultando todos los elementos";
        System.out.println(mensaje);
        return mensaje;
    }

    @Override
    public void delete() {
        System.out.println("estoy eliminando un elemento");
    }
}
