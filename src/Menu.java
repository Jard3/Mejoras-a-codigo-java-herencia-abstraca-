import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    private List<Alumno> alumnos;
    private List<Catedratico> catedraticos;
    private List<Curso> cursos;
    int carne =1;
    int carneCatedratico=1;
    public Menu() {
        alumnos = new ArrayList<>();
        catedraticos = new ArrayList<>();
        cursos = new ArrayList<>();
    }

    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("----- Menú Principal -----");
            System.out.println("1. Registrar Alumno");
            System.out.println("2. Registrar Catedrático");
            System.out.println("3. Inscribir Alumno en Curso");
            System.out.println("4. Asignar Curso a Catedrático");
            System.out.println("5. Mostrar Alumnos");
            System.out.println("6. Mostrar Catedráticos");
            System.out.println("7. Salir");
            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    registrarAlumno(scanner);
                    carne+=1;
                    break;
                case 2:
                    registrarCatedratico(scanner);
                    carneCatedratico+=1;
                    break;
                case 3:
                    inscribirAlumnoEnCurso(scanner);
                    break;
                case 4:
                    asignarCursoACatedratico(scanner);
                    break;
                case 5:
                    mostrarAlumnos();
                    break;
                case 6:
                    mostrarCatedraticos();
                    break;
                case 7:
                    System.out.println("Saliendo del programa...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
        }
    }

    private void registrarAlumno(Scanner scanner) {

        String id ="0909-23-" + carne ;
        System.out.print("Nombre del Alumno: ");
        String nombre = scanner.nextLine();
        String carrera = "Ingenieria en sistemas";

        Alumno alumno = new Alumno(nombre, id, carrera);
        alumnos.add(alumno);
        System.out.println("Alumno registrado exitosamente.\n");
    }

    private void registrarCatedratico(Scanner scanner) {
        String profesion = "";
        String id ="0909-23-" + carneCatedratico ;
        System.out.print("Nombre del Catedrático: ");
        String nombre = scanner.nextLine();
        System.out.print("Escoga la profesion del Catedrático: "+"\n");
        System.out.println("1: Ing. Sistemas"+"\n"+
                "2: Ing Civil"+"\n"+
                "3: Lic. Administración de empresa");
        int opcion = scanner.nextInt();
        if (opcion ==1){profesion="Ing. Sistemas";}
        else if (opcion ==2){profesion="Ing. Civil";}
        else if (opcion ==3) {profesion="Lic. Administracion de empresas";}


        Catedratico catedratico = new Catedratico(nombre, id, profesion);
        catedraticos.add(catedratico);
        System.out.println("Catedrático registrado exitosamente.\n");
    }

    private void inscribirAlumnoEnCurso(Scanner scanner) {
        if (alumnos.isEmpty()) {
            System.out.println("No hay alumnos registrados.\n");
            return;
        }
        System.out.println("Lista de Alumnos:");
        for (int i = 0; i < alumnos.size(); i++) {
            System.out.println(i + 1 + ". " + alumnos.get(i).getNombre());
        }
        System.out.print("Elige el número del Alumno: ");
        int numAlumno = scanner.nextInt() - 1;
        scanner.nextLine();

        Asignar Asignar = new Asignar();
        String nombreCurso = Asignar.Asignar();
        String codigoCurso = "";


        Curso curso = new Curso(nombreCurso);
        alumnos.get(numAlumno).inscribirCurso(curso);
        cursos.add(curso);
    }

    private void asignarCursoACatedratico(Scanner scanner) {
        if (catedraticos.isEmpty()) {
            System.out.println("No hay catedráticos registrados.\n");
            return;
        }
        System.out.println("Lista de Catedráticos:");
        for (int i = 0; i < catedraticos.size(); i++) {
            System.out.println(i + 1 + ". " + catedraticos.get(i).getNombre());
        }
        System.out.print("Elige el número del Catedrático: ");
        int numCatedratico = scanner.nextInt() - 1;
        scanner.nextLine();



        Asignar Asignar = new Asignar();
        String nombreCurso = Asignar.Asignar();
        String codigoCurso = "";

        Curso curso = new Curso(nombreCurso);
        catedraticos.get(numCatedratico).asignarCurso(curso);
        cursos.add(curso);}


    private void mostrarAlumnos() {
        if (alumnos.isEmpty()) {
            System.out.println("No hay alumnos registrados.\n");
        } else {
            System.out.println("----- Lista de Alumnos -----");
            for (Alumno alumno : alumnos) {
                alumno.mostrarDetalles();
            }
            System.out.println();
        }
    }

    private void mostrarCatedraticos() {
        if (catedraticos.isEmpty()) {
            System.out.println("No hay catedráticos registrados.\n");
        } else {
            System.out.println("----- Lista de Catedráticos -----");
            for (Catedratico catedratico : catedraticos) {
                catedratico.mostrarDetalles();
            }
            System.out.println();
        }
    }

}