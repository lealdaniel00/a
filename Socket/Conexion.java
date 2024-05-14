import java.io.*;
import java.net.*;

public class Conexion {
    // puerto
    final int port = 1234;
    // host
    final String host = "localhost";
    protected Socket socketCliente;
    protected ServerSocket socketServidor;
    protected DataOutputStream mensajeAEnviar;
    protected DataOutputStream salidaAEnviar;

    public Conexion(String tipo) throws IOException {
        if (tipo == "servidor") {
            socketServidor = new ServerSocket(port);
            socketCliente = new Socket();
        } else {
            socketCliente = new Socket(host, port);
        }
    }
}
