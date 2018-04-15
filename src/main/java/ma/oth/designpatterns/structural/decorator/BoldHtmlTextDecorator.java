package ma.oth.designpatterns.structural.decorator;

public class BoldHtmlTextDecorator extends HtmlTextDecorator {

	public BoldHtmlTextDecorator(HtmlText html) {
		this.htmlText=html;
	}
	
	public String exposeContent() {
		return "<i>"+htmlText.exposeContent()+"</i>";
	}
	
}
