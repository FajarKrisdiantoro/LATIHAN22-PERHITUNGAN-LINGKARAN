/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/*
NAMA : FAJAR KRISDIANTORO
NIM  : 22205004
PRODI: TI REG SORE
*/
package projectpbogit22;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class ProjectPBOgit22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double diameter = 0;
        double radius;
        double area;
        double circumference;
        boolean validInput = false;
        
        System.out.println("=====PERHITUNGAN LINGKARAN=====");
        
        while (!validInput) {
            System.out.print("Masukkan nilai diameter lingkaran: ");
            if (input.hasNextDouble()) {
                diameter = input.nextDouble();
                validInput = true;
            } else {
                System.out.println("Masukan tidak valid. Mohon masukkan angka.");
                input.next(); // Menghapus input yang tidak valid
            }
        }

        // Menghitung jari-jari, luas, dan keliling lingkaran
        radius = diameter / 2;
        area = Math.PI * Math.pow(radius, 2);
        circumference = 2 * Math.PI * radius;

        System.out.println("Jari-jari lingkaran: " + radius);
        System.out.println("Luas lingkaran: " + area);
        System.out.println("Keliling lingkaran: " + circumference);

        input.close();
    }
    
}
