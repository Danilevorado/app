package xb;

/* loaded from: classes2.dex */
abstract class a {
    public static final int a(int i10) {
        if (new ub.c(2, 36).k(i10)) {
            return i10;
        }
        throw new IllegalArgumentException("radix " + i10 + " was not in valid range " + new ub.c(2, 36));
    }

    public static final int b(char c10, int i10) {
        return Character.digit((int) c10, i10);
    }

    public static final boolean c(char c10) {
        return Character.isWhitespace(c10) || Character.isSpaceChar(c10);
    }
}
