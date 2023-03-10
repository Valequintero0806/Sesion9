public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador();

        persona.setNombre("Valentina Quintero");
        persona.setEdad("dieciseis años");
        persona.setNumeroDeTelefono(312627);
        cliente.setNombre("Valeria Quintana");
        cliente.setEdad("treintaidos años");
        cliente.setNumeroDeTelefono(3157427);
        cliente.setCredito("credito aprobado");
        trabajador.setNombre("Sara Quintero");
        trabajador.setEdad("Treintaiuno años");
        trabajador.setSalario("salario mínimo");
        trabajador.setNumeroDeTelefono(3126567);

        String nombre = cliente.getNombre();
        System.out.println(nombre);

        String edad = cliente.getEdad();
        System.out.println(edad);

        int NumeroDeTelefono = cliente.getNumeroDeTelefono();
        System.out.println(NumeroDeTelefono);

        String credito = cliente.getCredito();
        System.out.println(credito);

        nombre = persona.getNombre();
        System.out.println(nombre);

        edad = persona.getEdad();
        System.out.println(edad);

        NumeroDeTelefono = persona.getNumeroDeTelefono();
        System.out.println(NumeroDeTelefono);

        nombre = trabajador.getNombre();
        System.out.println(nombre);

        edad = trabajador.getEdad();
        System.out.println(edad);

        String salario = trabajador.getSalario();
        System.out.println(salario);

        NumeroDeTelefono = trabajador.getNumeroDeTelefono();
        System.out.println(NumeroDeTelefono);

    }

}

class Persona {
    public String nombre;
    public String edad;
    public int NumeroDeTelefono;

    public void setNumeroDeTelefono(int NumeroDeTelefono) {
        this.NumeroDeTelefono = NumeroDeTelefono;
    }

    public int getNumeroDeTelefono() {
        return this.NumeroDeTelefono;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getEdad(){
        return "Edad de la persona:" + this.edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre(){
        return "Nombre de la persona:" + this.nombre;
    }

}

class Cliente extends Persona {
    private String credito;

    public Cliente() {
        System.out.println("Estoy en el constructor de cliente");
    }

    public void setCredito(String credito) {
        this.credito = credito;
    }
    public String getCredito() {
        return "Estado del credito:" + this.credito;
    }
}

class Trabajador extends Persona{
   private String salario;

   public Trabajador() {
       System.out.println("Estoy en el constructor de trabajador");
   }
   public void setSalario(String salario) {
       this.salario = salario;
   }
   public String getSalario() {
       return  "Gana mensualmente:"+ this.salario;
   }
}

