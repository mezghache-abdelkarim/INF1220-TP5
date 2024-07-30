public class Main {

    public static void main(String[] args) {

      Cercle cercle = new Cercle(3);

      System.out.println("cercle diametre :" + cercle.diametre);
      System.out.println("cercle Perimeter :" + cercle.getPerimeter());

      cercle.resize(2);
      System.out.println("cercle diametre :" + cercle.diametre);
      System.out.println("cercle Perimeter :" + cercle.getPerimeter());


      Carre carre = new Carre(2);

      System.out.println("carre taille :" + carre.taille);
      System.out.println("carre Perimeter :" + carre.getPerimeter());

      carre.resize(3);
      System.out.println("carre taille :" + carre.taille);
      System.out.println("carre Perimeter :" + carre.getPerimeter());



}
}