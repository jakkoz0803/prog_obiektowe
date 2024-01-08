/*package zadtrzecie;
import java.util.ArrayList;
import java.util.Arrays;

public class Music implements Comparable<Music> {
    String title;
    String artist;
    int releaseYear;

    public Music(String title, String artist, int releaseYear) {
        this.title = title;
        this.artist = artist;
        this.releaseYear = releaseYear;
    }

    @Override
    public int compareTo(zadtrzecie.Music o) {
        return Integer.compare(releaseYear, o.releaseYear);
    }

    @Override
    public String toString() {
        return " " + releaseYear;
    }

    public static void main(String[] args) {
        Music m1 = new Music("A","A",2000);
        Music m2 = new Music("B","B",2001);
        Music m3 = new Music("C","C",1995);
        Music m4 = new Music("D","D",2007);

        ArrayList<zad3.Music> MusicList = new ArrayList<>(Arrays.asList(m1,m2,m3,m4));
        for(var item : MusicList) {
            System.out.println(item);
        }

        MusicList.sort(new MusicComparator());
        System.out.println("==========");

        for(var item : MusicList) {
            System.out.println(item);
        }
    }
}

//  Napisz klasę Music, która zawiera pola: title (typu String),
//  artist (typu String) i releaseYear (typu int).
//  Zaimplementuj interfejs Comparable w taki sposób, aby obiekty klasy Music
//  były sortowane malejąco według roku wydania.
//  Stwórz tablicę 4 obiektów klasy Music i posortuj ją według
//  sprecyzowanego kryterium.

 */