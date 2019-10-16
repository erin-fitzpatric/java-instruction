package ch09_prj1_AnimalCounter;

public interface Countable {
	
// TODO this interface should include these methods:
	void incrementCount();
	void resetCount();
	int getCount();
	default String getCountString() {
    	return toString(); // might not need this part?
    }
}
