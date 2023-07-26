import java.util.Random;

class Game{
    int number;
    public int  getNumber(){
return number;
    }
    public void setNumber(int number){
        number=25;
    }
}

public class Gues_the_Number {
    public static void main(String[] args) {
        /* creat a class game , which allows a user to play "Gueses The Number "
         game once . Game should have the following method
         1 . Constructor to genrate the random number 
         2. take userinput to take user input of number
         3. isCorrectNumber() to detect whether the number entered by the user is true
         4. use properties such as noOfGauses(int) ,To get this task done 
         */
        Game numberGame=new Game();
        numberGame.setNumber(26);
        System.out.println(numberGame);
       Random ra=new Random();
       int ran=ra.nextInt(50);
       for(int i=0;i<50;i++){

       
       if(ran == numberGame.getNumber()){

        System.out.println();
       }
    }
        }
}
