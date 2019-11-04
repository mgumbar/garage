
public class MoteurEssence extends Moteur {

	MoteurEssence(String cylindre, Double prix)
	{
		super(cylindre, prix);
		super.setType(TypeMoteur.ESSENCE);
	}
}
