public class Persona {
    String name;
    int age;
    String sex;

    public Persona(String name,int age,  String sex)
    {
        this.name = name;
        this.age= age;
        this.sex=sex;
    }
    public int getAge()
    {
        return age;
    };

    public void comparasionEdad(Persona otrapersona)
    {
        if (this.age > otrapersona.getAge())
        {
            System.out.println(this.name +"is older than"+ otrapersona.name);
        } else if (this.age< otrapersona.getAge()) {
            System.out.println(this.name+"is yonger than"+ otrapersona.name);
        }
        else {
            System.out.println("They have the same age. ");
        }
    }
}
