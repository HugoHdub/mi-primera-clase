public class Linterna {
    // La marca de la linterna
    private String marcaLinterna;
    // La cantidad de batería restante de la linterna
    private int porcentajeBatería;
    // Indica si la linterna está encendida o apagada
    private boolean encendido;
    /**
     * Crea una Linterna y establece la marca y el porcentaje de batería de la misma.
     */
    public Linterna(String marcaDeLinterna, int porcentajeDeBatería) {
        marcaLinterna = marcaDeLinterna;
        porcentajeBatería = porcentajeDeBatería;
        encendido = true;
    }
    
    /**
     * Devuelve la marca de la linterna.
     */
    public String getMarcaLinterna() {
        return marcaLinterna;    
    }
    
    /**
     * Devuelve el porcentaje de batería restante en la linterna.
     */
    public int getPorcentajeBatería() {
        return porcentajeBatería;
    }
    
    /**
     * Devuelve el estado de la linterna, si está encendida o apagada.
     */
    public boolean isEncendido() {
        return encendido;
    }
    
    /**
     * Cambia la marca de la linterna.
     */
    public void marcaLinterna(String marcaDeLinterna) {
        marcaLinterna = marcaDeLinterna;
    }
    
    /**
     * Modifica el porcentaje de batería de la linterna. (Mod.1 y 2)
     */
    public void modificarPorcentajeBatería(int cambio) {
        porcentajeBatería = porcentajeBatería - cambio;
    }
    
    /**
     * Cambia el estado de la linterna encendido/apagado.
     */
    public void alternarEncendido() {
        if (encendido == true) {
            encendido = false;
        }
        else {
            encendido = true;
        }
    }
    
    /**
     * Muestra un mensaje con la batería restante de la linterna. (Mod.3 y 5)
     */
    public void imprimirDetalles (){
        if (encendido = true) {
            System.out.println ("La marca de la linterna es: " + marcaLinterna + " La linterna tiene " + porcentajeBatería + " % restante. La linterna está encendida.");
        }
        else {
            System.out.println ("La marca de la linterna es: " + marcaLinterna + " La linterna tiene " + porcentajeBatería + " % restante. La linterna está apagada.");
        }
    }
    
    /**
     * Muestra un String que contiene el estado de la linterna. (Mod.4)
     */
    public String getEstado () {
        if (encendido = true) {
            return "Marca: " + marcaLinterna + " Porcentaje: " + porcentajeBatería + " Estado: Encendida";
        } else {
            return "Marca: " + marcaLinterna + " Porcentaje: " + porcentajeBatería + " Estado: Apagada";
        }
    }
}
