package Houmwork.zoo_park.model;

public class Pet {
    //FD
    private String ID;
    private String type;
    private int age;
    private String nickname;
    private boolean isMale;

    // Cons-ion

    public Pet(String ID, String type, int age, String nickname, boolean isMale) {
        this.ID = ID;
        this.type = type;
        this.age = age;
        this.nickname = nickname;
        this.isMale = isMale;
    }
    // get&set


    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;

    }
    // toStr

        @Override
        public String toString() {
            return "Animals{" +
                    "ID='" + ID + '\'' +
                    ", type='" + type + '\'' +
                    ", age=" + age +
                    ", nickname='" + nickname + '\'' +
                    ", isMale=" + isMale +
                    '}';
    }
    // voice

    public void voice(){
        System.out.println(" ");
    }
}


