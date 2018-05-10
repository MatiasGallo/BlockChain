
public class Token {
	String name;
	String symbol;
	int decimal;
	int totalsuply;
	int balanceof;
	int transfer;
	int transferFrom;
	int approve;
	int allowance;
	
	public Token(String newname,String newsymbol,int newdecimal,int newtotalsuply,int newbalanceof,int newtransfer,int newtransferFrom,int newapprovance,int newallowance) {
		name = newname;
		symbol = newsymbol;
		decimal = newdecimal;
		totalsuply = newtotalsuply;
		balanceof = newbalanceof;
		transfer = newtransfer;
		transferFrom = newtransferFrom;
		approve = newapprovance;
		allowance = newallowance;
	}
}
