package bc;

/* loaded from: classes2.dex */
abstract /* synthetic */ class n {

    /* renamed from: a, reason: collision with root package name */
    private static final int f4625a = Runtime.getRuntime().availableProcessors();

    public static final int a() {
        return f4625a;
    }

    public static final String b(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
