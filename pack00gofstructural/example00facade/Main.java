package pack00gofstructural.example00facade;

public class Main {
  public static void main(String[] args) {
    
    MultimediaFacade facade = new MultimediaFacade();

    // Playing audio
    facade.playMedia("song.mp3", "audio");

    // Playing video
    facade.playMedia("movie.mp4", "video");

    // Loading image
    facade.playMedia("picture.jpg", "image");

    // Unsupported media type
    facade.playMedia("unknown.file", "unknown");
  }
}


/* 
Output

Playing audio file: song.mp3
Playing video file: movie.mp4
Loading image file: picture.jpg
Unsupported media type: unknown
*/