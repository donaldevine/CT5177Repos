package examprep;

import java.util.List;

public interface SerializationHandler<E> {
	public void serialise(List<E> list);
	public List<E> deserialise();
}
