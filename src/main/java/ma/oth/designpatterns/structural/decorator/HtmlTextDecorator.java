package ma.oth.designpatterns.structural.decorator;

public abstract class HtmlTextDecorator extends HtmlText {
	
	
	
	protected HtmlText htmlText;
	
	public  abstract String exposeContent() ;

}
