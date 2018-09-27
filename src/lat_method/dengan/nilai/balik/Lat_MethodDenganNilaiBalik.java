package lat_method.dengan.nilai.balik;
/* 
    method dengan nilai balik = function di pascal
*/
public class Lat_MethodDenganNilaiBalik {
    
    // METHOD harus
    public static int hitungLuasPersegi(int sisi){
        int nLuas = sisi*sisi;
        
        return nLuas; 
    }
    
    public static void main(String[] args) {
        int sisi;
        sisi = 9;
        System.out.println("Luas Persegi dengan sisi "+ sisi +" adalah " + 
                hitungLuasPersegi(sisi));
        
    }
    
}
