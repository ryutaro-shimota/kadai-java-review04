package animal;

public class Animal {

    private String animalName;  //名前
    private int animalAge;   //年齢

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public int getAnimalAge() {
        return animalAge;
    }

    public void setAnimalAge(int animalAge) {
        this.animalAge = animalAge;
    }

    public Animal() {
    }

    public Animal(String animalName, int animalAge) {
        this.animalName = animalName;
        this.animalAge = animalAge;
    }

    public void say() {
        System.out.println(animalName + "です。" + animalAge + "歳です。");
    }

}
