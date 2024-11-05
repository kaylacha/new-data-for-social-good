import java.util.Scanner;

public class MusicStudio {
  public static void main(String[] args) {

    MusicProduction topSongs = new MusicProduction("TrackName.txt", "artists.txt", "popularity.txt");
    System.out.println(topSongs);

    System.out.println(topSongs.mostPopular());
    System.out.println(topSongs.artistTopSongs("Tyler, The Creator"));
    System.out.println(topSongs.displayArtistCount());




    

    
    
  }
}