import java.io.*;
import java.util.*;

import com.oc.exception.GarageVideException;

public class Garage implements Serializable {

	private ObjectInputStream ois;
	private ObjectOutputStream oos;

	public Garage() throws FileNotFoundException, IOException {
		
		try {
			this.vehicules = this.deSerialize();
		} catch (GarageVideException e) {
			// TODO: handle exception
		} 
	}

	private List<Vehicule> vehicules = new ArrayList();

	public void addVoiture(Vehicule vehicule) {
		vehicules.add(vehicule);
	}

	public List<Vehicule> GetAllVoiture() {
		return vehicules;
	}

	public String toString() {
		return "Nombre de véhicule : " + this.vehicules.size();
	}
	
	public List<Vehicule> deSerialize() throws GarageVideException
	{
		List<Vehicule> listVehicule = null;
		File file = new File(this.getClass().getName());
		if (!file.exists())
			throw new GarageVideException();
		ObjectInputStream ois;

		// On récupère maintenant les données !

		try {
			ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)));
			listVehicule = (List<Vehicule>) ois.readObject();
			ois.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return listVehicule;
	}
	
	public void saveInAFile()
	{
		try {
			
		File file = new File(this.getClass().getName());
		ObjectOutputStream oos;

		oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)));

		// Nous allons écrire chaque objet Game dans le fichier
		oos.writeObject(this.vehicules); // Ne pas oublier de fermer le flux ! oos.close();		
			oos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
