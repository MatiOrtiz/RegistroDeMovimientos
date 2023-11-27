package Ventas;

public abstract class Productos {
    protected int precio;

    public void setPrice(int precio){
        this.precio=precio;
    }
    public int getPrice(){
        return precio;
    }
}
