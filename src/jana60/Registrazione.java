package jana60;

import java.util.Scanner;

public class Registrazione {
    public static void main(String[] args) {
        String  nome,cognome,email,password;
        int age;
        Scanner scan= new Scanner(System.in);
        boolean riprova = true;

        do {
            System.out.println("Inserisci il tuo nome:");
            nome = scan.nextLine();
            System.out.println("Inserisci il tuo cognome:");
            cognome = scan.nextLine();
            System.out.println("Inserisci la tua mail:");
            email = scan.nextLine();
            System.out.println("Inserisci password:");
            password = scan.nextLine();

            try {
                System.out.println("Inserisci la tua età:");
                age = Integer.parseInt(scan.nextLine());

                Utente user1 = new Utente(nome,cognome,email,password,age);
                System.out.println("Grazie per esserti registrato");
                System.out.println(user1);
                riprova = false;

            } catch (NumberFormatException wrongAge) {
                System.out.println("Il campo età deve contenere solo numeri compresi 0 e 150.");
                System.out.println(wrongAge.getMessage());
                System.out.println("Riprova.");
            } catch (Exception e) {
                System.out.println("Dati inseriti non validi.");
                System.out.println(e.getMessage());
                System.out.println("Riprova.");
            }
        } while (riprova);

        scan.close();


    }
}
