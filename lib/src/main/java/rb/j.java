package rb;

/* loaded from: classes2.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    private static final k f26688a;

    /* renamed from: b, reason: collision with root package name */
    private static final vb.a[] f26689b;

    static {
        k kVar = null;
        try {
            kVar = (k) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (kVar == null) {
            kVar = new k();
        }
        f26688a = kVar;
        f26689b = new vb.a[0];
    }

    public static vb.a a(Class cls) {
        return f26688a.a(cls);
    }

    public static String b(i iVar) {
        return f26688a.c(iVar);
    }
}
