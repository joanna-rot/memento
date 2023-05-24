import java.util.ArrayList;
import java.util.List;

class Draft {
    private List<DraftState> states;
    private int currentStateIndex;

    public Draft() {
        states = new ArrayList<>();
        currentStateIndex = -1;
    }

    public void addState(DraftState state) {
        // Remove states beyond the current index when adding a new state
        states.subList(currentStateIndex + 1, states.size()).clear();
        states.add(state);
        currentStateIndex++;
    }

    public void undo() {
        if (currentStateIndex > 0) {
            currentStateIndex--;
        }
    }

    public void redo() {
        if (currentStateIndex < states.size() - 1) {
            currentStateIndex++;
        }
    }

    public void downloadAllStates() {
        for (DraftState state : states) {
            System.out.println("Creation Date: " + state.getCreationDate());
            System.out.println("Content: " + state.getContent());
            System.out.println();
        }
    }
}