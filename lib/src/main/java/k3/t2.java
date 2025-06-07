package k3;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.ads.se0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class t2 {

    /* renamed from: a, reason: collision with root package name */
    private final Date f24756a;

    /* renamed from: b, reason: collision with root package name */
    private final String f24757b;

    /* renamed from: c, reason: collision with root package name */
    private final List f24758c;

    /* renamed from: d, reason: collision with root package name */
    private final int f24759d;

    /* renamed from: e, reason: collision with root package name */
    private final Set f24760e;

    /* renamed from: f, reason: collision with root package name */
    private final Bundle f24761f;

    /* renamed from: g, reason: collision with root package name */
    private final Map f24762g;

    /* renamed from: h, reason: collision with root package name */
    private final String f24763h;

    /* renamed from: i, reason: collision with root package name */
    private final String f24764i;

    /* renamed from: j, reason: collision with root package name */
    private final int f24765j;

    /* renamed from: k, reason: collision with root package name */
    private final Set f24766k;

    /* renamed from: l, reason: collision with root package name */
    private final Bundle f24767l;

    /* renamed from: m, reason: collision with root package name */
    private final Set f24768m;

    /* renamed from: n, reason: collision with root package name */
    private final boolean f24769n;

    /* renamed from: o, reason: collision with root package name */
    private final String f24770o;

    /* renamed from: p, reason: collision with root package name */
    private final int f24771p;

    public t2(s2 s2Var, w3.a aVar) {
        this.f24756a = s2Var.f24739g;
        this.f24757b = s2Var.f24740h;
        this.f24758c = s2Var.f24741i;
        this.f24759d = s2Var.f24742j;
        this.f24760e = Collections.unmodifiableSet(s2Var.f24733a);
        this.f24761f = s2Var.f24734b;
        this.f24762g = Collections.unmodifiableMap(s2Var.f24735c);
        this.f24763h = s2Var.f24743k;
        this.f24764i = s2Var.f24744l;
        this.f24765j = s2Var.f24745m;
        this.f24766k = Collections.unmodifiableSet(s2Var.f24736d);
        this.f24767l = s2Var.f24737e;
        this.f24768m = Collections.unmodifiableSet(s2Var.f24738f);
        this.f24769n = s2Var.f24746n;
        this.f24770o = s2Var.f24747o;
        this.f24771p = s2Var.f24748p;
    }

    public final int a() {
        return this.f24759d;
    }

    public final int b() {
        return this.f24771p;
    }

    public final int c() {
        return this.f24765j;
    }

    public final Bundle d() {
        return this.f24767l;
    }

    public final Bundle e(Class cls) {
        return this.f24761f.getBundle(cls.getName());
    }

    public final Bundle f() {
        return this.f24761f;
    }

    public final w3.a g() {
        return null;
    }

    public final String h() {
        return this.f24770o;
    }

    public final String i() {
        return this.f24757b;
    }

    public final String j() {
        return this.f24763h;
    }

    public final String k() {
        return this.f24764i;
    }

    public final Date l() {
        return this.f24756a;
    }

    public final List m() {
        return new ArrayList(this.f24758c);
    }

    public final Set n() {
        return this.f24768m;
    }

    public final Set o() {
        return this.f24760e;
    }

    public final boolean p() {
        return this.f24769n;
    }

    public final boolean q(Context context) {
        d3.t tVarA = y2.b().a();
        t.b();
        String strA = se0.A(context);
        return this.f24766k.contains(strA) || tVarA.d().contains(strA);
    }
}
