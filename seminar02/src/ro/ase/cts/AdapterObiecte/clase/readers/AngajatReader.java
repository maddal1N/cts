package ro.ase.cts.AdapterObiecte.clase.readers;

import ro.ase.cts.AdapterObiecte.clase.Aplicant;
import ro.ase.cts.AdapterObiecte.clase.Angajat;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AngajatReader extends Readable{

    public AngajatReader(String numeFisier) {
        super(numeFisier);
    }

    public List<Aplicant> readAplicanti() throws FileNotFoundException {
        Scanner input2 = new Scanner(new File(super.numeFisier));
        input2.useDelimiter(",");
        List<Aplicant> angajati = new ArrayList<>();

        while (input2.hasNext()) {
            Angajat angajat = new Angajat();
            super.readAplicant(input2,angajat);

            int salariu = input2.nextInt();
            String ocupatie = input2.next();
            angajat.setSalariu(salariu);
            angajat.setOcupatie(ocupatie);
            angajati.add(angajat);
        }
        input2.close();
        return angajati;
    }
}
