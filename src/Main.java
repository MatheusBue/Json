import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static void main(String[] args) {
        String jsonPessoa = "{\"nome\":\"Rodrigo\",\"idade\":20,\"cidade\":\"Brasília\"}";

        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        Pessoa pessoa = gson.fromJson(jsonPessoa, Pessoa.class);

        System.out.println("Objeto Pessoa: " + pessoa);

        String jsonLivro = "{\"titulo\":\"Aventuras do Java\",\"autor\":\"Akemi\",\"editora\":{\"nome\":" +
                "\"TechBooks\",\"cidade\":\"São Paulo\"}}";


        var gson1 = new Gson();
        Livro livro = gson1.fromJson(jsonLivro, Livro.class);

        System.out.println("Objeto livro: " + livro);
    }
}
