package co.com.sofka.models;

import java.util.List;

public class Albunes{
	private List<Albun> albunes;

	public void setAlbunes(List<Albun> albunes){
		this.albunes = albunes;
	}

	public List<Albun> getData(){
		return albunes;
	}
}