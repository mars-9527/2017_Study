package wish.designmodel._22interpreter;

/**
 * 表达式类
 */
abstract class Expression {
	
	/**
	 * 解释器
	 */
	public void Intepret(PlayContext context){
		if(context.getText().length() == 0){
			return;
		}
		else{
			String playKey = context.getText().substring(0, 1);
			context.setText(context.getText().substring(2));
			double playValue = Double.parseDouble(context.getText().substring(0, context.getText().indexOf(" ")));
			
			//由于传进来的是引用，此处修改了演奏内容
			context.setText(context.getText().substring(context.getText().indexOf(" ")  + 1));
			
			excute(playKey, playValue);
		}
	}
	
	/**
	 * 抽象方法“执行”，不同的文法子类有不同的“执行”处理
	 */
	public abstract void excute(String key, double value);
}
