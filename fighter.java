public class fighter{

    String name;
    int damage;
    int health;
    int weight;
    double dodge;

    public fighter(String name, int damage, int healt, int weight, double dodge){
        this.name=name;
        this.damage=damage;
        this.health=healt;
        this.weight=weight;
        this.dodge=dodge;
    }

    public boolean dodge(){
        double randomvalue = Math.random()* 100;
        return randomvalue<=this.dodge;
    }

    public int hit(fighter f1){
        System.out.println("------------");
        System.out.println(this.name+" => "+ f1.name+" "+ this.damage+" hasar vurdu ");

        if(f1.dodge()){
            System.out.println(f1.name+" gelen hasarı sasvundu");
            return f1.health;
        }
        if(f1.health-this.damage<0)
        return 0;

        return f1.health-this.damage;
        

    }



}