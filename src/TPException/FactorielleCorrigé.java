package TPException;

public class FactorielleCorrigé {
	    public static void main(String[] args) {

	        int nbEntiers = 0;
	        int factorielle = 1;

	        try {
	            if (args.length == 0) {
	                throw new IllegalArgumentException("Donnez en paramètre la base de la factorielle");
	            }

	            nbEntiers = Integer.parseInt(args[0]);

	           if (nbEntiers < 0) {
	                throw new NegativeException(nbEntiers + " est négatif : la factorielle d'un nombre négatif n'est pas définie.");
	            }

	            if (nbEntiers > 20) {
	                throw new GrandException(nbEntiers + " a dépassé la limite.");
	            }

	            for (int i = 2; i <= nbEntiers; i++) {
	                factorielle *= i;
	            }

	            System.out.println("La factorielle de " + nbEntiers + " est : " + factorielle);

	        } catch (NumberFormatException e) {
	            System.out.println("La base de la factorielle doit être ENTIÈRE.");
	        } catch (IllegalArgumentException e) {
	            System.out.println(e.getMessage());
	        } catch (NegativeException e) {
	            System.out.println(e.getMessage());
	        } catch (GrandException e) {
	            System.out.println(e.getMessage());
	        }
	    
	
}}