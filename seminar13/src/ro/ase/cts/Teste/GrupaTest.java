package ro.ase.cts.Teste;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import ro.ase.cts.Categories.TesteRight;
import ro.ase.cts.Categories.TesteUrgente;
import ro.ase.cts.Clase.Grupa;
import ro.ase.cts.Mock.StudentStub;

import static org.junit.Assert.*;

public class GrupaTest {

    @Test
    @Category(TesteRight.class)
    public void testConstructorRight() {
        Grupa grupa = new Grupa(1086);
        assertEquals(1086,grupa.getNrGrupa());
    }

    @Test
    public void testConstructorLimiteInferioara() {
        Grupa grupa = new Grupa(1000);
        assertEquals(1000,grupa.getNrGrupa());
    }

    @Test
    @Category(TesteUrgente.class)
    public void testConstructorLimitaSuperioara() {
        Grupa grupa = new Grupa(1100);
        assertEquals(1100,grupa.getNrGrupa());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorError() {
        Grupa grupa = new Grupa(900);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorError2() {
        Grupa grupa = new Grupa(1200);
    }

    @Test (timeout = 565)
    public void testConstructorPerformance() {
        Grupa grupa = new Grupa(1086);
    }

    @Test
    @Category(TesteUrgente.class)
    public void testConstructorRange() {
        Grupa grupa = new Grupa(1001);
        assertEquals(1001,grupa.getNrGrupa());
        Grupa grupa2 = new Grupa(1099);
        assertEquals(1099,grupa2.getNrGrupa());
    }

    @Test
    public void testConstructorExistence() {
        Grupa grupa = new Grupa(1086);
        assertNotNull(grupa.getStudenti());
    }

}