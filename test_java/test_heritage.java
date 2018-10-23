class test_heritage {
    public static void main(String[] args) {
        int tableau_1[] = new int[3];
        int tableau_2[] = new int[3];
        int tableau_3[] = new int[3];
        tableau_1[0] = 1;
        tableau_1[1] = 2;
        tableau_1[2] = 3;

        tableau_2[0] = 1;
        tableau_2[1] = 2;
        tableau_2[2] = 3;

        for (int i = 0; i < 3; i++) {
            tableau_3[i] = tableau_1[i] + tableau_2[i];
        }

        for (int i = 0; i < 3; i++) {
            System.out.println(tableau_3[i]);
        }

    }
}