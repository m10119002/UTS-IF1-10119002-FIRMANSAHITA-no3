/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m10119002.pbo.uts.no3.target;

/**
 *
 * @author
 * NAMA     : Firman Sahita
 * KELAS    : IF-1
 * NIM      : 10119002
 * Deskripsi : UTS No-3
 * 
 */
public class HardRock extends Rnb implements PopRock, ProgressiveRock, PsychedelicRock {
    public void genreHardRock(String artistName) {
        System.out.print(artistName.concat(" adalah musisi "));
        System.out.println("HardRock");
    }
    
    @Override
    public void genrePopRock(String artistName) {
        System.out.print(artistName.concat(" adalah musisi "));
        System.out.println("PopRock");
    }
    
    @Override
    public void genrePsycehedellic(String artistName) {
        System.out.print(artistName.concat(" adalah musisi "));
        System.out.println("PsychedellicRock");
    }
    
    @Override
    public void genreProgressiveRock(String artistName) {
        System.out.print(artistName.concat(" adalah musisi "));
        System.out.println("ProgressiveRock");
    }
    
    
}
