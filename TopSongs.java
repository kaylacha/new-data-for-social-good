/*
* Represents the top songs
*/
public class TopSongs {
  private String trackName; // The name of the track
  private String artist; // The name of the artist for each of the tracks
  private int popularityRank; // How popular the track is

  /*
  * Sets trackName, artist, and popularityRank
  * to the specified values
  */
  public TopSongs(String trackName, String artist, int popularityRank) {
    this.trackName = trackName;
    this.artist = artist;
    this.popularityRank = popularityRank;
  }

  /*
  * No argument constructor
  * Uses all default values for instance variables
  */
  
public TopSongs() {
    this.trackName = "";
    this.artist = "";
    this.popularityRank = 0;
  }
  
  /*
  * Returns the name of the traclk
  */
  public String getTrackName() {
    return trackName;
  }

  /*
  * Returns the name of the artist
  */
  public String getArtist() {
    return artist;
  }

  /*
  * Returns the popularity ranking of the track
  */
  public int getPopularityRank() {
    return popularityRank;
  }

  /*
  * Returns a String containing the track name and artist
  * of the top songs and its popularity ranking
  */
  public String toString() {
    return trackName + " by " + artist + " has a popularity level of " + popularityRank + ".";
  }





  
}