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
public class Metal extends HardRock implements HeavyMetal {
    public void genreMetal(String artistName) {
        System.out.print(artistName.concat(" adalah musisi "));
        System.out.println("Metal");
    }

    @Override
    public void genreHeavyMetal(String artistName) {
        System.out.print(artistName.concat(" adalah musisi "));
        System.out.println("Heavy Metal");
    }

    @Override
    public void genrePunk(String artistName) {
        System.out.print(artistName.concat(" adalah musisi "));
        System.out.println("Punk");
    }
    
    public void genreGrunge(String artistName) {
        System.out.print(artistName.concat(" adalah musisi "));
        System.out.println("Grunge");
    }
}
