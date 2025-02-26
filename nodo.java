//classe nodo per la lista
class Nodo {
    private String info;
    private Nodo link;

    public Nodo(String info) {
        this.info = info;
        this.link = null;
    }
    public String getInfo() {
        return info;
    }
    public Nodo getLink() {
        return link;
    }
    public void setLink(Nodo link) {
        this.link = link;
    }
}