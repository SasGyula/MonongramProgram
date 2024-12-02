package hu.szamalk;

import hu.szamalk.modell.Betu;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        Betu betu = new Betu("G");
        System.out.println(betu.toString());
        Path forras = Paths.get("C:\\Users\\sas.gyula\\IdeaProjects\\Monogram1\\src\\main\\java\\hu\\szamalk\\szoveg.txt");
        System.out.println("Jelek száma az első sorba: " + betu.hanyJelSor(0));
        System.out.println("Jelek száma az első oszlopba: " + betu.hanyJelOszlop(0));
        System.out.print("Az első sor ");
        System.out.println(betu.teliSor(0) ? "tele van" : "nincs tele");
        System.out.print("Az első oszlop ");
        System.out.println(betu.teliOszlop(0) ? "tele van" : "nincs tele");
        System.out.println("Teli sorok száma: " + betu.hanyTeleSor());
        System.out.println("Teli oszlopok száma: " + betu.hanyTeleOszlop());
        
        try {
            for(int i = 0; i<100; i++){
                Files.write(forras, betu.toString().getBytes());
            }
            System.out.println("Szöveg sikeresen írva a fájlba!");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}