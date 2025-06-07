package com.google.android.gms.internal.play_billing;

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
public final class y1 {

    /* renamed from: p, reason: collision with root package name */
    public static final y1 f19691p;

    /* renamed from: q, reason: collision with root package name */
    public static final y1 f19692q;

    /* renamed from: r, reason: collision with root package name */
    public static final y1 f19693r;

    /* renamed from: s, reason: collision with root package name */
    public static final y1 f19694s;

    /* renamed from: t, reason: collision with root package name */
    public static final y1 f19695t;

    /* renamed from: u, reason: collision with root package name */
    public static final y1 f19696u;

    /* renamed from: v, reason: collision with root package name */
    public static final y1 f19697v;

    /* renamed from: w, reason: collision with root package name */
    public static final y1 f19698w;

    /* renamed from: x, reason: collision with root package name */
    public static final y1 f19699x;

    /* renamed from: y, reason: collision with root package name */
    public static final y1 f19700y;

    /* renamed from: z, reason: collision with root package name */
    private static final /* synthetic */ y1[] f19701z;

    /* renamed from: m, reason: collision with root package name */
    private final Class f19702m;

    /* renamed from: n, reason: collision with root package name */
    private final Class f19703n;

    /* renamed from: o, reason: collision with root package name */
    private final Object f19704o;

    static {
        y1 y1Var = new y1("VOID", 0, Void.class, Void.class, null);
        f19691p = y1Var;
        Class cls = Integer.TYPE;
        y1 y1Var2 = new y1("INT", 1, cls, Integer.class, 0);
        f19692q = y1Var2;
        y1 y1Var3 = new y1("LONG", 2, Long.TYPE, Long.class, 0L);
        f19693r = y1Var3;
        y1 y1Var4 = new y1("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f19694s = y1Var4;
        y1 y1Var5 = new y1("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f19695t = y1Var5;
        y1 y1Var6 = new y1("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f19696u = y1Var6;
        y1 y1Var7 = new y1("STRING", 6, String.class, String.class, "");
        f19697v = y1Var7;
        y1 y1Var8 = new y1("BYTE_STRING", 7, q0.class, q0.class, q0.f19623n);
        f19698w = y1Var8;
        y1 y1Var9 = new y1("ENUM", 8, cls, Integer.class, null);
        f19699x = y1Var9;
        y1 y1Var10 = new y1("MESSAGE", 9, Object.class, Object.class, null);
        f19700y = y1Var10;
        f19701z = new y1[]{y1Var, y1Var2, y1Var3, y1Var4, y1Var5, y1Var6, y1Var7, y1Var8, y1Var9, y1Var10};
    }

    private y1(String str, int i10, Class cls, Class cls2, Object obj) {
        this.f19702m = cls;
        this.f19703n = cls2;
        this.f19704o = obj;
    }

    public static y1[] values() {
        return (y1[]) f19701z.clone();
    }

    public final Class b() {
        return this.f19703n;
    }
}
