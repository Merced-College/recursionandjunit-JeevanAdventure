import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RecursiveTest {
    @Test
    public void test1() {
        assertEquals(Main.count8(0),0);
    }
    @Test
    public void test2() {
        assertEquals(Main.count8(818),2);
    }
    @Test
    public void test3() {
        assertEquals(Main.count8(8818),4);
    }
    @Test
    public void test4() {
        assertEquals(Main.countHi(""),0);
    }
    @Test
    public void test5() {
        assertEquals(Main.countHi("xxhixx"),2);
    }
    @Test
    public void test6() {
        assertEquals(MMain.countHi("hi"),1);
    }
    @Test
    public void test7() {
        assertEquals(Main.countHi2(""),0);
    }
    @Test
    public void test8() {
        assertEquals(Main.countHi2("ahibhi"),2);
    }
    @Test
    public void test9() {
        assertEquals(Main.countHi2("xhixhi"),0);
    }
    @Test
    public void test10() {
        assertEquals(Main.strCount("meo","meow"),0);
    }
    @Test
    public void test11() {
        assertEquals(Main.strCount("catcowcat","cat"),2);
    }
    @Test
    public void test12() {
        assertEquals(Main.strCount("catcowcat","dog"),0);
    }
    @Test
    public void test13() {
        assertEquals(Main.stringClean("y"),"y");
    }
    @Test
    public void test14() {
        assertEquals(Main.stringClean("abbbcdd"),"abcd");
    }
    @Test
    public void test15() {
        assertEquals(Main.stringClean("yyzzza"),"yza");
    }

}
