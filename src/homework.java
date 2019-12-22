import com.sun.org.apache.xpath.internal.objects.XString;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class homework
// This is very easy programme
{
    public static void main(String[] args) {
        String s = "This is very easy programme"; // remove character s from string
        String s1 = s.replace('s', ' ');
        int s2 = s.length();
        String spchar = " This $300 is equivalent of £200 but not for @100";
        String v = "The cost of iPhone is £1,250";
        String v1 = v.replaceAll("[0-9]", "");
        int a = 450;
        double d = a;
        String v3 = "125";
        int result = Integer.parseInt(v3);
        double v4 = 123.45;
        String m = Double.toString(v4);
        String k = "560.25";
        double t = Double.parseDouble("560.25");
        float c = 1/3;
        String price = "$250.00";
        String word1 = "There";
        word1 = word1.substring(2, 3);
        String word2 = "England";
        word2 = word2.substring(3, 4);
        String word3 = "orange";
        word3 = word3.substring(2, 4);


        System.out.println(s.replaceAll("s", " "));//removing letter 's' from the sentence
        System.out.println("string length: " +s2);//finding the lenght of the sentence
        System.out.println ( s = s. replaceAll("\\s",""));//removing space from the string
        System.out.println(spchar = spchar.replaceAll("[^a-zA-Z0-9]", " "));//removing all special character
        System.out.println(v1);//extracting just number
        System.out.println(d);//converting integer to double
        System.out.println(result);//converting string to integer
        System.out.println(v4);//converting double to string
        System.out.println(t);//converting string to double
        System.out.println(c);//1/3 to decimals
        System.out.println(price.replaceAll("\\$", "£"));
        System.out.println(word1);//middle letter a from word There
        System.out.println(word2);//letter l from word england
        System.out.println(word3);//letter 'an' from orange





    }


}