package lesson8;

class Animals {
    private String type;
    private String voice;

    public Animals(String type, String voice) {
        this.type = type;
        this.voice = voice;
    }

    protected void voice() {
        System.out.println(type + " издает " + voice);
    }
}