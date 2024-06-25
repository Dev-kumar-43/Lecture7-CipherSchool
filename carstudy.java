class car{
    String name;
    String color;
    int year;
    int maxspeed;

}


public class carstudy {
    public static void main(String[] args){
        car polo=new car();
        System.out.println(polo.name);
        System.out.println(polo.color);
        System.out.println(polo.year);
        System.out.println(polo.maxspeed);

        polo.color="red";
        polo.name="polo";
        polo.year=2016;
        polo.maxspeed=120;
        System.out.println(polo.name);
        System.out.println(polo.color);
        System.out.println(polo.year);
        System.out.println(polo.maxspeed);



    }
}
