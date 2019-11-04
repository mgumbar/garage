
public class MoteurHybride extends Moteur {

	public MoteurHybride(String cylindre, Double prix)
	{
		super(cylindre, prix);
		super.setType(TypeMoteur.HYBRIDE);
	}

}
