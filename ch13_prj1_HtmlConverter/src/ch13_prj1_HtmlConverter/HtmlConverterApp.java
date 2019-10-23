package ch13_prj1_HtmlConverter;

public class HtmlConverterApp {

	public static void main(String[] args) {
		System.out.println("HTML Converter\n");
		System.out.println("INPUT");
		String html = "<h1>Grocery List</h1>\n" +
				"<ul>\n" +
				" <li>Eggs</li>\n" +
				" <li>Milk</li>\n" +
				" <li>Butter</li>\n" +
				"</ul>";
		
		
		System.out.println(html + "\n");
		
		// removes <sdalkf> tags
		String htmlFormatted = html.replace("<ul>", "").replace("</ul>", "").replace("<h1>", "").replace("</h1>\n", "").replace("<li>", "* ").replace("</li>", "");
		
		System.out.println("OUTPUT");
		System.out.println(htmlFormatted);
	
		
		
	}

}