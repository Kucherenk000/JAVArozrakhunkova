
/*the Command for Calculating Duration */

public class CalculateDuration implements Command{

    private Album album;


    public CalculateDuration(Album album) {
        this.album = album;
    }

    public void execute()
    {
        album.Calculate();
    }

}
