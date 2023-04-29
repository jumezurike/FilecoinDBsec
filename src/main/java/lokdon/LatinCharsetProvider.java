package lokdon;
/**
 * Created by LokDon, LLC on 02/12/16.
 */

import java.nio.charset.Charset;
import java.nio.charset.spi.CharsetProvider;
import java.util.ArrayList;
import java.util.Iterator;

//charset provider for basic latin and latin supplement 1 from Unicode
public class LatinCharsetProvider extends CharsetProvider {

    private ArrayList<Character> latinCharset;

    private static final int CHARSET_SIZE = 256;

    public LatinCharsetProvider() {
        latinCharset = new ArrayList<Character>();

        int codePoint = 0;

//        latinCharset.add('\n');
//        latinCharset.add('\t');

        while (latinCharset.size() < CHARSET_SIZE) {
            if (!Character.isISOControl(codePoint) )
                latinCharset.add((char) codePoint);

            codePoint++;
        }

    }

    @Override
    public Iterator<Charset> charsets() {
        return null;
    }

    @Override
    public Charset charsetForName(String charsetName) {
        return null;
    }

//    @Override
//    public ArrayList<Character> getCharset() {
//        return latinCharset;
//    }


    public ArrayList<Character> getLatinCharset() {
        return latinCharset;
    }

    public void setLatinCharset(ArrayList<Character> latinCharset) {
        this.latinCharset = latinCharset;
    }
}
