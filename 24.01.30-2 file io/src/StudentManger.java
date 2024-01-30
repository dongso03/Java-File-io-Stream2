import java.util.ArrayList;
import java.util.List;

public class StudentManger {
	private List<Student> list;
	private IStudentRepo repo;

	public StudentManger() {
		repo = new StudentTextRepository();
		list = repo.readList();
	}

	// 추가
	public void add(Student s) {
		list.add(s);
	}

	// 변경
	public void update(Student olds, Student newS) {
		int index = list.indexOf(olds);
		list.set(index, newS);
	}

	// 삭제
	public void delete(int index) {
		list.remove(index);
	}

	// 전체목록
	public List<Student> getList() {
		return list;
	}
}
