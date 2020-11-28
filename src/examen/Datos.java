package examen;

import java.math.BigInteger;

public class Datos {

    private int tamPrimo;
    private BigInteger p;
    private BigInteger q;
    private BigInteger n;
    private BigInteger totient;
    private BigInteger e;
    private BigInteger d;
    private String mensaje;
    private BigInteger[] encriptado;

    public BigInteger getP() {
        return p;
    }

    public void setP(BigInteger p) {
        this.p = p;
    }

    public BigInteger getQ() {
        return q;
    }

    public void setQ(BigInteger q) {
        this.q = q;
    }

    public BigInteger getN() {
        return n;
    }

    public void setN(BigInteger n) {
        this.n = n;
    }

    public BigInteger getTotient() {
        return totient;
    }

    public void setTotient(BigInteger totient) {
        this.totient = totient;
    }

    public BigInteger getE() {
        return e;
    }

    public void setE(BigInteger e) {
        this.e = e;
    }

    public BigInteger getD() {
        return d;
    }

    public void setD(BigInteger d) {
        this.d = d;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public BigInteger[] getEncriptado() {
        return encriptado;
    }

    public void setEncriptado(BigInteger[] encriptado) {
        this.encriptado = encriptado;
    }

    public int getTamPrimo() {
        return tamPrimo;
    }

    public void setTamPrimo(int tamPrimo) {
        this.tamPrimo = tamPrimo;
    }
    
}
