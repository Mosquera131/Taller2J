public class Empleado {
    String name;
    Double Salariobase;
    int anosExperiences;

    public Empleado (String name,Double Salariobase,int anosExperiences)
    {
        this.name=name;
        this.anosExperiences=anosExperiences;
        this.Salariobase=Salariobase;
    }

    public Double bonoSalario()
    {
        Double porcentajeBono= 0.05 * anosExperiences;

        return  Salariobase * porcentajeBono;
    }

}
