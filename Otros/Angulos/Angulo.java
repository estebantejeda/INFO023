//Crear Clase Angulo

public class Angulo{

//Crear Atributos

	private int grados;
	private int radianes;
	private String seno;
	private String coseno;
	private String tangente;

//Crear Constructores

	public Angulo(int grados, int radianes, String seno, String coseno, String tangente){
		this.grados = grados;
		this.radianes = radianes;
		this.seno = seno;
		this.coseno = coseno;
		this.tangente = tangente;
	}


//Crear Metodos

	//Metodo getGrados

	public int getGrados(){
		return grados;
	}

	//Metodo getRadianes

	public int getRadianes(){
		return radianes;
	}

	//Metodo getSeno

	public String getSeno(){
		return seno;
	}

	//Metodo getCoseno

	public String getCoseno(){
		return coseno;
	}

	//Metodo getTangente

	public String getTangente(){
		return tangente;
	}

}