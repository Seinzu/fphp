import java.io.*;
import org.antlr.runtime.*;

public class fphp {
	
	public static void main(String[] args) throws Exception {
		ANTLRFileStream input = new ANTLRFileStream(args[0]);
		FphpLexer lexer = new FphpLexer(input);
		CommonTokenStream intermediate = new CommonTokenStream(lexer);
		FphpTokenSource source = new FphpTokenSource(intermediate, args[0]+".php");
		CommonTokenStream tokens = new CommonTokenStream(source);
		FphpParser parser = new FphpParser(tokens);
		String output = parser.program();
		String newfilename = args[0];
		int mid= newfilename.lastIndexOf(".fphp");
		newfilename = newfilename.substring(0,mid) + ".php";
		PrintWriter out = new PrintWriter(new FileWriter(newfilename));
		out.print(output);
		out.close();
	}
	
	
}