public interface IEnumerator<T> {
    public boolean hasNext();
    public void next();
    public T current();
}
