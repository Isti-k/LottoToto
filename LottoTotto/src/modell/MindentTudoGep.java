/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modell;

import java.util.Random;


public class MindentTudoGep {
    Random rnd = new Random();
    
    private int[] lottoSzelveny;
    private String totoSzelveny;
    private String[] dalok;
    
    public MindentTudoGep(){
        this(new String[0]);
    }
    
    public MindentTudoGep(String dal){
        this(new String[] {dal});
    }
    
    public MindentTudoGep(String[] dal){
        this.lottoSzelveny = new int[5];
        this.totoSzelveny = "";
        dallalFeltolt();
        if(!(dalok == null || dalok.length == 0 || dalok[0].isBlank())){
            dalokatFelvesz(dalok);
        }
    }
    
    public void ujraIndit(){
        this.dallalFeltolt();
    }
    
    private String genaralLottoSzelveny(){
        int[] szamok = new int[5];
        for (int i = 0; i < 5; i++) {
            int random = rnd.nextInt(91)+1;
            random = szamok[i];
            if(szamok[i] == random){
                random = rnd.nextInt(91)+1;
            }
        }
        
        
        return "";
    }
    
    public String kerLottoSzelveny(){
        return "1, 2, 3, 4, 5";
    }
    
    private String genaralTotoSzelveny(){
        return "";
    }
    
    public String kerTotoSzelveny(){
        String s = "";
        s += "1 2 3 ... 13 13+1";
        s += "x 1 2 ... x 1";
        return s;
    }
    
    public String kerDal(){
        return "";
    }
    
    public void ujDal(String dal){
        
        
    }

    private void dallalFeltolt() {
        
    }

    private void dalokatFelvesz(String[] dalok) {
        
    }
    
}
