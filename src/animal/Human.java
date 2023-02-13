package animal;

public class Human extends Animal implements Thinkable {
    private String animalHobby;

    public String getAnimalHobby() {
        return animalHobby;
    }

    public void setAnimalHobbby(String animalHobby) {
        this.animalHobby = animalHobby;
    }
    
    public Human() {
    }
    
    public Human(String animalName, int animalAge, String animalHobby) {
        super(animalName, animalAge);
        this.animalHobby = animalHobby;
    }
    
    @Override
    public void think() {
        System.out.println("私は" + animalHobby + "について考えています。");
    }
}
