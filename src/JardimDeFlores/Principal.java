package JardimDeFlores;

import java.io.ObjectInputStream.GetField;

public class Principal {

	public static void main(String[] args) {
		
		
		//flor 1
		Petala p1 = new Petala();
		p1.setCorPetala("Amarela");
		
		Petala p2 = new Petala();
		p2.setCorPetala("Laranja");
		
		Flor margarida = new Flor();
		margarida.setPetala1(p1);
		margarida.setPetala2(p2);
		
		
		//flor2
		Petala p3 = new Petala();
		p3.setCorPetala("Azul");
		
		Petala p4 = new Petala();
		p4.setCorPetala("Vermelha");
		
		Flor girassol = new Flor();
		girassol.setPetala3(p3);
		girassol.setPetala4(p4);
		
	        
	  //flor3
	  		Petala p5 = new Petala();
	  		p5.setCorPetala("Verde");
	  		
	  		Flor petunia = new Flor();
	  		petunia.setPetala5(p5);
	  		
	    
	  	//flor4
	  		Petala p6 = new Petala();
	  		p6.setCorPetala("Cinza");
	  		
	  		
	  		Flor geranio = new Flor();
	  		geranio.setPetala6(p6);
	  		
	  	   
	    
	  	//jardim1
	  	  Jardim j1 = new Jardim();
		    j1.setFlor1(margarida);
		    j1.setFlor2(girassol);
		    
		//jardim2
	  	  Jardim j2 = new Jardim();
		    j2.setFlor3(petunia);
		    j2.setFlor4(geranio); 
		    
		    
		//pracinha 1
		    Pracinha pracinha1 = new Pracinha();
		    pracinha1.setJ1(j1);
		    
		 //pracinha 1
		    Pracinha pracinha2 = new Pracinha();
		    pracinha2.setJ2(j2);
		    
		 System.out.println("Cor: "+pracinha1.getJ1().getFlor2().getPetala4().getCorPetala());
		//System.out.println("Cor: "+j2.getFlor3().getPetala5().getCorPetala());
	}

}
