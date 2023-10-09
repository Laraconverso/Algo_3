class Tres {
    public static void main (String[] args) {
        int[] arr = new int[4];
        try {
            int i = arr[4];
            System.out.println("Dentro del bloque try");
        } catch (NullPointerException ex) {
            System.out.println("Exception has been caught");
        }
        System.out.println("Fin.");
    }
}