public abstract class iterator {
    //This function iterates to the next position in the ArrayList.
    public abstract Object next(int position);

    //This function checks when the position is at 0, and prevents the user from going back even further.
    public abstract boolean hasPrev(int position);
}
