
class Cricket{

    public static void main(String cricket[]){

        int rohitHighestScore = 264;
        int sachinHighestScore = 200;
        int mandanaHighestScore = 135;
        int ackerrHighestScore = 232;
        int bjClarkHighestScore = 229;

       int highestScores[] = {rohitHighestScore, sachinHighestScore, mandanaHighestScore, ackerrHighestScore, bjClarkHighestScore};

       //variable returned from array elememnt
       int ref0 = highestScores[0]; 
       int ref1 = highestScores[1];
       int ref2 = highestScores[2];
       int ref3 = highestScores[3];
       int ref4 = highestScores[4];

       System.out.println("Elemeent of index 0 " + ref0);
       System.out.println("Elemeent of index 1 " + ref1);
       System.out.println("Elemeent of index 2 " + ref2);
       System.out.println("Elemeent of index 3 " + ref3);
       System.out.println("Elemeent of index 4 " + ref4);

      //length is a property of array
      System.out.println("Length of array element " + highestScores.length);
      }
}

       