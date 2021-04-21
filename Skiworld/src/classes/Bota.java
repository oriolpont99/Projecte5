package classes;

public class Bota {
    
    private int id_bota;
    private String marca;
    private String preu;
    
    public Bota(int id_bota, String marca, String preu) {
        this.id_bota = id_bota;
        this.marca = marca;
        this.preu = preu;
    }

    public Bota() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String toString(){
        return "ID BOTA: " + this.id_bota + "     MARCA: " + this.marca + "     PREU: " + this.preu + "€";
    }
    
    public int getId() {
        return id_bota;
    }
    public void setId(int id_bota){
        this.id_bota = id_bota;
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
