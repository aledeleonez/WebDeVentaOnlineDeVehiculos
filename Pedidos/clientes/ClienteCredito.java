package clientes;

import pedidos.Pedido;
import pedidos.PedidoCredito;

public class ClienteCredito extends Cliente  
{  
    protected Pedido creaPedido(double importe)  
    {  
        return new PedidoCredito(importe);  
    }  
}
