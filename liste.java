//classe per la lista con operazioni di inserimento e visualizzazione
class Lista {
    private Nodo head;
    private int elementi;

    public Lista() {
        this.head = null;
        this.elementi = 0;
    }
    // comparatore di stringhe
    private boolean precede(String s1, String s2) {
        return s1.compareTo(s2) < 0;
    }
    // testa
    public void inserisciInTesta(String info) {
        Nodo nuovoNodo = new Nodo(info);
        nuovoNodo.setLink(head);
        head = nuovoNodo;
       this.elementi++;
    }
    // coda
    public void inserisciInCoda(String info) {
        Nodo nuovoNodo = new Nodo(info);
        if (head == null) {
            head = nuovoNodo;
        } else {
            Nodo p = head;
            while (p.getLink() != null) {
                p = p.getLink();
            }
            p.setLink(nuovoNodo);
        }
        this.elementi++;
    }
    // inserimento ordnato in modo alfabetico
    public void inserisciInOrdine(String info) {
        if (head == null || precede(info, head.getInfo())) {
            inserisciInTesta(info);
        } else {
            Nodo p = null;
            Nodo current = head;
            Nodo nuovoNodo = new Nodo(info);
            while (current != null && precede(current.getInfo(), info)) {
                p = current;
                current = current.getLink();
            }
            if (p == null) {
                nuovoNodo.setLink(head);
                head = nuovoNodo;
            } else {
                nuovoNodo.setLink(current);
                p.setLink(nuovoNodo);
            }
            this.elementi++;
        }
    }
    // visita lista metodo
    public void visitalista() {
        Nodo p = head;
        while (p != null) {
            System.out.println(p.getInfo());
            p = p.getLink();
        }
    }
}
