package entities;


public class ListBillet {
  private Billet first;
  private int lenght = 0;

  public ListBillet() {
    this.first = null;
  }

  public void setLenght(int lenght) {
    this.lenght = lenght;
  }

  public void addBillet(Billet newBillet) {
    if (first == null) {
      first = newBillet;
      first.setNext(null);
    } else {
      Billet aux = first;

      while (aux.getNext() != null) {
        aux = aux.getNext();
      }
      aux.setNext(newBillet);
      System.out.println(aux.getId());
    }






  }

  public void removeBillet() {
    Billet aux = first.getNext();
    first.setNext(aux);
  }

//  public void viewBillets() {
//    if (first == null) {
//      System.out.println("Lista vazia!");
//    } else {
//      aux = first;
//      while (aux != null) {
//        System.out.println("Boleto: "
//                            + aux.getId()
//                            + ", Vencimento: "
//                            + aux.getDay()
//                            + "/"
//                            + aux.getMonth()
//                            + ", Valor: "
//                            + aux.getValue());
//        aux = aux.getNext();
//      }
//    }
//  }
}
