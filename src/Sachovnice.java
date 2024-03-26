public class Sachovnice {
    // Vytvořte program, který do konzole vykreslí  šachovnici. Pro
    //tmavá pole využijte plný obdélník "█" (napíšete jej jako
    //Alt + 219 nebo si jej zkopírujte z
    //textu do vašeho kódu). Pro světlá pole využijte mezeru. Jelikož znaky v
    //konzoli jsou mnohem vyšší než širší, vypište vždy 2 znaky vedle sebe,
    //aby vypadaly dohromady jako čtverec.

    public static void main(String[] args) {
        for (int j = 0; j < 8; j++) {
            for (int i = 0; i < 8; i++) {
                if ((i + j) % 2 == 0)
                    System.out.print("██");
                else
                    System.out.print("  ");
            }
            System.out.println(); // Odřádkování
        }
    }
}