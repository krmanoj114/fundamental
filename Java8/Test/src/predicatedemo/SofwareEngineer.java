package predicatedemo;

public class SofwareEngineer {
    int age;
    boolean isHavingGirlFriend;
    String name;

    public SofwareEngineer(int age, String name, boolean isHavingGirlFriend) {
        this.age = age;
        this.name = name;
        this.isHavingGirlFriend = isHavingGirlFriend;

    }

   public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isHavingGirlFriend() {
        return isHavingGirlFriend;
    }

    public void setHavingGirlFriend(boolean havingGirlFriend) {
        isHavingGirlFriend = havingGirlFriend;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "predicate.SofwareEngineer{" +
                "age=" + age +
                ", isHavingGirlFriend=" + isHavingGirlFriend +
                ", name='" + name + '\'' +
                '}';
    }
}
