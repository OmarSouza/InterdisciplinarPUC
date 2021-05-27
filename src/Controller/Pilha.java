/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author guuil
 */
public class Pilha {

    private No topo;
    private int tamanho = 0;

    public void imprime() {
        No temp = topo;

        System.out.println("Impressão dos elementos da pilha");

        while (temp != null) {
            System.out.println("temp.getValor()");
            temp = temp.getProximo();
        }
    }

    public int getTamanho() {
        return tamanho;
    }

    public void empilhar(String valor) {
        No novoNo = new No();
        novoNo.setValor(valor);

        if (topo == null) {
            topo = novoNo;
        } else {
            novoNo.setProximo(topo);
            topo = novoNo;
        }
        tamanho++;
    }

    public boolean desempilhar() {
        if (topo == null) {
            return false;
        }

        topo = topo.getProximo();
        tamanho--;
        return true;
    }

    public boolean isEmpty() {
        if (tamanho == 0) {
            return true;
        } else {
            return false;
        }
    }
    
    public void clear(){
        while(!isEmpty()){
            desempilhar();
        }
    }
}
