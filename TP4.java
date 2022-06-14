import MG2D.*;
import MG2D.geometrie.*;

class TP4{
    public static void main(String[] args) {
        Fenetre f = new Fenetre( "Mon_appli_MG2D" ,800 ,600 ) ;
        Point p1r1 = new Point(300,200);
        Point p2r1 = new Point(600,250);
        Couleur co = new Couleur(96,96,96);
        Rectangle r1 = new Rectangle(co,p1r1,p2r1,true);
        Point p1r2 = new Point(400,250);
        Point p2r2 = new Point(500,300);
        Rectangle r2 = new Rectangle(Couleur.GRIS,p1r2,p2r2,true);
        Point pc1 = new Point(350,200);
        Point pc2 = new Point(550,200);
        Cercle c1 = new Cercle(pc1,20,true);
        Cercle c2 = new Cercle(pc2,20,true);
        Point p1t1 = new Point(500,250);
        Point p2t1 = new Point(500,300);
        Point p3t1 = new Point(550,250);
        Couleur cot = new Couleur(195,195,195);
        Triangle t1 = new Triangle(cot,p1t1,p2t1,p3t1,true);
        Point p1t2 = new Point(400,250);
        Point p2t2 = new Point(400,300);
        Point p3t2 = new Point(300,250);
        Triangle t2 = new Triangle(cot,p1t2,p2t2,p3t2,true);
        f.ajouter(r1);
        f.ajouter(r2);
        f.ajouter(c1);
        f.ajouter(c2);
        f.ajouter(t1);
        f.ajouter(t2);

        f.rafraichir();
        int vitesse = 1;
        Clavier clavier = f.getClavier();
        Souris souris = f.getSouris();
        while(true){

            try{
            Thread.sleep(4);
            }
            catch(Exception e){}
            if(clavier.getHautEnfoncee())
		        vitesse++;
	        if(clavier.getBasEnfoncee() && vitesse>0)
		        vitesse--;
	        if(souris.getClicGauche())
		        if(r1.getCouleur().equals(co))
		            r1.setCouleur(Couleur.ROUGE);
		        else
		            r1.setCouleur(co);
            c1.translater(vitesse,0);
            c2.translater(vitesse,0);
            r1.translater(vitesse,0);
            r2.translater(vitesse,0);
            t2.translater(vitesse,0);
            t1.translater(vitesse,0);
            if(r1.getB().getX()==800){
            c1.translater(-600,0);
            c2.translater(-600,0);
            r1.translater(-600,0);
            r2.translater(-600,0);
            t2.translater(-600,0);
            t1.translater(-600,0);
            }
            f.rafraichir();
        }
    }


}

