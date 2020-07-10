package clases;

public class Libro {
    private String editorial;
    private Float precio;

    public Libro(){
        this.editorial="Sudamericana";
        this.precio=500.0f;
    }
    public Libro(String editorial,Float precio){
        this.editorial=editorial;
        this.precio=precio;
    }

    public String getEditorial() {
        return editorial;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }


}
