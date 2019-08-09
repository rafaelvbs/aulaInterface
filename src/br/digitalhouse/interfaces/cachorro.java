package br.digitalhouse.interfaces;

public class cachorro extends Animal implements Saudavel  {// implements implementa interface, se a classe abstrata
    // esta implementando uma interface a classe abstrata não precisa implementar mas a concreta tem a obrigatoriedade de implementação

public cachorro(String novaRaca){
    super(novaRaca);
}



    @Override
    public boolean animalSaudavel(String diagnostico) {
        if (diagnostico!=null && !diagnostico.equals("")){
        System.out.println(" O cachorro " +getRaca()+" esta com o Seguinte diagnostico: "+diagnostico);
        return true;
        }else{
        System.out.println("Não possui diagnostico");
        return false; //como usar esses returns para algo??????????
        }
    }

    @Override
    public int calculoIdadeAnimal(int novaIdade) {
        System.out.println("Estamos somando as idades");
        return getIdade()+novaIdade;
    }

    @Override
    public void seDivertir() {
        System.out.println("ele está se divertindo");
    }
}
