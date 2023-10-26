public class Player {

    private String name;
    private int score;

    private int streak;

    public Player(String name) {
        this.name = name;
        score = 0;
    }

    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }

    public void incrementScore() {
        score++;
    }

    public void reset() {
        score = 0;
    }

    public void winStreak(Boolean correct) {
        if (correct == true) {
            streak++;
        } else {
            streak = 0;
        }
    }

    public int getStreak() {
        return streak;
    }
}