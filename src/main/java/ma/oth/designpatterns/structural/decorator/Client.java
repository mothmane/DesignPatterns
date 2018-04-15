package ma.oth.designpatterns.structural.decorator;

public class Client {

	public void exp01() {
		HtmlText html = new HtmlText();
		html.content = "this is a text";
		
		String htmlMessage=new BoldHtmlTextDecorator(new ItalicHtmlTextDecorator(html)).exposeContent();
		String htmlMessage2=new ItalicHtmlTextDecorator(new BoldHtmlTextDecorator(html)).exposeContent();
		
		System.out.println(html.content);
		System.out.println(htmlMessage);
		System.out.println(htmlMessage2);
	}

	public Client() {
		exp01();
	}

	public static void main(String[] args) {
			new Client();
	}

}
