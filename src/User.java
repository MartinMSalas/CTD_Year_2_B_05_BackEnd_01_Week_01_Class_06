public class User {
    private String name;
    private int id;

    private SerieProxy serieProxy;

    public User(String name, int id, SerieProxy serieProxy) {
        this.name = name;
        this.id = id;
        this.serieProxy = serieProxy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public SerieProxy getSerieProxy() {
        return serieProxy;
    }

    public void setSerieProxy(SerieProxy serieProxy) {
        this.serieProxy = serieProxy;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String seeSerie(String serie) {
        String url = serieProxy.getMovie(serie);
        System.out.println(url);
        return url;

    }
}
