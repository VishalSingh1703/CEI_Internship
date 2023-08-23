package MyPackage;

public class StudentPojo {
	
	private int sid;
	
	private String name;
	
	private double marks;

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "StudentPojo [sid=" + sid + ", name=" + name + ", marks=" + marks + "]";
	}
	
}
