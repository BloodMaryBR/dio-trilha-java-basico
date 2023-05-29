public class FormatadorCepEx {
    public static void main(String[] args) {
        try {
            String meuCepFormatado = formatarCep("1234234");

            System.out.println(meuCepFormatado);
        } catch (CepInvalidoException e) {
          System.out.println("O ce informado nao tem 8 digitos");

        }
        

    }
    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
          throw new CepInvalidoException();
        
          //simulando um cep formatado
          return "123412-34";
    }
}
