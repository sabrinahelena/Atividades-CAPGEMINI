
package aprendendoClasse;

public class App {
    

    public static void main(String[] args) {
       Caneta c1 = new Caneta(); //criamos objeto C1 = caneta
c1.setModelo("BIC"); //definindo as minhas coisas na classe
//c1.modelo = "BIC" esse seria acesso direto, não seguro
c1.setCor("Azul");
c1.tampar();
c1.status();

//System.out.println("Tenho uma caneta " + c1.getModelo()); pode ter acesso assim tambem




    }
}
