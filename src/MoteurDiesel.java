
public class MoteurDiesel extends Moteur {

	public MoteurDiesel(String cylindre, Double prix)
	{
		super(cylindre, prix);
		super.setType(TypeMoteur.DIESEL);
	}

}
