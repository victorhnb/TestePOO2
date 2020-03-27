package application;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;




public class Program {

	public static void main(String[] args) {
		
		try {
			Document d1 = Jsoup.connect("https://www.magazineluiza.com.br/iphone-11-apple-preto-64gb-desbloqueado-mwlt2bz-a/p/ecafk4ejj2/te/ip11/").userAgent("Mozilla 69.0.1").get();
			Elements e1 = d1.select("div.header-product");
			Elements e2 = d1.select("div.price-template-price-block");
			
			System.out.println("Descrição do produto: "+ " \n"+ e1.tagName("h1").text());
			System.out.println("Descrição do preço: "+ " \n"+ e2.tagName("span").text());
		
		} catch (IOException e) {
			
			e.printStackTrace();
		}		
		
		
		
	}

}
