package practicaParcial2;

import java.util.List;
import java.util.ArrayList;

public class Empresa {
	private static Empresa instancia = null;
	private String name;
	private List<Bien> bienes;
	private List<Titular> titulares;
	
	public static Empresa nuevaEmpresa(String name) {
		if(instancia == null) { 
		instancia = new Empresa();
		instancia.name = name;
		}
			return instancia;
	}
	
	private Empresa() {
		bienes = new ArrayList<>();
		titulares = new ArrayList<>();
		
	}
	

	public static Empresa getInstancia() {
		return instancia;
	}



	public static void setInstancia(Empresa instancia) {
		Empresa.instancia = instancia;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public List<Bien> getBienes() {
		return bienes;
	}



	public void setBienes(List<Bien> bienes) {
		this.bienes = bienes;
	}



	public List<Titular> getTitulares() {
		return titulares;
	}



	public void setTitulares(List<Titular> titulares) {
		this.titulares = titulares;
	}


	public void agregarBien(Bien b) throws BienInvalidoException{
		if(b instanceof Automotor || b instanceof CuentaBancaria || b instanceof Bono || b instanceof ObraArte || b instanceof MarcaRegistrada) {
			bienes.add(b);
		}else {
			throw new BienInvalidoException();
		}
	}
	
	public void elminarBien(int id) throws BienNoExistenteException{
		Bien aux2 = new Bien();
		aux2.setId(id);
		if(!existe(aux2)) {
			throw new BienNoExistenteException();
		}else {
		for(Bien aux : bienes) {
			if (id == aux.id) {
				bienes.remove(bienes.indexOf(aux));
			}
		}
		}
	}

	private boolean existe(Bien aux2) {
		// TODO Auto-generated method stub
		for(Bien aux : bienes) {
			if (aux2.id == aux.id) {
				return true;
			}
	}
		return false;
	}
	public void agregarTitular(Titular t) throws TitularExistenteException {
		if(titulares.contains(t)) {
			throw new TitularExistenteException();
		}else {
			titulares.add(t);
		}
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float rnd = 10; 
		Empresa emp1;
		emp1 = Empresa.nuevaEmpresa("Coto");
		Titular t1 = new Titular("Vilhem","Von Hausten");
		Titular t2 = new Titular("Wilfred","Von Hausten");
		Titular t3 = new Titular("Godofred","Von Hausten");
		try {
			emp1.agregarTitular(t1);
			emp1.agregarTitular(t2);
			emp1.agregarTitular(t3);
			//emp1.agregarTitular(t2);
		}catch (TitularExistenteException e) {
			// TODO: handle exception
			System.out.println("Error al ingresar al titular: Titular Existente");
		}
		Automotor auto1 = new Automotor(t1);
		CuentaBancaria cb1 = new CuentaBancaria(t2);
		ObraArte oa1 = new ObraArte(t3);
		//BienInexistente bi1 = new BienInexistente(t1);
		try {
			auto1.setValorFiscal(rnd + 9);
			auto1.setValorMercado(rnd + 39);
			cb1.setValorFiscal(rnd + 3);
			cb1.setValorMercado(rnd - 3);
			oa1.setValorFiscal(rnd + 9);
			oa1.setValorMercado(rnd + 69);
			oa1.setPrima(1);
			auto1.setAlicuota(rnd);
			auto1.setPrima(rnd);
			try {
			emp1.agregarBien(auto1);
			emp1.agregarBien(cb1);
			emp1.agregarBien(oa1);
			//emp1.agregarBien(bi1);
			}catch (MiAppException e) {
				System.out.println("Bien que intento ingresar invalido");
			}
		}catch(AlicuotaInvalidaException e) {
			System.out.println("Algo salio mal!");
			System.out.println("Alicuota invalida");
		}catch (PrimaInvalidaException e) {
			// TODO: handle exception
			System.out.println("Algo salio mal!");
			System.out.println("Prima invalida");
		}catch (ValorFiscalInvalidoException e) {
			// TODO: handle exception
			System.out.println("Algo salio mal!");
			System.out.println("Valor Fiscal invalido");
		}catch (ValorMercadoInvalidoException e) {
			// TODO: handle exception
			System.out.println("Algo salio mal!");
			System.out.println("Valor Mercado invalido");
		}
		System.out.println(oa1.getPrima());
		System.out.println(auto1.calcularImpuesto());
		try {
			auto1.transferir(t2, emp1);
		}catch (TitularInvalidoException e) {
			// TODO: handle exception
			System.out.println("Algo salio mal!");
			System.out.println("Transferencia no realizada");
		}
		
		

	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
