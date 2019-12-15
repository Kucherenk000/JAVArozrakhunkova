
/*the Command to choose a random track*/


public class Random implements Command{

    private Album album;

    public Random(Album album) {
        this.album = album;
    }

    public void execute()
    {
        album.Random();
    }


}
