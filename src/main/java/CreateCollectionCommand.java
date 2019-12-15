
/*the Command for Creating Collection*/

public class CreateCollectionCommand implements Command{

    private Album album;


    public CreateCollectionCommand(Album album) {
        this.album = album;
    }
    public void execute()
    {
        album.Create();
    }

}
