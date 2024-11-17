package taller3.televisores;

public class TV {
    
    private Marca marca;
    private int canal = 1;
    private int precio = 500;
    private boolean estado;
    private int volumen = 1;
    private Control control;
    private static int numTV;
    
    public TV(Marca marca, boolean estado) {
        this.marca = marca;
        this.estado = estado;
        numTV++;
    }
    
    public void setMarca(Marca marca) {
        this.marca = marca;
    }
    
    public void setControl(Control control) {
        this.control = control;
    }
    
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    public void setVolumen(int volumen) {
        if (volumen >= 0 && (this.volumen) <= 7) {
            this.volumen = volumen;
        }
    }
    
    public void setCanal(int canal) {
        if (estado) {
            if (canal >= 1 && canal <= 120) {
                this.canal = canal;
            }
        }
    }

    public static void setNumTV(int numTV) {
        TV.numTV = numTV;
    }   
    
    public void turnOn() {
        estado = true;
    }
    
    public void turnOff() {
        estado = false;
    }
    
    public void canalUp() {
        if (estado) {
            if (canal < 120) {
                canal++;
            }
        }
    }
    
    public void canalDown() {
        if (estado) {
            if (canal > 1) {
                canal--;
            }
        }
    }
    
    public void volumenUp() {
        if (estado) {
            if (volumen < 7) {
                volumen++;
            }
        }
    }
    
    public void volumenDown() {
        if (estado) {
            if (volumen > 0) {
                volumen--;
            }
        }
    }
    
    public Marca getMarca() {
        return marca;
    }
    
    public int getPrecio() {
        return precio;
    }
    
    public int getVolumen() {
        return volumen;
    }
    
    public int getCanal() {
        return canal;
    }
    
    public Control getControl() {
        return control;
    }
    
    public static int getNumTV() {
        return numTV;
    }
    
    public boolean getEstado() {
        return estado;
    }
}
