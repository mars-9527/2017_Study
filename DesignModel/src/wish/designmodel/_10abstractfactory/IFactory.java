package wish.designmodel._10abstractfactory;

/**
 * �ѱ�DataAccess�����
 */
interface IFactory {
	IUser CreateUser();
	IDepartment CreateDepartment();
}
