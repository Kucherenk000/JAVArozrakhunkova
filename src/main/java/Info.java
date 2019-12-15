
/*the Command for printing info about program*/

public class Info implements Command{

    private Album album;

    public Info(Album album) {
        this.album = album;
    }

    public void execute()
    {
        album.Info();
    }

}
