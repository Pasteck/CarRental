package Model;

import server.HandleServer;

import java.io.PrintWriter;
import java.net.InetAddress;
import java.util.*;
import java.util.concurrent.ConcurrentSkipListMap;

public class Reservation {



    private Client client;
    private Vehicule vehicule;
    private Date dateDebut;
    private Date dateFin;

    public Reservation(Client client, Vehicule vehicule, Date dateDebut, Date dateFin) {
        this.client = client;
        this.vehicule = vehicule;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Vehicule getVehicule() {
        return vehicule;
    }

    public void setVehicule(Vehicule vehicule) {
        this.vehicule = vehicule;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }
}