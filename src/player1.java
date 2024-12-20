

	class Player1 {
	    private String name;
	    private int age;
	    private int score;
	    private int lifeLines;

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public int getAge() {
	        return age;
	    }

	    public void setAge(int age) {
	        this.age = age;
	    }

	    public int getScore() {
	        return score;
	    }

	    public void setScore(int score) {
	        this.score = score;
	    }

	    public int getLifeLines() {
	        return lifeLines;
	    }

	    public void setLifeLines(int lifeLines) {
	        this.lifeLines = lifeLines;
	    }
	}

	public class QuizGame {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        Player player = new Player();

	        try {
	            System.out.println("Enter your name:");
	            player.setName(sc.next());
	            System.out.println("Enter your age:");
	            player.setAge(sc.nextInt());
	            player.setScore(0);
	            player.setLifeLines(2);

	            System.out.println("Welcome to the quiz game, " + player.getName() + "!");
	            System.out.println("Are you ready to play? (yes/no)");
	            String response = sc.next();

	            if (response.equalsIgnoreCase("no")) {
	                System.out.println("Game terminated. Better luck next time!");
	                return;
	            }

	            System.out.println("Here are the rules:");
	            System.out.println("1. You will be asked a series of questions.");
	            System.out.println("2. You can use two lifeLines: 50-50 and Ask the Audience.");
	            System.out.println("3. If you answer a question correctly, you will earn a reward.");
	            System.out.println("4. If you answer a question incorrectly, the game will terminate.");

	            int questionNumber = 1;
	            int reward = 100;

	            while (questionNumber <= 10) {
	                System.out.println("\nQuestion " + questionNumber + ":");
	                switch (questionNumber) {
	                    case 1:
	                        System.out.println("Which is the largest planet in our solar system?");
	                        System.out.println("A) Earth");
	                        System.out.println("B) Saturn");
	                        System.out.println("C) Jupiter");
	                        System.out.println("D) Uranus");
	                        break;
	                    case 2:
	                        System.out.println("Which is the capital city of Australia?");
	                        System.out.println("A) Sydney");
	                        System.out.println("B) Melbourne");
	                        System.out.println("C) Canberra");
	                        System.out.println("D) Perth");
	                        break;
	                    case 3:
	                        System.out.println("Which cricketer is known as the god of cricket?");
	                        System.out.println("A) Sachin Tendulkar");
	                        System.out.println("B) Sunil Gavaskar");
	                        System.out.println("C) Kapil Dev");
	                        System.out.println("D) MS Dhoni");
	                        break;
	                    case 4:
	                        System.out.println("What is the process by which plants convert sunlight into energy?");
	                        System.out.println("A) Respiration");
	                        System.out.println("B) Photosynthesis");
	                        System.out.println("C) Decomposition");
	                        System.out.println("D) Fermentation");
	                        break;
	                    case 5:
	                        System.out.println("Which is the world's largest desert?");
	                        System.out.println("A) Sahara");
	                        System.out.println("B) Gobi");
	                        System.out.println("C) Mojave");
	                        System.out.println("D) Atacama");
	                        break;
	                    case 6:
	                        System.out.println("Which is the world's longest river?");
	                        System.out.println("A) Nile");
	                        System.out.println("B) Amazon");
	                        System.out.println("C) Yangtze");
	                        System.out.println("D) Mississippi");
	                        break;
	                    case 7:
	                        System.out.println("Which is the world's largest island?");
	                        System.out.println("A) Greenland");
	                        System.out.println("B) Iceland");
	                        System.out.println("C) Great Britain");
	                        System.out.println("D) Borneo");
	                        break;
	                    case 8:
	                        System.out.println("Who is known as the boxing legend?");
	                        System.out.println("A) Muhammad Ali");
	                        System.out.println("B) Mike Tyson");
	                        System.out.println("C) Floyd Mayweather");
	                        System.out.println("D) Manny Pacquiao");
	                        break;
	                    case 9:
	                        System.out.println("Which team is known as the All Blacks?");
	                        System.out.println("A) New Zealand");
	                        System.out.println("B) Australia");
	                        System.out.println("C) South Africa");
	                        System.out.println("D) England");
	                        break;
	                    case 10:
	                        System.out.println("Which of the following football

}
