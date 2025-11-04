package App_Domotica;

import java.util.Scanner;

public class appdomotica {

    static boolean statusH1,statusH2,statusH3,statusBany,StatusCuina,StatusMenjador;
    static boolean statusH12,statusH22,statusH32,statusBany2,StatusCuina2,StatusMenjador2;
    static boolean statusH13,statusH23,statusH33,statusBany3,StatusCuina3,StatusMenjador3;
    static int statusH14,statusH24,statusH34,statusBany4,StatusCuina4,StatusMenjador4;

    public static void main(String[] args) {
        
    String menu = "";
    String menu2 = "";
    String menu3 = "";
    String menu4 = "";
    String menu5 = "";
    String menutemperatura = "";
    String menutemperatura2 = "";
    Boolean encendre = null;
    Boolean obrir = null;
    String hab = "";
    String resposta = "";
    String resposta2 = "";
    String resposta3 = "";
    String resposta4 = "";
    String respostacamara = "";
    String hab3 = "";
    String hab4 = "";
    Boolean estatcamaras = null;
    Boolean fornestat = false;
    int temps = 0;

    //menu principal
    Scanner Scanner1 = new Scanner(System.in);

    do{
        System.out.println("-------------MENU-------------");
        System.out.println("a.- Llums");
        System.out.println("b.- Temperatura");
        System.out.println("c.- Cortines");
        System.out.println("d.- Forn");
        System.out.println("e.- Camares");
        System.out.println("f.- Sortir");
        System.out.println("------------------------------");

        menu = Scanner1.next();
        switch(menu){
            case "a":
                do {
                    System.out.println("------------------------------");
                    System.out.println("a.- Controlar 1 habitació");
                    System.out.println("b.- Controlar TOTES les habitacións");
                    System.out.println("c.- Estat de les llums");
                    System.out.println("d.- sortir");
                    System.out.println("------------------------------");

                    menu2 = Scanner1.next();
                    
                    
                    switch (menu2) {
                    
                        case "a":
                            System.out.println("Digues l'habitacio a encendre/apagar:(h1,h2,h3,menjador,cuina,bany)");
                            hab = Scanner1.next(); //demanem amb scanner la habitacio

                            System.out.println("Vols 'encendre / tancar': ");
                            resposta = Scanner1.next();

                            if (resposta.equals("encendre")) {
                                encendre = true;
                            }
                            else if (resposta.equals("tancar")) {
                                encendre = false;
                            }

                            llum(hab,encendre); //li pasem al void
                            break;
                        
                        case "b":
                            System.out.println("Has seleccionat TOTES les habitacións");
                            System.out.println("Que vols fer 'encendre / tancar': ");
                            resposta2 = Scanner1.next();
                            
                            if (resposta2.equals("encendre")) {
                                statusH1 = true; statusH2 = true; statusH3 = true; statusBany = true; StatusCuina = true; StatusMenjador = true;
                            }
                            else if (resposta2.equals("tancar")) {
                                statusH1 = false; statusH2 = false; statusH3 = false; statusBany = false; StatusCuina = false; StatusMenjador = false;
                            }

                            break;

                        case "c":
                            System.out.println("------------------------------");
                            System.out.println("Has seleccionat estat de les llums");
                            System.out.println("Llums Habitació 1: " + statusH1);
                            System.out.println("Llums Habitació 2: " + statusH2);
                            System.out.println("Llums Habitació 3: " + statusH3);
                            System.out.println("Llums Bany: " + statusBany);
                            System.out.println("Llums Menjador: " + StatusMenjador);
                            System.out.println("Llums Cuina: " + StatusCuina);
                            Scanner1.nextLine();
                            System.out.println("------------------------------");
                            break;
                    }

                } while (!(menu2.equals("d"))); //Per que torni a fer el segon menu
                break;
                

            case "b":
                    do {
                        System.out.println("------------------------------");
                        System.out.println("a.- Escull una habitació");
                        System.out.println("b.- Estat Temperatures");
                        System.out.println("d.- Sortir");
                        System.out.println("------------------------------");

    menutemperatura = Scanner1.next();

    switch(menutemperatura) {
        case "a":
            System.out.println("Digues habitacio a modificar temperatura (h1,h2,h3,menjador,cuina,bany): ");
            hab = Scanner1.next();

            System.out.println("------------------------------");
            System.out.println("a.- Pujar +1 a " + hab);
            System.out.println("b.- Baixar -1 a " + hab);
            System.out.println("c.- Establir temperatura personalitzada a " + hab);
            System.out.println("d.- Sortir");
            System.out.println("------------------------------");

            menutemperatura2 = Scanner1.next();

            switch(hab) {
                case "h1":
                    if(menutemperatura2.equals("a")) statusH14++;
                    else if(menutemperatura2.equals("b")) statusH14--;
                    break;
                case "h2":
                    if(menutemperatura2.equals("a")) statusH24++;
                    else if(menutemperatura2.equals("b")) statusH24--;
                    break;
                case "h3":
                    if(menutemperatura2.equals("a")) statusH34++;
                    else if(menutemperatura2.equals("b")) statusH34--;
                    break;
                case "menjador":
                    if(menutemperatura2.equals("a")) StatusMenjador4++;
                    else if(menutemperatura2.equals("b")) StatusMenjador4--;
                    break;
                case "cuina":
                    if(menutemperatura2.equals("a")) StatusCuina4++;
                    else if(menutemperatura2.equals("b")) StatusCuina4--;
                    break;
                case "bany":
                    if(menutemperatura2.equals("a")) statusBany4++;
                    else if(menutemperatura2.equals("b")) statusBany4--;
                    break;
                default:
                    System.out.println("Habitació no vàlida!");
            }
            break;

        case "b":
            System.out.println("------------------------------");
            System.out.println("Temperatura Habitació 1: " + statusH14);
            System.out.println("Temperatura Habitació 2: " + statusH24);
            System.out.println("Temperatura Habitació 3: " + statusH34);
            System.out.println("Temperatura Bany: " + statusBany4);
            System.out.println("Temperatura Menjador: " + StatusMenjador4);
            System.out.println("Temperatura Cuina: " + StatusCuina4);
            Scanner1.nextLine();
            System.out.println("------------------------------");
            break;

        case "d":
            // salir del menú de temperatura
            break;

        default:
            System.out.println("Opció no vàlida!");
    }

} while(!menutemperatura.equals("d"));

            break;

    
            case "c":
                do {
                    System.out.println("------------------------------");
                    System.out.println("a.- Controlar 1 habitació");
                    System.out.println("b.- Controlar TOTES les habitacións");
                    System.out.println("c.- Estat de les cortines");
                    System.out.println("d.- sortir");
                    System.out.println("------------------------------");

                    menu3 = Scanner1.next();
                    
                    switch (menu3) {
                    
                        case "a":
                            System.out.println("Digues habitacio a moure cortines:(h1,h2,h3,menjador,cuina,bany)");
                            hab3 = Scanner1.next(); //demanem amb scanner la habitacio

                            System.out.println("Vols 'obrir / tancar': ");
                            resposta3 = Scanner1.next();

                            if (resposta3.equals("obrir")) {
                                obrir = true;
                            }
                            else if (resposta3.equals("tancar")) {
                                obrir = false;
                            }

                            cortines(hab3,obrir); //li pasem al void
                            break;
                        
                        case "b":
                            System.out.println("Has seleccionat TOTES les habitacións");
                            System.out.println("Que vols fer 'encendre / tancar': ");
                            resposta3 = Scanner1.next();
                            
                            if (resposta3.equals("encendre")) {
                                statusH1 = true; statusH2 = true; statusH3 = true; statusBany = true; StatusCuina = true; StatusMenjador = true;
                            }
                            else if (resposta3.equals("tancar")) {
                                statusH1 = false; statusH2 = false; statusH3 = false; statusBany = false; StatusCuina = false; StatusMenjador = false;
                            }
                            break;

                        case "c":
                            System.out.println("------------------------------");
                            System.out.println("Has seleccionat estat de les cortines");
                            System.out.println("Cortines Habitació 1: " + statusH12);
                            System.out.println("Cortines Habitació 2: " + statusH22);
                            System.out.println("Cortines Habitació 3: " + statusH32);
                            System.out.println("Cortines Bany: " + statusBany2);
                            System.out.println("Cortines Menjador: " + StatusMenjador2);
                            System.out.println("Cortines Cuina: " + StatusCuina2);
                            Scanner1.nextLine();
                            System.out.println("------------------------------");
                            break;
                            
                    }
                } while (!(menu3.equals("d")));
            break;  

            case "d":
                System.out.println("------------------------------");
                System.out.println("a.- Controlar forn");
                System.out.println("b.- Estat del forn");
                System.out.println("c.- sortir");
                System.out.println("------------------------------");

            menu4 = Scanner1.next();

            switch (menu4) {
                case "a":
                    System.out.println("Vols 'encendre / apagar' el forn?: ");
                        resposta4 = Scanner1.next();

                        if (resposta4.equals("encendre")) {
                                fornestat = true;
                                System.out.println("Introdueix el temps en minuts: ");
                                temps = Scanner1.nextInt();

                                for (int i = temps; i > 0; i--){
                                    System.out.println(i +" minut restant.");
                                try {
                                    Thread.sleep(temps * 60000);
                                } catch (InterruptedException e) {
                                    System.out.println("¡Error!");
                                }
                            }
                                fornestat = false;
                                System.out.println("S'ha apagat el forn després de " + temps + " minuts!");
                            }

                            else if (resposta4.equals("tancar")) {
                                fornestat = false;
                                System.out.println("Forn Apagat!");
                            }
                    
                    break;

                case "b":
                    System.out.println("Has seleccionat estat del forn");
                    System.out.println("L'estat del forn es: " + fornestat);
                
                }while(!(menu4.equals("c")));
                break;

            case "e":
                
                System.out.println("Digues de quina habitació es la camara (h1,h2,h3,menjador,cuina,bany) ");
                    hab4 = Scanner1.next(); //demanem amb scanner la habitacio
                do{
                    System.out.println("------------------------------");
                    System.out.println("a.- Entrar camara");
                    System.out.println("b.- Configuració camara");
                    System.out.println("c.- Estat camara");
                    System.out.println("d.- Sortir");
                    System.out.println("------------------------------");

                    menu5 = Scanner1.next();
                        switch (menu5) {
                            case "a":
                            
                            do {
                                System.out.println("------------------------------");
                                System.out.println("a.- Veure video");
                                System.out.println("b.- Sortir camara");
                                System.out.println("------------------------------");
                                respostacamara = Scanner1.next();

                                switch (respostacamara) {
                                    case "a":
                                        System.out.println("Mirant càmera...");
                                        break;
                                }

                            } while (!(respostacamara.equals("b")));
                            break;
                    
                    case "b":
                        System.out.println("Vols 'encendre / tancar': ");
                            resposta = Scanner1.next();
                        
                            if (resposta.equals("encendre")) {
                                    estatcamaras = true;
                                }
                            else if (resposta.equals("tancar")) {
                                    estatcamaras = false;
                                }

                                camara(hab4,estatcamaras); //li pasem al void
                                break;
                        
                    case "c":
                        
                        System.out.println("------------------------------");
                        System.out.println("Has seleccionat estat de les camaras");
                        System.out.println("Camara Habitació 1: " + statusH13);
                        System.out.println("Camara Habitació 2: " + statusH23);
                        System.out.println("Camara Habitació 3: " + statusH33);
                        System.out.println("Camara Bany: " + statusBany3);
                        System.out.println("Camara Menjador: " + StatusMenjador3);
                        System.out.println("Camara Cuina: " + StatusCuina3);
                        Scanner1.nextLine();
                        System.out.println("------------------------------");
                            break;
                            }
                        }
                while(!(menu.equals("c")));
                
                
                
                };
            
        }
    
    while(!(menu.equals("f")));
    

        

    
    }

    public static void llum(String h,boolean on) {

        if(h.equals("h1")){
            statusH1 = on;
        }
        else if(h.equals("h2")){
            statusH2 = on;
        }
        else if (h.equals("h3")) {
            statusH3 = on;
        }
        else if (h.equals("menjador")) {
            StatusMenjador = on;
        }
        else if (h.equals("cuina")) {
            StatusCuina = on;
        }
        else if (h.equals("bany")) {
            statusBany = on;
        }  

    }

    public static void cortines(String h2,boolean on2) {

        if(h2.equals("h1")){
            statusH12 = on2;
        }
        else if(h2.equals("h2")){
            statusH22 = on2;
        }
        else if (h2.equals("h3")) {
            statusH32 = on2;
        }
        else if (h2.equals("menjador")) {
            StatusMenjador2 = on2;
        }
        else if (h2.equals("cuina")) {
            StatusCuina2 = on2;
        }
        else if (h2.equals("bany")) {
            statusBany2 = on2;
        }  

    }
    public static void camara(String h3, boolean on3) {
        if(h3.equals("h1")){
            statusH13 = on3;
        }
        else if(h3.equals("h2")){
            statusH23 = on3;
        }
        else if (h3.equals("h3")) {
            statusH33 = on3;
        }
        else if (h3.equals("menjador")) {
            StatusMenjador3 = on3;
        }
        else if (h3.equals("cuina")) {
            StatusCuina3 = on3;
        }
        else if (h3.equals("bany")) {
            statusBany3 = on3;
        }  
    }
}
