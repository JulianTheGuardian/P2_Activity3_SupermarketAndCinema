/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udes.clases_supermarket;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Julian
 */
public class SupermarketMain {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Employ> employList = new ArrayList();
        ArrayList<Client> clientList = new ArrayList();
        ArrayList<Supplier> supplierList = new ArrayList();
        ArrayList<Product> productList = new ArrayList();
        ArrayList<Bill> billList = new ArrayList();
        ArrayList<Cashier> cashierList = new ArrayList();
        ArrayList<Storage> storageList = new ArrayList();
        
        
        String nombre = "";
        int menu = 0;
        int subMenu = 0;
        
        while(true){
            
            System.out.println("\nBienvenido, ¿con que le gustaria trabajar el dia de hoy?");
            System.out.println("1. Empleados");
            System.out.println("2. Cliente");
            System.out.println("3. Proveedor"); 
            System.out.println("4. Producto");
            System.out.println("5. Factura");
            System.out.println("6. Caja Registradora");
            System.out.println("7. Almacen");
            System.out.println("8. Salir");           
            menu = scanner.nextInt();
            scanner.nextLine();
            
            if (menu==8){
                System.out.println("\nMuchas gracias por usar este servicio");
                System.exit(0);
            }
            
            switch(menu){
                
                case 1:
                    
                    nombre = "Empleado";
                    break;
                
                case 2:
                    
                    nombre = "Cliente";
                    break;
                
                case 3:
                    
                    nombre = "Proveedor";
                    break;
                
                case 4:
                    
                    nombre = "Producto";
                    break;
                    
                case 5:
                    
                    nombre = "Factura";
                    break;
                    
                case 6:
                    
                    nombre = "Caja Registradora";
                    break;
                    
                case 7:
                    
                    nombre = "Almacen";
                    break;
            }
        
            subMenu = Submenu(scanner, nombre);
        
            switch(subMenu){
                
                case 1:
                    
                    switch(nombre){
                        
                        case "Empleado":
                            
                            employList=Add(employList, scanner, nombre, productList, employList, clientList);
                            break;

                        case "Cliente":
                            
                            clientList=Add(clientList, scanner, nombre, productList, employList, clientList);
                            break;
                            
                        case "Proveedor":
                            
                            supplierList=Add(supplierList, scanner, nombre, productList, employList, clientList);
                            break;
                            
                        case "Producto":
                            
                            productList=Add(productList, scanner, nombre, productList, employList, clientList);
                            break;
                            
                        case "Factura":
                            
                            if(!employList.isEmpty() && !clientList.isEmpty() && !productList.isEmpty()){
                                billList=Add(billList, scanner, nombre, productList, employList, clientList);
                            }
                            else{
                                System.out.println("Antes de agregar una factura agregue por lo menos un cliente, un empleado y un producto.");
                            }                            
                            break;
                            
                        case "Caja Registradora":
                            
                            if(!employList.isEmpty()){
                                cashierList=Add(cashierList, scanner, nombre, productList, employList, clientList);
                            }
                            else{
                                System.out.println("Antes de crear una caja registradora ingrese minimo un empleado.");
                            }
                            break;
                            
                        case "Almacen":
                            
                            if(!employList.isEmpty() && !productList.isEmpty()){
                                storageList=Add(storageList, scanner, nombre, productList, employList, clientList);
                            }
                            else{
                                System.out.println("Antes de agregar un almacen ingrese minimo un empleado y un producto.");
                            }
                            break;    
                    }
                    break;
                    
                case 2:
                    
                    switch(nombre){
                        
                        case "Empleado":
                            
                            Show(employList);
                            break;

                        case "Cliente":
                            
                            Show(clientList);
                            break;
                            
                        case "Proveedor":
                            
                            Show(supplierList);
                            break;
                            
                        case "Producto":
                            
                            Show(productList);
                            break;
                            
                        case "Factura":
                            
                            Show(billList);                           
                            break;
                            
                        case "Caja Registradora":
                            
                            Show(cashierList);
                            break;
                            
                        case "Almacen":
                            
                            Show(storageList);
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
    
    public static ArrayList Add(ArrayList storage,Scanner scanner, String nombre, ArrayList<Product> productList, ArrayList<Employ> employList, ArrayList<Client> clientList){
        
    int repetitions;
    int points = 0; 
    int sePaso = 0;
    int paso = 0;
    int nProductos;
    double salary = 0;
    double price = 0;
    String phoneNumber = "";
    String schedule = "";
    String mail = "";
    String dueDate = "";
    String expeditionDate = "";
    String name = "";
    String id = "";
    boolean available = true;
    
    System.out.println("Cuantos " + nombre + " quieres agregar?");
    repetitions = scanner.nextInt();
    scanner.nextLine();
    
        for(int i=0; i<repetitions; i++){
            
            switch(nombre){
                        
                case "Empleado":
                    
                    System.out.println("\nIngrese los siguientes datos: ");
                    System.out.print("Nombre: ");
                    name = scanner.nextLine();

                    System.out.print("Numero de identificacion: ");
                    id = scanner.nextLine();
                    
                    System.out.print("Numero de Telefono: ");
                    phoneNumber = scanner.nextLine();

                    System.out.print("Salario: ");
                    salary = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.println("Jordana laboral: ");
                    System.out.println("Ejemplo: 8:00AM - 8:00PM");
                    schedule = scanner.nextLine();
                    
                    Employ myEmploy = new Employ(name, id, phoneNumber, salary, schedule);
                    storage.add(myEmploy);
                    break;

                case "Cliente":
                    
                    System.out.println("\nIngrese los siguientes datos: ");
                    System.out.print("Nombre: ");
                    name = scanner.nextLine();

                    System.out.print("Numero de identificacion: ");
                    id = scanner.nextLine();
                    
                    System.out.print("Puntos Acumulados: ");
                    points = scanner.nextInt();
                    scanner.nextLine();
                    
                    System.out.print("Correo : ");
                    mail = scanner.nextLine();
                    
                    Client myClient = new Client(name, id, mail, points);
                    storage.add(myClient);
                    break;

                case "Proveedor":
                    
                    System.out.println("\nIngrese los siguientes datos: ");
                    System.out.print("Nombre: ");
                    name = scanner.nextLine();

                    System.out.print("Numero de identificacion: ");
                    id = scanner.nextLine();
                    
                    Supplier mySupplier = new Supplier(name, id);
                    storage.add(mySupplier);
                    break;

                case "Producto":
                    
                    System.out.println("\nIngrese los siguientes datos: ");
                    System.out.print("Nombre: ");
                    name = scanner.nextLine();

                    System.out.print("Numero de identificacion: ");
                    id = scanner.nextLine();
                    
                    System.out.print("Precio: ");
                    price = scanner.nextDouble();

                    System.out.print("Esta Disponible (true o false): ");
                    available = scanner.nextBoolean();
                    scanner.nextLine();

                    System.out.print("Fecha de Vencimiento: ");
                    dueDate = scanner.nextLine();

                    System.out.print("Fecha de Expedicion: ");
                    expeditionDate = scanner.nextLine();
                    
                    Product myProduct = new Product(price, id, name, available, dueDate, expeditionDate);
                    storage.add(myProduct);
                    break;

                case "Factura":
                    
                    System.out.println("Cuantos productos va a tener la factura?");
                    nProductos = scanner.nextInt();
                    scanner.nextLine();

                    double precioTotal = 0;

                    if(nProductos > productList.size()){
                        nProductos = productList.size();
                        System.out.println("Debido a que quiso ingresar mas productos que los registrados, se tomara como que quiere agregar todos los productos registrados.");
                        sePaso = 1;
                    }

                    String[] productosNameFactura = new String[nProductos];
                    Product[] productosFactura = new Product[nProductos];
                    int[] cantidadFactura = new int[nProductos];

                    if(sePaso == 0){
                        for (int j = 0; j < nProductos; j++) {
                            System.out.println("Ingrese el nombre del " + j + " producto que desea agregar.");
                            productosNameFactura[j] = scanner.nextLine();
                            System.out.println("Que cantidad de " + productosNameFactura[j] + " va a llevar la factura?");
                            cantidadFactura[j] = scanner.nextInt();
                            scanner.nextLine();
                        }

                        for (int j = 0; j < nProductos; j++) {
                           for(Product product: productList){
                               if(product.getName().equals(productosNameFactura[paso])){
                                    productosFactura[paso] = product;
                                    precioTotal = product.getPrice()*cantidadFactura[paso] + precioTotal;
                                    paso++;
                                    break;
                               }
                           }
                        }
                    }
                    else{
                        for(Product product: productList){
                            productosFactura[paso] = product;

                            System.out.println("Que cantidad de " + productosFactura[paso].getName() + " va a llevar en la factura?");
                            cantidadFactura[paso] = scanner.nextInt();
                            scanner.nextLine();
                            precioTotal = product.getPrice()*cantidadFactura[paso] + precioTotal;
                            paso++;
                        } 
                    }

                    System.out.println("Ingrese el nombre del empleado que realizo la factura.");
                    String empleadoFac = scanner.nextLine();

                    Employ empleadoFactura = new Employ();

                    for(Employ employ: employList){
                        if(employ.getName().equals(empleadoFac)){
                            empleadoFactura = employ;
                            break;
                        }
                    }

                    System.out.println("Ingrese el nombre del cliente que pidio la factura.");
                    String cliente = scanner.nextLine();

                    Client clienteFactura = new Client();

                    for(Client client: clientList){
                        if(client.getName().equals(cliente)){
                            clienteFactura = client;
                            break;
                        }
                    }

                    System.out.println("Ingrese la fecha de expedicion de la factura.");
                    expeditionDate = scanner.nextLine();

                    System.out.println("Ingrese el numero de la factura.");
                    String billNumber = scanner.nextLine();

                    System.out.println("Ingrese el metodo de pago.");
                    String paymentMethod = scanner.nextLine();

                    System.out.println("Ingrese la cantidad de dinero que va a pagar.");
                    double moneyReceived = scanner.nextDouble();
                    scanner.nextLine();

                    double moneyExchange = moneyReceived-precioTotal;

                    Bill myBill = new Bill(productosFactura, cantidadFactura, empleadoFactura, clienteFactura, expeditionDate, billNumber, paymentMethod, precioTotal, moneyReceived, moneyExchange);
                    storage.add(myBill);                           
                    break;

                case "Caja Registradora":
                    
                    System.out.println("Ingrese el numero que va a tener la caja registradora.");
                    String caja = scanner.nextLine();

                    System.out.println("Ingrese el dinero que hay en la caja registradora.");
                    double money = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.println("Ingrese el nombre del empleado que trabaja en la caja registradora.");
                    String cajero = scanner.nextLine();

                    Employ empleadoCaja = new Employ();

                    for(Employ employ: employList){
                        if(employ.getName().equals(cajero)){
                            empleadoCaja = employ;
                            break;
                        }
                    }

                    Cashier myCashier = new Cashier(empleadoCaja, caja, money);
                    storage.add(myCashier);
                    break;

                case "Almacen":
                    
                    System.out.println("Cuantos productos va a guardar en el almacen?");
                    nProductos = scanner.nextInt();
                    scanner.nextLine();

                    if(nProductos > productList.size()){
                        nProductos = productList.size();
                        System.out.println("Debido a que quiso ingresar mas productos que los registrados, se tomara como que quiere agregar todos los productos agragados al alamacen.");
                        sePaso = 1;
                    }

                    String[] productosNameAlmacen = new String[nProductos];
                    Product[] productosAlmacen = new Product[nProductos];
                    int[] cantidadAlmacen = new int[nProductos];

                    if(sePaso == 0){
                        for (int j = 0; j < nProductos; j++) {
                            System.out.println("Ingrese el nombre del " + j + " producto que desea agregar.");
                            productosNameAlmacen[j] = scanner.nextLine();
                            System.out.println("Que cantidad de " + productosNameAlmacen[j] + " desea agregar al almacen?");
                            cantidadAlmacen[j] = scanner.nextInt();
                            scanner.nextLine();
                        }

                        for (int j = 0; j < nProductos; j++) {
                           for(Product product: productList){
                               if(product.getName().equals(productosNameAlmacen[paso])){
                                   productosAlmacen[paso] = product;
                                   paso++;
                                   break;
                                }
                           }
                        }    
                    }
                    else{
                        for(Product product: productList){
                            productosAlmacen[paso] = product;

                            System.out.println("Que cantidad de " + productosAlmacen[paso].getName() + " desea agregar al almacen?");
                            cantidadAlmacen[paso] = scanner.nextInt();
                            scanner.nextLine();
                            paso++;
                        } 
                    }

                    System.out.println("Ingrese el nombre del empleado que trabaja en la bodega.");
                    String empleadoBodega = scanner.nextLine();

                    Employ empleado = new Employ();

                    for(Employ employ: employList){
                        if(employ.getName().equals(empleadoBodega)){
                            empleado = employ;
                            break;
                        }
                    }

                    Storage myStorage = new Storage(productosAlmacen, cantidadAlmacen, empleado);
                    storage.add(myStorage);
                    break;
            }
        }
    return storage;
    } 
    
    public static void Show(ArrayList storage){
        System.out.println("");
        
        for(int i=0; i<storage.size(); i++){
            System.out.println((i+1) + ". " + storage.get(i));
        }
    }
}
