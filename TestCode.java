public class TestCode {
    public static void main(String[] args) {
        MusicPlaylist playlist = new MusicPlaylist();

        // เพิ่มเพลง
        playlist.addSongAtHead("Shape of You", "Ed Sheeran");
        playlist.addSongAtTail("Blinding Lights", "The Weeknd");
        playlist.addSongAtTail("Bohemian Rhapsody", "Queen");

        // แสดง Playlist
        playlist.displayPlaylist();

        // ค้นหาเพลง
        playlist.searchSongByTitle("Bohemian Rhapsody");

        // ลบเพลง
        playlist.deleteSongAtHead();
        playlist.displayPlaylist();

        // เล่นเพลง
        playlist.playCurrentSong();
        playlist.playNextSong();
        playlist.playPreviousSong();

        // ล้าง Playlist
        playlist.clearPlaylist();
        playlist.displayPlaylist();
    }
    
}