public class SuperHero extends Hero {
    boolean flying;
    public void fly(){
        this.flying = true;
        System.out.println("飛び上がった！");
    }
    public void land(){
        this.flying = false;
        System.out.println("着地した！");
    }
    public void run(){
        System.out.println(this.name + "は撤退した");
    }
    public void attack(Matango m){
        super.attack(m);
        if(this.flying){
            super.attack(m);
        }
    }
    public void test(){
        super.test();
        System.out.println("子テスト");
    }
    public SuperHero() {
        System.out.println("SuperHeroのコンストラクタが動作");
    }
}
