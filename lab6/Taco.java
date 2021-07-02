public class Taco{
 
    String name;
    int weight, beef, beans, cheese, lettuce;

    public Taco(String name,  int beef, int beans, int cheese, int lettuce){
        this.name = name;
        this.beef =beef;
        this.beans =beans;
        this.cheese =cheese;
        this.lettuce =lettuce;
        setWeight();
    }

    public Taco(){
        this.name = "n/a";
        this.beef = 2;
        this.beans = 3;
        this.cheese = 2;
        this.lettuce = 1;
        setWeight();
    }

    public void setWeight(){
        this.weight = this.beef + this.beans + this.cheese + this.lettuce;
    }

    public void print_order(){
        System.out.println(name + "'s taco will have the following ingredients:");  
        System.out.println(this.beef +  " units of beef,");
        System.out.println(this.beans +  " units of beans,");
        System.out.println(this.cheese +  " units of cheese, and");
        System.out.println(this.lettuce +  " units of lettuce.");
    }

    public void gutBomb(){
        this.beef *= 2;
        this.beans *= 2;
        this.cheese *= 2;
        this.lettuce *= 2;
        setWeight();
    }


    public int weight(){
        return weight;
    }

}
