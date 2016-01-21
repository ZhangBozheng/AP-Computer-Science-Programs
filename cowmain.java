public class cowmain{
    public static void main(String[] argv){
        Cow bessie = new Cow("bessie",160,160);
        Cow dahlia = new Cow("dahlia",48,16);
        Cow margie = new Cow("margie",48,64);
        Cow darlia = new Cow("darlia",128,96);
        dahlia.grow();
        bessie.eat(dahlia);//dahlia dies
        darlia.eat(margie);
        darlia.grow();
        margie.grow();
        bessie.grow();
        margie.eat(darlia);
        bessie.eat(margie);
        margie.grow();
        dahlia.eat(bessie);
        dahlia.grow();
        margie.grow();
        bessie.grow();
        System.out.println(dahlia);
        System.out.println(darlia);
        System.out.println(margie);
        System.out.println(bessie);
    }
}