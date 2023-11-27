package Listados;
import Ventas.*;
import java.util.List;

public class ListaVentas {
    public List<Cigarrillos> listaCigarrillos;
    public List<Golosinas> listaGolosinas;
    public List<Villarino> listaVillarino;
    public List<CargasVirtuales> listaCargasVirtuales;
    public List<Varios> listaVarios;

    public int totalCigarrillos(){
        int total= 0;
        for (Cigarrillos cigarrillos : listaCigarrillos)
            total += cigarrillos.getPrice();
        return total;
    }

    public int totalGolosinas(){
        int total= 0;
        for(Golosinas golosinas : listaGolosinas)
            total+= golosinas.getPrice();
        return total;
    }

    public int totalVillarino(){
        int total= 0;
        for(Villarino cargas : listaVillarino)
            total+= cargas.getPrice();
        return total;
    }

    public int totalCargasVirtuales(){
        int total= 0;
        for(CargasVirtuales cargas : listaCargasVirtuales)
            total+= cargas.getPrice();
        return total;
    }

    public int totalVarios(){
        int total= 0;
        for(Varios varios : listaVarios)
            total+= varios.getPrice();
        return total;
    }
}
