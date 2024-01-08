package zad4;
import java.util.Date;

public class VideoGame implements Cloneable{
    public String title;
    public String genre;
    public Date releaseDate;

    public VideoGame(String title, String genre, Date releaseDate) {
        this.title = title;
        this.genre = genre;
        this.releaseDate = releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        Date data = new Date(2011,1,12);
        VideoGame game = new VideoGame("Minecraft","Sandbox",data);
        System.out.println("Pierwotna gra: " + game.toString());

        try
        {
            VideoGame otherGame = (VideoGame) game.clone();
            Date oData = new Date(133,2,4);
            game.setReleaseDate(oData);
            System.out.println(game.toString());
            System.out.println(otherGame.toString());
        } catch(CloneNotSupportedException e)
        {
            throw new RuntimeException(e);
        }

    }
}
