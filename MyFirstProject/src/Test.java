import shape.*;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student(21,"Rhishi",25,new Department(23,"ZenTeams"));
		Department d=new Department(27,"ZENsarTechNolOgiES");
//		Employee e = new Employee(7, "ZENSAR");
		
		System.out.println(s);
		System.out.println(d);
		
		System.out.println(s.getStudentName());
		System.out.println(s.getStudentAge());
		System.out.println(s.getStudentId());
		System.out.println(s.getDepartment().getDepartmentId());
//		System.out.println(e.getEmpId());
//		System.out.println(e.getEmpName());
		Circle c = new Circle(3);
		System.out.println("Area of Circle "+c.area());
		
		Rectangle r = new Rectangle(4,5);
		System.out.println("Area of Rectangle "+r.area());
	}

}
