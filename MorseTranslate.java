package Inlämning25februari;
import java.util.HashMap;
import java.util.Objects;


public class MorseTranslate {
    private HashMap<String, String> code;

    public MorseTranslate() {

        code = new HashMap<>();

        code.put("A", "*-");
        code.put("*-", "A");
        code.put("a","*-");

        code.put("B", "-***");
        code.put("-***", "B");
        code.put("b","-***");

        code.put("C", "-*-*");
        code.put("-*-*", "C");
        code.put("c","-*-*");

        code.put("D", "-**");
        code.put("-**", "D");
        code.put("d","-**");

        code.put("E", "*");
        code.put("*", "E");
        code.put("e","*");

        code.put("F", "**-*");
        code.put("**-*", "F");
        code.put("f","**-*");

        code.put("G", "--*");
        code.put("--*", "G");
        code.put("g","--*");

        code.put("H", "****");
        code.put("****", "H");
        code.put("h","****");

        code.put("I", "**");
        code.put("**", "I");
        code.put("i","**");


        code.put("J", "*---");
        code.put("*---", "J");
        code.put("j","*---");

        code.put("K", "-*-");
        code.put("-*-", "K");
        code.put("k","-*-");

        code.put("L", "*-**");
        code.put("*-**", "L");
        code.put("l","*-**");

        code.put("M", "--");
        code.put("--", "M");
        code.put("m","--");

        code.put("N", "-*");
        code.put("-*", "N");
        code.put("n","-*");

        code.put("O", "---");
        code.put("---", "O");
        code.put("o","---");

        code.put("P", "*--*");
        code.put("*--*", "P");
        code.put("p","*--*");

        code.put("Q", "--*-");
        code.put("--*-", "Q");
        code.put("q","--*-");

        code.put("R", "*-*");
        code.put("*-*", "R");
        code.put("r","*-*");

        code.put("S", "***");
        code.put("***", "S");
        code.put("s","***");

        code.put("T", "-");
        code.put("-", "T");
        code.put("t","-");

        code.put("U", "**-");
        code.put("**-", "U");
        code.put("u","**-");

        code.put("V", "***-");
        code.put("***-", "V");
        code.put("v","***-");

        code.put("W", "*--");
        code.put("*--", "W");
        code.put("w","*--");

        code.put("X", "-**-");
        code.put("-**-", "X");
        code.put("x","-**-");

        code.put("Y", "-*--");
        code.put("-*--", "Y");
        code.put("y","-*--");

        code.put("Z", "--**");
        code.put("--**", "Z");
        code.put("z","--**");

        code.put("1","*----");
        code.put("*----","1");

        code.put("2","**---");
        code.put("**---","2");

        code.put("3","***--");
        code.put("***--","3");

        code.put("4","****-");
        code.put("****-","4");

        code.put("5","*****");
        code.put("*****","5");

        code.put("6","-****");
        code.put("-****","6");

        code.put("7","--***");
        code.put("--***","7");

        code.put("8","---**");
        code.put("---**","8");

        code.put("9","----*");
        code.put("----*","9");

        code.put("0","-----");
        code.put("-----","0");

        code.put(".","*-*-*-");
        code.put("*-*-*-",".");

        code.put(",","--**--");
        code.put("--**--",",");

        code.put("?","**--**");
        code.put("**--**","?");

        code.put("HEY", "*****-*--");
        code.put("*****-*--", "HEY");

        code.put("-*****--*-*--*-----**-", "THANK YOU");
        code.put("THANK YOU", "-*****--*-*--*-----**-");

        code.put("GOOD BYE", "--*-------**-***-*--*");
        code.put("--*-------**-***-*--*", "GOOD BEY");




    }
    public String getmorse(String letter) {

        switch (letter) {
            case "", " ", "_", "!", "@", "#", "£", "¤", "$", "%", "&", "/", "{", "(", "[" -> System.out.println(
                    "Morse code translation not found...");
            case ")", "]", "=", "}", "+", "´", "¨", "~", "'", ":", ";", "<", ">", "|", "§" -> System.out.println(
                    "Morse code translation not found..");
            case "Å", "å", "Ä", "ä", "Ö", "ö", "€", "µ" -> System.out.println("Morse code translation not found....");
        }

        return code.get(letter);



    }
}

