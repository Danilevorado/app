package androidx.fragment.app;

import android.view.ViewGroup;
import androidx.lifecycle.j;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    private final i f2956a;

    /* renamed from: b, reason: collision with root package name */
    private final ClassLoader f2957b;

    /* renamed from: d, reason: collision with root package name */
    int f2959d;

    /* renamed from: e, reason: collision with root package name */
    int f2960e;

    /* renamed from: f, reason: collision with root package name */
    int f2961f;

    /* renamed from: g, reason: collision with root package name */
    int f2962g;

    /* renamed from: h, reason: collision with root package name */
    int f2963h;

    /* renamed from: i, reason: collision with root package name */
    boolean f2964i;

    /* renamed from: k, reason: collision with root package name */
    String f2966k;

    /* renamed from: l, reason: collision with root package name */
    int f2967l;

    /* renamed from: m, reason: collision with root package name */
    CharSequence f2968m;

    /* renamed from: n, reason: collision with root package name */
    int f2969n;

    /* renamed from: o, reason: collision with root package name */
    CharSequence f2970o;

    /* renamed from: p, reason: collision with root package name */
    ArrayList f2971p;

    /* renamed from: q, reason: collision with root package name */
    ArrayList f2972q;

    /* renamed from: s, reason: collision with root package name */
    ArrayList f2974s;

    /* renamed from: c, reason: collision with root package name */
    ArrayList f2958c = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    boolean f2965j = true;

    /* renamed from: r, reason: collision with root package name */
    boolean f2973r = false;

    static final class a {

        /* renamed from: a, reason: collision with root package name */
        int f2975a;

        /* renamed from: b, reason: collision with root package name */
        Fragment f2976b;

        /* renamed from: c, reason: collision with root package name */
        int f2977c;

        /* renamed from: d, reason: collision with root package name */
        int f2978d;

        /* renamed from: e, reason: collision with root package name */
        int f2979e;

        /* renamed from: f, reason: collision with root package name */
        int f2980f;

        /* renamed from: g, reason: collision with root package name */
        j.c f2981g;

        /* renamed from: h, reason: collision with root package name */
        j.c f2982h;

        a() {
        }

        a(int i10, Fragment fragment) {
            this.f2975a = i10;
            this.f2976b = fragment;
            j.c cVar = j.c.RESUMED;
            this.f2981g = cVar;
            this.f2982h = cVar;
        }
    }

    v(i iVar, ClassLoader classLoader) {
        this.f2956a = iVar;
        this.f2957b = classLoader;
    }

    public v b(int i10, Fragment fragment, String str) {
        k(i10, fragment, str, 1);
        return this;
    }

    v c(ViewGroup viewGroup, Fragment fragment, String str) {
        fragment.S = viewGroup;
        return b(viewGroup.getId(), fragment, str);
    }

    public v d(Fragment fragment, String str) {
        k(0, fragment, str, 1);
        return this;
    }

    void e(a aVar) {
        this.f2958c.add(aVar);
        aVar.f2977c = this.f2959d;
        aVar.f2978d = this.f2960e;
        aVar.f2979e = this.f2961f;
        aVar.f2980f = this.f2962g;
    }

    public abstract int f();

    public abstract int g();

    public abstract void h();

    public abstract void i();

    public v j() {
        if (this.f2964i) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f2965j = false;
        return this;
    }

    void k(int i10, Fragment fragment, String str, int i11) {
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str2 = fragment.K;
            if (str2 != null && !str.equals(str2)) {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.K + " now " + str);
            }
            fragment.K = str;
        }
        if (i10 != 0) {
            if (i10 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
            int i12 = fragment.I;
            if (i12 != 0 && i12 != i10) {
                throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.I + " now " + i10);
            }
            fragment.I = i10;
            fragment.J = i10;
        }
        e(new a(i11, fragment));
    }

    public v l(Fragment fragment) {
        e(new a(3, fragment));
        return this;
    }

    public v m(int i10, Fragment fragment) {
        return n(i10, fragment, null);
    }

    public v n(int i10, Fragment fragment, String str) {
        if (i10 == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        k(i10, fragment, str, 2);
        return this;
    }

    public v o(boolean z10) {
        this.f2973r = z10;
        return this;
    }
}
