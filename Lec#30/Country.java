
public class Country {
	public String name;
	public String language;
	public int area;
	public int population;
	public Country(String name, String language, int area, int population)
	{
		this.name=name;
		this.language=language;
		this.area=area;
		this.population=population;
	}
	public String toString () {
		String str="";
		str+="[Country name : "+name+
				", Country language : "+language+
				", Country area : "+area+
				", Country population : "+population+"]";
		return str;
	}
}
