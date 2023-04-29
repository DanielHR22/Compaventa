package compraventa3;
import java.util.Scanner;
public class Compraventa_ {
    
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //lista de carros disponibles
       Lista listaCarros = new Lista();
       Lista listaMotos = new Lista();

        listaCarros.agregar(new Carro("1. Lexus", "ES", 2022, 18200));
        listaCarros.agregar(new Carro("2. Audi", "A4", 2022, 17100));
        listaCarros.agregar(new Carro("3. Mercedes-Benz", "C-Class", 2021, 17000));
        listaCarros.agregar(new Carro("4. BMW", "M3", 2022, 18700));
        listaCarros.agregar(new Carro("5. Mazda", "3", 2022, 11000));

        listaMotos.agregar(new Moto("1. Harley Davidson", " Iron 883", 2020, 15000.00));
        listaMotos.agregar(new Moto("2. Honda", "CBR600RR", 2022, 12000.00));
        listaMotos.agregar(new Moto("3. Yamaha", "R6", 2022, 13000.00));
        listaMotos.agregar(new Moto("4. Kawasaki", "Ninja 650", 2022, 8000.00));
        listaMotos.agregar(new Moto("5. Yamaha", "R1", 2021, 18000.00));
        
        //usuario
        System.out.println("Bienvenido a la tienda de vehículos");
        System.out.println("==================================");

        System.out.println("Por favor ingrese su nombre:");
        String nombre = sc.nextLine();

        System.out.println("Por favor ingrese su cédula:");
        String cedula = sc.nextLine();
        //Crear usuario
        Usuario usuario = new Usuario(nombre, cedula);

        System.out.println("¿Desea comprar un carro o una moto? (C/M)");
        String tipoVehiculo = sc.nextLine();

        if (tipoVehiculo.equalsIgnoreCase("C")) {
            System.out.println("Estos son los carros disponibles:");
            listaCarros.imprimir();
            
            

            System.out.println("Por favor ingrese el número correspondiente al carro que desea comprar:");
            int opcion = Integer.parseInt(sc.nextLine());

        

        Vehiculo vehiculo = null;

        switch (opcion) {
            case 1:
                vehiculo = listaCarros.obtener(0);
                break;
            case 2:
                vehiculo = listaCarros.obtener(1);
                break;
            case 3: 
                vehiculo = listaCarros.obtener(2);
                break;
            case 4: 
                vehiculo = listaCarros.obtener(3);
                break;
            case 5: 
                vehiculo = listaCarros.obtener(4);
                break;
            default:
                System.out.println("Opcion invalida");
        }
        
 
            Vendedor vendedor = new Vendedor("Sebastian", "123456789");
            System.out.println("Nombre vendedor: " + vendedor.getNombre());
            System.out.println("\n Cedula vendedor: " + vendedor.getCedula());
            Factura factura = new Factura(vehiculo);
            System.out.println("\n Factura: \n Nombre usuario: " + usuario.getNombre() + " \n Cedula usuario: " + usuario.getCedula() + "\n Cedula vendedor: " + vendedor.getCedula() + "Nombre vendedor: " + vendedor.getNombre() + "\n Informacion vehiculo comprado: " + factura.imprimir());

        }
        else if (tipoVehiculo.equalsIgnoreCase("M")) {
            System.out.println("Estas son las motos disponibles:");
            listaMotos.imprimir();         
        

            System.out.println("Por favor ingrese el número correspondiente a la moto que desea comprar:");
            int opcion = Integer.parseInt(sc.nextLine());
            Vehiculo vehiculo1 = null;
            
            switch (opcion){
            case 1:
                vehiculo1 = listaMotos.obtener(0);
                break;
            case 2:
                vehiculo1 = listaMotos.obtener(1);
                break;
            case 3: 
                vehiculo1 = listaCarros.obtener(2);
                break;
            case 4: 
                vehiculo1 = listaCarros.obtener(3);
                break;
            case 5: 
                vehiculo1 = listaCarros.obtener(4);
                break;    
            }
            

            Vendedor vendedor = new Vendedor("Daniel ", "123456789");
            System.out.println("Nombre vendedor: " + vendedor.getNombre());
            System.out.println("\n Cedula vendedor: " + vendedor.getCedula());
            Factura factura2 = new Factura (vehiculo1); 
            System.out.println("\n Factura: \n Nombre usuario: " + usuario.getNombre() + " \n Cedula usuario: " + usuario.getCedula() + "\n Cedula vendedor: " + vendedor.getCedula() + "Nombre vendedor: " + vendedor.getNombre() + "\n Informacion vehiculo comprado: " + factura2.imprimir());
            }
    }
}
