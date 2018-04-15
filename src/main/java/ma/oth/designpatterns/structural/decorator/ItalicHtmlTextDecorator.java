package ma.oth.designpatterns.structural.decorator;

public class ItalicHtmlTextDecorator extends HtmlTextDecorator {

	public ItalicHtmlTextDecorator(HtmlText html) {
		this.htmlText=html;
	}
	
	public String exposeContent() {
		return "<b>"+htmlText.exposeContent()+"</b>";
	}
	
}
