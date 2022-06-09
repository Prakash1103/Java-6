package miss;

public class Students {
	public void getStudentInfo(int id) {
		System.out.println("Student ID "+id);
	
	}
	public void getStudentInfo(int id,String name) {
		System.out.println("Student ID "+id+" "+"Student Name"+name);
	}
	public void  getStudentInfo(String email,long phoneNumber) {
		System.out.println("Student Email"+email+" "+"Student PhoneNumber"+phoneNumber);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students stud=new Students();
		stud.getStudentInfo(1103);
		stud.getStudentInfo(1103, " Prakash");
		stud.getStudentInfo(" balaprakash150@gmail.com", 6282363879l);

	}

	
		
	}


