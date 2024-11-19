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
     * Modifica el porcentaje de batería de la linterna.
     */
    public void modificarPorcentajeBatería(int cambio) {
        porcentajeBatería = cambio;
    }
    
    /**
     * Cambia el estado de la linterna encendido/apagado.
     */
    public void alternarEncendido() {
        if (encendido = true) {
            encendido = false;
        }
        else {
            encendido = true;
        }
    }
}