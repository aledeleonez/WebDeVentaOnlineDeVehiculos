package vendedor;

import builders.ConstructorDocumentacionVehiculo;
import documentacion.Documentacion;

public class Vendedor  
{  
    protected ConstructorDocumentacionVehiculo constructor;  
  
    public Vendedor(ConstructorDocumentacionVehiculo constructor)  
    {  
        this.constructor = constructor;  
    }  
  
    public Documentacion construye(String nombreCliente)  
    {  
        constructor.construyeSolicitudPedido(nombreCliente);  
        constructor.construyeSolicitudMatriculacion  
           (nombreCliente);  
        Documentacion documentacion = constructor.resultado();  
        return documentacion;  
    }  
}
