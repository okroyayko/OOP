
import com.company.space.zive_tvory.Ryby.Losos;
import com.company.space.zive_tvory.Ryby.Stuka;
import com.company.space.zive_tvory.Ryby.Sumec;
import com.company.space.zive_tvory.Tvor;
import com.company.space.zive_tvory.Orol;
import com.company.space.zive_tvory.dieable;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Tvor[] tvoroviaNaZemi = new Tvor[20];
        int index = 0;

        tvoroviaNaZemi[index++] = new Sumec("sumec veľký", 18, 20);
        tvoroviaNaZemi[index++] = new Sumec("sumec americký", 18, 20);
        tvoroviaNaZemi[index++] = new Sumec("sumček pestrý", 18, 20);

        tvoroviaNaZemi[index++] = new Losos("losos atlantický", 20, 50);
        tvoroviaNaZemi[index++] = new Losos("losos pacifický", 20, 50);
        tvoroviaNaZemi[index++] = new Losos("pstruh dúhový", 20, 50);

        tvoroviaNaZemi[index++] = new Stuka("šťuka tigria", 18, 20);
        tvoroviaNaZemi[index++] = new Stuka("šťuka muskini", 18, 20);
        tvoroviaNaZemi[index++] = new Stuka("šťuka severná", 18, 20);

        Tvor orlik = new Orol("orlík", 24);
        tvoroviaNaZemi[index++] = orlik;


        Date dnes = new Date();
        ((dieable) tvoroviaNaZemi[0]).die(dnes);

    }
}
