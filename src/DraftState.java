import java.time.LocalDateTime;

class DraftState {
    private String content;
    private LocalDateTime creationDate;

    public DraftState(String content) {
        this.content = content;
        this.creationDate = LocalDateTime.now();
    }

    public String getContent() {
        return content;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }
}
