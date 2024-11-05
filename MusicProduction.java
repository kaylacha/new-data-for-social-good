import java.util.Scanner;

public class MusicProduction {
  private TopSongs[] TopSongsData; // The 1D array of TrackName objects

  /*
  * Reads the data from TrackNameFile, artistFile  
  * and popularityFile to initialize trackData
  */
  public MusicProduction(String TrackNameFile, String artistsFile, String popularityFile) {
    TopSongsData = createTopSongs(TrackNameFile, artistsFile, popularityFile);
  }

  /*
  * Returns a 1D array of TopSongs objects using
  * the data from TrackNameFile, artistFile, and popularityFile
  */
  public TopSongs[] createTopSongs(String TrackNameFile, String artistsFile, String popularityFile) {
    String[] TrackNameData = FileReader.toStringArray(TrackNameFile);
    String[] artistsData = FileReader.toStringArray(artistsFile);
    int[] popularityData = FileReader.toIntArray(popularityFile);

    TopSongs[] tempSongs = new TopSongs[artistsData.length];

    for (int index = 0; index < tempSongs.length; index++) {
      tempSongs[index] = new TopSongs(TrackNameData[index], artistsData[index], popularityData[index]);
    }

    return tempSongs;
  }
 /*
  * Returns the number of times an artist name appeared in the top songs
  * Iterates through the list and if an element matches the target value
  * it increments the running count by 1
  */
  public int countArtists(String artistName) {
    int count = 0;
    for (TopSongs names : TopSongsData) {
      if (names.getArtist().equals(artistName)) {
        count++;
      }
    }

    return count;
  }
/*
  * Returns the most popular song in the list
  * Iterates through the list and finds the index of most popular song
  * Returns the name associated with that index of song
  */
  public String mostPopular() {
    int index = 0;
    int highestPop = TopSongsData[0].getPopularityRank();
    for (int i = 0; i < TopSongsData.length; i++) {
      if (TopSongsData[i].getPopularityRank()>highestPop) {
        highestPop = TopSongsData[i].getPopularityRank();
        index = i;
      }
    }

    return "The most popular song is " + TopSongsData[index].getTrackName();
  }

  /*
  * Returns the top songs of a particular artist
  * Iterates through the list and finds a song with the target artist
  * Adds the name of the associated song to the String
  * Uses more than 1D array at the same time (artist array and track name array)
  */

  public String artistTopSongs(String artistName) {
    String songs = "";
    for (int i = 0; i < TopSongsData.length; i++) {
      if (TopSongsData[i].getArtist().equals(artistName)) {
        songs += TopSongsData[i].getTrackName() + "\n";
      }
    }

    return artistName + "'s top songs are " + songs;
  }
  
  /*
  * Prompts the user to enter an artist to find and return their response
  */
  public String promptUser() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter an artist: ");
    return scanner.nextLine();
  }

  /*
  * A toString statement that returns every song, artist, and ranking
  */
  public String toString() {
    String output = "";
    for (TopSongs song : TopSongsData){
      output += song.toString() + "\n";
    }
    return "These are the top 50 songs \n" + output;
  }
 /*
  * Returns a String containing the number of appearances of the user specified artist
  */
  public String displayArtistCount() {
    String artistName = promptUser();
    int count = countArtists(artistName);
    return artistName + " appears " + count + " times on the top 50 Spotify charts.";
  }



  
}