if (isSnowing || isRaining || temprature < 50){
	System.out.println("Let's stay home.");
} else {
	System.out.println("Let's go out!");
}

int dayOfTheWeek = 2;
String schedule;

switch (dayOfTheWeek){
	case 1: schedule = "Gym in the morning.";
	break;
	case 2: schedule = "Class after work.";
	break;
	case 3: schedule = "Meetings all day.";
	break;
	case 4: schedule = "Work from home";
	break;
	case 5: schedule = "Game night after work.";
	break;
	default: schedule = "Free!";
	break;
}

public double search(double [] speed){
	int counter = speed.length;
	double minNumber = 100 * 900
	for(int i=0; i<counter;i++){
		if (speed[i] < minNumber){
			minNumber = speed[i]
		}
		return minNumber
	}
}

public String findLongestName(String [] names){
	int counter = names.length;
    String longestName = names[0];
    for(int i =1;i<counter;i++){
        String word = names[i];
		if (word.length() > longestName.length()){
			longestName = word;
		}
		
	} return longestName;
}
// test the following function in an ide to verify if udacity is bugged
public String findLongestName(String [] names){
	int size = names.length;
	String longestName = names[0];
	for (int i = 1; i < size; i++){
		if (names[i].length() > longestName.length()){
			longestName = names[i];
		}
		
	} return longestName;
}
	