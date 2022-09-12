/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.fatecfranca.projeto3.exe1;

import java.util.Date;

/**
 *
 * @author 1090482111027
 */
public final class Reserva {
    private int nroReserva;
    private Date data;
    
    private Passageiro passageiro;
    private Voo voo;
    
    public Reserva() {
    }

    public Reserva(int nroReserva, Date data, Passageiro passageiro, Voo voo) {
        this.setNroReserva(nroReserva);
        this.setData(data);
        this.setPassageiro(passageiro);
        this.setVoo(voo);
    }

    public int getNroReserva() {
        return nroReserva;
    }

    public void setNroReserva(int nroReserva) {
        this.nroReserva = nroReserva;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Passageiro getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    }

    public Voo getVoo() {
        return voo;
    }

    public void setVoo(Voo voo) {
        this.voo = voo;
    }

    @Override
    public String toString() {
        return "Reserva{\n" + "nroReserva=" + nroReserva + ",\ndata=" + data + ",\npassageiro=" + passageiro + ",\nvoo=" + voo + '}';
    }
    
}
