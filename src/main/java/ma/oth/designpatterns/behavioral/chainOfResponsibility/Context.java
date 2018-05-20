package ma.oth.designpatterns.behavioral.chainOfResponsibility;

public class Context {

	private int accountId;
	private int ammount;

	public Context() {
		// TODO Auto-generated constructor stub
	}

	public Context(int accountId, int ammount) {
		super();
		this.accountId = accountId;
		this.ammount = ammount;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public int getAmmount() {
		return ammount;
	}

	public void setAmmount(int ammount) {
		this.ammount = ammount;
	}

}
