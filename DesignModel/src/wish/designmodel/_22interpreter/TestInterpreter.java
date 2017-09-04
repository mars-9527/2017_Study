package wish.designmodel._22interpreter;

/**
 * ������ģʽ������һ�����ԣ����������ķ���һ�ֱ�ʾ��������һ����������
 * ���������ʹ�øñ�ʾ�����������еľ��ӡ�
 * 
 * �ķ�����һ������ִ�в�ͬ�������ַ�ƴ�ӳ�һ���ַ������������������ɾ��嶯����
 */
public class TestInterpreter {

	public static void main(String[] args) {
		PlayContext context = new PlayContext();
		context.setText("T 500 O 2 E 0.5 G 0.5 A 3 E 0.5 G 0.5 D 3 E 0.5 G 0.5 A 0.5 O 3 C 1 O 2 A 0.5 G 1 C 0.5 E 0.5 D 3 ");
		Expression expression = null;
		try{
			while(context.getText().length() > 0){
				String str = context.getText().substring(0, 1);
				if(str.equals("O"))//���֧�жϿ���ʹ�÷��似��
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
