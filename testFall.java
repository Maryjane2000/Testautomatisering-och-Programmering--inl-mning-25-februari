package Inlämning25februari;


import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class testFall {

    @Test
    public void testToGetA(){
        MorseTranslate translate = new MorseTranslate();
        String actual = translate.getmorse("*-");
        assertEquals("A", actual);


    }
    @Test
    public void testGetReverse(){
        MorseTranslate translate = new MorseTranslate();
        String actual = translate.getmorse("Z");
        assertEquals("--**", actual);
    }
    @Test
    public void testGetWord(){
        MorseTranslate translate = new MorseTranslate();
        String w = translate.getmorse("*****-*--");
        assertEquals("HEY", w);
        String t = translate.getmorse("-*****--*-*--*-----**-");
        assertEquals("THANK YOU", t);
        String g = translate.getmorse("--*-------**-***-*--*");
        assertEquals("GOOD BEY", g);
    }


    }








