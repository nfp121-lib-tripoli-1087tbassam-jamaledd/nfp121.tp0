
/**
 * Décrivez votre classe B ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
//bassam makram jamaleddine numero dossier 1087t cnam tripoli a modifiee cette class
public class B extends A
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private int j;

    /**
     * Constructeur d'objets de classe B
     */
    public B()
    {
       super();
        j = 64;
    }

    /**
     * Un exemple de méthode - remplacez ce commentaire par le vôtre
     *
     * @param  y   le paramètre de la méthode
     * @return     la somme de x et de y
     */
    public int sampleMethod(int y)
    {
        // Insérez votre code ici
        return j+6 + super.sampleMethod(y);
    }
}
