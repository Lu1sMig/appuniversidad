import java.util.Arrays;

public class Vector {

    private Alumno[] alumnos = new Alumno[10];
    private int totalDeAlumnos = 0;

    public void adiciona(int posicion, Alumno alumno) {
        //        this.alumnos[totalDeAlumnos] = alumno;
        //        totalDeAlumnos++;
        //le agregamos un avalidacion a la lista para la posicion
        this.guardarEspacio();
        if(!posicionValida(posicion)) {
            throw new IllegalArgumentException("posicion invalida");
        }
        for(int i = totalDeAlumnos - 1; i >= posicion; i-=1) {
            alumnos[i+1] = alumnos[i];
        }
        alumnos[posicion] = alumno;
        totalDeAlumnos++;
    }

    public void adicionaEnCualquierPosisicion (int posicion, Alumno alumno) {
        for(int i = totalDeAlumnos - 1; i >= posicion; i-=1) {
            alumnos[i+1] = alumnos[i];
        }
        alumnos[posicion] = alumno;
        totalDeAlumnos++;
    }

    public void adicionar(Alumno alumno) {
        //recibe un alumno
        this.guardarEspacio();

        for(int i = 0; i < alumnos.length; i++) {
            if(alumnos[i] == null) {
                alumnos[i] = alumno;
                break;
            }
        }
    }

    public Alumno obtener(int posicion) {
        //recibe una posición y devuelve el alumno
        return null;
    }

    public void remover(int posicion) {
        //elimina por la posición
        for(int i = posicion; i < this.totalDeAlumnos; i++) {
            this.alumnos[i] = this.alumnos[i+1];
        }
        totalDeAlumnos--;
    }

    public boolean contener(Alumno alumno) {
        //Sabremos si está el alumno o no en la lista
        for(int i = 0; i < totalDeAlumnos; i++) {
            if(alumno.equals(alumnos[i])) {
                return true;
            }
        }
        return false;
    }

    public int tamanio() {
        //Devuelve la cantidad de alumnos
        return totalDeAlumnos;
    }

    public String toString() {
        //Facilitará la impresión
        return Arrays.toString(alumnos);
    }

    public Alumno pegar(int posicion) {
        if(!posicionOcupada(posicion)) {
            throw new IllegalArgumentException("posición invalida");
        }
        return alumnos[posicion];
    }

    private boolean posicionOcupada(int posicion) {
        return posicion >= 0 && posicion < totalDeAlumnos;
    }

    private boolean posicionValida(int posicion) {
        return posicion >= 0 && posicion <= totalDeAlumnos;
    }

    private void guardarEspacio() {
        if(totalDeAlumnos == alumnos.length) {
            Alumno[] nuevoArray = new Alumno[alumnos.length*2];
            for(int i = 0; i < alumnos.length; i++) {
                nuevoArray[i] = alumnos[i];
            }
            this.alumnos= nuevoArray;
        }
    }

}