import java.util.Arrays;

public class StringTask{

    public static void main(String[] args) {
       // String str1 = Util.deleteSpace("      ");
       // System.out.println(str1.length());

        String text = "As a decrepit father takes delight\\n\" +\n" +
                "                \"To see his active child do deeds of youth,\\n\" +\n" +
                "                \"So I, made lame by fortune’s dearest spite,\\n\" +\n" +
                "                \"Take all my comfort of thy worth and truth.\\n\" +\n" +
                "                \"For whether beauty, birth, or wealth, or wit, \"";
        String[] wordsArr = text.split(",");

      //  System.out.println(Util.addQuotes("Too"));
       // System.out.println(Util.correctWord("ЧикаГО"));
      //  Util.capitalizeWords("capital london");
        OddEven qd=new OddEven();
        qd.findOddEven(2147483647+1);
        ConvertStringToArray.stringToArrayChar("Name");
        //StringBuilder
        String word1="QA";
        int word2=4;
        String word3="every";
        int word4=1;
        StringBuilder sb=new StringBuilder();//потоко не безапасен, быстрый конкат
        sb
                .append(word1)
                .append(word2)
                .append(word3)
                .append(word4);
        System.out.println(sb);
        String result ="";
        result= result.concat(word1)
                .concat(String.valueOf(word2))
                .concat(word3)
                .concat(String.valueOf(word4));
        System.out.println(result);
//Потокобезопасен
        StringBuffer sbuf= new StringBuffer();
        sbuf.append(word1)
                .append(word2)
                .append(word3)
                .append(word4);
        System.out.println(sbuf);
        String a=null;
       String b="";
        System.out.println(b.isEmpty());
        System.out.println(b.length());
//        System.out.println(Util.capitalizeWords("ergergRER"));
      //  System.out.println(Util.capitalizeWords(""));
      //  System.out.println(Util.capitalizeAllWords("ташкент  я люблю тебя"));
    }
}

