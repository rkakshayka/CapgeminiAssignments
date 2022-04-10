package generic_hands_on;
//    <Angular Brackets>
import java.util.List;
// This generic class will work for any data type
public class MyGenericClass<T> {
	private List<T> list;

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}
	
}
