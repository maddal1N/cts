package ro.ase.cts.Teste;

import org.junit.Test;
import ro.ase.cts.Clase.Student;

import static org.junit.Assert.*;

public class StudentTest {

    @org.junit.Test
    public void getNume() {
        String nume = "Gigel";
        Student student =  new Student(nume);

        assertEquals(nume, student.getNume());
    }

    @org.junit.Test
    public void setNume(){
        String nume = "Popescu";
        Student student =  new Student();
        student.setNume(nume);

        assertEquals(nume, student.getNume());
    }

    @org.junit.Test
    public void testDefaultConstructorWorksCorrectly(){
        Student student =  new Student();

        assertNotNull("Lista de note nu a fost initializata.",student.getNote());
        assertNotNull("Numele nu a fost initializat.",student.getNume());
    }

    @org.junit.Test
    public void adaugaNota(){
        int nota = 10;

        Student student =  new Student();
        student.adaugaNota(nota);

        assertEquals(nota,student.getNota(0));
    }

    @org.junit.Test
    public void getNota(){
        Student student =  new Student();
        student.adaugaNota(5);
        student.adaugaNota(10);
        student.adaugaNota(9);

        assertEquals(5,student.getNota(0));
        assertEquals(10,student.getNota(1));
    }

    @org.junit.Test
    public void adaugaOSinguraNota(){
        int nota = 10;

        Student student =  new Student();
        student.adaugaNota(nota);

        assertEquals(1,student.getNote().size());
    }

    @org.junit.Test
    public void adaugaNotaIncorecta(){
        Student student =  new Student();
//1
        try{
            //2
            student.adaugaNota(-1);
            //3 - nu ajunge aici
            fail("Nu trebuia sa ajunga aici. Metoda nu arunca exceptie.");
        }
        catch (IllegalArgumentException e){
            //4
        }
        catch (Exception e){
            //5 - nu ajunge aici
            fail("Nu trebuia sa ajunga aici. Metoda nu arunca exceptie IllegalArgumentException.");
        }
        //6
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void adaugaNotaIncorectaJUnit4(){
        Student student =  new Student();
        student.adaugaNota(-1);
    }

    @org.junit.Test
    public void studentulAreRestante(){
        Student student =  new Student();
        student.adaugaNota(4);
        boolean rezultat = student.areRestante();

//        assertEquals(true,rezultat);
        assertTrue(rezultat);
    }

    @org.junit.Test
    public void studentulNuAreRestante(){
        Student student =  new Student();
        student.adaugaNota(6);
        boolean rezultat = student.areRestante();

        assertFalse(rezultat);
    }

    @org.junit.Test
    public void calculeazaMedie(){
        Student student= new Student();
        student.adaugaNota(6);
        student.adaugaNota(7);

//        assertEquals(6.5,student.calculeazaMedie()); - deprecated
        assertEquals(6.5,student.calculeazaMedie(),0.1);
    }
}