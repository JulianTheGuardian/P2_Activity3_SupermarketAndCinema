/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udes.clases_cinema;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Julian
 */
public class CinemaMain {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Bill_Food> billFoodList = new ArrayList();
        ArrayList<Bill_Function> billFunctionList = new ArrayList();
        ArrayList<Chair> chairList = new ArrayList();
        ArrayList<Cinema_Room> cinemaRoomList = new ArrayList();
        ArrayList<Client> clientList = new ArrayList();
        ArrayList<Function> functionList = new ArrayList();
        ArrayList<Movie> movieList = new ArrayList();
        ArrayList<Product_Food> productFoodList = new ArrayList();
        ArrayList<Worker> workerList = new ArrayList();
        
        String nombre = "";
        int menu = 0;
        int subMenu = 0;
        
        while(true){
            
            System.out.println("\nBienvenido, ¿con que le gustaria trabajar el dia de hoy?");
            System.out.println("1. Factura de Comida");
            System.out.println("2. Factura de Funcion");
            System.out.println("3. Silla"); 
            System.out.println("4. Sala de Cine");
            System.out.println("5. Cliente");
            System.out.println("6. Funcion");
            System.out.println("7. Pelicula");
            System.out.println("8. Comida");
            System.out.println("9. Empleado");
            System.out.println("10. Salir");           
            menu = scanner.nextInt();
            scanner.nextLine();
            
            if (menu==10){
                System.out.println("Muchas gracias por usar este servicio");
                System.exit(0);
            }
            
            switch(menu){
                case 1:
                    
                    nombre = "Factura de Comida";
                    break;
                
                case 2:
                    
                    nombre = "Factura de Funcion";
                    break;
                
                case 3:
                    
                    nombre = "Silla";
                    break;
                
                case 4:
                    
                    nombre = "Sala de Cine";
                    break;
                    
                case 5:
                    
                    nombre = "Cliente";
                    break;
                    
                case 6:
                    
                    nombre = "Funcion";
                    break;
                    
                case 7:
                    
                    nombre = "Pelicula";
                    break;
                    
                case 8:
                    
                    nombre = "Comida";
                    break;
                   
                case 9:
                    
                    nombre = "Empleado";
                    break;    
            }
        
            subMenu = Submenu(scanner, nombre);
        
            switch(subMenu){
                case 1:
                    
                    switch(nombre){
                        
                        case "Factura de Comida":
                            
                            if (!productFoodList.isEmpty() && !clientList.isEmpty() && !workerList.isEmpty()) {
                                billFoodList = Add(billFoodList, scanner, nombre, productFoodList, workerList, clientList, functionList, chairList, cinemaRoomList, movieList);            
                            }
                            else{
                                System.out.println("Para generar una factura de comida primero ingrese minimo una comida, un cliente y un trabajador.");
                            }
                            break;

                        case "Factura de Funcion":
                            
                            if (!functionList.isEmpty() && !clientList.isEmpty() && !workerList.isEmpty()) {
                                billFunctionList = Add(billFunctionList, scanner, nombre, productFoodList, workerList, clientList, functionList, chairList, cinemaRoomList, movieList);
                            }
                            else{
                                System.out.println("Para generar una factura de funcion primero ingrese minimo una funcion, un cliente y un trabajador.");
                            }
                            break;
                            
                        case "Silla":
                            
                            chairList = Add(chairList, scanner, nombre, productFoodList, workerList, clientList, functionList, chairList, cinemaRoomList, movieList);
                            break;
                            
                        case "Sala de Cine":
                            
                            if (!chairList.isEmpty()) {
                                cinemaRoomList = Add(cinemaRoomList, scanner, nombre, productFoodList, workerList, clientList, functionList, chairList, cinemaRoomList, movieList);
                            }
                            else{
                                System.out.println("Para agregar una sala de cine primero agregue minimo una silla.");
                            }
                            break;
                            
                        case "Cliente":
                            
                            clientList = Add(clientList, scanner, nombre, productFoodList, workerList, clientList, functionList, chairList, cinemaRoomList, movieList);                            
                            break;
                            
                        case "Funcion":
                            
                            if (!movieList.isEmpty() && !cinemaRoomList.isEmpty()) {
                                functionList = Add(functionList, scanner, nombre, productFoodList, workerList, clientList, functionList, chairList, cinemaRoomList, movieList);
                            }
                            else{
                                System.out.println("Para agregar una funcion minimo agregue una pelicula y una sala de cine.");
                            }
                            break;
                            
                        case "Pelicula":
                            
                            movieList = Add(movieList, scanner, nombre, productFoodList, workerList, clientList, functionList, chairList, cinemaRoomList, movieList);                                                        
                            break;   
                        
                        case "Comida":
                            
                            productFoodList = Add(productFoodList, scanner, nombre, productFoodList, workerList, clientList, functionList, chairList, cinemaRoomList, movieList);
                            break;
                            
                        case "Empleado":
                            
                            workerList = Add(workerList, scanner, nombre, productFoodList, workerList, clientList, functionList, chairList, cinemaRoomList, movieList);
                            break;    
                    }
                    break;
                    
                case 2:
                    
                    switch(nombre){
                        
                        case "Factura de Comida":
                            
                            Show(billFoodList);
                            break;

                        case "Factura de Funcion":
                            
                            Show(billFunctionList);
                            break;
                            
                        case "Silla":
                            
                            Show(chairList);
                            break;
                            
                        case "Sala de Cine":
                            
                            Show(cinemaRoomList);
                            break;
                            
                        case "Cliente":
                            
                            Show(clientList);
                            break;
                            
                        case "Funcion":
                            
                            Show(functionList);
                            break;
                            
                        case "Pelicula":
                            
                            Show(movieList);
                            break;   
                        
                        case "Comida":
                            
                            Show(productFoodList);
                            break;
                            
                        case "Empleado":
                            
                            Show(workerList);
                            break;
                    }
                    break;
            }
        }
    }
    
    public static int Submenu(Scanner scanner, String nombre){
        System.out.println("\nBienvenido al submenu " + nombre);
        System.out.println("¿Que le gustaria hacer el dia de hoy?");
        System.out.println("1. Agregar " + nombre);
        System.out.println("2. Listar " + nombre);
        System.out.println("3. Salir");
        int respuesta = scanner.nextInt();
        scanner.nextLine();
        return respuesta;
    }
    
    public static void Show(ArrayList storage){
        System.out.println("");
        
        for(int i=0; i<storage.size(); i++){
            System.out.println((i+1) + ". " + storage.get(i));
        }
    }
    
    public static ArrayList Add(ArrayList storage,Scanner scanner, String nombre, ArrayList<Product_Food> productFoodList, ArrayList<Worker> workerList, ArrayList<Client> clientList, ArrayList<Function> functionList, ArrayList<Chair> chairList, ArrayList<Cinema_Room> cinemaRoomList, ArrayList<Movie> movieList){
        
    int repetitions;
    
    System.out.println("Cuantos " + nombre + " quieres agregar?");
    repetitions = scanner.nextInt();
    scanner.nextLine();
    
        for(int i=0; i<repetitions; i++){
            
            switch(nombre){
                
                case "Factura de Comida":
                    
                    System.out.println("Ingrese el numero de factura.");
                    String billId = scanner.nextLine();
                    
                    System.out.println("Cuantos productos va a facturar?");
                    int nProductos = scanner.nextInt();
                    scanner.nextLine();
                    
                    String productNames[] = new String[nProductos];
                    int numberOfProduc[] = new int[nProductos];
                    int count = 0;
                    double totalPrice = 0;
                    Product_Food myProductFoodFac[] = new Product_Food[nProductos];
                    
                    for (int j = 0; j < nProductos; j++) {
                        System.out.println("Ingrese el nombre del " + (j+1) + " producto a facturar (separados por un espacio cada producto).");
                        productNames[j] = scanner.nextLine();
                        
                        System.out.println("Ingrese cuantos " + productNames[j] + " va a facturar.");
                        numberOfProduc[j] = scanner.nextInt();
                        scanner.nextLine();
                    }
                    
                    for (int j = 0; j < nProductos; j++) {
                        for(Product_Food producto: productFoodList){
                            if (producto.getName().equals(productNames[count])){
                                myProductFoodFac[count] = producto;
                                totalPrice = totalPrice + producto.getFoodPrice()*numberOfProduc[count];
                                count++;
                                break;
                            }
                        }
                    }
                    
                    System.out.println("Ingrese el nombre del cliente que pidio la factura.");
                    String clientName = scanner.nextLine();
                    
                    Client myClientFac = new Client();
                    
                    for(Client cliente: clientList){
                        if (cliente.getName().equals(clientName)){
                            myClientFac = cliente;
                            break;
                        }
                    }
                    
                    System.out.println("Ingrese el nombre del empleado que esta creando la factura.");
                    String employName = scanner.nextLine();
                    
                    Worker myWorkerFac = new Worker();
                    
                    for(Worker trabajador: workerList){
                        if (trabajador.getName().equals(employName)){
                            myWorkerFac = trabajador;
                            break;
                        }
                    }
                    
                    Bill_Food myBillFood = new Bill_Food(billId, myProductFoodFac, numberOfProduc, totalPrice, myClientFac, myWorkerFac);
                    storage.add(myBillFood);
                    break;

                case "Factura de Funcion":

                    System.out.println("Ingrese el numero de factura.");
                    String billIdFunc = scanner.nextLine();

                    System.out.println("Ingrese el nombre del empleado que esta creando la factura.");
                    String employNameFunc = scanner.nextLine();

                    Worker myWorkerFunc = new Worker();

                    for(Worker trabajador: workerList){
                        if (trabajador.getName().equals(employNameFunc)){
                            myWorkerFunc = trabajador;
                            break;
                        }
                    }

                    System.out.println("Ingrese el nombre del cliente que pidio la factura.");
                    String clientNameFunc = scanner.nextLine();

                    Client myClientFunc = new Client();

                    for(Client cliente: clientList){
                        if (cliente.getName().equals(clientNameFunc)){
                            myClientFunc = cliente;
                            break;
                        }
                    }

                    System.out.println("Ingrese el id de la funcion a facturar.");
                    String functionId = scanner.nextLine();

                    Function myFunctionFac = new Function();
                    
                    for(Function funcion: functionList){
                        if (funcion.getId().equals(functionId)){
                            myFunctionFac = funcion;
                            break;
                        }
                    }
                    
                    System.out.println("La sala tiene " + myFunctionFac.getCinemaRoom().getTotalOfChairs() + " sillas, elija cual quiere.");
                    int nChair = scanner.nextInt()-1;
                    scanner.nextLine();

                    String roomId = myFunctionFac.getCinemaRoom().getId();
                    String chairId = myFunctionFac.getCinemaRoom().getChair()[nChair].getIdChair();
                    double totalPriceFunc = myFunctionFac.getCinemaRoom().getChair()[nChair].getPrice();

                    Bill_Function myBillFunction = new Bill_Function(billIdFunc, chairId, roomId, 1, totalPriceFunc, myClientFunc, myWorkerFunc , myFunctionFac);
                    storage.add(myBillFunction);
                    break;

                case "Silla":

                    System.out.println("Ingrese el id de la silla");
                    String chairID = scanner.nextLine();

                    System.out.println("La silla fue comprada? (true o false)");
                    boolean bougth = scanner.nextBoolean();
                    scanner.nextLine();

                    System.out.println("La silla es premium? (true o false)");
                    boolean premium = scanner.nextBoolean();
                    scanner.nextLine();

                    double chairPrice;

                    if (premium) {
                        chairPrice = 15000;
                    }
                    else{
                        chairPrice = 10000;
                    }

                    Chair myChair = new Chair(chairID, bougth, premium, chairPrice);
                    storage.add(myChair);
                    break;

                case "Sala de Cine":
                    
                    System.out.println("Ingrese el ID de la sala.");
                    String idSala = scanner.nextLine();
                    
                    System.out.println("Ingrese el tipo de sala.");
                    String tipoSala = scanner.nextLine();
                    
                    System.out.println("Ingrese el numero de sillas de la sala.");
                    int totalChairs = scanner.nextInt();
                    scanner.nextLine();
                    
                    int premiumChairs = 0;
                    int commonChairs = 0;
                    int countSillas = 0;
                    
                    Chair[] sillas = new Chair[totalChairs];
                    
                    for (int j = 0; j < totalChairs; j++) {
                        System.out.println("Ingrese el Id de la silla " + (j+1) + ".");
                        String idSilla = scanner.nextLine();
                        
                        for(Chair silla: chairList){
                            if (silla.getIdChair().equals(idSilla)){
                                
                                sillas[countSillas] = silla;
                                
                                if (silla.isPremium()) {
                                    premiumChairs++;
                                }
                                else{
                                    commonChairs++; 
                                }
                                
                                countSillas++;
                                break;
                            }
                        }
                    }
                    
                    Cinema_Room myCinemaRoom = new Cinema_Room(idSala, tipoSala, commonChairs, premiumChairs, totalChairs, sillas);
                    storage.add(myCinemaRoom);
                    break;

                case "Cliente":
                    
                    System.out.println("Ingrese el nombre del cliente.");
                    String nameClient = scanner.nextLine();
                    
                    System.out.println("Ingrese el id del cliente.");
                    String idClient = scanner.nextLine();
                    
                    System.out.println("El cliente tiene targeta del cine? (true o false)");
                    boolean cinemaCard = scanner.nextBoolean();
                    scanner.nextLine();
                    
                    Client myClient = new Client(nameClient, idClient, cinemaCard);
                    storage.add(myClient);
                    break;
                
                case "Funcion":
                    
                    System.out.println("Ingrese la hora de inicio de la funcion.");
                    String startTime = scanner.nextLine();
                    
                    System.out.println("Ingrese la hora de fin de la funcion.");
                    String finalTime = scanner.nextLine();
                    
                    System.out.println("Ingrese la fecha de la funcion.");
                    String date = scanner.nextLine();
                    
                    System.out.println("Ingrese el id la funcion.");
                    String id = scanner.nextLine();
                    
                    System.out.println("Ingrese el id la sala donde se proyecta.");
                    String idSalaProyection = scanner.nextLine();
            
                    System.out.println("Ingrese el id la pelicula que se proyecta.");
                    String idMovieProyection = scanner.nextLine();
                    
                    Cinema_Room myCinemaProyection = new Cinema_Room();
                    Movie myMovieProyection = new Movie();
                    
                    for(Cinema_Room salaCine: cinemaRoomList){
                        if (salaCine.getId().equals(idSalaProyection)){
                            myCinemaProyection = salaCine;
                            break;
                        }
                    }
                    
                    for(Movie pelicula: movieList){
                        if (pelicula.getId().equals(idMovieProyection)){
                            myMovieProyection = pelicula;
                            break;
                        }
                    }
                    
                    Function myFunction = new Function(myMovieProyection, myCinemaProyection, startTime, finalTime, date, id);
                    storage.add(myFunction);
                    break;
                    
                case "Pelicula":
                    
                    System.out.println("Ingrese el nombre de la pelicula.");
                    String movieName = scanner.nextLine();
                    
                    System.out.println("Ingrese el id de la pelicula.");
                    String movieId = scanner.nextLine();
                    
                    System.out.println("Ingrese el genero de la pelicula.");
                    String movieGenre = scanner.nextLine();
                    
                    System.out.println("Ingrese la edad minima para ver la pelicula.");
                    String movieAgeRestriction = scanner.nextLine();
                    
                    System.out.println("Ingrese el copyrigth de la pelicula.");
                    String movieCopyrigth = scanner.nextLine();
                    
                    System.out.println("Ingrese la duracion de la pelicula (minutos).");
                    String movieDuration = scanner.nextLine();
                    
                    Movie myMovie = new Movie(movieName, movieId, movieGenre, movieAgeRestriction, movieCopyrigth, movieDuration);
                    storage.add(myMovie);
                    break;   

                case "Comida":
                    
                    System.out.println("Ingrese el id del nuevo producto.");
                    String idFood = scanner.nextLine();
                    
                    System.out.println("Ingrese el nombre del nuevo producto.");
                    String nameFood = scanner.nextLine();
                    
                    System.out.println("Ingrese el tipo del nuevo producto (Bebida o comida).");
                    String typeFood = scanner.nextLine();
                    
                    System.out.println("Ingrese el precio del nuevo producto.");
                    double priceFood = scanner.nextDouble();
                    scanner.nextLine();
                    
                    Product_Food myFood = new Product_Food(idFood, nameFood, typeFood, priceFood);
                    storage.add(myFood);
                    break;

                case "Empleado":
                    
                    System.out.println("Ingrese el nombre del nuevo empleado.");
                    String nameEmploy = scanner.nextLine();
                    
                    System.out.println("Ingrese el id del nuevo empleado.");
                    String idEmploy = scanner.nextLine();
                    
                    System.out.println("Ingrese el telefono del nuevo empleado.");
                    String celEmploy = scanner.nextLine();
                    
                    System.out.println("Ingrese el horario del nuevo empleado.");
                    System.out.println("Ejemplo: 8:00AM - 8:00PM");
                    String scheduleEmploy = scanner.nextLine();
                    
                    System.out.println("Ingrese el salario del nuevo empleado.");
                    double salaryEmploy = scanner.nextDouble();
                    scanner.nextLine();
                    
                    Worker myWorker = new Worker(nameEmploy, idEmploy, celEmploy, scheduleEmploy, salaryEmploy);
                    storage.add(myWorker);
                    break;
            }
        }
        return storage;
    } 
}
