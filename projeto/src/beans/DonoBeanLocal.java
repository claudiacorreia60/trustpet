package beans;

import org.orm.PersistentSession;
import trustpet.Animal;

import javax.ejb.Local;
import java.util.List;

@Local
public interface DonoBeanLocal {

	/**
	 *
	 * @param emailDono
	 * @param nome
	 * @param idade
	 * @param porte
	 * @param sexo
	 * @param alergias
	 * @param doencas
	 * @param comportamento
	 * @param vacinas
	 * @param desparasitacao
	 * @param esterilizacao
	 * @param raca
	 * @param avatar
	 * @param session
	 */
	boolean registarAnimal(String emailDono, String nome, int idade, String porte, String sexo, String alergias, String doencas, String comportamento, boolean vacinas, boolean desparasitacao, boolean esterilizacao, String raca, String avatar, PersistentSession session);

	/**
	 *
	 * @param emailDono
	 * @param session
	 */
	List<Animal> consultarAnimais(String emailDono, PersistentSession session);

	/**
	 *
	 * @param emailDono
	 * @param nome
	 * @param idade
	 * @param porte
	 * @param sexo
	 * @param alergias
	 * @param doencas
	 * @param comportamento
	 * @param vacinas
	 * @param desparasitacao
	 * @param esterilizacao
	 * @param raca
	 * @param avatar
	 * @param session
	 */
	boolean editarAnimal(String emailDono, String nome, int idade, String porte, String sexo, String alergias, String doencas, String comportamento, boolean vacinas, boolean desparasitacao, boolean esterilizacao, String raca, String avatar, PersistentSession session);


}