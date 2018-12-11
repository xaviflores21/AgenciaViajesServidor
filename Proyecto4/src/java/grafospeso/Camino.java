/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafospeso;

import java.util.ArrayList;

/**
 *
 * @author xavi
 * @param <K>
 * @param <V>
 * @param <C>
 */
public class Camino<K, V, C> {

        ArrayList<Nodo<K, V, C>> list;
        int costo;

        public Camino() {
            list = new ArrayList<>();
            costo = 0;
        }

        public Camino(ArrayList<Nodo<K, V, C>> list, int costo) {
            this.list = list;
            this.costo = costo;
        }

        public ArrayList<Nodo<K, V, C>> getLista() {
            return list;
        }

        public void setLista(ArrayList<Nodo<K, V, C>> list) {
            this.list = list;
        }

        public int getCosto() {
            return costo;
        }

        public void setCosto(int costo) {
            this.costo = costo;
        }

        public void agregar(Nodo<K, V, C> nodo, int costo) {
            this.list.add(nodo);
            this.costo += costo;
        }

        public boolean contiene(Nodo<K, V, C> nodo) {
            for (Nodo<K, V, C> nodo1 : list) {
                if (nodo.getId() == nodo1.getId()) {
                    return true;
                }
            }
            return false;
        }

        public Nodo<K, V, C> ultima() {
            return list.get(list.size() - 1);
        }

        public Camino getCopia() {
            Camino camino = new Camino();
            camino.setLista((ArrayList) this.getLista().clone());
            camino.setCosto(this.getCosto());
            return camino;
        }

        @Override
        public String toString() {
            return costo + "";
        }
    }