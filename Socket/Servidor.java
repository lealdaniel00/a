<<<<<<< HEAD
import java.io.*;

public class Servidor extends Conexion {
    String mensaje;

    public Servidor() throws IOException {
        super("servidor");
    }

    public void iniciarServidor() {
        try {
            System.out.println("EL servidor se ha iniciado, estamos esperando conectar el cliente");
            socketCliente = socketServidor.accept();
            System.out.println("Se conecto un cliente, felicitaciones, lo has logrado.");
            mensajeAEnviar = new DataOutputStream(socketCliente.getOutputStream());
            mensajeAEnviar.writeUTF("RR");
            BufferedReader mensajeEntrante = new BufferedReader(new InputStreamReader(socketCliente.getInputStream()));
            while ((mensaje = mensajeEntrante.readLine()) != null) {
                System.out.println(mensaje);
            }
            System.out.println("SE ACABO, eso es too amigos");
            socketServidor.close();
        } catch (Exception e) {
            System.out.println("Se rompio el codigo, lo lamento");
            // TODO: handle exception
        }
    }
}
=======
import java.io.*;

public class Servidor extends Conexion {
    String mensaje;

    public Servidor() throws IOException {
        super("servidor");
    }

    public void iniciarServidor() {
        try {
            System.out.println("EL servidor se ha iniciado, estamos esperando conectar el cliente");
            socketCliente = socketServidor.accept();
            System.out.println("Se conecto un cliente, felicitaciones, lo has logrado.");
            mensajeAEnviar = new DataOutputStream(socketCliente.getOutputStream());
            mensajeAEnviar.writeUTF("RR");
            BufferedReader mensajeEntrante = new BufferedReader(new InputStreamReader(socketCliente.getInputStream()));
            while ((mensaje = mensajeEntrante.readLine()) != null) {
                System.out.println(mensaje);
            }
            System.out.println("SE ACABO, eso es too amigos");
            socketServidor.close();
        } catch (Exception e) {
            System.out.println("Se rompio el codigo, lo lamento");
            // TODO: handle exception
        }
    }
}
>>>>>>> 66d0425dac58438aa03045f56b774262f0b3ab05
