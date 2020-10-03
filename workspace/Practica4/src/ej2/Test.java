package ej2;

public class Test {

	public static void main(String[] args) {
		//error 	Type mismatch: cannot convert from Veterinaria<Gato> to Veterinaria<Animal>
         //Veterinaria<Animal> vet = new Veterinaria<Gato>();

		//error Type mismatch: cannot convert from Veterinaria<Animal> to Veterinaria<Gato>
         //Veterinaria <Gato> vet = new Veterinaria <Animal>();

		//error 	The method setAnimal(capture#1-of ?) in the type Veterinaria<capture#1-of ?> is not applicable for the arguments (Gato)
         //Veterinaria <?> vet = new Veterinaria<Gato>();
         //vet.setAnimal(new Gato());

		// Anda bien
        //Veterinaria vet1 = new Veterinaria ();
        //vet1.setAnimal(new Perro());
		
		
		//error 	Cannot instantiate the type Veterinaria<?>
         //Veterinaria vet = new Veterinaria <?>();

      //  Veterinaria <? extends Animal> vet2 = new Veterinaria<Gato>();
        // no anda esto de setearle algo
        // vet2.setAnimal(new Gato());

      //   Veterinaria <Animal> vet3 = new Veterinaria <Animal>();
    //     vet3.setAnimal(new Animal());
     //    Veterinaria <? super Gato> vet4 = vet3;
     //    vet4.getAnimal();
         // no anda esto
        // vet4.setAnimal(new Animal());
	}

}
