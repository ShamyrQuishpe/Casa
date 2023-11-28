public class Pcamiguel {
    //Atributos
    public String amigos;
    public int edad;

    public Pcamiguel(String amigos, int edad){
        this.amigos=amigos;
        this.edad=edad;
    }

            public void saludar(){
        System.out.println("Yo soy migueliño y saludo a mi amigo " + amigos);
        System.out.println("La edad de mi amigo es: " + edad);
            }

            public static void main(String[] arg){
        Pcamiguel amigo1 = new Pcamiguel("Shamyr",20);
        amigo1.saludar();
        Pcamiguel amigo2 = new Pcamiguel("Freddy",21);
        amigo2.saludar();
            }

}
