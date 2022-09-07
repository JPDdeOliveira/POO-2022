package app;

import io.jooby.annotations.*;

@Path("/")
public class Controller {

  @GET
  public String sayHi(String texto) {
    texto = "Bem vindo a Api calculadora, para fazer os calculos, digite os comandos a seguir:\n Soma: /soma/valor1/valor2\n Subtracao: /subtracao/valor1/valor2\n Multiplicacao: /multiplicacao/valor1/valor2\n Divisao: /divisao/valor1/valor2";
    return texto;
  }
}
