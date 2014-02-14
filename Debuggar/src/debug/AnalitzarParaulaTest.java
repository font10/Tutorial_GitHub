package debug;

public class AnalitzarParaulaTest {
	public static void main(String[] args) {

		testComptarGrupsCaractersRepetits("mississippii"); // resultat esperat: 4 (ss, ss, pp, iii)
		testComptarGrupsCaractersRepetits("test"); // resultat esperat: 0 (no hi ha lletres repetides)
		testComptarGrupsCaractersRepetits("aabbcdaaaabb"); // resultat esperat: 4 (aa, bb, aaaa, bb)

	}

	public static void testComptarGrupsCaractersRepetits(String s) {
		AnalitzarParaula analitzadorParaula = new AnalitzarParaula(s);
		int resultat = analitzadorParaula.comptarGrupsCaractersRepetits();
		System.out.println("Grups de caracters repetits: " + resultat);

	}
}
