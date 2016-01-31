package synchroProblemPrac;

public class SynchTester {
	int idxPointer = 0;

	int getPointer() {
		if (idxPointer >= 20)
			idxPointer = 0;
		return idxPointer++;
	}
}