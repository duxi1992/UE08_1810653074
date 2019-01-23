package Aufgabe1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

class login {

    public static void main(String[] args) throws IOException {

        FileReader datei = new FileReader("C:\\Users\\Duxiwebsolutions\\Desktop\\Geheimnis.txt");
        BufferedReader inBuffer = new BufferedReader(datei);

        String geheimnis = inBuffer.readLine();


        Scanner eingabe = new Scanner(System.in);

        String user, pass;


        Scanner input = new Scanner(System.in);

        String username;
        String password;

        System.out.println("Log in:");
        System.out.println("Benutzername: ");
        username = input.next();

        System.out.println("Passwort: ");
        password = input.next();

        //users check = new users(username, password);

        if(username.equals("Riccardo") && password.equals("1234"))
            System.out.println("du bist jetz eingeloggt");
            System.out.println(geheimnis);



    }


}

  /* FileReader datei = new FileReader("C:\\Users\\Duxiwebsolutions\\Desktop\\Geheimnis.txt");
       BufferedReader inBuffer = new BufferedReader(datei);

       String geheimnis = inBuffer.readLine();


       Scanner eingabe = new Scanner(System.in);

       String user, pass;
*/