final class Dog extends Pet {
    private String name;
    private String breed;
    private String[] commands;

    public Dog() {
        super(Color.BROWN, new Shelter("Стандартное приют", "Стандартный адрес"));
        this.name = "Неизвестно";
        this.breed = "Неизвестно";
        this.commands = new String[0];
    }

    public Dog(String name, String breed, Color color, Shelter shelter) {
        super(color, shelter);
        this.name = name;
        this.breed = breed;
        this.commands = new String[0];
    }

    public Dog(String name, String breed, Color color, Shelter shelter, String[] commands) {
        super(color, shelter);
        this.name = name;
        this.breed = breed;
        this.commands = commands;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public String[] getCommands() {
        return commands;
    }

    public void setCommands(String[] commands) {
        this.commands = commands;
    }

    public void makeVoice(String voice, int number) {
        for (int i = 0; i < number; i++) {
            System.out.println(voice);
        }
    }


    public String getInfo() {
        String petInfo = super.getInfo();
        return "Имя: " + name + ", Парода: " + breed + ", " + petInfo + ", Команды: " + String.join(", ", commands);
    }
}