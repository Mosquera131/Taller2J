import java.util.ArrayList;

public class Agenda {
    private ArrayList<Contact> contacts;

    //Haciendole un constructor a la clase Agenda

    public Agenda()
    {
        this.contacts=new ArrayList<>();
    }


    //Haciendo los métodos.

    public  Contact  buscar( String name)
    {
        for (Contact contact: contacts)
        {
            if (contact.Getname().equalsIgnoreCase(name))
            {return contact;}
        }
        return null;

    }


    public void  add(Contact contact)
    {
        contacts.add(contact);
    }


    public boolean delete(String name)
    {
        for (Contact contact: contacts)
            if(contact.Getname().equalsIgnoreCase(name))
            {
                contacts.remove(contact);
                return true;
            }
        return false;
    }
}
