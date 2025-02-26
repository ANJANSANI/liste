// classe main 
public class Main {
    public static void main(String[] args) {
        Lista lista = new Lista();
        // inserimento in ordine alfabetico
        lista.inserisciInOrdine("B");
        lista.inserisciInOrdine("A");
        lista.inserisciInOrdine("C");
        System.out.println("dopo inserimento in ordine alfabetico:");
        lista.visitalista();
        // inserimento in testa
        lista.inserisciInTesta("primo");
        System.out.println("dopo inserimento in testa:");
        lista.visitalista();
        // inserimento in coda
        lista.inserisciInCoda("fine");
        System.out.println("dopo inserimento in coda:");
        lista.visitalista();
    }
}
