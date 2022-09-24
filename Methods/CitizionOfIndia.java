class CitizionOfIndia{

     public static void showResponsibility(){

      System.out.println("Invoked showResponsibility");

         int age = 21;
         char gender ='F';

         if(age >= 10 && age < 16){
          //AND or OR operator
           System.out.println("Responsibilty is school");
           return;
        }
        
          if(age == 16){
          System.out.println("Responsibilty is collage");
          return;
          }
         
          if(age == 21){
            System.out.println("Responsibility is voting");
          
             if(gender == 'F'){
               System.out.println("Girl can illegally marry");
            }
    
               else{
                  System.out.println("Boy cannot illegally marry");
               }
         }
           System.out.println("end of show responsibility");
           return;
        }
 }
   

    