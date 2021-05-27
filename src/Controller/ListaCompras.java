/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Produto;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author guuil
 */
public class ListaCompras extends Produto {

    private javax.swing.JTable jTable1;

    public ArrayList AdicionarProduto(long codBarras,
            String marca, String nomeProduto, double preco) {

        ArrayList<Produto> list = new ArrayList<>();
        Produto prod = new Produto(codBarras, marca, nomeProduto, preco);

        list.add(prod);
        return list;
    }

    public DefaultTableModel AdicionarNaLista(long codBarras,
            String marca, String nomeProduto, double preco) {

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        ArrayList<Produto> list = AdicionarProduto(codBarras,
                marca, nomeProduto, preco);

        Object dadosRow[] = new Object[4];

        for (int i = 0; i < list.size(); i++) {
            if (dadosRow == null) {
                dadosRow[0] = list.get(i).getCodBarras();
                dadosRow[1] = list.get(i).getMarca();
                dadosRow[2] = list.get(i).getNomeProduto();
                dadosRow[3] = list.get(i).getPreco();

            } else {
                
                model.addRow(dadosRow);

            }
        }
        
        return model;
    }

}
