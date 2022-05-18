public class DogOwner {
    private String name;
    private String sex;
    private Dog dog;

    public DogOwner(String name, String sex){
        this.name = name;
        this.sex = sex;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public void ageDog(){
        if (dog != null) {
            int age = dog.getAge();
            age++;
            dog.setAge(age);
        }
        else{
            System.out.println("No doggo for you, dog");
        }
    }
    @Override
    public String toString(){return name + " heeft een " + sex + ", deze is " + dog.getAge() +
            " jaar oud en van het soort: " + dog.getSpecies() + ". De hond heet: " + dog.getName();
            }
}
