public abstract class Personaje {
    protected String nombre;
    protected int nivel;

    public Personaje(String nombre, int nivel) {
        this.nombre = nombre;
        this.nivel = nivel;
    }

    public void subirNivel() {
        nivel++;
        System.out.println(nombre + " ha subido al nivel " + nivel + "!");
    }


    public abstract void atacar();

    // clase de Guerrero
    public class Guerrero extends Personaje {
        private int fuerza;

        public Guerrero(String nombre, int nivel, int fuerza) {
            super(nombre, nivel);
            this.fuerza = fuerza;
        }

        @Override
        public void atacar() {
            System.out.println(nombre + " ataca con su espada con fuerza " + fuerza * nivel + "!");
        }

        public void usarEscudo() {
            System.out.println(nombre + " usa su escudo para bloquear el ataque.");
        }
    }
    // clase mago
    public  class Mago extends Personaje {
        private int poderMagico;

        public Mago(String nombre, int nivel, int poderMagico) {
            super(nombre, nivel);
            this.poderMagico = poderMagico;
        }

        @Override
        public void atacar() {
            System.out.println(nombre + " lanza un hechizo de poder " + poderMagico * nivel + "!");
        }

        public void lanzarHechizoCuracion() {
            System.out.println(nombre + " lanza un hechizo de curación.");
        }
    }
}
