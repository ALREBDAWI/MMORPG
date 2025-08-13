package Model;

public class Person {

    private String name;
    private Category category;
    private Race race;
    private int level;
    private int hp; //life power

    //constructor
    public Person(String pName, Category pCategory, Race pRace, int pLevel, int pHp) {
        this.setName(pName);
        this.setCategory(pCategory);
        this.setRace(pRace);
        this.setLevel(pLevel);
        this.setHp(pHp);
    }

    //constructor
    public Person(String pName, Category pCategory, Race pRace) {
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

    public Category getCategory() {
        return this.category;
    }
    public void setCategory(Category pCategory) {
        this.category = pCategory;
    }

    public Race getRace() {
        return this.race;
    }
    public void setRace(Race pRace) {
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
        Person p1 = new Person("rex", Category.getCategories().get("catIron"), Race.getRaces().get("Elf"), 1, 1);
        System.out.println(p1);

    }
}
