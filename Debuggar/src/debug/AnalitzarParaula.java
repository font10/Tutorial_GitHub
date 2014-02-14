package debug;

public class AnalitzarParaula {

	private String paraula;
	

	/**
	 * Construeix un analitzador per una paraula donada.
	 * 
	 * @param p
	 *            la paraula que ha de ser analitzada
	 */
	public AnalitzarParaula(String p) {
		paraula = p;
	}

	/**
	 * Compta els grups de caracters repetits. Per exemple, "mississippi!!!" te 4 grups repetits: ss, ss, pp i !!!.
	 * 
	 * @return el nombre de grups de caracters repetits
	 */
	public int comptarGrupsCaractersRepetits() {
		System.out.println();
		int comptador = 0;
		for (int i = 1; i < paraula.length() - 1; i++) {
			if (paraula.charAt(i) == paraula.charAt(i + 1)) {
				if (paraula.charAt(i - 1) != paraula.charAt(i)) {
					comptador++;
				}
			}
		}
		return comptador;
	}

}
