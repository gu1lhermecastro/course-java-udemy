package entities;


public class ListBillet {
  private Billet first;
  private Billet aux;
  private Billet last;
  private int lenght = 0;

  public void setLenght(int lenght) {
    this.lenght = lenght;
  }

  public void addBillet(Billet newBillet) {
    if (first == null) {
      first = newBillet;
      newBillet.setNext(null);
      lenght++;
      return;
    }

    Billet aux = first;

    if (newBillet.getMonth() < aux.getMonth()) {
      newBillet.setNext(first.getNext());
      first = newBillet;

    } else {
      while (aux.getNext() != null) {
        aux = aux.getNext();
      }
      aux.setNext(newBillet);
    }
  }

  public void removeBillet() {
    Billet aux = first.getNext();
    first.setNext(aux);
  }

  public void viewBillets() {
    if (first == null) {
      System.out.println("Lista vazia!");
    } else {
      aux = first;
      while (aux != null) {
        System.out.println("Boleto: " + aux.getId());
        aux = aux.getNext();
      }
    }
  }
}
