public class Movie{
   
    String name;
    int rating;
    String duration;
    Movie(String name,int rating,String duration){
        this.name=name;
        this.rating=rating;
        this.duration=duration;
    }
    public boolean hit(){
        if (rating>8){
            return true;
            
        }
        else{
            return false;
        }
    }
    public void details(){
        System.out.println("name of the Movie:"+name);
        System.out.println("rating of the Movie"+rating);
        System.out.println("duration of the movie"+ duration);
        System.out.println("is movie hit " +hit());
        
        
    }


   public static void main(String[] args){
       Movie M1 = new Movie("court",9,"2:30hours");
       M1.details();
   }
}