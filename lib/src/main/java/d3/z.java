package d3;

/* loaded from: classes.dex */
public abstract class z {
    public static int a(g gVar) {
        return gVar.g();
    }

    public static int b(g gVar) {
        return gVar.f();
    }

    public static g c(int i10, int i11, String str) {
        return new g(i10, i11, str);
    }

    public static g d(int i10, int i11) {
        g gVar = new g(i10, i11);
        gVar.j(true);
        gVar.h(i11);
        return gVar;
    }

    public static g e(int i10, int i11) {
        g gVar = new g(i10, i11);
        gVar.k(true);
        gVar.i(i11);
        return gVar;
    }

    public static boolean f(g gVar) {
        return gVar.l();
    }

    public static boolean g(g gVar) {
        return gVar.m();
    }

    public static boolean h(g gVar) {
        return gVar.n();
    }
}
