package examen;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

public class Archivo {

    public void EscribirArchivoCifrado(BigInteger e, BigInteger totient, BigInteger n, BigInteger[] cifrado) throws IOException {
        File archivo = new File("Cifrado.txt");
        FileWriter escritor = new FileWriter(archivo.getName());
        escritor.append(e + System.lineSeparator());
        escritor.append(totient + System.lineSeparator());
        escritor.append(n + System.lineSeparator());
        escritor.append(Arrays.toString(cifrado) + System.lineSeparator());
        escritor.close();
    }

    public void EscribirArchivoDescifrado(String mensaje) throws IOException {
        File archivo = new File("Descifrado.txt");
        FileWriter escritor = new FileWriter(archivo.getName());
        escritor.append("El mensaje es: " + mensaje);
        escritor.close();
    }

    public void LeerArchivo(Datos datos, Path ruta) throws IOException {
        datos.setE(new BigInteger(Files.readAllLines(ruta).get(0)));
        datos.setTotient(new BigInteger(Files.readAllLines(ruta).get(1)));
        datos.setN(new BigInteger(Files.readAllLines(ruta).get(2)));
        String cifrado = Files.readAllLines(ruta).get(3);
        cifrado = cifrado.replace("[", "");
        cifrado = cifrado.replace("]", "");
        String[] partes = cifrado.split(", ");
        BigInteger[] encriptado = new BigInteger[partes.length];
        for (int i = 0; i < partes.length; i++) {
            encriptado[i] = new BigInteger(partes[i]);
        }
        datos.setEncriptado(encriptado);
    }
}
