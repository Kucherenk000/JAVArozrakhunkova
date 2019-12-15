
/*the Command for Searching Genre*/

public class Style implements Command{

    private Album album;


    public Style(Album album) {
        this.album = album;
    }

    public void execute()
    {
        album.Style();
    }

}
