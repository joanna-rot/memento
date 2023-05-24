public class Main {
    public static void main(String[] args) {
        Draft draft = new Draft();

        // Capture user input
        String userInput = "Initial text";

        // Initial state
        DraftState state1 = new DraftState(userInput);
        draft.addState(state1);

        // Make changes
        userInput = "Updated text";
        DraftState state2 = new DraftState(userInput);
        draft.addState(state2);

        // Undo
        draft.undo();

        // Redo
        draft.redo();

        // Download all states
        draft.downloadAllStates();
    }
}
