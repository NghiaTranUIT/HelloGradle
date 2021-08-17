import java.util.ArrayList;

public class Library {
    private final String name;
    private ArrayList<String> selections;
    public Library(String name) {
        this.name = name;
        this.selections = new ArrayList<String>();
        this.selections.add("Science");
        this.selections.add("Literature");
        this.selections.add("Education");
        this.selections.add("Children");
        this.selections.add("Advanture");
    }
    public String getName() {
        return name;
    }

    public boolean isInSelection(String select) {
        return this.selections.contains(select);
    }
}
