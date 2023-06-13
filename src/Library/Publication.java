package Library;

public interface Publication {
    public abstract void openBook();
    public abstract void closeBook();
    public abstract void leafThrough(int p);
    public abstract void advancePage();
    public abstract void backPage();
}
