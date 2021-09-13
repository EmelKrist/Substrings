package substrings;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class SubstringsTest {
    
    private static SubstringSearch subSTR;
    
    public SubstringsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        subSTR = new SubstringSearch("efg63jan");
    }
    
    @Test //тест для проверки строки на null
    public void String_NO_NULL() {
        String expected = subSTR.InputString;
        Assert.assertNotNull(expected);
    }
    
    @Test //тест для проверки на правильность нахождения подстроки 
    public void SubstringTest() {
        String expected;
    int indexaa = subSTR.InputString.indexOf("aa");
    int index00 = subSTR.InputString.indexOf("00");
    if ((indexaa == -1)&(index00 == -1)){
    expected = "No";
    }else{
    expected = "Yes";}
    
    String actual = subSTR.Result;
    Assert.assertEquals(expected, actual);
    }
    
    
    
}
