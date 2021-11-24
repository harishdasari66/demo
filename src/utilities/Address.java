package utilities;

import java.util.*;


public class Address
{
	 private String houseno;
	 private String street;
	 private String localty;
	 private String city;
	 private String state;
	 private String country;
	 private int zip;
	 
	 
	 
	 
	 public Address(String houseno,String street,String localty,String city,String state,String country,int zip)
	 {
	    this.houseno=houseno;
	    this.street=street;
	    this.localty=localty;
	    this.city=city;
		this.state=state;
		this.country=country;
		this.zip=zip;
		 
	 }




	public String getHouseno() {
		return houseno;
	}




	public void setHouseno(String houseno) {
		this.houseno = houseno;
	}




	public String getStreet() {
		return street;
	}




	public void setStreet(String street) {
		this.street = street;
	}




	public String getLocalty() {
		return localty;
	}




	public void setLocalty(String localty) {
		this.localty = localty;
	}




	public String getCity() {
		return city;
	}




	public void setCity(String city) {
		this.city = city;
	}




	public String getState() {
		return state;
	}




	public void setState(String state) {
		this.state = state;
	}




	public String getCountry() {
		return country;
	}




	public void setCountry(String country) {
		this.country = country;
	}




	public int getZip() {
		return zip;
	}




	public void setZip(int zip) {
		this.zip = zip;
	}
	
	//get Address
	public String getAddress()
	{
		System.out.println("Address Details :");
		return 
		       "House no :"+this.houseno+"\n"+
		       "Steet :"+this.street+"\n"+
		       "localty :"+this.localty+"\n"+
		       "city :"+this.city+"\n"+
		       "State :"+this.city+"\n"+
		       "Country :"+this.country+"\n"+
		       "Zip code :"+this.zip;
	}

	public static void main(String[] args)
	{
		List<Address> addresses=new ArrayList<Address>();
		addresses.add(new Address("2-563","sri sai colony","madhapur","hyderabad","telanagana","india",500010));
		
		addresses.forEach(x->System.out.println(x.getAddress()));
		
	}
	
}
