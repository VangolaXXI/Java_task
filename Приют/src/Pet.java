class Pet {
    private int age;
    private Color color;
    private Shelter shelter;

    public Pet(Color color, Shelter shelter) {
        this.age = generateDefaultAge();
        this.color = color;
        this.shelter = shelter;
    }

    public int getAge() {
        return age;
    }

    public Color getColor() {
        return color;
    }

    public Shelter getShelter() {
        return shelter;
    }

    private int generateDefaultAge() {
        return 1; // Пример генерации возраста по умолчанию
    }

    public String getInfo() {
        return "Возраст: " + age + ", Цвет: " + color + ", Приют: " + shelter.getName() + " (" + shelter.getAddress() + ")";
    }
}