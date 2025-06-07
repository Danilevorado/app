package com.google.android.gms.internal.measurement;

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
public final class e9 {

    /* renamed from: p, reason: collision with root package name */
    public static final e9 f18914p;

    /* renamed from: q, reason: collision with root package name */
    public static final e9 f18915q;

    /* renamed from: r, reason: collision with root package name */
    public static final e9 f18916r;

    /* renamed from: s, reason: collision with root package name */
    public static final e9 f18917s;

    /* renamed from: t, reason: collision with root package name */
    public static final e9 f18918t;

    /* renamed from: u, reason: collision with root package name */
    public static final e9 f18919u;

    /* renamed from: v, reason: collision with root package name */
    public static final e9 f18920v;

    /* renamed from: w, reason: collision with root package name */
    public static final e9 f18921w;

    /* renamed from: x, reason: collision with root package name */
    public static final e9 f18922x;

    /* renamed from: y, reason: collision with root package name */
    public static final e9 f18923y;

    /* renamed from: z, reason: collision with root package name */
    private static final /* synthetic */ e9[] f18924z;

    /* renamed from: m, reason: collision with root package name */
    private final Class f18925m;

    /* renamed from: n, reason: collision with root package name */
    private final Class f18926n;

    /* renamed from: o, reason: collision with root package name */
    private final Object f18927o;

    static {
        e9 e9Var = new e9("VOID", 0, Void.class, Void.class, null);
        f18914p = e9Var;
        Class cls = Integer.TYPE;
        e9 e9Var2 = new e9("INT", 1, cls, Integer.class, 0);
        f18915q = e9Var2;
        e9 e9Var3 = new e9("LONG", 2, Long.TYPE, Long.class, 0L);
        f18916r = e9Var3;
        e9 e9Var4 = new e9("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f18917s = e9Var4;
        e9 e9Var5 = new e9("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f18918t = e9Var5;
        e9 e9Var6 = new e9("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f18919u = e9Var6;
        e9 e9Var7 = new e9("STRING", 6, String.class, String.class, "");
        f18920v = e9Var7;
        e9 e9Var8 = new e9("BYTE_STRING", 7, x7.class, x7.class, x7.f19398n);
        f18921w = e9Var8;
        e9 e9Var9 = new e9("ENUM", 8, cls, Integer.class, null);
        f18922x = e9Var9;
        e9 e9Var10 = new e9("MESSAGE", 9, Object.class, Object.class, null);
        f18923y = e9Var10;
        f18924z = new e9[]{e9Var, e9Var2, e9Var3, e9Var4, e9Var5, e9Var6, e9Var7, e9Var8, e9Var9, e9Var10};
    }

    private e9(String str, int i10, Class cls, Class cls2, Object obj) {
        this.f18925m = cls;
        this.f18926n = cls2;
        this.f18927o = obj;
    }

    public static e9[] values() {
        return (e9[]) f18924z.clone();
    }

    public final Class b() {
        return this.f18926n;
    }
}
