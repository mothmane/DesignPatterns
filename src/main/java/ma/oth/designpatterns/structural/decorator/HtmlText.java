package ma.oth.designpatterns.structural.decorator;

public class HtmlText {
	
	public HtmlText() {
		
	}
	
	public HtmlText(String content) {
		this.content=content;
	}
	
	protected String content;
	
	public String exposeContent() {
		return content;
	}

}
