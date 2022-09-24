class Cricket1{

    public static void main(String cricket[]){

        int rohitHighestScore = 264;
        int sachinHighestScore = 200;
        int mandanaHighestScore = 135;
        int ackerrHighestScore = 232;
        int bjClarkHighestScore = 229;

       int highestScores[] = {rohitHighestScore, sachinHighestScore, mandanaHighestScore, ackerrHighestScore, bjClarkHighestScore};

       //variable returned from array elememnt
       

       for(int index = 0; index < highestScores.length; index++){
          int ref = highestScores[index];
          System.out.println("Element at index  " + index + ref);
          }

      //length is a property of array
      System.out.println( "lenght of elements" + highestScores.length);
      }
}
