package DesignPatterns.BehavioralPatterns;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

class Song {
    private String title;

    public Song(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}

class Playlist implements Iterable<Song> {
    private List<Song> songs;

    public Playlist(List<Song> songs) {
        this.songs = songs;
    }

    @Override
    public Iterator<Song> iterator() {
        return new SongIterator();
    }

    private class SongIterator implements Iterator<Song> {
        private int currentIndex;

        @Override
        public boolean hasNext() {
            return currentIndex < songs.size();
        }

        @Override
        public Song next() {
            return songs.get(currentIndex++);
        }
    }
}

public class IteratorPattern {
    public static void main(String[] args) {
        List<Song> songs = Arrays.asList(
            new Song("Song 1"),
            new Song("Song 2"),
            new Song("Song 3")
        );

        Playlist playlist = new Playlist(songs);

        // Iterate over the songs in the playlist
        for (Song song : playlist) {
            System.out.println(song.getTitle());
        }
    }
}



