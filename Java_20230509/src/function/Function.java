package function;

@FunctionalInterface
public interface Function<T> {
	public double apply(T t);
}
