package locadora;

import java.util.ArrayList;
import java.util.Scanner;

public class Locadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Filme> filmes = new ArrayList();

        boolean rodando = true;

        while (rodando) {
            System.out.println("[1] Cadastrar filme");
            System.out.println("[2] Procurar por gênero");
            System.out.println("[3] Remover filme");
            String opcao = scanner.nextLine();

            switch (opcao) {
                case "1": {
                    System.out.println("Titulo: ");
                    String titulo = scanner.nextLine();
                    System.out.println("Genero: ");
                    String genero = scanner.nextLine();
                    System.out.println("Codigo do Filme: ");
                    int codfilme = scanner.nextInt();
                    
                    Filme f = new Filme();
                    f.setCodfilme(codfilme);
                    f.setTitulo(titulo);
                    f.setGenero(genero);
                    filmes.add(f);
                    break;
                }
                case "2": {
                    System.out.println("Digite o gênero: ");
                    String genero = scanner.nextLine();

                    boolean encontrado = false;
                    for (int i = 0; i < filmes.size(); i++) {

                        Filme fTemp = filmes.get(i);

                        if (genero.equals(fTemp.getGenero())) {
                            System.out.println("Filme encontrado");
                            System.out.println("\tCódigo: " + fTemp.getCodfilme());
                            System.out.println("\tTítulo: " + fTemp.getTitulo());
                            System.out.println("\tGênero: " + fTemp.getGenero());
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Não foi encontrado nenhum filme com esse gênero");
                    }
                    break;
                }
                case "3": {
                    for (int i = 0; i < filmes.size(); i++) {

                        Filme fTemp = filmes.get(i);
                        System.out.println("Código:" + filmes.get(i).getCodfilme());
                        System.out.println("Título:" + filmes.get(i).getTitulo());
                        System.out.println("Gênero:" + filmes.get(i).getGenero());
                        
                    }
                    System.out.println("Digite a posição do filme(Por ordem de Cadastro): ");
                    int referencia = scanner.nextInt() - 1;
                    scanner.nextLine();

                    filmes.remove(referencia);
                    System.out.println("Filme apagado!!!");
                    break;
                }
            }
        }

    }
}
