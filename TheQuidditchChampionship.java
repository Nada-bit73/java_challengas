/*
 * 
 *  
 */
package thequidditchchampionship;

/**
 *
 * @Nada
 */
public class TheQuidditchChampionship {

    public static void main(String[] args) {
        int gryffindor = 450;    //gryffindor points       ﻿ ﻿
        int ravenclaw = 500;  //ravenclaw p﻿oints
        
        
        //1. Calculate the difference in points.
        int margin= gryffindor - ravencla﻿w;
        
        
        //who win
        if(margin >= 300){
            System.out.println("Gryffindor takes the house cup!");
        }else if(margin < 300 && 100 < margin ){
            System.out.println("In second place, Gryffindor!");
        }else if(100 == margin){
            System.out.println("In third place, Gryffindor!");
        }else{
            System.out.println("In fourth place, Gryffindor!");
        }
    }
    
}
