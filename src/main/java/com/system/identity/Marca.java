
package com.system.identity;

/**
 *
 * @author llagu
 */
public class Marca {
    private int id;
    private String marca;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return this.marca;
    }
    
}
