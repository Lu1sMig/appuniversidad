public class Principal {

    public static void main(String[] args) {
        Alumno a1 = new Alumno("Juan");
        Alumno a2 = new Alumno("Jose");
        Vector lista = new Vector();
        lista.adicionar(a1);
        lista.adicionar(a2);
        System.out.println(lista);

        System.out.println(lista.tamanio());
        lista.adiciona(2,a1);
        System.out.println(lista.tamanio());
//        lista.adiciona(4,a2);
//        System.out.println(lista.tamanio());

//        System.out.println(lista.contener(a1));

//        Alumno a3 = new Alumno("Danilo");
//        System.out.println(lista.contener(a3));

//        Alumno x = lista.pegar(0);
//        System.out.println(x);

//       lista.adicionaEnCualquierPosisicion(4,a3);
//        System.out.println(lista);

//        lista.remover(2);
//        System.out.println(lista);
//
//        for(int i = 0; i < 300; i++) {
//            Alumno y = new Alumno("Joao" + i);
//            lista.adicionar(y);
//        }
//        System.out.println(lista);
    }
}
//La estructura de datos es la forma de organizar y guardar datos,
//para qe pueda ser utilizado de manera eficiente y mejor administrando
//El objetivo de ste script es comprender el funcionamiento de las estructuras de datos en java
//https://www.aluracursos.com/blog/estructura-datos-con-java