import java.util.Scanner;
public class Asignar {
    Scanner scanner = new Scanner(System.in);
    private String nombre;

    public String Asignar(){
        String nombreCurso = "";



        System.out.println("Escoga el semestre"+"\n"+
                "1: Primer Semestre"+"\n"+
                "2: Segundo Semestre"+"\n"+
                "3: Tercer Semestre"+"\n"+
                "4: Cuarto Semestre"+"\n"+
                "5: Quinto Semestre"+"\n"+
                "6: Sexto Semestre"+"\n"+
                "7: Septimo Semestre"+"\n"+
                "8: Octavo Semestre"+"\n"+
                "9: Noveno Semestre"+"\n"+
                "10: Decimo Semestre"
        );
        int opciones = scanner.nextInt();
        int curso;
        switch (opciones){
            case 1:
                System.out.println("Escoga el curso a asignar");
                System.out.println(
                        "1: Desarrollo Humano y Profesional"+"\n"+
                                "2: Metodologia de la investigacion"+"\n"+
                                "3: Contabilidad I"+"\n"+
                                "4: Introduccion a los sistemas de computo"+"\n"+
                                "5: Logica de sistemas"+"\n"
                );
                curso = scanner.nextInt() ;
                if (curso == 1){nombreCurso = "Desarrollo humano y profesional";}
                else if (curso == 2){nombreCurso = "Metodologia de la investigacion";}
                else if (curso == 3){nombreCurso = "Contabilidad I";}
                else if (curso == 4){ nombreCurso = "Introduccion a los sistemas de computo";}
                else if (curso == 5){ nombreCurso = "Logica de sistemas";}
                break;
                case 2:
                    System.out.println("Escoga el curso a asignar");
                    System.out.println(
                            "1: Precalculo"+"\n"+
                            "2: Algebra lineal"+"\n"+
                            "3: Algoritmos"+"\n"+
                            "4: Contabilidad II"+"\n"+
                            "5: Matematica discreta"+"\n"
                    );
                    curso = scanner.nextInt() ;
                    if (curso == 1){nombreCurso = "Precalculo";}
                    else if (curso == 2){nombreCurso = "Algebra lineal";}
                    else if (curso == 3){nombreCurso = "Algoritmos";}
                    else if (curso == 4){ nombreCurso = "Contabilidad II";}
                    else if (curso == 5){ nombreCurso = "Matematica discreta";}
                    break;
                    case 3:
                        System.out.println("Escoga el curso a asignar");
                        System.out.println(
                                "1: Fisica I"+"\n"+
                                        "2: Calculo I"+"\n"+
                                        "3: Programacion I"+"\n"+
                                        "4: Proceso administrativo"+"\n"+
                                        "5: Derecho informatico"+"\n"
                        );
                        curso = scanner.nextInt() ;
                        if (curso == 1){nombreCurso = "Fisica I";}
                        else if (curso == 2){nombreCurso = "Calculo I";}
                        else if (curso == 3){nombreCurso = "Programacion I";}
                        else if (curso == 4){ nombreCurso = "Proceso Administrativo";}
                        else if (curso == 5){ nombreCurso = "Derecho informatico";}
                        break;
                        case 4:
                            System.out.println("Escoga el curso a asignar");
                            System.out.println(
                                    "1: Microeconomia"+"\n"+
                                            "2: Calculo II"+"\n"+
                                            "3: Programacion II"+"\n"+
                                            "4: Fisica II"+"\n"+
                                            "5: Estadistica I"+"\n"
                            );
                            curso = scanner.nextInt() ;
                            if (curso == 1){nombreCurso = "Microeconomia";}
                            else if (curso == 2){nombreCurso = "Calculo II";}
                            else if (curso == 3){nombreCurso = "Programacion II";}
                            else if (curso == 4){ nombreCurso = "Fisica II";}
                            else if (curso == 5){ nombreCurso = "Estadistica I";}
                            break;
                            case 5:
                                System.out.println("Escoga el curso a asignar");
                                System.out.println(
                                        "1: Metodos numericos"+"\n"+
                                                "2: Emprendedores de negocios"+"\n"+
                                                "3: Programacion III"+"\n"+
                                                "4: Electronica analogica"+"\n"+
                                                "5: Estadistica II"+"\n"
                                );
                                curso = scanner.nextInt() ;
                                if (curso == 1){nombreCurso = "Metodos numericos";}
                                else if (curso == 2){nombreCurso = "Emprendedores de negocios";}
                                else if (curso == 3){nombreCurso = "Programacion III";}
                                else if (curso == 4){ nombreCurso = "Electronica analogica";}
                                else if (curso == 5){ nombreCurso = "Estadistica II";}
                                break;
                                case 6:
                                    System.out.println("Escoga el curso a asignar");
                                    System.out.println(
                                            "1: Investigacion de operaciones"+"\n"+
                                                    "2: Base de datos I"+"\n"+
                                                    "3: Automates y lenguajes formales"+"\n"+
                                                    "4: Sistemas operativos I"+"\n"+
                                                    "5: Electronica Digital"+"\n"
                                    );
                                    curso = scanner.nextInt() ;
                                    if (curso == 1){nombreCurso = "Investigación de operaciones";}
                                    else if (curso == 2){nombreCurso = "Base de datos I";}
                                    else if (curso == 3){nombreCurso = "Automates y lenguajes formales";}
                                    else if (curso == 4){ nombreCurso = "Sistemas operativos";}
                                    else if (curso == 5){ nombreCurso = "Electronica Digital";}
                                    break;
                                    case 7:
                                        System.out.println("Escoga el curso a asignar");
                                        System.out.println(
                                                "1: Base de datos II"+"\n"+
                                                        "2: Analisis de sistemas I"+"\n"+
                                                        "3: Sistemas operativos II"+"\n"+
                                                        "4: Arquitectura de computadoras"+"\n"+
                                                        "5: Compiladores"+"\n"
                                        );
                                        curso = scanner.nextInt() ;
                                        if (curso == 1){nombreCurso = "Base de datos II";}
                                        else if (curso == 2){nombreCurso = "Analisis de sistemas I";}
                                        else if (curso == 3){nombreCurso = "Sistemas operativos II";}
                                        else if (curso == 4){ nombreCurso = "Arquitectura de computadoras";}
                                        else if (curso == 5){ nombreCurso = "Compiladores";}
                                        break;
                                        case 8:
                                            System.out.println("Escoga el curso a asignar");
                                            System.out.println(
                                                    "1: Desarollo web"+"\n"+
                                                            "2: Analisis de sistemas II"+"\n"+
                                                            "3: Redes de computadoras I"+"\n"+
                                                            "4: Etica profesional"+"\n"+
                                                            "5: Arquitectura de computadoras"+"\n"
                                            );
                                            curso = scanner.nextInt() ;
                                            if (curso == 1){nombreCurso = "Desarrollo web";}
                                            else if (curso == 2){nombreCurso = "Analisis de sistemas II";}
                                            else if (curso == 3){nombreCurso = "Redes de compuadoras I";}
                                            else if (curso == 4){ nombreCurso = "Etica profesional";}
                                            else if (curso == 5){ nombreCurso = "Arquitectura de computadoras II";}
                                            break;
                                    case 9:
                                        System.out.println("Escoga el curso a asignar");
                                        System.out.println(
                                                "1: Administracion de tecnologias de informacion"+"\n"+
                                                        "2: Ingenieria de software"+"\n"+
                                                        "3: Proyecto de graduacion I"+"\n"+
                                                        "4: Redes de computadoras II"+"\n"+
                                                        "5: Inteligencia artificial"+"\n"
                                        );
                                        curso = scanner.nextInt() ;
                                        if (curso == 1){nombreCurso = "Administracion de tecnologias de informacion";}
                                        else if (curso == 2){nombreCurso = "Ingenieria de software";}
                                        else if (curso == 3){nombreCurso = "Poryecto de Graduacion I";}
                                        else if (curso == 4){ nombreCurso = "Redes de computadoras II";}
                                        else if (curso == 5){ nombreCurso = "Inteligencia artificial";}
                                        break;
                                     case 10:
                                         System.out.println("Escoga el curso a asignar");
                                         System.out.println(
                                                 "1: Telecomunicaciones"+"\n"+
                                                         "2: Seminario de tecnologias de informacion"+"\n"+
                                                         "3: Aseguramiento de la calidad del software"+"\n"+
                                                         "4: Proyecto de graduacion II"+"\n"+
                                                         "5: Seguridad y auditorias de sistemas"+"\n"
                                         );
                                         curso = scanner.nextInt() ;
                                         if (curso == 1){nombreCurso = "Telecomunicaciones";}
                                         else if (curso == 2){nombreCurso = "Seminario de tecnologias de informacion";}
                                         else if (curso == 3){nombreCurso = "Aseguramiento de la calidad del software";}
                                         else if (curso == 4){ nombreCurso = "Proyecto de graduacion II";}
                                         else if (curso == 5){ nombreCurso = "Seguridad y auditoria de sistemas";}
                                         break;

        }
        return nombreCurso;

    }


}
