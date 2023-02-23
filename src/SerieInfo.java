public class SerieInfo {
    private String name;
    private int viewQuantity;

    public SerieInfo(String name, int viewQuantity) {
        this.name = name;
        this.viewQuantity = viewQuantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getViewQuantity() {
        return viewQuantity;
    }

    public void setViewQuantity(int viewQuantity) {
        this.viewQuantity = viewQuantity;
    }
}
