package ex4;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *  La classe fournit des utilitaires pour le formatage des dates.
 */
public class DateUtils {

	/**
	 * Formate une date selon le modèle spécifié. Le format par défaut étant: dd/MM/yyyy HH:mm:ss
	 *
	 * @param pattern le modèle de formatage (par exemple, "dd/MM/yyyy")
	 * @param date la date à formater
	 * @return la date formatée sous forme de chaîne
	 */
	public static String format(String pattern, Date date) {
		if (pattern == null || pattern.isEmpty()) {
			pattern = "dd/MM/yyyy HH:mm:ss";
		}
		SimpleDateFormat formateur = new SimpleDateFormat(pattern);
		return formateur.format(date);
	}
}
