public class ring {
    fighter f1;
    fighter f2;
    int minweight;
    int maxweight;

public ring(fighter f1, fighter f2, int minweight, int maxweight){
    this.f1=f1;
    this. f2=f2;
    this.maxweight=maxweight;
    this.minweight=minweight;
}

public void printScore(){
    System.out.println("-----------------");
    System.out.println(f1.name+" kalan can\t: "+ f1.health);
    System.out.println(f2.name+" kalan can\t: "+ f2.health);

}

public boolean checkWeighit(){
    return (f1.weight>=minweight && f1.weight<=maxweight) &&  (f2.weight>=minweight && f2.weight<=maxweight);
}

public boolean isWin(){
    if(f1.health ==0){
        System.out.println("Maçın kazananı : "+f2.name);
        return true;
    }else if(f2.health==0){
        System.out.println("Maçın kazananı : "+ f1.name);
        return true;
    }
    return false;
}
public void run(){
    if(checkWeighit()){
        while (f1.health > 0 && f2.health >0){
            System.err.println("======== YENİ ROUND ===========");
            f2.health = f1.hit(f2);
            if(isWin())
            break;

            f1.health = f2.hit(f1);
            if(isWin())
            break;
            printScore();
        } 
      
    }else System.out.println("Sporcuların ağırlıkları uyuşmuyor !!!");
}



}
