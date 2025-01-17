import bank.account;
class sport{
    String name;
    char type;
    int noplayers;

    public void info(){
        System.out.println("the person plays");
        System.out.println("the type of sport is");
    }


}
class basketball extends sport{
    String position;
    int ballsize;

}

class football extends sport{
    
}

class nbaBasketball extends basketball{
    String rules;
    int extraTime;
}

class information extends basketball{
    public void info(){
        System.out.println("the oerson plays"+name);
        System.out.println("the mode of sport is"+type);
        System.out.println("his position is "+position);
    }
}
public class test{
    public static void main(String[] args){
        basketball per1=new basketball();
        per1.position="center";
        per1.type='i';
        per1.name="basketball";
        per1.noplayers='5';
        per1.info();
    }
}