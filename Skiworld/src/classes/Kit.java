package classes;

public class Kit {
    
    private int id_kit;
    private int id_esqui;
//    private String preu_esqui;
    private int id_bota;
//    private String preu_bota;
    private int id_roba;
//    private String preu_roba;
    private int id_casc;
//    private String preu_casc;
    private int total;

    public Kit(int id_kit, int id_esqui, int id_bota, int id_roba, int id_casc, int total) {
        this.id_kit = id_kit;
        this.id_esqui = id_esqui;
//        this.preu_esqui = preu_esqui;
        this.id_bota = id_bota;
//        this.preu_bota = preu_bota;
        this.id_roba = id_roba;
//        this.preu_roba = preu_roba;
        this.id_casc = id_casc;
//        this.preu_casc = preu_casc;
        this.total = total;
    }

    public Kit() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String toString(){
        return "|| ID KIT: " + this.id_kit + " ID ESQUI: " + this.id_esqui + " ID ROBA: " + this.id_roba + " ID BOTES: " + this.id_bota + " ID CASC: " + this.id_casc + " PREU KIT: " + this.total + "€";
    }
    
    public int getId() {
        return id_bota;
    }
    public void setId(int id_bota){
        this.id_bota = id_bota;
    }
    public int getId_Esqui() {
        return id_esqui;
    }
    public void setId_Esqui(int id_esqui){
        this.id_esqui = id_esqui;
    }
    public int getId_Casc() {
        return id_casc;
    }
    public void setId_Casc(int id_casc){
        this.id_casc = id_casc;
    }
    public int getId_Roba() {
        return id_roba;
    }
    public void setId_Roba(int id_roba){
        this.id_roba = id_roba;
    }
    public int getId_Kit() {
        return id_kit;
    }
    public void setId_Kit(int id_kit){
        this.id_kit= id_kit;
    }
//    public String getId_PreuBota() {
//        return preu_bota;
//    }
//    public void setId_PreuBota(String preu_bota){
//        this.preu_bota = preu_bota;
//    }
//    public String getId_PreuEsqui() {
//        return preu_esqui;
//    }
//    public void setId_PreuEsqui(String preu_esqui){
//        this.preu_esqui = preu_esqui;
//    }
//    public String getId_PreuCasc() {
//        return preu_casc;
//    }
//    public void setId_PreuCasc(String preu_casc){
//        this.preu_casc = preu_casc;
//    }
//    public String getId_PreuRoba() {
//        return preu_roba;
//    }
//    public void setId_PreuRoba(String preu_roba){
//        this.preu_roba = preu_roba;
//    }
    public int getId_Total() {
        return total;
    }
    public void setId_Total(int total){
        this.total= total;
    }

}



