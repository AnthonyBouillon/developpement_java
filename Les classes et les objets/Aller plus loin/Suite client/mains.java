public class mains {
    
          
        public static void main(String[] args) {
            // Créer un tableau grace pour mon constructeur
            Client tab[] = { 
                new Client("Bobby", "Weller", "Baker Street", "Londre"),
                new Client("White", "Jack", "", "Detroit"), 
                new Client("Claypool", "Les", "", "San Francisco"),
                new Client("Thunders", "Johnny", "", "New York") 
            };
            // Affiche le tableau
            for (Client tableau : tab) {
                System.out.println(tableau.getName() + " " + tableau.getFirstname());
            }
        }
}




