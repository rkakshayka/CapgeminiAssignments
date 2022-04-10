package generic_hands_on;

public class MyGenericClass2<K, V> {
	//Declared 2 variable
	private K key;
	private V value;
	
	//Creating constructor to initialize these variable.
	//Using Source-> Generate Constructor
	public MyGenericClass2(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}
	
	//creating only getters using Source-> generate getters.
	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}

}
