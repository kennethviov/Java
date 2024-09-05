package OOPROG.SistemaSaPagdumalaSaLibrarya;

import java.util.ArrayList;

public class Libro {
    private ArrayList<String> titulo = new ArrayList<String>();
    private ArrayList<String> tagsuwat = new ArrayList<String>();
    private ArrayList<String> isbn = new ArrayList<String>();
    private ArrayList<Integer> mgaKopya = new ArrayList<Integer>();
    private ArrayList<Integer> gihuwam = new ArrayList<Integer>();

    public Libro() {
        titulo.add("Itik nga Nagkapa-kapa");
        tagsuwat.add("J.E. Ebarita");
        isbn.add("1-2345-6789-0123");
        mgaKopya.add(5);
        gihuwam.add(0);

        titulo.add("Turagsoy");
        tagsuwat.add("J.G. Baran");
        isbn.add("978-3-16-148410-0");
        mgaKopya.add(3);
        gihuwam.add(0);

        titulo.add("Maigo Ka\'g Kilat");
        tagsuwat.add("J.M. Jamisola");
        isbn.add("978-3-16-148409-7");
        mgaKopya.add(6);
        gihuwam.add(0);
    }


    public void magpunoUgLibro(String titulo, String tagsuwat, String isbn, int mgaKopya) { 
        this.titulo.add(titulo);
        this.tagsuwat.add(tagsuwat);
        this.isbn.add(isbn);
        this.mgaKopya.add(mgaKopya);
        this.gihuwam.add(0); // gitaknang bili sa baryableng gihuwam
    }


    public void manghuwamUgLibro(String titulo, int mgaKopya) {
        for (int i = 0; i < gettituloSize(); i++) {
            if (titulo.equalsIgnoreCase(this.titulo.get(i))) {
                this.mgaKopya.set(i, this.mgaKopya.get(i) - mgaKopya);
                gihuwam.set(i, gihuwam.get(i) + mgaKopya);
                System.out.println("\nNanghuwam ka\'g " + mgaKopya + " ka kopya sa librong \"" + this.titulo.get(i) + "\"");
            }
        }
    }

    public void ibalikAngLibro(String titulo, int mgaKopya) {
        for (int i = 0; i < gettituloSize(); i++) {
            if (titulo.equalsIgnoreCase(this.titulo.get(i))) {
                if (gihuwam.get(i) != 0) {
                    this.mgaKopya.set(i, this.mgaKopya.get(i) + mgaKopya);
                    gihuwam.set(i, gihuwam.get(i) - mgaKopya);
                    System.out.println("\nNag-uli ka\'g " + mgaKopya + " ka kopya sa librong \"" + this.titulo + "\"");
                } else {
                    System.out.println("\nNa-uli na ang tanang librong nakatitulo\'g ingon-ani");
                    return;
                }
            }
        }
    }

    public void mgaDetalye() {
        System.out.println("=======================================================================================");
        System.out.println("[Librarya]\n");
        for (int i = 0; i < gettituloSize(); i++) {
            System.out.println("\"" + titulo.get(i)  + "\"" + " gisuwat ni " + tagsuwat.get(i) + "\tISBN: " + isbn.get(i) + "\t\tNahabilin pang kopya: " + mgaKopya.get(i));
        }
        System.out.println("=======================================================================================");
    }

    // getters
    public int gettituloSize() {
        return titulo.size();
    }

    // checkers for isbn
    public boolean isbnExists(String isbn) {
        boolean exists = false;
        String s1 = isbn.replaceAll("\\D", "");
        for (int i = 0; i < this.isbn.size(); i++) {
            String s2 = this.isbn.get(i).replaceAll("\\D", "");
            if (s1.equals(s2)) {
                exists = true;
            }
        }
        return exists;
    }

    public boolean isbnNumLength(String isbn) {
        int nums = 0;
        for (char c : isbn.toCharArray()) {
            if (Character.isDigit(c)) {
                nums++;
            }
        }
        if (nums == 13) {
            return true;
        } else {
            return false;
        }
    }

    // book checking
    public boolean doesBookExist(String titulo) {
        boolean exists = false;
        for (int i = 0; i < this.titulo.size(); i++) {
            if (titulo.equalsIgnoreCase(this.titulo.get(i))) {
                exists = true;
            } else {
                System.out.println("Walay ingon-ani nga libro!");
            }
        }
        return exists;
    }

    public boolean isCopiesEnough(int nums) {
        boolean enough = false;
        for (int i = 0; i < mgaKopya.size(); i++) {
            if (mgaKopya.get(i) >= nums) {
                enough = true;
            } else if (mgaKopya.get(i) == 0) {
                System.out.println("\nWala na\'y nahabilin nga libro");
            } else {
                System.out.println("\nDi na kaabot ang nahabilin nga libro.");
                System.out.println("Pwede pa ka makahuwam ug " + mgaKopya.get(i) + " ka kopya."); 
            }
        }
        return enough;
    }

    public boolean isBorrowedEnough(int nums) {
        boolean enough = false;
        for (int i = 0; i < gihuwam.size(); i++) {
            if (gihuwam.get(i) >= nums) {
                enough = true;
            } else {
                System.out.println("\nNaa kay " + (nums - gihuwam.get(i) + " ka sobrang hinulman."));
                System.out.println("I-uli palihug sa saktong tag-iya.");
            }
        }
        return enough;
    }
}