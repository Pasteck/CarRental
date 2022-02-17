package Model;

import java.io.PrintWriter;
import java.net.InetAddress;

public class Client {

    private InetAddress adressIP;
    private String nom;
    private PrintWriter out;

    public void setOut(PrintWriter out) {
        this.out = out;
    }

    public PrintWriter getOut() {
        return out;
    }

    public User(InetAddress adressIP, String nom, PrintWriter out) {
        this.adressIP = adressIP;
        this.nom = nom;
        this.out=out;
    }

    public InetAddress getAdressIP() {
        return adressIP;
    }

    public String getNom() {
        return nom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return nom.equals(user.nom);
    }
}
