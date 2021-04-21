package classes;

public class Esqui {
    
    private int id_esqui;
    private String marca;
    private String preu;
    
    public Esqui(int id_esqui, String marca, String preu) {
        this.id_esqui = id_esqui;
        this.marca = marca;
        this.preu = preu;
    }

    public Esqui() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String toString(){
        return "ID ESQUI: " + this.id_esqui + "     MARCA: " + this.marca + "     PREU: " + this.preu + "€";
    }
    
    public int getId() {
        return id_esqui;
    }
    public void setId(int id_esqui){
        this.id_esqui = id_esqui;
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



