<<<<<<< HEAD
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Cliente extends Conexion {
    public Cliente() throws IOException {
        super("cliente");
    }

    public void iniciarCliente() {
        Scanner scann = new Scanner(System.in);
        String mensaje;
        try {
            mensajeAEnviar = new DataOutputStream(socketCliente.getOutputStream());
            mensaje = scann.nextLine();
            while (!mensaje.equals("no")) {
                mensajeAEnviar.writeUTF(mensaje);
                System.out.println("Ingrese el nuevo valor a enviar");
                mensaje = scann.nextLine();
            }
            System.out.println("break");
            socketCliente.close();
        } catch (Exception e) {
        }
    }
}
=======
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Cliente extends Conexion {
    public Cliente() throws IOException {
        super("cliente");
    }

    public void iniciarCliente() {
        Scanner scann = new Scanner(System.in);
        String mensaje;
        try {
            mensajeAEnviar = new DataOutputStream(socketCliente.getOutputStream());
            mensaje = scann.nextLine();
            while (!mensaje.equals("no")) {
                mensajeAEnviar.writeUTF(mensaje);
                System.out.println("Ingrese el nuevo valor a enviar");
                mensaje = scann.nextLine();
            }
            System.out.println("break");
            socketCliente.close();
        } catch (Exception e) {
        }
    }
}
>>>>>>> 66d0425dac58438aa03045f56b774262f0b3ab05
