package Composition;
import java.util.*;

public class AlatTulis {
    public String NamaAlatTulis;
    public int Jumlah;

     AlatTulis(String alatTulis, int jumlah){
        this.NamaAlatTulis=alatTulis;
        this.Jumlah=jumlah; 
    }
}

class HargaAlatTulis{
    private final List<AlatTulis>ATK;
    
    HargaAlatTulis(List<AlatTulis>ATK) {
        this.ATK=ATK;
    }
    
    public List<AlatTulis>getAlatTulis() {
        return ATK;
    }
}


    


