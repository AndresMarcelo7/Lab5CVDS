/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.cvds.guessGame;


import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Ing Pipe
 */
@ManagedBean(name = "guessBean")
@ApplicationScoped
public class GameBuild {
    private int numero;
    private int numeroIntentado;
    private int intentosRealizados;
    private int premioAcumulado;
    private String hasWon;
    
    public GameBuild() {
        numero = (int) (Math.random() *10 ) + 1;
        intentosRealizados=0;
        premioAcumulado=0;
        hasWon="no";
    }
    
    public void guess(){
        intentosRealizados+=1;
        if (numeroIntentado == numero && intentosRealizados == 1){
            premioAcumulado = 100000;
        }
        else if (numeroIntentado != numero && premioAcumulado >= 10000){
            premioAcumulado-=10000;
        }
        else{
            premioAcumulado = 0;
        }
    }
    
    public void restart(){
        numero = (int) (Math.random() *10 ) + 1;
        intentosRealizados=0;
        premioAcumulado=0;
        hasWon="no";
        
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getIntentosRealizados() {
        return intentosRealizados;
    }

    public void setIntentosRealizados(int intentosRealizados) {
        this.intentosRealizados = intentosRealizados;
    }

    public int getPremioAcumulado() {
        return premioAcumulado;
    }

    public void setPremioAcumulado(int premioAcumulado) {
        this.premioAcumulado = premioAcumulado;
    }

    public String getHasWon() {
        return hasWon;
    }

    public void setHasWon(String hasWon) {
        this.hasWon = hasWon;
    }

    public int getNumeroIntentado() {
        return numeroIntentado;
    }

    public void setNumeroIntentado(int numeroIntentado) {
        this.numeroIntentado = numeroIntentado;
    }
    
    
    
    
    
}
