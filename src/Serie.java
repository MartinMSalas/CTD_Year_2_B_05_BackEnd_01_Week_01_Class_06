public class Serie implements ISerie {
    private String name;

    public Serie(String name) {
        this.name = name;
    }

    @Override
    public String getMovie(String movie) {
        return "www." + movie + ".com";
    }
}
