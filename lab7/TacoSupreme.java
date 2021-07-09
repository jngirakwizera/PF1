public class TacoSupreme extends Taco{
 
    int sourCream, blackOlives;

    public TacoSupreme(String name,  int beef, int beans, int cheese, int lettuce, int sourCream, int blackOlives){
        this.name = name;
        this.beef =beef;
        this.beans =beans;
        this.cheese =cheese;
        this.lettuce =lettuce;
        this.sourCream = sourCream;
        this.blackOlives = blackOlives;
        setWeight();
    }

    public TacoSupreme(){
        this.name = "n/a";
        this.beef = 2;
        this.beans = 3;
        this.cheese = 2;
        this.lettuce = 1;
        this.sourCream = 1;
        this.blackOlives = 1;
        setWeight();
    }

    public void setWeight(){
        this.weight = this.beef + this.beans + this.cheese + this.lettuce + this.sourCream + this.blackOlives;
    }

    public void print_order(){
        System.out.println(name + "'s taco will have the following ingredients:");  
        System.out.println(this.beef +  " units of beef,");
        System.out.println(this.beans +  " units of beans,");
        System.out.println(this.cheese +  " units of cheese, and");
        System.out.println(this.lettuce +  " units of lettuce.");
        System.out.println("PLUS!!!...");
        System.out.println(this.sourCream +  " units of sour cream.");
        System.out.println(this.blackOlives +  " units of black olives!");
    }

    public void gutBomb(){

        this.beef *= 2;
        this.beans *= 2;
        this.cheese *= 2;
        this.lettuce *= 2;
        this.sourCream *= 2;
        this.blackOlives *= 2;

        setWeight();
    }


    public int weight(){
        return weight;
    }

}

