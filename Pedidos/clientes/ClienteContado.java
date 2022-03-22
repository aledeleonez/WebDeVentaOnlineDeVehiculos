package clientes;

import pedidos.Pedido;
import pedidos.PedidoContado;

public class ClienteContado extends Cliente  
{  
    protected Pedido creaPedido(double importe)  
    {  
        return new PedidoContado(importe);  
    }  
} 
