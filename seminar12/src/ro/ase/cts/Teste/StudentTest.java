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
}