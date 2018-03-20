package aula36;


public class Teste {
    
    public static void main(String[] args) {
        
        Contato contato = new Contato();
        Endereco endereco = new Endereco();
        Telefone tel = new Telefone();
        
        
        contato.setNome("Ronaldo");
        //contato.setEndereco("Viamão - RS");
        //contato.setTelefone("51995505355");
        
        endereco.setCidade("Viamão");
        endereco.setCep("215150");
        endereco.setEstado("RS");
        
        tel.setDdd("11");
        tel.setNumero("995134051");
        tel.setTipo("Celular");
        
        contato.setTelefone(tel);
        
        contato.setEndereco(endereco);
        
        System.out.println(contato.getNome());
        System.out.println(contato.getTelefone());
        
        if(contato != null && contato.getEndereco() != null){
            System.out.println(contato.getEndereco().getCidade());
        }
        
        if(contato != null && contato.getTelefone() != null){
            System.out.println(contato.getTelefone().getDdd() + "-" + contato.getTelefone());
        }
        
        
    } 
}
