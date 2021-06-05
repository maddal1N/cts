package ro.ase.cts.Teste;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import ro.ase.cts.Categories.TesteRight;
import ro.ase.cts.Categories.TesteUrgente;
import ro.ase.cts.Clase.Grupa;
import ro.ase.cts.Mock.StudentDummy;
import ro.ase.cts.Mock.StudentStub;

import static org.junit.Assert.*;

// Contine si GrupaTestWithStubs
public class GrupaTestWithMocks {
    private static Grupa grupa;

    @Test
    public void adaugaStudent(){
        Grupa grupa = new Grupa(1086);
        StudentDummy studentDummy = new StudentDummy();

        grupa.adaugaStudent(studentDummy);
        assertEquals(1,grupa.getStudenti().size());
    }

    @Test
    public void adaugaStudentBoundarySuperior(){
        assertEquals(35,grupa.getStudenti().size());
    }

    @BeforeClass
    public static void creareGrupa(){
        grupa = new Grupa(1086);
        for(int i=0;i<35;i++){
            StudentDummy studentDummy = new StudentDummy();
            grupa.adaugaStudent(studentDummy);
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void adaugaStudentExceptie(){
        StudentDummy studentDummy = new StudentDummy();
        grupa.adaugaStudent(studentDummy);
    }

    @Test
    @Category({TesteRight.class, TesteUrgente.class})
    public void textGetPromovabilitate(){
        Grupa grupa = new Grupa(1086);
        StudentStub studentStub = new StudentStub();
        grupa.adaugaStudent(studentStub);
        assertEquals(0,grupa.getPromovabilitate(),0.01);
    }

}