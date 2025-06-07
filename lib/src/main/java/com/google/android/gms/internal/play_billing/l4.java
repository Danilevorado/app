package com.google.android.gms.internal.play_billing;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'p' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public final class l4 {
    public static final l4 A;
    public static final l4 B;
    public static final l4 C;
    public static final l4 D;
    public static final l4 E;
    private static final /* synthetic */ l4[] F;

    /* renamed from: n, reason: collision with root package name */
    public static final l4 f19574n;

    /* renamed from: o, reason: collision with root package name */
    public static final l4 f19575o;

    /* renamed from: p, reason: collision with root package name */
    public static final l4 f19576p;

    /* renamed from: q, reason: collision with root package name */
    public static final l4 f19577q;

    /* renamed from: r, reason: collision with root package name */
    public static final l4 f19578r;

    /* renamed from: s, reason: collision with root package name */
    public static final l4 f19579s;

    /* renamed from: t, reason: collision with root package name */
    public static final l4 f19580t;

    /* renamed from: u, reason: collision with root package name */
    public static final l4 f19581u;

    /* renamed from: v, reason: collision with root package name */
    public static final l4 f19582v;

    /* renamed from: w, reason: collision with root package name */
    public static final l4 f19583w;

    /* renamed from: x, reason: collision with root package name */
    public static final l4 f19584x;

    /* renamed from: y, reason: collision with root package name */
    public static final l4 f19585y;

    /* renamed from: z, reason: collision with root package name */
    public static final l4 f19586z;

    /* renamed from: m, reason: collision with root package name */
    private final m4 f19587m;

    static {
        l4 l4Var = new l4("DOUBLE", 0, m4.DOUBLE, 1);
        f19574n = l4Var;
        l4 l4Var2 = new l4("FLOAT", 1, m4.FLOAT, 5);
        f19575o = l4Var2;
        m4 m4Var = m4.LONG;
        l4 l4Var3 = new l4("INT64", 2, m4Var, 0);
        f19576p = l4Var3;
        l4 l4Var4 = new l4("UINT64", 3, m4Var, 0);
        f19577q = l4Var4;
        m4 m4Var2 = m4.INT;
        l4 l4Var5 = new l4("INT32", 4, m4Var2, 0);
        f19578r = l4Var5;
        l4 l4Var6 = new l4("FIXED64", 5, m4Var, 1);
        f19579s = l4Var6;
        l4 l4Var7 = new l4("FIXED32", 6, m4Var2, 5);
        f19580t = l4Var7;
        l4 l4Var8 = new l4("BOOL", 7, m4.BOOLEAN, 0);
        f19581u = l4Var8;
        l4 l4Var9 = new l4("STRING", 8, m4.STRING, 2);
        f19582v = l4Var9;
        m4 m4Var3 = m4.MESSAGE;
        l4 l4Var10 = new l4("GROUP", 9, m4Var3, 3);
        f19583w = l4Var10;
        l4 l4Var11 = new l4("MESSAGE", 10, m4Var3, 2);
        f19584x = l4Var11;
        l4 l4Var12 = new l4("BYTES", 11, m4.BYTE_STRING, 2);
        f19585y = l4Var12;
        l4 l4Var13 = new l4("UINT32", 12, m4Var2, 0);
        f19586z = l4Var13;
        l4 l4Var14 = new l4("ENUM", 13, m4.ENUM, 0);
        A = l4Var14;
        l4 l4Var15 = new l4("SFIXED32", 14, m4Var2, 5);
        B = l4Var15;
        l4 l4Var16 = new l4("SFIXED64", 15, m4Var, 1);
        C = l4Var16;
        l4 l4Var17 = new l4("SINT32", 16, m4Var2, 0);
        D = l4Var17;
        l4 l4Var18 = new l4("SINT64", 17, m4Var, 0);
        E = l4Var18;
        F = new l4[]{l4Var, l4Var2, l4Var3, l4Var4, l4Var5, l4Var6, l4Var7, l4Var8, l4Var9, l4Var10, l4Var11, l4Var12, l4Var13, l4Var14, l4Var15, l4Var16, l4Var17, l4Var18};
    }

    private l4(String str, int i10, m4 m4Var, int i11) {
        this.f19587m = m4Var;
    }

    public static l4[] values() {
        return (l4[]) F.clone();
    }

    public final m4 b() {
        return this.f19587m;
    }
}
