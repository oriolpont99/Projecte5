package classes;

public class Roba {
    
    private int id_roba;
    private String marca;
    private String preu;
    
    public Roba(int id_roba, String marca, String preu) {
        this.id_roba = id_roba;
        this.marca = marca;
        this.preu = preu;
    }

    public Roba() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String toString(){
        return "ID ROBA: " + this.id_roba + "     MARCA: " + this.marca + "     PREU: " + this.preu + "€";
    }
    
    public int getId() {
        return id_roba;
    }
    public void setId(int id_roba){
        this.id_roba = id_roba;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public String getPreu() {
        return preu;
    }
    public void setPreu(String preu){
        this.preu = preu;
    }
    
}



