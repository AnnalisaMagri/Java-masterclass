import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public boolean addSong (String title, Double duration){
        if(findSong(title)==null){ // if the song not in the album
            this.songs.add(new Song(title,duration));
            return true;
        }
        return false;
    }
    private Song findSong(String title){ //used only in this class
        for (Song checksong:this.songs){ //for each, creates variable checksong and iterate in ArrayList
            if(checksong.getTitle().equals(title)){
                return checksong; // song is already in playlist
            }
        }
        return null; //no such song in playlist
    }
    public boolean addToPlaylist(int tracknumber, LinkedList<Song> playList){
        int index=tracknumber-1; //index starts from 0, tracknr starts from 1
        if ((index>=0)&&(index<=this.songs.size())){//if that index exists in the album
            playList.add(this.songs.get(index));//add the song from that index
            return true;
        }
        System.out.println("This album has no track "+tracknumber);
        return false;
    }
    public boolean addToPlaylist(String title, LinkedList<Song> playList){
        if (findSong(title)!=null){//if there is a song with that title in the album
            playList.add(findSong(title));//add the song with that title
            return true;
        }
        System.out.println("The song "+ title+ " is not in this album.");
        return false;
    }
}
