package ro.ase.cts.observer.clase;

public interface Subiect {
void aboneazaClient(Observer observer);
void dezaboneazaClient(Observer observer);
void trimiteMeaj(String mesaj);
}
