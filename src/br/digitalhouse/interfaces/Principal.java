package br.digitalhouse.interfaces;

public class Principal {
    public static void main(String[] args) {
        cachorro novoCachorro = new cachorro("Golden");
        novoCachorro.animalSaudavel("");

        novoCachorro.setIdade(10);
        int  idadeAnimal=novoCachorro.calculoIdadeAnimal(90);
        System.out.println("A idade total é: "+idadeAnimal);
    }
}
