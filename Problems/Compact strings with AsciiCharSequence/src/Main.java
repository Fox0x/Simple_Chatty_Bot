import java.util.Arrays;

/*
Wow! This problem is kind of tricky.
If you're ready to put your thinking cap on, brace yourself and good luck!
 Otherwise, you can skip it for now and return any time later
 */
class AsciiCharSequence implements CharSequence {

	byte[] charArray;

	public AsciiCharSequence(byte[] charArray) {
		this.charArray = charArray;
	}

	// implementation
	@Override
	public int length() {
		return charArray.length;
	}

	@Override
	public char charAt(int index) throws IndexOutOfBoundsException {
		return (char) charArray[index];
	}

	@Override
	public CharSequence subSequence(int start, int end) throws IndexOutOfBoundsException {
		return new AsciiCharSequence(Arrays.copyOfRange(charArray, start, end));
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		for (byte b : charArray) {
			builder = builder.append(b);
		}
		return builder.toString();
	}
}