package classes;

public class Casc {
    
    private int id_casc;
    private String marca;
    private String preu;
    
    public Casc(int id_casc, String marca, String preu) {
        this.id_casc = id_casc;
        this.marca = marca;
        this.preu = preu;
    }

    public Casc() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String toString(){
        return "ID CASC: " + this.id_casc + "     MARCA: " + this.marca + "     PREU: " + this.preu + "€";
    }
    
    public int getId() {
        return id_casc;
    }
    public void setId(int id_casc){
        this.id_casc = id_casc;
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
