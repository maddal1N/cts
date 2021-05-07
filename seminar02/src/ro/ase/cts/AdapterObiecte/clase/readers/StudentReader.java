package ro.ase.cts.AdapterObiecte.clase.readers;

import ro.ase.cts.AdapterObiecte.clase.Aplicant;
import ro.ase.cts.AdapterObiecte.clase.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentReader extends Readable{

    public StudentReader(String numeFisier) {
        super(numeFisier);
    }

    public  List<Aplicant> readAplicanti() throws FileNotFoundException, NumberFormatException {
        Scanner input = new Scanner(new File(super.numeFisier));
        input.useDelimiter(",|\n");
        List<Aplicant> studenti = new ArrayList<>();

        while (input.hasNext()) {
            Student student = new Student();
            super.readAplicant(input,student);

            int an_studii = input.nextInt();
            String facultate = (input.next()).toString();
            student.setAn_studii(an_studii);
            student.setFacultate(facultate);
            studenti.add(student);
        }
        input.close();
        return studenti;
    }
}
