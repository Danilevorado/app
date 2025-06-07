package l3;

/* loaded from: classes.dex */
final class l extends Exception {
    public l(String str) {
        super(str);
    }

    public l(String str, Throwable th) {
        super("Could not obtain webview for the overlay.", th);
    }
}
