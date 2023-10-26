public class Player {

    private Boolean incorrect;
  
    private String name;
  
    private int score;

    private int streak;

    public Player(String name) {
        this.name = name;
        incorrect = false;
        score = 0;
    }

    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }

    public void changeScore() {
        if (incorrect) {
          score = 0;
        } else {
        score++;
      }
    }

    public void reset() {
        score = 0;
    }

    public void incrementStreak() {
      streak++;
    }

    public int getStreak() {
        return streak;
    }

    public void resetStreak() {
      streak = 0;
    }

    public int getIncorrect() {
      if (incorrect) {
        return 1; 
    } else {
        return 0;
    }
  }
}  