        int number_1;
        int resultat = 0;
        System.out.println("Saisissez le nombre");
        number_1 = Console.lireI();
        for (int i = number_1 - 1; i > 0; i--) {
            resultat = resultat + i;
            System.out.println(resultat);
        }