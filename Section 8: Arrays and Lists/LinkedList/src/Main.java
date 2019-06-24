import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    // Create a program that implements a playlist for songs
    // Create a Song class having Title and Duration for a song.
    // The program will have an Album class containing a list of songs.
    // The albums will be stored in an ArrayList
    // Songs from different albums can be added to the playlist and will appear in the list in the order
    // they are added.
    // Once the songs have been added to the playlist, create a menu of options to:-
    // Quit,Skip forward to the next song, skip backwards to a previous song.  Replay the current song.
    // List the songs in the playlist
    // A song must exist in an album before it can be added to the playlist (so you can only play songs that
    // you own).
    // Hint:  To replay a song, consider what happened when we went back and forth from a city before we
    // started tracking the direction we were going.
    // As an optional extra, provide an option to remove the current song from the playlist
    // (hint: listiterator.remove()
    private static ArrayList<Album> albums = new ArrayList<>();// arraylist of all albums(all songs)

    public static void main(String[] args) {

        Album album = new Album("War", "U2");
        album.addSong("Sunday Bloody Sunday", 4.38);
        album.addSong("Seconds", 3.09);
        album.addSong("New Year's Day", 5.38);
        album.addSong("Like a Song…", 4.48);
        album.addSong("Drowning Man", 4.12);
        albums.add(album);

        album = new Album("Funhouse", "P!nk");
        album.addSong("Sober", 4.12);
        album.addSong("I Don't Believe You", 4.36);
        album.addSong("One Foot Wrong", 3.25);
        album.addSong("Please Don't Leave Me", 3.52);
        album.addSong("Bad Influence", 3.36);
        album.addSong("Funhouse", 3.25);
        album.addSong("Crystal Ball", 4.36);
        album.addSong("It's All Your Fault", 3.52);
        album.addSong("Mean", 3.16);
        album.addSong("Glitter In the Air", 3.47);
        albums.add(album);

        album = new Album("For those about to rock", "AC/DC");
        album.addSong("For those about to rock", 5.44);
        album.addSong("I put the finger on you", 3.25);
        album.addSong("Lets go", 3.45);
        album.addSong("Inject the venom", 3.33);
        album.addSong("Snowballed", 4.51);
        album.addSong("Evil walks", 3.45);
        album.addSong("C.O.D.", 5.25);
        album.addSong("Breaking the rules", 5.32);
        album.addSong("Night of the long knives", 5.12);
        albums.add(album);

        LinkedList<Song> playList = new LinkedList<>();
        albums.get(0).addToPlaylist("Drowning Man", playList);// add to playlist song from album 0
        albums.get(0).addToPlaylist("Vertigo", playList);// no such track
        albums.get(0).addToPlaylist(1, playList);// add to playlist first track of first album
        albums.get(1).addToPlaylist("Sober", playList);
        albums.get(1).addToPlaylist("Glitter In the Air", playList);
        albums.get(1).addToPlaylist(12, playList);// no such track
        albums.get(2).addToPlaylist("Snowballed",playList);
        albums.get(2).addToPlaylist(1,playList);
        albums.get(2).addToPlaylist("Rock you", playList); // no such track

        play(playList);


    }

    private static void play(LinkedList<Song> playlist){
        if (playlist.size()==0){
            System.out.println("No songs in the playlist");
            return;
        }else {
            System.out.println("Now playing: "+ playlist.iterator().next().toString());//using the overriden toString of SOng
        }

    }


}


