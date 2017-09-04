package wish.designmodel._22interpreter;

/**
 * 解释器模式，给定一个语言，定义它的文法的一种表示，并定义一个解释器，
 * 这个解释器使用该表示来解释语言中的句子。
 * 
 * 文法：按一定规则将执行不同动作的字符拼接成一个字符串，供解释器分析成具体动作。
 */
public class TestInterpreter {

	public static void main(String[] args) {
		PlayContext context = new PlayContext();
		context.setText("T 500 O 2 E 0.5 G 0.5 A 3 E 0.5 G 0.5 D 3 E 0.5 G 0.5 A 0.5 O 3 C 1 O 2 A 0.5 G 1 C 0.5 E 0.5 D 3 ");
		Expression expression = null;
		try{
			while(context.getText().length() > 0){
				String str = context.getText().substring(0, 1);
				if(str.equals("O"))//多分支判断可以使用反射技术
					expression = new Scale();
				else if(str.equals("T"))
					expression = new Speed();
				else if(str.equals("C") || str.equals("D") || str.equals("E") || str.equals("F") ||
						str.equals("G") || str.equals("A") || str.equals("B") || str.equals("P"))
					expression = new Note();
				
				if(expression != null)
					expression.Intepret(context);
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
