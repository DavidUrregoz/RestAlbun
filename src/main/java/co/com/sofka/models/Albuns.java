package co.com.sofka.models;

import java.util.List;

public class Albuns{
	private List<Albun> albuns;

	public void setAlbuns(List<Albun> albuns){
		this.albuns = albuns;
	}

	public List<Albun> getData(){
		return albuns;
	}
}