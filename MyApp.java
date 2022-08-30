package SpringDemo;

public class MyApp {
  public static void main(String[] args){
//    create obj
    Coach baseballCoach = new BaseballCoach();
    Coach trackCoach = new TrackCoach();

//    use obj
    System.out.println(baseballCoach.getDailyWorkout());
    System.out.println(trackCoach.getDailyWorkout());

  }
}
