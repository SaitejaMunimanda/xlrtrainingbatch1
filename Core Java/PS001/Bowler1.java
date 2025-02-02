package PS001;
    
    public class Bowler1 {
        private String name;
        private int wickets;
        private int matches;
        private int balls_Bowled;
        private int runs_Conceded;
    
    
        public Bowler1() {
            this.name = "";
            this.wickets = 0;
            this.matches = 0;
            this.balls_Bowled = 0;
            this.runs_Conceded = 0;
            //System.out.println("Hello");
        }
    
        
        public Bowler1(String name, int wickets, int matches, int ballsBowled, int runsConceded) {
            this.name = name;
            this.wickets = wickets;
            this.matches = matches;
            this.balls_Bowled = ballsBowled;
            this.runs_Conceded = runsConceded;
        }
    
        
        public void computeBowlingAverage() {
            if (wickets > 0) {
                double bowlingAvg = (double) runs_Conceded / wickets;
                System.out.println("Name: " + name);
                System.out.printf("bowling_avg=%.1f\n", bowlingAvg);
            } else {
                System.out.println("Name: " + name);
                System.out.println("bowling_avg=Infinity (no wickets taken)");
            }
        }
    
        
        public static void main(String[] args) {
            //Bowler1 obj = new Bowler1();
            //obj.computeBowlingAverage();
            Bowler1 bowler = new Bowler1("Sachin", 10, 5, 750, 463);
            bowler.computeBowlingAverage();
        }
    }
    
