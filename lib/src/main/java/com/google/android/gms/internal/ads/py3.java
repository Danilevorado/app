package com.google.android.gms.internal.ads;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'q' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public final class py3 {

    /* renamed from: p, reason: collision with root package name */
    public static final py3 f14093p;

    /* renamed from: q, reason: collision with root package name */
    public static final py3 f14094q;

    /* renamed from: r, reason: collision with root package name */
    public static final py3 f14095r;

    /* renamed from: s, reason: collision with root package name */
    public static final py3 f14096s;

    /* renamed from: t, reason: collision with root package name */
    public static final py3 f14097t;

    /* renamed from: u, reason: collision with root package name */
    public static final py3 f14098u;

    /* renamed from: v, reason: collision with root package name */
    public static final py3 f14099v;

    /* renamed from: w, reason: collision with root package name */
    public static final py3 f14100w;

    /* renamed from: x, reason: collision with root package name */
    public static final py3 f14101x;

    /* renamed from: y, reason: collision with root package name */
    public static final py3 f14102y;

    /* renamed from: z, reason: collision with root package name */
    private static final /* synthetic */ py3[] f14103z;

    /* renamed from: m, reason: collision with root package name */
    private final Class f14104m;

    /* renamed from: n, reason: collision with root package name */
    private final Class f14105n;

    /* renamed from: o, reason: collision with root package name */
    private final Object f14106o;

    static {
        py3 py3Var = new py3("VOID", 0, Void.class, Void.class, null);
        f14093p = py3Var;
        Class cls = Integer.TYPE;
        py3 py3Var2 = new py3("INT", 1, cls, Integer.class, 0);
        f14094q = py3Var2;
        py3 py3Var3 = new py3("LONG", 2, Long.TYPE, Long.class, 0L);
        f14095r = py3Var3;
        py3 py3Var4 = new py3("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f14096s = py3Var4;
        py3 py3Var5 = new py3("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f14097t = py3Var5;
        py3 py3Var6 = new py3("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f14098u = py3Var6;
        py3 py3Var7 = new py3("STRING", 6, String.class, String.class, "");
        f14099v = py3Var7;
        py3 py3Var8 = new py3("BYTE_STRING", 7, ww3.class, ww3.class, ww3.f17284n);
        f14100w = py3Var8;
        py3 py3Var9 = new py3("ENUM", 8, cls, Integer.class, null);
        f14101x = py3Var9;
        py3 py3Var10 = new py3("MESSAGE", 9, Object.class, Object.class, null);
        f14102y = py3Var10;
        f14103z = new py3[]{py3Var, py3Var2, py3Var3, py3Var4, py3Var5, py3Var6, py3Var7, py3Var8, py3Var9, py3Var10};
    }

    private py3(String str, int i10, Class cls, Class cls2, Object obj) {
        this.f14104m = cls;
        this.f14105n = cls2;
        this.f14106o = obj;
    }

    public static py3[] values() {
        return (py3[]) f14103z.clone();
    }

    public final Class b() {
        return this.f14105n;
    }
}
