package examen;

import java.math.BigInteger;
import java.util.*;
import java.io.*;

public class Cifrado {

    /*
    Para el algortimo RSA se necesitan:
    -numeros primos p y q
    -n = p*q
    -phi = (p-1)(q-1)
    d = e^1 mod totient
     */
    //GENERAR PRIMOS
    public BigInteger generarP(int tamPrimo) {
        return new BigInteger(tamPrimo, 10, new Random());
    }

    public BigInteger generarQ(int tamPrimo, BigInteger p) {
        BigInteger q;
        do {
            q = new BigInteger(tamPrimo, 10, new Random());
        } while (q.compareTo(p) == 0);
        //Regresa p y q en un arreglo BigInteger[p,q]
        return q;
    }

    //GENERAR CLAVES
    public BigInteger generarN(BigInteger p, BigInteger q) {
        return p.multiply(q);
    }

    public BigInteger generarPhi(BigInteger p, BigInteger q) {
        BigInteger totient = p.subtract(BigInteger.valueOf(1));
        totient = totient.multiply(q.subtract(BigInteger.valueOf(1)));
        return totient;
    }

    public BigInteger generarE(int tamPrimo, BigInteger totient) {
        BigInteger e;
        do {
            e = new BigInteger(2 * tamPrimo, new Random());
        } while ((e.compareTo(totient) != -1) || (e.gcd(totient).compareTo(BigInteger.valueOf(1)) != 0));
        return e;
    }

    public BigInteger generarD(BigInteger e, BigInteger totient) {
        return e.modInverse(totient);
    }

    public BigInteger[] encriptar(String mensaje, BigInteger e, BigInteger n) {
        byte[] temp = new byte[1];
        byte[] digitos = mensaje.getBytes();
        BigInteger[] bigDigitos = new BigInteger[digitos.length];
        //Recorrer bigDigitos
        for (int i = 0; i < bigDigitos.length; i++) {
            temp[0] = digitos[i];
            bigDigitos[i] = new BigInteger(temp);
        }
        BigInteger[] encriptado = new BigInteger[bigDigitos.length];
        for (int i = 0; i < bigDigitos.length; i++) {
            encriptado[i] = bigDigitos[i].modPow(e, n);
        }
        return encriptado;
    }

    public String desencriptar(BigInteger[] encriptado, BigInteger d, BigInteger n) {
        BigInteger[] desencriptado = new BigInteger[encriptado.length];
        for (int i = 0; i < desencriptado.length; i++) {
            desencriptado[i] = encriptado[i].modPow(d, n);
        }
        char[] charArray = new char[desencriptado.length];
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = (char) (desencriptado[i].intValue());
        }
        return new String(charArray);
    }

    //VALIDACIONES
    public boolean validarMensaje(String mensaje) {
        String m = mensaje;
        boolean valido = true;
        //Verificar que el campo de mensaje no esté vacio
        if (m.equals("") || m.isEmpty()) {
            valido = false;
        }
        //Verificar si es un número
        try {
            Integer.parseInt(m);
        } catch (NumberFormatException nfe) {
            valido = false;
        }
        return valido;
    }
}
