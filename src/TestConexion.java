public class TestConexion {
    public static void main(String[] args) throws Exception {
        try (Conexion con =new Conexion()){
            con.leerDatos();
        } catch (IllegalStateException ex) {
            System.out.println("Ejecutando cath");
            ex.printStackTrace();
        }

        /* Conexion con = null;
        try {
            con = new Conexion();
            con.leerDatos();
        } catch (IllegalStateException ex) {
            ex.printStackTrace();
        } finally {
            if (con != null) {
                con.cerrar();
            }
        } */
    }
}
