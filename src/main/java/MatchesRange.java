
/*the Command for Searching tracks that are matching the range*/

public class MatchesRange implements Command {

    private Album album;


    public MatchesRange(Album album) {
        this.album = album;
    }

    public void execute()
    {
        album.Match();
    }

}
