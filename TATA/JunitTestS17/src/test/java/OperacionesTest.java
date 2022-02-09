
import org.junit.*;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class OperacionesTest {

    public static Operaciones operaciones;
    int resultadoEsperado;
    int resultado;
    int num1;
    int num2;

    @BeforeClass
    public static void instanciaObjeto(){
       operaciones = new Operaciones();
    }

    @Before
    public void instanciarClase() {
        operaciones = new Operaciones();
        num1 = 5;
        num2 = 2;
        resultado = 0;
    }

    @Test(timeout = 5500)
    public void testSumar() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        resultadoEsperado = 7;
        resultado = operaciones.sumar(num1, num2);

        Assert.assertEquals(resultadoEsperado, resultado);
        Assert.assertEquals("","");
    }

    @Test
    public void testText() {
        resultadoEsperado = 7;
        resultado = operaciones.sumar(num1, num2);

        Assert.assertEquals("","");
    }


    @Test(expected = AssertionError.class)
    public void testSumarFail() {
        resultadoEsperado = 7;
        resultado = operaciones.sumar(num1, num2);

        Assert.assertEquals("",resultadoEsperado, resultado);
    }

    @Test
    public void testRestar() {

        resultadoEsperado = 2;
        resultado = operaciones.restar(num1, num2);

        try {
            Assert.assertEquals("El resultado no es correcto", resultadoEsperado, resultado);
        }catch (AssertionError e){
            System.out.println("Los elementos no son iguales");
            Assert.fail();
        }
    }

    @Test
    public void testMultiplicar() {

        int [] resultadoEsperadoVector = {1,2,3};
        int [] resultadoVector = operaciones.multiplicar();

        Assert.assertArrayEquals("El resultado no es correcto",
                resultadoEsperadoVector, resultadoVector);
    }

    @Test
    public void testDividir() {

      //boolean resultadoEsperado = true;
        boolean resultadoVector = operaciones.dividir(10,7);

        Assert.assertFalse("El resultado no es correcto",
                resultadoVector);
    }

    @After
    public void cerrarObjeto() {
        //operaciones = null;
    }

/*
    @BeforeClass
    public static void ejecucionInicial(){
        System.out.println("##############Before Class#############");
    }

    @Before
    public void setUp(){
        System.out.println("**********Este es el before*********");
    }

    @Test
    public void imprimir() {
        System.out.println("primer test");
    }

    @Ignore
    @Test
    public void imprimirDosVeces() {
        System.out.println("Segundo test");
    }

    @Ignore
    @Test
    public void imprimirTresVeces() {
        System.out.println("Tres test");
    }

    @After
    public void terminar(){
        System.out.println("---------Este es el After----------");
    }

    @AfterClass
    public static void alFinal(){
        System.out.println("#################Este es el AfterClass#############");
    }*/
}
