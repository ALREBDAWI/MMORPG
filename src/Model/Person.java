package Model;

public class Person {

    private String name;
    private String category;
    private String race;
    private int level;
    private int hp; //life power

    //constructor
    public Person() {
        this.name = "strider";
        this.category = "warrior";
        this.race = "human";
        this.level = 1;
        this.hp = 100;
    }

    //constructor
    public Person(String pName, String pCategory, String pRace, int pLevel, int pHp) {
        this.setName(pName);
        this.setCategory(pCategory);
        this.setRace(pRace);
        this.setLevel(pLevel);
        this.setHp(pHp);
    }

    //constructor
    public Person(String pName, String pCategory, String pRace) {
        this.setName(pName);
        this.setCategory(pCategory);
        this.setRace(pRace);
        this.setLevel(1);
        this.setHp(100);
    }

    //getter and setter
    public String getName() {
        return this.name;
    }
    public void setName(String pName) {
        this.name = pName;
    }

    public String getCategory() {
        return this.category;
    }
    public void setCategory(String pCategory) {
        this.category = pCategory;
    }

    public String getRace() {
        return this.race;
    }
    public void setRace(String pRace) {
        this.race = pRace;
    }

    public int getLevel() {
        return this.level;
    }
    public void setLevel(int pLevel) {
        this.level = pLevel;
    }

    public int getHp() {
        return this.hp;
    }
    public void setHp(int pHp) {
        this.hp = pHp;
    }

    @Override
    public String toString() {
        return
        "name : " + this.getName()
        + "\ncategory : " + this.getCategory()
        + "\nrace : " + this.getRace()
        + "\nlevel : " + this.getLevel()
        + "\nhp : " + this.getHp()
        + "\n";

    }

    //test
    public static void main(String[] args) {
        Person p1 = new Person("rex", "mex", "tex");
        System.out.println(p1);
    }
}
