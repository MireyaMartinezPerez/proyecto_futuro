public class Proyectofuturo {
    public static void main(String[] args) {
        System.out.println("Estudiante " + args[0] + ":" + veredicto("5", "4"));
        /**Mireya Martínez Pérez*/
    }

    private static String veredicto(String ciclos, String horas){
        if (ciclos.equals(horas))
            return "Bien. Pero una hora de estudio para cada módulo puede ser insuficiente.";
        if (Integer.valueOf(horas)<Integer.valueOf(ciclos)){
            return "Poco tiempo de estudio. Debes dedicar más tiempo";
        }
        return "Ideal. Trabajas los contenidos en casa.";
    }

}
