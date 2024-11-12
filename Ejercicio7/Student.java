import java.util.ArrayList;

public class Student {
    String name;

    private ArrayList<Double> notas;

    public Student()
    {
        this.name= name;

        this.notas = new ArrayList<>();
    }


    public void add(Double nota)
    {
        notas.add(nota);
    }

    public double  promedio ()
    {
        if (notas.isEmpty())
        {
            System.out.println("you don't have a nota");
            return 0.0;
        }

        double suma = 0;

        for(double nota: notas)
        {
            suma += nota;
        }

        return suma / notas.size();


    }

    public void aprobación() {
        double promedio = promedio();
        if (promedio >= 60) {
            System.out.println("Has aprobado.");
        } else {
            System.out.println("No has aprobado.");
        }
    }


}
