
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import com.oc.option.*;

public class Vehicule implements Serializable {
	
	private Moteur moteur;
	
	private List<Option> options = new ArrayList<>();

	/**
	 * @return the moteur
	 */
	public Moteur getMoteur() {
		return moteur;
	}

	/**
	 * @param moteur the moteur to set
	 */
	public void setMoteur(Moteur moteur) {
		this.moteur = moteur;
	}

	public void addOption(Option option) {
		this.options.add(option);
	}

	public String toString()
	{
		Stream<Option> so = this.options.stream();
		String options = so.map(x -> x.getClass().getName() + " " + x.getPrix())
						.collect(Collectors.toList()).toString();
		return "+ Voiture: " + this.getClass().getName().toUpperCase() + " " + getMoteur().toString() + ", options: " + options;
	}
}
