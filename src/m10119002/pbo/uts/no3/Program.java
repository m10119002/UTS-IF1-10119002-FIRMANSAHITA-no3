/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m10119002.pbo.uts.no3;

import m10119002.pbo.uts.no3.target.BlackMetal;
import m10119002.pbo.uts.no3.target.DeathCoreKepiting;
import m10119002.pbo.uts.no3.target.DeathMetal;
import m10119002.pbo.uts.no3.target.Folk;
import m10119002.pbo.uts.no3.target.Grindcore;
import m10119002.pbo.uts.no3.target.HardRock;
import m10119002.pbo.uts.no3.target.Metal;
import m10119002.pbo.uts.no3.target.NewSkul;
import m10119002.pbo.uts.no3.target.Rnb;
import m10119002.pbo.uts.no3.target.Rockabilly;

/**
 *
 * @author
 * NAMA     : Firman Sahita
 * KELAS    : IF-1
 * NIM      : 10119002
 * Deskripsi : UTS No-3
 * 
 */
public class Program {
    public static void main(String[] args) {
        Rnb blues = new Rnb();
        blues.setArtistName("Jimmy Hendrik");
        blues.genreBlues(blues.getArtistName());
        
        Rnb jazz = new Rnb();
        jazz.setArtistName("Chad Baker");
        jazz.genreJazz(jazz.getArtistName());
        
        Folk folk = new Folk();
        folk.setArtistName("Bob Dylan");
        folk.genreFolk(folk.getArtistName());
        
        Rockabilly rockabilly = new Rockabilly();
        rockabilly.setArtistName("Elvis Presley");
        rockabilly.genreRockabilly(rockabilly.getArtistName());
        
        HardRock prRock = new HardRock();
        prRock.setArtistName("DreamTheater");
        prRock.genreProgressiveRock(prRock.getArtistName());
        
        HardRock psRock = new HardRock();
        psRock.setArtistName("The Doors");
        psRock.genrePsycehedellic(psRock.getArtistName());
        
        HardRock popRock = new HardRock();
        popRock.setArtistName("Kiss");
        popRock.genrePopRock(popRock.getArtistName());
        
        Metal punk = new Metal();
        punk.setArtistName("MXPX");
        punk.genrePunk(punk.getArtistName());
        
        Metal heMetal = new Metal();
        heMetal.setArtistName("METALLICA");
        heMetal.genreHeavyMetal(heMetal.getArtistName());
        
        Grindcore gcore = new Grindcore();
        gcore.setArtistName("Mesin Tempur");
        gcore.genreGrindcore(gcore.getArtistName());
        
        DeathMetal dMetal = new DeathMetal();
        dMetal.setArtistName("JASAD");
        dMetal.genreDeathMetal(dMetal.getArtistName());
        
        DeathCoreKepiting dcore = new DeathCoreKepiting();
        dcore.setArtistName("Revenge The Fate");
        dcore.genreDeathCoreKepiting(dcore.getArtistName());
        
        BlackMetal bMetal = new BlackMetal();
        bMetal.setArtistName("Behemoth");
        bMetal.genreBlackMetal(bMetal.getArtistName());
        
        NewSkul nskul = new NewSkul();
        nskul.setArtistName("HATEBREED");
        nskul.genreNewSkul(nskul.getArtistName());
    }
}
