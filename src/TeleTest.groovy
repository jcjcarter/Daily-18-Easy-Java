/**
 * Created by TZ6YSQ on 10/29/2015.
 */
class TeleTest extends GroovyTestCase {

    private Tele tele = new Tele();

    void testConvertNumber() {

        assertEquals("1-800-2662278",tele.convertNumber("1-800-COMCAST") )
    }
}
