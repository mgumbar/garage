
public class MoteurElectrique extends Moteur {

	public MoteurElectrique(String cylindre, Double prix)
	{
		super(cylindre, prix);
		super.setType(TypeMoteur.ELECTRIQUE);
	}

}
