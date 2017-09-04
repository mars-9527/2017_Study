package wish.designmodel._10abstractfactory;

/**
 * 已被DataAccess类替代
 */
interface IFactory {
	IUser CreateUser();
	IDepartment CreateDepartment();
}
