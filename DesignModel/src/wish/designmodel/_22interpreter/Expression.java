package wish.designmodel._22interpreter;

/**
 * ���ʽ��
 */
abstract class Expression {
	
	/**
	 * ������
	 */
	public void Intepret(PlayContext context){
		if(context.getText().length() == 0){
			return;
		}
		else{
			String playKey = context.getText().substring(0, 1);
			context.setText(context.getText().substring(2));
			double playValue = Double.parseDouble(context.getText().substring(0, context.getText().indexOf(" ")));
			
			//���ڴ������������ã��˴��޸�����������
			context.setText(context.getText().substring(context.getText().indexOf(" ")  + 1));
			
			excute(playKey, playValue);
		}
	}
	
	/**
	 * ���󷽷���ִ�С�����ͬ���ķ������в�ͬ�ġ�ִ�С�����
	 */
	public abstract void excute(String key, double value);
}
