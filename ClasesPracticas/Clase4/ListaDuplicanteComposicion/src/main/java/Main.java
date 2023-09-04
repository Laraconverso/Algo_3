public class Main {
    public static void main(String[] args) {
        var ldc = new ListaDuplicanteComposicion<Integer>(); //inferencia de tipos
        ldc.add(10);
        ldc.add(20);
        ldc.add(30);

        System.out.println(ldc.get(0));
        System.out.println(ldc.get(1));
        System.out.println(ldc.get(2));
        System.out.println(ldc.get(3));
        System.out.println(ldc.get(4));
        System.out.println(ldc.get(5));

        var ldch = new ListaDuplicanteHerencia<Integer>();
        ldch.add(10);
        ldch.add(20);
        ldch.add(30);

        System.out.println(ldch.get(0));
        System.out.println(ldch.get(1));
        System.out.println(ldch.get(2));
        System.out.println(ldch.get(3));
        System.out.println(ldch.get(4));
        System.out.println(ldch.get(5));
    }


}
