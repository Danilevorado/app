package c9;

import android.content.Context;
import java.lang.ref.WeakReference;
import z7.h;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: l, reason: collision with root package name */
    private static final a f5059l = new a();

    /* renamed from: a, reason: collision with root package name */
    private d9.a f5060a;

    /* renamed from: b, reason: collision with root package name */
    private xa.a f5061b;

    /* renamed from: c, reason: collision with root package name */
    private t7.b f5062c;

    /* renamed from: d, reason: collision with root package name */
    private e9.a f5063d;

    /* renamed from: e, reason: collision with root package name */
    private p7.b f5064e;

    /* renamed from: f, reason: collision with root package name */
    private b f5065f;

    /* renamed from: g, reason: collision with root package name */
    private WeakReference f5066g;

    /* renamed from: h, reason: collision with root package name */
    private db.a f5067h;

    /* renamed from: i, reason: collision with root package name */
    private h f5068i;

    /* renamed from: j, reason: collision with root package name */
    private o7.a f5069j;

    /* renamed from: k, reason: collision with root package name */
    private e f5070k;

    private a() {
    }

    public static xa.a a() {
        return f5059l.f5061b;
    }

    public static Context b() {
        WeakReference weakReference = f5059l.f5066g;
        if (weakReference == null) {
            return null;
        }
        return (Context) weakReference.get();
    }

    public static b c() {
        return f5059l.f5065f;
    }

    public static a d() {
        return f5059l;
    }

    public static d9.a e() {
        return f5059l.f5060a;
    }

    public static db.a g() {
        return f5059l.f5067h;
    }

    public static e9.a h() {
        return f5059l.f5063d;
    }

    public static p7.b i() {
        return f5059l.f5064e;
    }

    public static t7.b j() {
        return f5059l.f5062c;
    }

    public static h k() {
        return f5059l.f5068i;
    }

    public static void m(Context context) {
        n(context, false);
    }

    public static void n(Context context, boolean z10) {
        if (context == null) {
            return;
        }
        if (!q() || z10) {
            f5059l.o(context);
        }
    }

    private void o(Context context) {
        this.f5068i = new h();
        this.f5066g = new WeakReference(context.getApplicationContext());
        this.f5063d = bb.d.c();
        this.f5067h = bb.d.a();
        this.f5060a = new za.a(context);
        this.f5061b = new xa.b(context);
        this.f5062c = new t7.a(context);
        this.f5064e = new p7.a(context);
        this.f5065f = new b(context);
        this.f5069j = new o7.a(context, this.f5060a.i());
        this.f5070k = new e();
    }

    public static boolean p() {
        return f5059l.f5070k.e();
    }

    private static boolean q() {
        WeakReference weakReference = f5059l.f5066g;
        return (weakReference == null || weakReference.get() == null) ? false : true;
    }

    public o7.a f() {
        return this.f5069j;
    }

    public h l() {
        return this.f5068i;
    }
}
